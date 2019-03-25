package th.co.cbank.util;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import org.apache.log4j.Logger;
import th.co.cbank.project.constants.AppConstants;

public final class DateChooseDialog extends javax.swing.JDialog {
    private final Logger logger = Logger.getLogger(DateChooseDialog.class);
    private GregorianCalendar curDay;
    private final SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    private boolean ok;
    private Timer time;
    private Calendar selectedDate;
    private int monthSelected;

    public boolean isOk() {
        return ok;
    }

    public DateChooseDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        SimpleDateFormat sss = new SimpleDateFormat("yyyy");
        int yearCurrent = Integer.parseInt(sss.format(new Date()));
        spYear.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(yearCurrent), null, null, Integer.valueOf(1)));

        SimpleDateFormat sM = new SimpleDateFormat("MM");
        int month = Integer.parseInt(sM.format(new Date()));
        monthSelected = month;
        cbMonth.setSelectedIndex(monthSelected - 1);

        initTable(tblCalendar);

        curDay = (GregorianCalendar) Calendar.getInstance();
        lbToday.setText("วันนี้ : " + df.format(new Date()));
        time = new Timer(1000, new TimeShow());
        time.start();
        spYear.setEditor(new JSpinner.NumberEditor(spYear, "####0"));

        showCalendar();

    }

    public DateChooseDialog(java.awt.Frame parent, boolean modal, Point point) {
        this(parent, modal);
        this.setLocation(point);

        SimpleDateFormat sss = new SimpleDateFormat("yyyy");
        int yearCurrent = Integer.parseInt(sss.format(new Date()));
        spYear.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(yearCurrent), null, null, Integer.valueOf(1)));
        lbToday.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmdBack = new javax.swing.JButton();
        cmdForward = new javax.swing.JButton();
        lbToday = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCalendar = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCalendar1 = new javax.swing.JTable();
        cbMonth = new javax.swing.JComboBox();
        spYear = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calendar (V.0.0.3)");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        cmdBack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdBack.setText("<<");
        cmdBack.setFocusable(false);
        cmdBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBackActionPerformed(evt);
            }
        });

        cmdForward.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdForward.setText(">>");
        cmdForward.setFocusable(false);
        cmdForward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdForwardActionPerformed(evt);
            }
        });

        lbToday.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbToday.setText("วันนี้: ");
        lbToday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbTodayActionPerformed(evt);
            }
        });

        tblCalendar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblCalendar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0", "1", "2", "3", "4", "5", "6"},
                {"7", "8", "9", "10", "11", "12", "13"},
                {"14", "15", "16", "17", "18", "19", "20"},
                {"21", "22", "23", "24", "25", "26", "27"},
                {"28", "29", "30", "31", "32", "33", "34"},
                {"35", "36", "37", "38", "39", "40", "41"}
            },
            new String [] {
                "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCalendar.getTableHeader().setResizingAllowed(false);
        tblCalendar.getTableHeader().setReorderingAllowed(false);
        tblCalendar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblCalendarFocusGained(evt);
            }
        });
        tblCalendar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblCalendarMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblCalendar);

        tblCalendar1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblCalendar1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0", "1", "2", "3", "4", "5", "6"},
                {"7", "8", "9", "10", "11", "12", "13"},
                {"14", "15", "16", "17", "18", "19", "20"},
                {"21", "22", "23", "24", "25", "26", "27"},
                {"28", "29", "30", "31", "32", "33", "34"},
                {"35", "36", "37", "38", "39", "40", "41"}
            },
            new String [] {
                "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCalendar1.getTableHeader().setResizingAllowed(false);
        tblCalendar1.getTableHeader().setReorderingAllowed(false);
        tblCalendar1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblCalendarFocusGained(evt);
            }
        });
        tblCalendar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblCalendarMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblCalendar1);

        cbMonth.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "มกราคม", "กุมภาพันธ์", "มีนาคม", "เมษายน", "พฤษภาคม", "มิถุนายน", "กรกฏาคม", "สิงหาคม", "กันยายน", "ตุลาคม", "พฤศจิกายน", "ธันวาคม" }));
        cbMonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMonthItemStateChanged(evt);
            }
        });
        cbMonth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbMonthKeyPressed(evt);
            }
        });

        spYear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        spYear.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(2558), null, null, Integer.valueOf(1)));
        spYear.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spYearStateChanged(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmdBack, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(cmdForward, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(lbToday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(spYear, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spYear, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdForward, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbToday, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(369, 251));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblCalendarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCalendarMouseReleased
        if (evt.getClickCount() == 2) {
            initSelectDate();
        }
}//GEN-LAST:event_tblCalendarMouseReleased

    private void cmdForwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdForwardActionPerformed
        forward();
}//GEN-LAST:event_cmdForwardActionPerformed

    private void cmdBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBackActionPerformed
        backward();
}//GEN-LAST:event_cmdBackActionPerformed

    int count = 0;
    private void spYearStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spYearStateChanged
        //doInputAction();
        tblCalendar.requestFocus();
    }//GEN-LAST:event_spYearStateChanged

private void cbMonthKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbMonthKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        selectedDate = null;
        dispose();
    }
}//GEN-LAST:event_cbMonthKeyPressed

    private void lbTodayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbTodayActionPerformed
        selectedDate = Calendar.getInstance();
        dispose();
    }//GEN-LAST:event_lbTodayActionPerformed

    private void tblCalendarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblCalendarFocusGained
        System.out.println("tbl request focus");
        doInputAction();
    }//GEN-LAST:event_tblCalendarFocusGained

    private void cbMonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMonthItemStateChanged
        if (evt.getStateChange() == 2) {
            monthSelected = cbMonth.getSelectedIndex();
            tblCalendar.requestFocus();
        }
    }//GEN-LAST:event_cbMonthItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbMonth;
    private javax.swing.JButton cmdBack;
    private javax.swing.JButton cmdForward;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton lbToday;
    private javax.swing.JSpinner spYear;
    private javax.swing.JTable tblCalendar;
    private javax.swing.JTable tblCalendar1;
    // End of variables declaration//GEN-END:variables

    private DefaultTableModel model;

    private void initTable(JTable table) {
        //Setting column size
        model = (DefaultTableModel) table.getModel();
        table.setShowGrid(true);
        //table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.setRowSelectionAllowed(true);
        table.setShowGrid(true);
        table.setBackground(Color.WHITE);
        table.setGridColor(Color.LIGHT_GRAY);

        JTableHeader header = table.getTableHeader();
        header.setFont(new java.awt.Font(AppConstants.DEFAULT_FONT, java.awt.Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        table.setFont(new java.awt.Font(AppConstants.DEFAULT_FONT, java.awt.Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        table.setRowHeight(22);

        table.setCellSelectionEnabled(true);

        //Setting column size
        TableColumn column;
        int[] colSize = {37, 38, 37, 38, 37, 37, 37};
        for (int i = 0; i < colSize.length; i++) {
            column = table.getColumnModel().getColumn(i);
            column.setPreferredWidth(colSize[i]);
            column.setResizable(false);
        }

        TableColumnModel tcm = table.getColumnModel();

        DefaultTableCellRenderer d;

        d = new DefaultTableCellRenderer();
        d.setHorizontalAlignment(SwingConstants.CENTER);
        tcm.getColumn(0).setCellRenderer(d);
        tcm.getColumn(1).setCellRenderer(d);
        tcm.getColumn(2).setCellRenderer(d);
        tcm.getColumn(3).setCellRenderer(d);
        tcm.getColumn(4).setCellRenderer(d);
        tcm.getColumn(5).setCellRenderer(d);
        tcm.getColumn(6).setCellRenderer(d);

    }

    private int numMonth(int year, int month, int day) {
        Calendar c = Calendar.getInstance(Locale.ENGLISH);
        c.set(year, month, day);
        int maxDayOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
        return maxDayOfMonth;
    }

    private void showCalendar() {
        resetTableModel(model);

        Calendar c = Calendar.getInstance();
        c.set(Calendar.MONTH, monthSelected);
        int year = Integer.parseInt(spYear.getValue().toString());
        c.set(Calendar.YEAR, year);

        c.set(Calendar.DAY_OF_MONTH, 1);
        int index = c.get(Calendar.DAY_OF_WEEK) - 1;
        int numMonth = numMonth(year, monthSelected, 1);
        int numDay = 1;
        int[] weeks = new int[42];
        boolean chk = false;
        for (int i = 0; i < 43; i++) {
            if (i == index) {
                weeks[i] = numDay;
                chk = true;
                numDay++;
            } else if (chk == true) {
                if (numDay <= numMonth) {
                    weeks[i] = numDay;
                    numDay++;
                } else {
                }
            } else {
                weeks[i] = 0;
            }
        }

        String[] week1 = new String[7];
        String[] week2 = new String[7];
        String[] week3 = new String[7];
        String[] week4 = new String[7];
        String[] week5 = new String[7];
        String[] week6 = new String[7];
        week1 = addWeek(weeks, week1, 1);
        week2 = addWeek(weeks, week2, 2);
        week3 = addWeek(weeks, week3, 3);
        week4 = addWeek(weeks, week4, 4);
        week5 = addWeek(weeks, week5, 5);
        week6 = addWeek(weeks, week6, 6);

        model.addRow(week1);
        model.addRow(week2);
        model.addRow(week3);
        model.addRow(week4);
        model.addRow(week5);
        model.addRow(week6);
    }

    private String[] addWeek(int[] weeks, String[] week, int weekofmount) {
        if (weekofmount == 1) {
            for (int i = 0; i < week.length; i++) {
                int day = weeks[i];
                week[i] = day == 0 ? "" : String.valueOf(day);
            }
        } else if (weekofmount == 2) {
            for (int i = 0; i < week.length; i++) {
                int day = weeks[i + 7];
                week[i] = day == 0 ? "" : String.valueOf(day);
            }
        } else if (weekofmount == 3) {
            for (int i = 0; i < week.length; i++) {
                int day = weeks[i + 14];
                week[i] = day == 0 ? "" : String.valueOf(day);
            }
        } else if (weekofmount == 4) {
            for (int i = 0; i < week.length; i++) {
                int day = weeks[i + 21];
                week[i] = day == 0 ? "" : String.valueOf(day);
            }
        } else if (weekofmount == 5) {
            for (int i = 0; i < week.length; i++) {
                int day = weeks[i + 28];
                week[i] = day == 0 ? "" : String.valueOf(day);
            }
        } else if (weekofmount == 6) {
            for (int i = 0; i < week.length; i++) {
                int day = weeks[i + 35];
                week[i] = day == 0 ? "" : String.valueOf(day);
            }
        }
        return week;
    }

    private void resetTableModel(DefaultTableModel model) {
        int rowCount = model.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            model.removeRow(0);
        }
    }

    /**
     * @return the selectedDate
     */
    public Calendar getSelectDate() {
        return selectedDate;
    }

    public String getDateString() {
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
        return s.format(selectedDate.getTime());
    }

    private void initSelectDate() {
        int row = tblCalendar.getSelectedRow();
        int column = tblCalendar.getSelectedColumn();
        String ndate = (String) model.getValueAt(row, column);
        if (!ndate.equals("")) {
            int dayn = Integer.parseInt(ndate);
            int month = cbMonth.getSelectedIndex();
            int year;
            try {
                year = Integer.parseInt(String.valueOf(spYear.getValue()));
                Calendar sDate = Calendar.getInstance();
                sDate.set(Calendar.YEAR, year);
                sDate.set(Calendar.MONTH, month);
                sDate.set(Calendar.DAY_OF_MONTH, dayn);

                selectedDate = sDate;
                System.out.println(selectedDate.getTime());
                dispose();
            } catch (NumberFormatException e) {
                e.printStackTrace();
                selectedDate = null;
            }

        }
    }

    private void doInputAction() {
        int year = Integer.parseInt(String.valueOf(spYear.getValue()));
        curDay = new GregorianCalendar(year, monthSelected - 1, 1);
        showCalendar();
    }

    private void forward() {
        int forward = cbMonth.getSelectedIndex() + 1;
        if (forward == 12) {
            forward = 0;
            int year = Integer.parseInt(spYear.getValue().toString()) + 1;
            spYear.setValue(year);
        }
        cbMonth.setSelectedIndex(forward);
        doInputAction();
    }

    private void backward() {
        int back = cbMonth.getSelectedIndex() - 1;
        if (back == -1) {
            back = 11;
            int year = Integer.parseInt(spYear.getValue().toString()) - 1;
            spYear.setValue(year);
        }
        cbMonth.setSelectedIndex(back);
        doInputAction();
    }

    private class TimeShow implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            lbToday.setText("วันนี้ : " + df.format(new Date()));
        }
    }
}
