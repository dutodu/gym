package panels;

import Classes.Colors;
import java.awt.Color;
import javax.swing.JPanel;


public class Invoice extends javax.swing.JPanel {

    
    Color background = new Color(153,153,153);
    Color unselectedColor = new Color(51, 51, 51);


    private static Invoice instance;
    
    private Invoice() {
        initComponents();
        setBackgroundColor();
        
        memberbtn.setSelected(true);
        memberbtn.setBackground(background);
    }
    
    public static Invoice getInstance(){
        if (instance == null) {
            instance = new Invoice();
        }
        return instance;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        titleBar = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        staffbtn = new javax.swing.JToggleButton();
        memberbtn = new javax.swing.JToggleButton();
        parentPanel = new javax.swing.JPanel();
        staffRegistration = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        dateChooserCombo2 = new datechooser.beans.DateChooserCombo();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1206, 708));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleBar.setBackground(new java.awt.Color(51, 51, 51));
        titleBar.setFocusable(false);
        titleBar.setPreferredSize(new java.awt.Dimension(1206, 740));
        titleBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        titleLabel.setText(".... Invoice");
        titleBar.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, 230, 40));

        staffbtn.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(staffbtn);
        staffbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        staffbtn.setForeground(new java.awt.Color(255, 255, 255));
        staffbtn.setText("Suppliment");
        staffbtn.setBorderPainted(false);
        staffbtn.setContentAreaFilled(false);
        staffbtn.setFocusPainted(false);
        staffbtn.setOpaque(true);
        staffbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffbtnActionPerformed(evt);
            }
        });
        titleBar.add(staffbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 130, 40));

        memberbtn.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(memberbtn);
        memberbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        memberbtn.setForeground(new java.awt.Color(255, 255, 255));
        memberbtn.setText("Fee");
        memberbtn.setBorderPainted(false);
        memberbtn.setContentAreaFilled(false);
        memberbtn.setFocusPainted(false);
        memberbtn.setOpaque(true);
        memberbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberbtnActionPerformed(evt);
            }
        });
        titleBar.add(memberbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 40));

        add(titleBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1206, 40));

        parentPanel.setLayout(new java.awt.CardLayout());

        staffRegistration.setBackground(new java.awt.Color(153, 153, 153));
        staffRegistration.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("NIC");
        staffRegistration.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Card No");
        staffRegistration.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Balance");
        staffRegistration.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, 60, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("To");
        staffRegistration.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, -1, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Invoice ID");
        staffRegistration.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("From");
        staffRegistration.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice ID", "NIC", "Card No", "Amount", "From", "To", "Paid Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        staffRegistration.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 1130, 290));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        staffRegistration.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 210, 30));

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        staffRegistration.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 210, 30));

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        staffRegistration.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 210, 30));

        dateChooserCombo1.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 14));
        staffRegistration.add(dateChooserCombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 210, 30));

        dateChooserCombo2.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 14));
        staffRegistration.add(dateChooserCombo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 210, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Paid");
        staffRegistration.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 180, 30));

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("NIC");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 270, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Card No");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 270, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Contact No");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 270, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Name");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 270, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("NIC:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Name:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 90, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Contact No:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 90, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Card No:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 90, 30));

        staffRegistration.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, 410, 190));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Amount");
        staffRegistration.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 30));

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        staffRegistration.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 210, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Amount");
        staffRegistration.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 250, -1, 30));

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        staffRegistration.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 250, 210, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Amount");
        staffRegistration.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 210, 40));

        parentPanel.add(staffRegistration, "card3");

        add(parentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1206, 668));
    }// </editor-fold>//GEN-END:initComponents

    private void memberbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberbtnActionPerformed
         
            unseletButton();
            memberbtn.setSelected(true);
            memberbtn.setBackground(background);
            
            parentPanel.removeAll();
            parentPanel.repaint();
            parentPanel.revalidate();
            parentPanel.setVisible(true);
        
    }//GEN-LAST:event_memberbtnActionPerformed

    private void staffbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffbtnActionPerformed
            unseletButton();
            staffbtn.setSelected(true);
            staffbtn.setBackground(background);
            
            parentPanel.removeAll();
            parentPanel.add(staffRegistration);
            parentPanel.repaint();
            parentPanel.revalidate();
            parentPanel.setVisible(true);
    }//GEN-LAST:event_staffbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private datechooser.beans.DateChooserCombo dateChooserCombo2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JToggleButton memberbtn;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JPanel staffRegistration;
    private javax.swing.JToggleButton staffbtn;
    private javax.swing.JPanel titleBar;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    public void setBackgroundColor(){
        Color backGroundCOlor = Classes.Colors.defaultbackground;
        this.setBackground(backGroundCOlor);
    }
    

    private void unseletButton() {
        memberbtn.setSelected(false);
        memberbtn.setBackground(unselectedColor);
        staffbtn.setSelected(false);
        staffbtn.setBackground(unselectedColor);
    }
   
}
