package panels;

import Classes.Colors;
import java.awt.Color;
import javax.swing.JPanel;


public class RegistrationPanel extends javax.swing.JPanel {

    
    Color background = new Color(153,153,153);
    Color unselectedColor = new Color(51, 51, 51);


    private static RegistrationPanel instance;
    
    private RegistrationPanel() {
        initComponents();
        setBackgroundColor();
        
        memberbtn.setSelected(true);
        memberbtn.setBackground(background);
    }
    
    public static RegistrationPanel getInstance(){
        if (instance == null) {
            instance = new RegistrationPanel();
        }
        return instance;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        ViewWorkoutPlan = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jButton9 = new javax.swing.JButton();
        ViewPackage = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        titleBar = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        staffbtn = new javax.swing.JToggleButton();
        supplierbtn = new javax.swing.JToggleButton();
        memberbtn = new javax.swing.JToggleButton();
        parentPanel = new javax.swing.JPanel();
        memberRegistration = new javax.swing.JPanel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        dateChooserCombo2 = new datechooser.beans.DateChooserCombo();
        jLabel6 = new javax.swing.JLabel();
        lastnameText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        middlenameTet = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        firstnameText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nixText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        membernoText = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        supplieraddproductButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        viewpkgButton = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        staffRegistration = new javax.swing.JPanel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        dateChooserCombo3 = new datechooser.beans.DateChooserCombo();
        jLabel20 = new javax.swing.JLabel();
        lastnameText1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        middlenameTet1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        firstnameText1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        nixText1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        membernoText1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        supplieraddproductButton1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        jSeparator24 = new javax.swing.JSeparator();
        jSeparator25 = new javax.swing.JSeparator();
        jSeparator27 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jSeparator29 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Workout plans");
        jPanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 50));

        jTable2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Workout Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable2);

        jPanel6.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 310, 340));

        jList4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane8.setViewportView(jList4);

        jPanel6.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 310, 340));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setText("Select");
        jPanel6.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 450, 90, 30));

        ViewWorkoutPlan.getContentPane().add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel8.setBackground(new java.awt.Color(153, 153, 153));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Packages");
        jPanel8.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 50));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category ", "Package", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jPanel8.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 820, 240));

        ViewPackage.getContentPane().add(jPanel8, java.awt.BorderLayout.CENTER);

        setPreferredSize(new java.awt.Dimension(1206, 708));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleBar.setBackground(new java.awt.Color(51, 51, 51));
        titleBar.setFocusable(false);
        titleBar.setPreferredSize(new java.awt.Dimension(1206, 740));
        titleBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        titleLabel.setText(".... Registration");
        titleBar.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 230, 40));

        staffbtn.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(staffbtn);
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
        buttonGroup1.add(supplierbtn);
        supplierbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        supplierbtn.setForeground(new java.awt.Color(255, 255, 255));
        supplierbtn.setText("Supplier");
        supplierbtn.setBorderPainted(false);
        supplierbtn.setContentAreaFilled(false);
        supplierbtn.setFocusPainted(false);
        supplierbtn.setOpaque(true);
        titleBar.add(supplierbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 130, 40));

        memberbtn.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(memberbtn);
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

        add(titleBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1206, 40));

        parentPanel.setLayout(new java.awt.CardLayout());

        memberRegistration.setBackground(new java.awt.Color(153, 153, 153));
        memberRegistration.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox2.setText("Female");
        jCheckBox2.setContentAreaFilled(false);
        memberRegistration.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 600, -1, 30));

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox3.setText("Male");
        jCheckBox3.setContentAreaFilled(false);
        memberRegistration.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, -1, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Gender");
        memberRegistration.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 110, 30));

        dateChooserCombo2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        dateChooserCombo2.setEnabled(false);
        dateChooserCombo2.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 14));
        memberRegistration.add(dateChooserCombo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 250, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Date of Birth");
        memberRegistration.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 110, 30));

        lastnameText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lastnameText.setBorder(null);
        lastnameText.setOpaque(false);
        memberRegistration.add(lastnameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 320, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Last Name");
        memberRegistration.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 110, 30));

        middlenameTet.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        middlenameTet.setBorder(null);
        middlenameTet.setOpaque(false);
        memberRegistration.add(middlenameTet, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 320, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Middle Name");
        memberRegistration.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 110, 30));

        firstnameText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        firstnameText.setBorder(null);
        firstnameText.setOpaque(false);
        memberRegistration.add(firstnameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 320, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("First Name");
        memberRegistration.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 110, 30));

        nixText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nixText.setBorder(null);
        nixText.setOpaque(false);
        memberRegistration.add(nixText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 320, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("NIC");
        memberRegistration.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 110, 30));

        membernoText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        membernoText.setBorder(null);
        membernoText.setOpaque(false);
        memberRegistration.add(membernoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 320, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Member No");
        memberRegistration.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 110, 30));

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField9.setBorder(null);
        jTextField9.setOpaque(false);
        memberRegistration.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 320, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Contact No1");
        memberRegistration.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 90, 30));

        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField10.setBorder(null);
        jTextField10.setOpaque(false);
        memberRegistration.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 320, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Contat No2");
        memberRegistration.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 90, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("No");
        memberRegistration.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 90, 30));

        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField11.setBorder(null);
        jTextField11.setOpaque(false);
        memberRegistration.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 320, 30));

        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField12.setBorder(null);
        jTextField12.setOpaque(false);
        memberRegistration.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 320, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Street 1");
        memberRegistration.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 90, 30));

        jTextField13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField13.setBorder(null);
        jTextField13.setOpaque(false);
        memberRegistration.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 320, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Street 2");
        memberRegistration.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 90, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("City");
        memberRegistration.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 90, 30));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setBorder(null);
        jTextField1.setOpaque(false);
        memberRegistration.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, 320, 30));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox2.setBorder(null);
        jComboBox2.setOpaque(false);
        memberRegistration.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 80, 310, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Package");
        memberRegistration.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, 110, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Payment Type");
        memberRegistration.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 130, 110, 30));

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField7.setBorder(null);
        jTextField7.setOpaque(false);
        memberRegistration.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 230, 220, 30));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setBorder(null);
        jComboBox1.setOpaque(false);
        memberRegistration.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 160, 310, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Amount");
        memberRegistration.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 220, 90, 30));

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField8.setBorder(null);
        jTextField8.setOpaque(false);
        memberRegistration.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, 310, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Card No");
        memberRegistration.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 290, 90, 30));

        jCheckBox4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox4.setText("Activate");
        jCheckBox4.setContentAreaFilled(false);
        jCheckBox4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        memberRegistration.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 380, 100, -1));

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox1.setText("Deactivate");
        jCheckBox1.setContentAreaFilled(false);
        jCheckBox1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        memberRegistration.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 380, 100, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Add Card  No");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setFocusPainted(false);
        memberRegistration.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 570, 220, 35));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("View Members");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setFocusPainted(false);
        memberRegistration.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 530, 220, 35));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Edit Details");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setFocusPainted(false);
        memberRegistration.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 490, 220, 35));

        supplieraddproductButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        supplieraddproductButton.setText("Save Member");
        supplieraddproductButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        supplieraddproductButton.setFocusPainted(false);
        memberRegistration.add(supplieraddproductButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 450, 220, 35));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Refresh (ctrl+r)");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setFocusPainted(false);
        memberRegistration.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 610, 220, 35));
        memberRegistration.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 330, 10));
        memberRegistration.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, 330, 10));
        memberRegistration.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 330, 10));
        memberRegistration.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 330, 10));
        memberRegistration.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 330, 10));
        memberRegistration.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 330, 10));
        memberRegistration.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 350, 320, 10));
        memberRegistration.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 330, 10));
        memberRegistration.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 330, 10));
        memberRegistration.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 330, 10));
        memberRegistration.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 330, 10));
        memberRegistration.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 330, 10));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);
        memberRegistration.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 380, 620));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setOpaque(false);
        memberRegistration.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 390, 620));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewpkgButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewpkgButton.setText("View Package");
        viewpkgButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewpkgButton.setBorderPainted(false);
        viewpkgButton.setContentAreaFilled(false);
        viewpkgButton.setFocusPainted(false);
        viewpkgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewpkgButtonActionPerformed(evt);
            }
        });
        jPanel3.add(viewpkgButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 140, 35));
        jPanel3.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 100, 10));

        memberRegistration.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 370, 410));
        memberRegistration.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 260, 210, 10));

        parentPanel.add(memberRegistration, "card2");

        staffRegistration.setBackground(new java.awt.Color(153, 153, 153));
        staffRegistration.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox5.setText("Female");
        jCheckBox5.setContentAreaFilled(false);
        staffRegistration.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 600, -1, 30));

        jCheckBox6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox6.setText("Male");
        jCheckBox6.setContentAreaFilled(false);
        staffRegistration.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, -1, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Gender");
        staffRegistration.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 110, 30));

        dateChooserCombo3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        dateChooserCombo3.setEnabled(false);
        dateChooserCombo3.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 14));
        staffRegistration.add(dateChooserCombo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 250, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Date of Birth");
        staffRegistration.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 110, 30));

        lastnameText1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lastnameText1.setBorder(null);
        lastnameText1.setOpaque(false);
        staffRegistration.add(lastnameText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 320, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Last Name");
        staffRegistration.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 110, 30));

        middlenameTet1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        middlenameTet1.setBorder(null);
        middlenameTet1.setOpaque(false);
        staffRegistration.add(middlenameTet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 320, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Middle Name");
        staffRegistration.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 110, 30));

        firstnameText1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        firstnameText1.setBorder(null);
        firstnameText1.setOpaque(false);
        staffRegistration.add(firstnameText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 320, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("First Name");
        staffRegistration.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 110, 30));

        nixText1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nixText1.setBorder(null);
        nixText1.setOpaque(false);
        staffRegistration.add(nixText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 320, 30));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("NIC");
        staffRegistration.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 110, 30));

        membernoText1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        membernoText1.setBorder(null);
        membernoText1.setOpaque(false);
        staffRegistration.add(membernoText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 320, 30));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Staff No");
        staffRegistration.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 110, 30));

        jTextField14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField14.setBorder(null);
        jTextField14.setOpaque(false);
        staffRegistration.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 320, 30));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Contact No1");
        staffRegistration.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 90, 30));

        jTextField15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField15.setBorder(null);
        jTextField15.setOpaque(false);
        staffRegistration.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 320, 30));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Contat No2");
        staffRegistration.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 90, 30));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("No");
        staffRegistration.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 90, 30));

        jTextField16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField16.setBorder(null);
        jTextField16.setOpaque(false);
        staffRegistration.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 320, 30));

        jTextField17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField17.setBorder(null);
        jTextField17.setOpaque(false);
        staffRegistration.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 320, 30));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Street 1");
        staffRegistration.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 90, 30));

        jTextField18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField18.setBorder(null);
        jTextField18.setOpaque(false);
        staffRegistration.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 320, 30));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("Street 2");
        staffRegistration.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 90, 30));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("City");
        staffRegistration.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 90, 30));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.setBorder(null);
        jTextField2.setOpaque(false);
        staffRegistration.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, 320, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Add Card  No");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setFocusPainted(false);
        staffRegistration.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 570, 220, 35));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("View Staff");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.setFocusPainted(false);
        staffRegistration.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 530, 220, 35));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("Edit Details");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.setFocusPainted(false);
        staffRegistration.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 490, 220, 35));

        supplieraddproductButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        supplieraddproductButton1.setText("Save Staff");
        supplieraddproductButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        supplieraddproductButton1.setFocusPainted(false);
        supplieraddproductButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplieraddproductButton1ActionPerformed(evt);
            }
        });
        staffRegistration.add(supplieraddproductButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 450, 220, 35));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("Refresh (ctrl+r)");
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.setFocusPainted(false);
        staffRegistration.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 610, 220, 35));

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        staffRegistration.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 90, 330, 180));
        staffRegistration.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 330, 10));
        staffRegistration.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, 330, 10));
        staffRegistration.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 330, 10));
        staffRegistration.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 330, 10));
        staffRegistration.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 330, 10));
        staffRegistration.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 330, 10));
        staffRegistration.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 330, 10));
        staffRegistration.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 330, 10));
        staffRegistration.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 330, 10));
        staffRegistration.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 330, 10));
        staffRegistration.add(jSeparator27, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 330, 10));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setOpaque(false);
        staffRegistration.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 380, 620));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contact Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.setOpaque(false);
        staffRegistration.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 390, 620));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("Discription");
        staffRegistration.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, 110, 30));

        jTextField21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField21.setBorder(null);
        jTextField21.setOpaque(false);
        staffRegistration.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 290, 220, 30));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setText("Payment");
        staffRegistration.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 290, 90, 30));

        jCheckBox8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox8.setText("Activate");
        jCheckBox8.setContentAreaFilled(false);
        jCheckBox8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        staffRegistration.add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 380, 100, -1));

        jCheckBox9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox9.setText("Deactivate");
        jCheckBox9.setContentAreaFilled(false);
        jCheckBox9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        staffRegistration.add(jCheckBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 380, 100, -1));
        staffRegistration.add(jSeparator29, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 320, 240, 10));

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Package Enrollment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel7.setOpaque(false);
        staffRegistration.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 370, 410));

        parentPanel.add(staffRegistration, "card3");

        add(parentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1206, 668));
    }// </editor-fold>//GEN-END:initComponents

    private void memberbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberbtnActionPerformed
         
            unseletButton();
            memberbtn.setSelected(true);
            memberbtn.setBackground(background);
            
            parentPanel.removeAll();
            parentPanel.add(memberRegistration);
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

    private void supplieraddproductButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplieraddproductButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplieraddproductButton1ActionPerformed

    private void viewpkgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewpkgButtonActionPerformed
       ViewPackage.pack();
       ViewPackage.setLocationRelativeTo(null);
       ViewPackage.setVisible(true);
    }//GEN-LAST:event_viewpkgButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog ViewPackage;
    private javax.swing.JDialog ViewWorkoutPlan;
    private javax.swing.ButtonGroup buttonGroup1;
    private datechooser.beans.DateChooserCombo dateChooserCombo2;
    private datechooser.beans.DateChooserCombo dateChooserCombo3;
    private javax.swing.JTextField firstnameText;
    private javax.swing.JTextField firstnameText1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField lastnameText;
    private javax.swing.JTextField lastnameText1;
    private javax.swing.JPanel memberRegistration;
    private javax.swing.JToggleButton memberbtn;
    private javax.swing.JTextField membernoText;
    private javax.swing.JTextField membernoText1;
    private javax.swing.JTextField middlenameTet;
    private javax.swing.JTextField middlenameTet1;
    private javax.swing.JTextField nixText;
    private javax.swing.JTextField nixText1;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JPanel staffRegistration;
    private javax.swing.JToggleButton staffbtn;
    private javax.swing.JButton supplieraddproductButton;
    private javax.swing.JButton supplieraddproductButton1;
    private javax.swing.JToggleButton supplierbtn;
    private javax.swing.JPanel titleBar;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton viewpkgButton;
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
        supplierbtn.setSelected(false);
        supplierbtn.setBackground(unselectedColor);
    }
   
}
