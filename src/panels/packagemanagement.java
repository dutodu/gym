package panels;

import Database.Beans.Category;
import Database.Tables.CategoryManagment;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;


public class packagemanagement extends javax.swing.JPanel {

    
    Color background = new Color(153,153,153);
    Color unselectedColor = new Color(51, 51, 51);
    
     private static packagemanagement instance;
    
    private packagemanagement() {
        initComponents();
        NewCategory.setBackground(background);
        NewPayment.setBackground(background);

        initialize();
    }
    
    public static packagemanagement getInstance(){
        if (instance == null) {
            instance = new packagemanagement();
        }
        return instance;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        NewCategory = new javax.swing.JDialog();
        titleBar1 = new javax.swing.JPanel();
        titleLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        categoryTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        categoryCombo = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        categoryList = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        categoryDes = new javax.swing.JTextArea();
        editCategoryBtn = new javax.swing.JButton();
        addCategoryBtn = new javax.swing.JButton();
        NewPayment = new javax.swing.JDialog();
        titleBar2 = new javax.swing.JPanel();
        titleLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        titleBar = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        parentPanel = new javax.swing.JPanel();
        staffRegistration = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();

        NewCategory.setBackground(new java.awt.Color(153, 153, 153));
        NewCategory.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleBar1.setBackground(new java.awt.Color(51, 51, 51));
        titleBar1.setFocusable(false);
        titleBar1.setPreferredSize(new java.awt.Dimension(1206, 740));
        titleBar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleLabel1.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        titleLabel1.setText("... Attendence");
        titleBar1.add(titleLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 230, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Add New Category");
        titleBar1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 210, 40));

        NewCategory.getContentPane().add(titleBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 40));

        categoryTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        categoryTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                categoryTxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                categoryTxtKeyTyped(evt);
            }
        });
        NewCategory.getContentPane().add(categoryTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 230, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Description");
        NewCategory.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        categoryCombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        categoryCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        categoryCombo.setOpaque(false);
        NewCategory.getContentPane().add(categoryCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 250, -1));

        categoryList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        categoryList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(categoryList);

        NewCategory.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 300, 250));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Category");
        NewCategory.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        categoryDes.setColumns(20);
        categoryDes.setRows(5);
        jScrollPane3.setViewportView(categoryDes);

        NewCategory.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 250, -1));

        editCategoryBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editCategoryBtn.setText("Edit Category");
        editCategoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCategoryBtnActionPerformed(evt);
            }
        });
        NewCategory.getContentPane().add(editCategoryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 180, -1));

        addCategoryBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addCategoryBtn.setText("Add Category");
        addCategoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCategoryBtnActionPerformed(evt);
            }
        });
        NewCategory.getContentPane().add(addCategoryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 180, -1));

        NewPayment.setBackground(new java.awt.Color(153, 153, 153));
        NewPayment.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleBar2.setBackground(new java.awt.Color(51, 51, 51));
        titleBar2.setFocusable(false);
        titleBar2.setPreferredSize(new java.awt.Dimension(1206, 740));
        titleBar2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleLabel2.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        titleLabel2.setText("... Attendence");
        titleBar2.add(titleLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 230, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Add New Payment");
        titleBar2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 210, 40));

        NewPayment.getContentPane().add(titleBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 40));

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NewPayment.getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 230, -1));

        jComboBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NewPayment.getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 250, -1));

        jScrollPane4.setViewportView(jList2);

        NewPayment.getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 300, 250));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Payment");
        NewPayment.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("Edit Payment");
        NewPayment.getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 180, -1));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("Add Payment");
        NewPayment.getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 180, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleBar.setBackground(new java.awt.Color(51, 51, 51));
        titleBar.setFocusable(false);
        titleBar.setPreferredSize(new java.awt.Dimension(1206, 740));
        titleBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        titleLabel.setText("Package Management");
        titleBar.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 230, 40));

        jPanel1.add(titleBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1206, 40));

        parentPanel.setLayout(new java.awt.CardLayout());

        staffRegistration.setBackground(new java.awt.Color(153, 153, 153));
        staffRegistration.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category", "Category Type", "Payment Type", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        staffRegistration.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 1130, 350));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Edit Package");
        staffRegistration.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 180, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Add Package");
        staffRegistration.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 180, 30));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Register Packages", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 10, 130));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 10, 130));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 220, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Package Category");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, 30));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Add New");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 110, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Payment Type");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 120, 30));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Payment Type" }));
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 210, 30));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Add New");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 110, 30));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 210, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Amount");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 100, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Package Type");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 110, 30));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton2.setText("Single");
        jRadioButton2.setContentAreaFilled(false);
        jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, -1, 30));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton1.setText("Couple");
        jRadioButton1.setContentAreaFilled(false);
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, -1, 30));

        staffRegistration.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1130, 170));

        parentPanel.add(staffRegistration, "card3");

        jPanel1.add(parentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1206, 668));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1206, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 708, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        NewCategory.pack();
        NewCategory.setLocationRelativeTo(null);
        NewCategory.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        NewPayment.pack();
        NewPayment.setLocationRelativeTo(null);
        NewPayment.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void addCategoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCategoryBtnActionPerformed
       
        if(!CategoryManagment.isCategoryAvailable(categoryTxt.getText())){
        Category category = new Category();
        category.setCategory(categoryTxt.getText());
        category.setCategoryDes(categoryDes.getText());
        addCategoryBtn.setEnabled(false);
        if(CategoryManagment.addCategory(category)){
            System.out.println("Added");
        }
        }else{
            System.out.println("Category already added!");
        }
        
    }//GEN-LAST:event_addCategoryBtnActionPerformed
    
    
    int olCategoryId;
    String  olCategory;
    
    private void categoryListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryListMouseClicked
       if(evt.getClickCount() == 2){
           try {
       
         ResultSet categorySet = CategoryManagment.getAllCategory(categoryList.getSelectedValue());
         
         if(categorySet.next()){
             categoryTxt.setText(categorySet.getString("category"));
             categoryDes.setText(categorySet.getString("description"));
             olCategoryId = categorySet.getInt("idcategory");
             olCategory = categorySet.getString("category");
             
             setRefresh();
         }
           } catch (Exception e) {
               e.printStackTrace();
           }
         
       }
    }//GEN-LAST:event_categoryListMouseClicked

    private void editCategoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCategoryBtnActionPerformed
        
        try {
            if(!CategoryManagment.isCategoryAvailable(categoryTxt.getText()) || olCategory.equalsIgnoreCase(categoryTxt.getText())){}
        
                Category category = new Category();
                category.setCategory(categoryTxt.getText());
                category.setCategoryDes(categoryDes.getText());
                category.setOldCategoryId(olCategoryId);
            if(CategoryManagment.updateCategory(category)){
                System.out.println("Updated");
            }
            setRefresh();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_editCategoryBtnActionPerformed
    
    
    int x;
    
    private void categoryTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_categoryTxtKeyReleased
           x = categoryCombo.getSelectedIndex();

            if (categoryTxt.getText().isEmpty()) {
                categoryCombo.setPopupVisible(false);
                addCategoryBtn.setEnabled(true);
            } else {
                try {
                    Vector v1 = new Vector();

                    ResultSet result = CategoryManagment.getCategoryLike(categoryTxt.getText());
                    while (result.next()) {
                        v1.add(result.getString("category"));
                    }
                    DefaultComboBoxModel model = new DefaultComboBoxModel(v1);
                    categoryCombo.setModel(model);

                    if (categoryCombo.getItemCount() != 0) {
                        categoryCombo.setPopupVisible(true);
                        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                            ResultSet resultSet = CategoryManagment.getAllCategory(categoryCombo.getItemAt(x).toString());
                            
                            if (resultSet.next()) {
                                categoryTxt.setText(categoryCombo.getItemAt(x).toString());
                                categoryDes.setText(resultSet.getString("description"));
                                
                                addCategoryBtn.setEnabled(false);
                                categoryCombo.setPopupVisible(false);
                            }
                        }
                        if (evt.getKeyCode() == 38) {

                            if (x == 0) {
                                x = categoryCombo.getItemCount();
                            }
                            x--;
                            categoryCombo.setSelectedIndex(x);
                        }
                        if (evt.getKeyCode() == 40) {

                            if (x == categoryCombo.getItemCount()) {
                                x = 0;
                            }
                            x++;
                            categoryCombo.setSelectedIndex(x);
                        }

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
    }//GEN-LAST:event_categoryTxtKeyReleased

    private void categoryTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_categoryTxtKeyTyped
       
    }//GEN-LAST:event_categoryTxtKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog NewCategory;
    private javax.swing.JDialog NewPayment;
    private javax.swing.JButton addCategoryBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> categoryCombo;
    private javax.swing.JTextArea categoryDes;
    private javax.swing.JList<String> categoryList;
    private javax.swing.JTextField categoryTxt;
    private javax.swing.JButton editCategoryBtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JPanel staffRegistration;
    private javax.swing.JPanel titleBar;
    private javax.swing.JPanel titleBar1;
    private javax.swing.JPanel titleBar2;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel titleLabel1;
    private javax.swing.JLabel titleLabel2;
    // End of variables declaration//GEN-END:variables

private void loadCategory(){
    try {
        ResultSet categorySet = CategoryManagment.getCategorySet();
        
            DefaultListModel dlm = new DefaultListModel();
        while(categorySet.next()){
            dlm.addElement(categorySet.getString("category"));
            
        }
        categoryList.setModel(dlm);
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    private void initialize() {
      loadCategory();
    }
    
    private void setRefresh(){
        categoryTxt.setText(null);
        categoryDes.setText(null);
        loadCategory();
    }
}
