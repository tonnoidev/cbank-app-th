package th.co.cbank.project.control;

import java.awt.Component;
import java.awt.Container;
import org.apache.log4j.Logger;

public class EnableControl {
    private final Logger logger = Logger.getLogger(EnableControl.class);

    public void enableComponents(Container container, boolean enable) {
        Component[] components = container.getComponents();
        for (Component component : components) {
            component.setEnabled(enable);
            if (component instanceof Container) {
                enableComponents((Container) component, enable);
            }
        }
    }
}
