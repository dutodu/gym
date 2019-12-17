package panels;

public class staffregistrationPanel extends javax.swing.JPanel {

    private static staffregistrationPanel instance;

    private staffregistrationPanel() {
        initComponents();
    }

    public static staffregistrationPanel getInstance() {
        if (instance == null) {
            instance = new staffregistrationPanel();
        }
        return instance;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        memberregistrationPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        showButton = new javax.swing.JButton();
        captureButton = new javax.swing.JButton();
        staffactivateCheckBox = new javax.swing.JCheckBox();
        browseButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        staffidText = new javax.swing.JTextField();
        nixText = new javax.swing.JTextField();
        firstnameText = new javax.swing.JTextField();
        middlenameTet = new javax.swing.JTextField();
        lastnameText = new javax.swing.JTextField();
        searchText = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        enrollDateChooser = new datechooser.beans.DateChooserCombo();
        dobDateChooser = new datechooser.beans.DateChooserCombo();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        searchDropDown = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        jTextField14 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        staffTable = new javax.swing.JTable();
        jComboBox3 = new javax.swing.JComboBox<>();
        searchtypeCombo = new javax.swing.JComboBox<>();
        activeCombo = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        memberregistrationPanel.setBackground(new java.awt.Color(204, 204, 204));
        memberregistrationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Staff Registration             ");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        memberregistrationPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1206, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("NIC");
        memberregistrationPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 110, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("First Name");
        memberregistrationPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 110, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Middle Name");
        memberregistrationPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 110, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Last Name");
        memberregistrationPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 110, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Date of Birth");
        memberregistrationPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 110, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Gender");
        memberregistrationPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 110, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Contact No");
        memberregistrationPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 90, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Contat No");
        memberregistrationPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 90, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("No");
        memberregistrationPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 90, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Street 2");
        memberregistrationPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 90, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Staff ID");
        memberregistrationPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 110, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("City");
        memberregistrationPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 90, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Code");
        memberregistrationPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 300, 50, -1));

        imageLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        imageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        memberregistrationPanel.add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 60, 130, 140));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Street 1");
        memberregistrationPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 90, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Package");
        memberregistrationPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 250, 70, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Date");
        memberregistrationPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 350, 70, -1));

        showButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        showButton.setText("Show Staff");
        memberregistrationPanel.add(showButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 470, 170, 30));

        captureButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        captureButton.setText("Capture");
        captureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                captureButtonActionPerformed(evt);
            }
        });
        memberregistrationPanel.add(captureButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 90, 130, 35));

        staffactivateCheckBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        staffactivateCheckBox.setText("Activate Staff");
        staffactivateCheckBox.setContentAreaFilled(false);
        staffactivateCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        staffactivateCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffactivateCheckBoxActionPerformed(evt);
            }
        });
        memberregistrationPanel.add(staffactivateCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 350, -1));

        browseButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        browseButton.setText("Browse");
        memberregistrationPanel.add(browseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 130, 110, 35));

        addButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addButton.setText("Add New Staff");
        memberregistrationPanel.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 410, 170, 35));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        memberregistrationPanel.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 190, 30));

        staffidText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        staffidText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        memberregistrationPanel.add(staffidText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 200, 30));

        nixText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nixText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        memberregistrationPanel.add(nixText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 200, 30));

        firstnameText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        firstnameText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        memberregistrationPanel.add(firstnameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 200, 30));

        middlenameTet.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        middlenameTet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        memberregistrationPanel.add(middlenameTet, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 200, 30));

        lastnameText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lastnameText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        memberregistrationPanel.add(lastnameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 200, 30));

        searchText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        memberregistrationPanel.add(searchText, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 180, 30));

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        memberregistrationPanel.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 190, 30));

        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        memberregistrationPanel.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 190, 30));

        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        memberregistrationPanel.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 190, 30));

        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        memberregistrationPanel.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 190, 30));

        jTextField13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        memberregistrationPanel.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 190, 30));

        enrollDateChooser.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 14));
        memberregistrationPanel.add(enrollDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 350, 150, 25));

        dobDateChooser.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 14));
        memberregistrationPanel.add(dobDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 140, 25));

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox2.setText("Female");
        jCheckBox2.setContentAreaFilled(false);
        memberregistrationPanel.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox3.setText("Male");
        jCheckBox3.setContentAreaFilled(false);
        memberregistrationPanel.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, -1, -1));

        searchDropDown.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        memberregistrationPanel.add(searchDropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 210, 30));

        jLabel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        memberregistrationPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 350, 190));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enrollment Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        memberregistrationPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 360, 370));

        jLabel23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contact Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        memberregistrationPanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 350, 370));

        editButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editButton.setText("Edit Staff");
        memberregistrationPanel.add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 410, 170, 35));

        jTextField14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        memberregistrationPanel.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 300, 210, 30));

        jLabel24.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        memberregistrationPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, 350, 180));

        staffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Staff ID", "NIC", "Name", "DOB", "Gender", "Contact", "Address", "Package", "Code", "Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(staffTable);
        if (staffTable.getColumnModel().getColumnCount() > 0) {
            staffTable.getColumnModel().getColumn(0).setResizable(false);
            staffTable.getColumnModel().getColumn(1).setResizable(false);
            staffTable.getColumnModel().getColumn(2).setResizable(false);
            staffTable.getColumnModel().getColumn(3).setResizable(false);
            staffTable.getColumnModel().getColumn(4).setResizable(false);
            staffTable.getColumnModel().getColumn(5).setResizable(false);
            staffTable.getColumnModel().getColumn(6).setResizable(false);
            staffTable.getColumnModel().getColumn(7).setResizable(false);
            staffTable.getColumnModel().getColumn(8).setResizable(false);
            staffTable.getColumnModel().getColumn(9).setResizable(false);
            staffTable.getColumnModel().getColumn(10).setResizable(false);
        }

        memberregistrationPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 1090, 210));

        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        memberregistrationPanel.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 250, 210, 30));

        searchtypeCombo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchtypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search by Code", "Search by NIC", "Search by Name" }));
        memberregistrationPanel.add(searchtypeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 150, 30));

        activeCombo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        activeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Active/Deactive" }));
        memberregistrationPanel.add(activeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 470, 210, 30));

        add(memberregistrationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1206, 748));
    }// </editor-fold>//GEN-END:initComponents

    private void captureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_captureButtonActionPerformed
        
    }//GEN-LAST:event_captureButtonActionPerformed

    private void staffactivateCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffactivateCheckBoxActionPerformed
        
    }//GEN-LAST:event_staffactivateCheckBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> activeCombo;
    private javax.swing.JButton addButton;
    private javax.swing.JButton browseButton;
    private javax.swing.JButton captureButton;
    private datechooser.beans.DateChooserCombo dobDateChooser;
    private javax.swing.JButton editButton;
    private datechooser.beans.DateChooserCombo enrollDateChooser;
    private javax.swing.JTextField firstnameText;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField lastnameText;
    private javax.swing.JPanel memberregistrationPanel;
    private javax.swing.JTextField middlenameTet;
    private javax.swing.JTextField nixText;
    private javax.swing.JComboBox<String> searchDropDown;
    private javax.swing.JTextField searchText;
    private javax.swing.JComboBox<String> searchtypeCombo;
    private javax.swing.JButton showButton;
    private javax.swing.JTable staffTable;
    private javax.swing.JCheckBox staffactivateCheckBox;
    private javax.swing.JTextField staffidText;
    // End of variables declaration//GEN-END:variables
}
