package th.co.cbank.util;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;
import org.apache.log4j.Logger;
import th.co.cbank.project.constants.AppConstants;

public class ScrollText extends JComponent {
    private final Logger logger = Logger.getLogger(ScrollText.class);
    private BufferedImage image;
    private Dimension imageSize;
    private volatile int currOffset;
    private Thread internalThread;
    private volatile boolean noStopRequested;

    public ScrollText(String text) {
        currOffset = 0;
        buildImage(text);

        setMinimumSize(imageSize);
        setPreferredSize(imageSize);
        setMaximumSize(imageSize);
        setSize(imageSize);

        noStopRequested = true;
        Runnable r = new Runnable() {
            @Override
            public void run() {
                try {
                    runWork();
                } catch (Exception x) {
                    System.err.println(x.getMessage());
                }
            }
        };

        internalThread = new Thread(r, "ScrollText");
        internalThread.start();
    }

    private void buildImage(String text) {
        RenderingHints renderHints = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        renderHints.put(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);

        BufferedImage scratchImage = new BufferedImage(1, 1,
                BufferedImage.TYPE_INT_RGB);

        Graphics2D scratchG2 = scratchImage.createGraphics();
        scratchG2.setRenderingHints(renderHints);

        Font font = new Font(AppConstants.DEFAULT_FONT, Font.BOLD | Font.ITALIC, 18);

        FontRenderContext frc = scratchG2.getFontRenderContext();
        TextLayout tl = new TextLayout(text, font, frc);
        Rectangle2D textBounds = tl.getBounds();
        int textWidth = (int) Math.ceil(textBounds.getWidth());
        int textHeight = (int) Math.ceil(textBounds.getHeight());

        int horizontalPad = 600;
        int verticalPad = 10;

        imageSize = new Dimension(textWidth + horizontalPad, textHeight
                + verticalPad);

        image = new BufferedImage(imageSize.width, imageSize.height,
                BufferedImage.TYPE_INT_RGB);

        Graphics2D g2 = image.createGraphics();
        g2.setRenderingHints(renderHints);

        int baselineOffset = (verticalPad / 2) - ((int) textBounds.getY());

        g2.setColor(Color.BLUE);
        g2.fillRect(0, 0, imageSize.width, imageSize.height);

        g2.setColor(Color.white);
        tl.draw(g2, 0, baselineOffset);

// Free-up resources right away, but keep "image" for
// animation.
        scratchG2.dispose();
        scratchImage.flush();
        g2.dispose();
    }

    @Override
    public void paint(Graphics g) {
// Make sure to clip the edges, regardless of curr size
        g.setClip(0, 0, imageSize.width, imageSize.height);

        int localOffset = currOffset; // in case it changes
        g.drawImage(image, -localOffset, 0, this);
        g.drawImage(image, imageSize.width - localOffset, 0, this);

// draw outline
        g.setColor(Color.black);
        g.drawRect(0, 0, imageSize.width - 1, imageSize.height - 1);
    }

    private void runWork() {
        while (noStopRequested) {
            try {
                Thread.sleep(25); // 10 frames per second

                // adjust the scroll position
                currOffset = (currOffset + 1) % imageSize.width;

                // signal the event thread to call paint()
                repaint();
            } catch (InterruptedException x) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void stopRequest() {
        noStopRequested = false;
        internalThread.interrupt();
    }

    public boolean isAlive() {
        return internalThread.isAlive();
    }

}
