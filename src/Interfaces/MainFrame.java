package Interfaces;

import java.awt.Color;
import javax.swing.JPanel;
import panels.dashboardPanel;
import panels.RegistrationPanel;
import panels.database;
import panels.packagemanagement;

public class MainFrame extends javax.swing.JFrame {

    Color background = new Color(153,153,153);
    Color unselectedColor = new Color(51, 51, 51);

    public MainFrame() {
        initComponents();

        loadingMethod();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        PackageManagement = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        categoryButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        addnewpackageButton = new javax.swing.JButton();
        editpackageButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        WorkoutPlanManagment = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        addnewButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        eercideButton = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList<>();
        addButton = new javax.swing.JButton();
        editplanButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        NewExercise = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        editeerciseButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jList6 = new javax.swing.JList<>();
        jTextField7 = new javax.swing.JTextField();
        addneweerciseButton = new javax.swing.JButton();
        buttonGroup2 = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        closeButton = new javax.swing.JButton();
        minimizeButton = new javax.swing.JButton();
        loadPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JToggleButton();
        supplierButton = new javax.swing.JToggleButton();
        databaseButton = new javax.swing.JToggleButton();
        memberButton = new javax.swing.JToggleButton();
        attendenceButton = new javax.swing.JToggleButton();
        accountantButton = new javax.swing.JToggleButton();
        stocktButton = new javax.swing.JToggleButton();
        storageButton = new javax.swing.JToggleButton();
        messageButton = new javax.swing.JToggleButton();
        reportButton = new javax.swing.JToggleButton();
        adminButton = new javax.swing.JToggleButton();
        accountButton = new javax.swing.JToggleButton();
        dashboardButton = new javax.swing.JToggleButton();
        logoPanel = new javax.swing.JPanel();

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Package Management");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Payment Type");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Amount");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Category Description");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 30));

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 190, 30));

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 210, 30));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 240, 30));

        categoryButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        categoryButton.setText("Add New Category");
        categoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryButtonActionPerformed(evt);
            }
        });
        jPanel2.add(categoryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, 30));

        jList2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(jList2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 220, 240));

        addnewpackageButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addnewpackageButton.setText("Add New Package");
        jPanel2.add(addnewpackageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 180, 30));

        editpackageButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editpackageButton.setText("Edit Package");
        jPanel2.add(editpackageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 180, 30));

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

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 860, 240));

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton1.setText("Couple");
        jRadioButton1.setContentAreaFilled(false);
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, 30));

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton2.setText("Single");
        jRadioButton2.setContentAreaFilled(false);
        jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Category Name");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 240, 110));

        PackageManagement.getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Workout plan Management");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Qty");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, 30));

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 220, 30));

        addnewButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addnewButton.setText("Add New Plan");
        jPanel3.add(addnewButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 180, 30));

        removeButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        removeButton.setText(">>");
        jPanel3.add(removeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 60, 30));

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

        jPanel3.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 340, 220));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Workout Name");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, 30));

        jList4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane8.setViewportView(jList4);

        jPanel3.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 220, 240));

        eercideButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        eercideButton.setText("Add New Exercise");
        eercideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eercideButtonActionPerformed(evt);
            }
        });
        jPanel3.add(eercideButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, 180, 30));

        jList5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane9.setViewportView(jList5);

        jPanel3.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 220, 240));

        addButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addButton.setText("<<");
        jPanel3.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 60, 30));

        editplanButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editplanButton.setText("Edit Plan");
        jPanel3.add(editplanButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 180, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Exercises");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, 30));

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 220, 30));

        WorkoutPlanManagment.getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("New Exercise");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 50));

        editeerciseButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editeerciseButton.setText("Edit Eercise");
        jPanel4.add(editeerciseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 160, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Exerce Name");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 30));

        jList6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane10.setViewportView(jList6);

        jPanel4.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 220, 250));

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel4.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 210, 30));

        addneweerciseButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addneweerciseButton.setText("Add New Exercise");
        jPanel4.add(addneweerciseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 160, 30));

        NewExercise.getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 760));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setMinimumSize(new java.awt.Dimension(1366, 760));
        mainPanel.setPreferredSize(new java.awt.Dimension(1366, 760));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        closeButton.setForeground(new java.awt.Color(204, 0, 0));
        closeButton.setText("X");
        closeButton.setContentAreaFilled(false);
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1167, 0, -1, 20));

        minimizeButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        minimizeButton.setForeground(new java.awt.Color(255, 255, 255));
        minimizeButton.setText("-");
        minimizeButton.setContentAreaFilled(false);
        minimizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(minimizeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, -1, 20));

        mainPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 1206, 20));

        loadPanel.setBackground(new java.awt.Color(0, 0, 0));
        mainPanel.add(loadPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 1206, 708));

        menuPanel.setBackground(new java.awt.Color(51, 51, 51));
        menuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(204, 204, 255));
        usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernameLabel.setText("User Name Here");
        menuPanel.add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 50));

        logoutButton.setBackground(new java.awt.Color(51, 51, 51));
        logoutButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Logout");
        logoutButton.setBorderPainted(false);
        logoutButton.setContentAreaFilled(false);
        logoutButton.setFocusPainted(false);
        logoutButton.setOpaque(true);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        menuPanel.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 160, 40));

        supplierButton.setBackground(new java.awt.Color(51, 51, 51));
        supplierButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        supplierButton.setForeground(new java.awt.Color(255, 255, 255));
        supplierButton.setText("Supplier");
        supplierButton.setBorderPainted(false);
        supplierButton.setContentAreaFilled(false);
        supplierButton.setFocusPainted(false);
        supplierButton.setOpaque(true);
        supplierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierButtonActionPerformed(evt);
            }
        });
        menuPanel.add(supplierButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 160, 40));

        databaseButton.setBackground(new java.awt.Color(51, 51, 51));
        databaseButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        databaseButton.setForeground(new java.awt.Color(255, 255, 255));
        databaseButton.setText("Search Database");
        databaseButton.setBorderPainted(false);
        databaseButton.setContentAreaFilled(false);
        databaseButton.setFocusPainted(false);
        databaseButton.setOpaque(true);
        databaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                databaseButtonActionPerformed(evt);
            }
        });
        menuPanel.add(databaseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 160, 40));

        memberButton.setBackground(new java.awt.Color(51, 51, 51));
        memberButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        memberButton.setForeground(new java.awt.Color(255, 255, 255));
        memberButton.setText("Member");
        memberButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        memberButton.setBorderPainted(false);
        memberButton.setContentAreaFilled(false);
        memberButton.setFocusPainted(false);
        memberButton.setOpaque(true);
        memberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberButtonActionPerformed(evt);
            }
        });
        menuPanel.add(memberButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 160, 40));

        attendenceButton.setBackground(new java.awt.Color(51, 51, 51));
        attendenceButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        attendenceButton.setForeground(new java.awt.Color(255, 255, 255));
        attendenceButton.setText("Attendence");
        attendenceButton.setBorderPainted(false);
        attendenceButton.setContentAreaFilled(false);
        attendenceButton.setFocusPainted(false);
        attendenceButton.setOpaque(true);
        attendenceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendenceButtonActionPerformed(evt);
            }
        });
        menuPanel.add(attendenceButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 160, 40));

        accountantButton.setBackground(new java.awt.Color(51, 51, 51));
        accountantButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        accountantButton.setForeground(new java.awt.Color(255, 255, 255));
        accountantButton.setText("Accountant");
        accountantButton.setBorderPainted(false);
        accountantButton.setContentAreaFilled(false);
        accountantButton.setFocusPainted(false);
        accountantButton.setOpaque(true);
        accountantButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountantButtonActionPerformed(evt);
            }
        });
        menuPanel.add(accountantButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 160, 40));

        stocktButton.setBackground(new java.awt.Color(51, 51, 51));
        stocktButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stocktButton.setForeground(new java.awt.Color(255, 255, 255));
        stocktButton.setText("Stock");
        stocktButton.setBorderPainted(false);
        stocktButton.setContentAreaFilled(false);
        stocktButton.setFocusPainted(false);
        stocktButton.setOpaque(true);
        stocktButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stocktButtonActionPerformed(evt);
            }
        });
        menuPanel.add(stocktButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 160, 40));

        storageButton.setBackground(new java.awt.Color(51, 51, 51));
        storageButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        storageButton.setForeground(new java.awt.Color(255, 255, 255));
        storageButton.setText("Storage");
        storageButton.setBorderPainted(false);
        storageButton.setContentAreaFilled(false);
        storageButton.setFocusPainted(false);
        storageButton.setOpaque(true);
        storageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storageButtonActionPerformed(evt);
            }
        });
        menuPanel.add(storageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 160, 40));

        messageButton.setBackground(new java.awt.Color(51, 51, 51));
        messageButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        messageButton.setForeground(new java.awt.Color(255, 255, 255));
        messageButton.setText("Message");
        messageButton.setBorderPainted(false);
        messageButton.setContentAreaFilled(false);
        messageButton.setFocusPainted(false);
        messageButton.setOpaque(true);
        messageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageButtonActionPerformed(evt);
            }
        });
        menuPanel.add(messageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 160, 40));

        reportButton.setBackground(new java.awt.Color(51, 51, 51));
        reportButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reportButton.setForeground(new java.awt.Color(255, 255, 255));
        reportButton.setText("Report");
        reportButton.setBorderPainted(false);
        reportButton.setContentAreaFilled(false);
        reportButton.setFocusPainted(false);
        reportButton.setOpaque(true);
        reportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButtonActionPerformed(evt);
            }
        });
        menuPanel.add(reportButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 160, 40));

        adminButton.setBackground(new java.awt.Color(51, 51, 51));
        adminButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        adminButton.setForeground(new java.awt.Color(255, 255, 255));
        adminButton.setText("Admin");
        adminButton.setBorderPainted(false);
        adminButton.setContentAreaFilled(false);
        adminButton.setFocusPainted(false);
        adminButton.setOpaque(true);
        adminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButtonActionPerformed(evt);
            }
        });
        menuPanel.add(adminButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 160, 40));

        accountButton.setBackground(new java.awt.Color(51, 51, 51));
        accountButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        accountButton.setForeground(new java.awt.Color(255, 255, 255));
        accountButton.setText("Account");
        accountButton.setBorderPainted(false);
        accountButton.setContentAreaFilled(false);
        accountButton.setFocusPainted(false);
        accountButton.setOpaque(true);
        accountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountButtonActionPerformed(evt);
            }
        });
        menuPanel.add(accountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 160, 40));

        dashboardButton.setBackground(new java.awt.Color(51, 51, 51));
        dashboardButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dashboardButton.setForeground(new java.awt.Color(255, 255, 255));
        dashboardButton.setText("Dashboard");
        dashboardButton.setContentAreaFilled(false);
        dashboardButton.setFocusPainted(false);
        dashboardButton.setOpaque(true);
        dashboardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardButtonActionPerformed(evt);
            }
        });
        menuPanel.add(dashboardButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 160, 40));

        mainPanel.add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 160, 660));

        logoPanel.setBackground(new java.awt.Color(255, 255, 255));
        logoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        mainPanel.add(logoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 68));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 728));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void memberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberButtonActionPerformed
        if (memberButton.isSelected()) {
            unseletButton();
            memberButton.setBackground(background);
            panels.RegistrationPanel mrp = RegistrationPanel.getInstance();
            loadPanel(mrp);
        }
    }//GEN-LAST:event_memberButtonActionPerformed

    private void databaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_databaseButtonActionPerformed
        if (databaseButton.isSelected()) {
            unseletButton();
            databaseButton.setBackground(background);
            panels.database db = database.getInstance();
            loadPanel(db);
        }
    }//GEN-LAST:event_databaseButtonActionPerformed

    private void supplierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierButtonActionPerformed
        if (supplierButton.isSelected()) {
            unseletButton();
            supplierButton.setBackground(background);
            panels.packagemanagement pm = packagemanagement.getInstance();
            loadPanel(pm);
        }
    }//GEN-LAST:event_supplierButtonActionPerformed

    private void attendenceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendenceButtonActionPerformed
        if (attendenceButton.isSelected()) {
            unseletButton();
            attendenceButton.setBackground(background);
        }
    }//GEN-LAST:event_attendenceButtonActionPerformed

    private void accountantButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountantButtonActionPerformed
        if (accountantButton.isSelected()) {
            unseletButton();
            accountantButton.setBackground(background);
        }
    }//GEN-LAST:event_accountantButtonActionPerformed

    private void stocktButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stocktButtonActionPerformed
        if (stocktButton.isSelected()) {
            unseletButton();
            stocktButton.setBackground(background);
        }
    }//GEN-LAST:event_stocktButtonActionPerformed

    private void storageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storageButtonActionPerformed
        if (storageButton.isSelected()) {
            unseletButton();
            storageButton.setBackground(background);
        }
    }//GEN-LAST:event_storageButtonActionPerformed

    private void messageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageButtonActionPerformed
        if (messageButton.isSelected()) {
            unseletButton();
            messageButton.setBackground(background);
        }
    }//GEN-LAST:event_messageButtonActionPerformed

    private void reportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportButtonActionPerformed
        if (reportButton.isSelected()) {
            unseletButton();
            reportButton.setBackground(background);
        }
    }//GEN-LAST:event_reportButtonActionPerformed

    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButtonActionPerformed
        if (adminButton.isSelected()) {
            unseletButton();
            adminButton.setBackground(background);
            WorkoutPlanManagment.pack();
            WorkoutPlanManagment.setLocationRelativeTo(null);
            WorkoutPlanManagment.setVisible(true);
        }
    }//GEN-LAST:event_adminButtonActionPerformed

    private void accountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountButtonActionPerformed
        if (accountButton.isSelected()) {
            unseletButton();
            accountButton.setBackground(background);
        }
    }//GEN-LAST:event_accountButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        if (logoutButton.isSelected()) {
            unseletButton();
            logoutButton.setBackground(background);

        }
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void dashboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardButtonActionPerformed
        if (dashboardButton.isSelected()) {
            unseletButton();
            dashboardButton.setBackground(background);
            panels.dashboardPanel dp = dashboardPanel.getInstance();
            loadPanel(dp);
        }
    }//GEN-LAST:event_dashboardButtonActionPerformed

    private void minimizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeButtonActionPerformed
      this.setState(MainFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeButtonActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void eercideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eercideButtonActionPerformed
        NewExercise.pack();
        NewExercise.setLocationRelativeTo(null);
        NewExercise.setVisible(true);
    }//GEN-LAST:event_eercideButtonActionPerformed

    private void categoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog NewExercise;
    private javax.swing.JDialog PackageManagement;
    private javax.swing.JDialog WorkoutPlanManagment;
    private javax.swing.JToggleButton accountButton;
    private javax.swing.JToggleButton accountantButton;
    private javax.swing.JButton addButton;
    private javax.swing.JButton addnewButton;
    private javax.swing.JButton addneweerciseButton;
    private javax.swing.JButton addnewpackageButton;
    private javax.swing.JToggleButton adminButton;
    private javax.swing.JToggleButton attendenceButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton categoryButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JToggleButton dashboardButton;
    private javax.swing.JToggleButton databaseButton;
    private javax.swing.JButton editeerciseButton;
    private javax.swing.JButton editpackageButton;
    private javax.swing.JButton editplanButton;
    private javax.swing.JButton eercideButton;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jList5;
    private javax.swing.JList<String> jList6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JPanel loadPanel;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JToggleButton logoutButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JToggleButton memberButton;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JToggleButton messageButton;
    private javax.swing.JButton minimizeButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JToggleButton reportButton;
    private javax.swing.JToggleButton stocktButton;
    private javax.swing.JToggleButton storageButton;
    private javax.swing.JToggleButton supplierButton;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables

    public void unseletButton() {
        dashboardButton.setBackground(unselectedColor);
        memberButton.setBackground(unselectedColor);
        databaseButton.setBackground(unselectedColor);
        supplierButton.setBackground(unselectedColor);
        attendenceButton.setBackground(unselectedColor);
        accountantButton.setBackground(unselectedColor);
        stocktButton.setBackground(unselectedColor);
        storageButton.setBackground(unselectedColor);
        messageButton.setBackground(unselectedColor);
        reportButton.setBackground(unselectedColor);
        adminButton.setBackground(unselectedColor);
        accountButton.setBackground(unselectedColor);
        logoutButton.setBackground(unselectedColor);
    }

    public void loadPanel(JPanel panel) {
        loadPanel.removeAll();
        loadPanel.add(panel);
        loadPanel.repaint();
        loadPanel.revalidate();
        loadPanel.setVisible(true);
    }

    private void loadingMethod() {
        unseletButton();
            dashboardButton.setBackground(background);
            panels.dashboardPanel dp = dashboardPanel.getInstance();
            loadPanel(dp);
    }

}
