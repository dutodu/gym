package panels;



public class dashboardPanel extends javax.swing.JPanel {

    private static dashboardPanel instance;
    
    public dashboardPanel() {
        initComponents();
    }
    

    
    public static dashboardPanel getInstance(){
        if (instance == null) {
            instance = new dashboardPanel();
        }
        return instance;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        parentdashboardPanel = new javax.swing.JPanel();
        dashboardPanel = new javax.swing.JPanel();
        stockupdateButton = new javax.swing.JToggleButton();
        paymentButton = new javax.swing.JToggleButton();
        dueButton = new javax.swing.JToggleButton();
        specialnoteButton = new javax.swing.JToggleButton();
        applicationformButton = new javax.swing.JToggleButton();

        setPreferredSize(new java.awt.Dimension(1206, 740));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        parentdashboardPanel.setLayout(new java.awt.CardLayout());

        dashboardPanel.setBackground(new java.awt.Color(153, 153, 153));
        dashboardPanel.setPreferredSize(new java.awt.Dimension(1206, 740));
        dashboardPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        stockupdateButton.setBackground(new java.awt.Color(51, 51, 51));
        stockupdateButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        stockupdateButton.setForeground(new java.awt.Color(204, 204, 204));
        stockupdateButton.setText("Stock Update");
        stockupdateButton.setContentAreaFilled(false);
        stockupdateButton.setFocusPainted(false);
        stockupdateButton.setOpaque(true);
        dashboardPanel.add(stockupdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 540, 200, 150));

        paymentButton.setBackground(new java.awt.Color(51, 51, 51));
        paymentButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        paymentButton.setForeground(new java.awt.Color(204, 204, 204));
        paymentButton.setText("Payment");
        paymentButton.setContentAreaFilled(false);
        paymentButton.setFocusPainted(false);
        paymentButton.setOpaque(true);
        dashboardPanel.add(paymentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, 200, 150));

        dueButton.setBackground(new java.awt.Color(51, 51, 51));
        dueButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dueButton.setForeground(new java.awt.Color(204, 204, 204));
        dueButton.setText("Due Payments");
        dueButton.setContentAreaFilled(false);
        dueButton.setFocusPainted(false);
        dueButton.setOpaque(true);
        dashboardPanel.add(dueButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 540, 200, 150));

        specialnoteButton.setBackground(new java.awt.Color(51, 51, 51));
        specialnoteButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        specialnoteButton.setForeground(new java.awt.Color(204, 204, 204));
        specialnoteButton.setText("Special Notes");
        specialnoteButton.setContentAreaFilled(false);
        specialnoteButton.setFocusPainted(false);
        specialnoteButton.setOpaque(true);
        dashboardPanel.add(specialnoteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 540, 200, 150));

        applicationformButton.setBackground(new java.awt.Color(51, 51, 51));
        applicationformButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        applicationformButton.setForeground(new java.awt.Color(204, 204, 204));
        applicationformButton.setText("Application Form");
        applicationformButton.setContentAreaFilled(false);
        applicationformButton.setFocusPainted(false);
        applicationformButton.setOpaque(true);
        applicationformButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applicationformButtonActionPerformed(evt);
            }
        });
        dashboardPanel.add(applicationformButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 200, 150));

        parentdashboardPanel.add(dashboardPanel, "card2");

        add(parentdashboardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 1670, 748));
    }// </editor-fold>//GEN-END:initComponents

    private void applicationformButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applicationformButtonActionPerformed
//        if (applicationformButton.isSelected()) {
//            unseletButton();
////            mf.loadPanel(fp);
//            parentdashboardPanel.removeAll();
//            parentdashboardPanel.add(memberregistrationPanel);
//            parentdashboardPanel.repaint();           
//            parentdashboardPanel.revalidate();
//        }
    }//GEN-LAST:event_applicationformButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton applicationformButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JToggleButton dueButton;
    private javax.swing.JPanel parentdashboardPanel;
    private javax.swing.JToggleButton paymentButton;
    private javax.swing.JToggleButton specialnoteButton;
    private javax.swing.JToggleButton stockupdateButton;
    // End of variables declaration//GEN-END:variables


    
    public void unseletButton(){
        applicationformButton.setSelected(false);
        paymentButton.setSelected(false);
        stockupdateButton.setSelected(false);
        dueButton.setSelected(false);
        specialnoteButton.setSelected(false);
    }
}
