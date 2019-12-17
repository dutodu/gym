package panels;

import java.awt.Color;


public class database extends javax.swing.JPanel {

    
    Color background = new Color(153,153,153);
    Color unselectedColor = new Color(51, 51, 51);

    
    public database() {
        initComponents();
        memberbtn.setSelected(true);
        memberbtn.setBackground(background);
    }
    
    
    private static database instance; 
    public static database getInstance(){
        if (instance == null) {
            instance = new database();
        }
        return instance;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleBar = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        memberbtn = new javax.swing.JToggleButton();
        staffbtn = new javax.swing.JToggleButton();
        supplierbtn = new javax.swing.JToggleButton();
        parentPanel = new javax.swing.JPanel();
        searchStaff = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jComboBox5 = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        searchMember = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        titleBar.setBackground(new java.awt.Color(51, 51, 51));
        titleBar.setFocusable(false);
        titleBar.setPreferredSize(new java.awt.Dimension(1206, 740));
        titleBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        titleLabel.setText(".... Registration");
        titleBar.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 230, 40));

        memberbtn.setBackground(new java.awt.Color(51, 51, 51));
        memberbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        memberbtn.setForeground(new java.awt.Color(255, 255, 255));
        memberbtn.setText("Member");
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

        staffbtn.setBackground(new java.awt.Color(51, 51, 51));
        staffbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        staffbtn.setForeground(new java.awt.Color(255, 255, 255));
        staffbtn.setText("Staff");
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

        supplierbtn.setBackground(new java.awt.Color(51, 51, 51));
        supplierbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        supplierbtn.setForeground(new java.awt.Color(255, 255, 255));
        supplierbtn.setText("Supplier");
        supplierbtn.setBorderPainted(false);
        supplierbtn.setContentAreaFilled(false);
        supplierbtn.setFocusPainted(false);
        supplierbtn.setOpaque(true);
        titleBar.add(supplierbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 130, 40));

        parentPanel.setLayout(new java.awt.CardLayout());

        searchStaff.setBackground(new java.awt.Color(153, 153, 153));
        searchStaff.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nic", "Name", "Gender", "Contact No", "Address", "Payment", "Entroll Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        searchStaff.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 1150, 533));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchStaff.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 250, 30));

        searchStaff.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 270, 30));
        searchStaff.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 30, 30));

        jComboBox5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search by Name", "Search by Nic", "Load Activated", "Load Deactivated", "Load All", " " }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        searchStaff.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 140, 30));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("View Payments");
        searchStaff.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 30, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Sort By:");
        searchStaff.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, 30));

        jRadioButton5.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton5.setText("Alphabetical Order");
        jRadioButton5.setContentAreaFilled(false);
        searchStaff.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, -1, 30));

        jRadioButton6.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton6.setText("Entroll Date");
        jRadioButton6.setContentAreaFilled(false);
        searchStaff.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, -1, 30));

        parentPanel.add(searchStaff, "card2");

        searchMember.setBackground(new java.awt.Color(153, 153, 153));
        searchMember.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nic", "Name", "Dob", "Gender", "Contact No", "Address", "Entroll Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        searchMember.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 1150, 533));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchMember.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 250, 30));

        searchMember.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 270, 30));
        searchMember.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 30, 30));

        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search by Name", "Search by Code", "Search by Nic", "Load Activated", "Load Deactivated", "Load All", " " }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        searchMember.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 140, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Sort By:");
        searchMember.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, -1, 30));

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton1.setText("Entroll Date");
        jRadioButton1.setContentAreaFilled(false);
        searchMember.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, -1, 30));

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton2.setText("Alphabetical Order");
        jRadioButton2.setContentAreaFilled(false);
        searchMember.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, 30));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("View Payments");
        searchMember.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 30, -1, 30));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("View Package");
        searchMember.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, -1, 30));

        parentPanel.add(searchMember, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1206, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(titleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(parentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 708, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(titleBar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(parentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void memberbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberbtnActionPerformed

        unseletButton();
        memberbtn.setSelected(true);
        memberbtn.setBackground(background);

        parentPanel.removeAll();
        parentPanel.add(searchMember);
        parentPanel.repaint();
        parentPanel.revalidate();
        parentPanel.setVisible(true);

    }//GEN-LAST:event_memberbtnActionPerformed

    private void staffbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffbtnActionPerformed
        unseletButton();
        staffbtn.setSelected(true);
        staffbtn.setBackground(background);

        parentPanel.removeAll();
        parentPanel.add(searchStaff);
        parentPanel.repaint();
        parentPanel.revalidate();
        parentPanel.setVisible(true);
    }//GEN-LAST:event_staffbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton memberbtn;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JPanel searchMember;
    private javax.swing.JPanel searchStaff;
    private javax.swing.JToggleButton staffbtn;
    private javax.swing.JToggleButton supplierbtn;
    private javax.swing.JPanel titleBar;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    
    private void unseletButton() {
        memberbtn.setSelected(false);
        memberbtn.setBackground(unselectedColor);
        staffbtn.setSelected(false);
        staffbtn.setBackground(unselectedColor);
        supplierbtn.setSelected(false);
        supplierbtn.setBackground(unselectedColor);
    }
   

}

