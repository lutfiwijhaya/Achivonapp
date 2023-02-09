/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package HumanResource;

import CustomResource.MySession;
import Main.MasterForm;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author hi
 */
public class RequestEmployeeAllocation extends MasterForm {

    /**
     * Creates new form RequestEmployeeAllocation
     */
    public RequestEmployeeAllocation() {
        initComponents();
        MyWindow();
        
        jLabel23.setText(MySession.get_JobPosition());
        jLabel24.setText(MySession.get_nama());
        jLabel25.setText(MySession.get_JobPosition());
        jLabel26.setText(MySession.get_birthPlace());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        customTextfield2 = new CustomResource.CustomTextfield();
        t_tgl = new com.toedter.calendar.JDateChooser();
        jLabel26 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Summary for Company Allocation");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, -1, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("REQUEST - EMPLOYEE ALLOCATION");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, -1));

        jLabel3.setText("B1. Statement by Employee Allocated");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, -1, -1));

        jLabel4.setText(":");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 320, 10, -1));

        jLabel5.setText("Work Location");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, -1, -1));

        jLabel6.setText("Name");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));

        jLabel8.setText("Position");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, -1, -1));

        jLabel10.setText("Required Allocation Date :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 230, -1));

        jLabel11.setText(":");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 10, -1));

        jLabel12.setText(":");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 10, -1));

        jLabel13.setText(":");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 280, 10, -1));

        jLabel14.setText("A. EMPLOYEE INFORMATION FOR ALLOCATION");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, 690, -1));

        jLabel15.setText("C. ADJUSTMENT DATE AGAINST ALLOCATION SCHEDULE       : DD-MMM-YYYY");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 790, -1, -1));

        jLabel16.setText("Scheduling Details");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 820, -1, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 680, 690, -1));

        jLabel17.setText("B. REASON STATEMENT");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, -1, -1));

        jLabel18.setText("B2. Statement by Team Manager");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 660, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Description", "Expected Time"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 840, 690, 210));

        jLabel19.setText("For the above reasons, we would like to adjust the allocation of the relevant personnel, so please review and approve this adjustment ");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 1070, -1, 30));
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 1240, 110, 20));

        jTable2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Pre'd", "Rec'd", "Rev'd", "MGR"
            }
        ));
        jTable2.setRowHeight(70);
        jTable2.setShowHorizontalLines(true);
        jTable2.setShowVerticalLines(true);
        jScrollPane5.setViewportView(jTable2);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 370, 100));

        jTable3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Rev'd", "MGR"
            }
        ));
        jTable3.setRowHeight(70);
        jTable3.setShowHorizontalLines(true);
        jTable3.setShowVerticalLines(true);
        jScrollPane6.setViewportView(jTable3);

        jPanel2.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 180, 100));

        jTable4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "President"
            }
        ));
        jTable4.setRowHeight(70);
        jTable4.setShowHorizontalLines(true);
        jTable4.setShowVerticalLines(true);
        jScrollPane7.setViewportView(jTable4);

        jPanel2.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 100, 110, 100));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Kirim/Send");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 1180, 160, 40));

        jLabel21.setText("of the allocation.");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 1100, -1, -1));

        jLabel22.setText("Discipline");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, -1));

        jLabel23.setText("Discipline");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 230, -1));

        jLabel24.setText("Discipline");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 230, -1));

        jLabel25.setText("Discipline");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, 230, -1));

        customTextfield2.setLabelText("Description Allocation     :");
        jPanel2.add(customTextfield2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 330, 40));

        t_tgl.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jPanel2.add(t_tgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 190, 30));

        jLabel26.setText("Discipline");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, 230, -1));

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1216, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private CustomResource.CustomTextfield customTextfield2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private com.toedter.calendar.JDateChooser t_tgl;
    // End of variables declaration//GEN-END:variables

    private void MyWindow(){
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screen.width, screen.height-45);
        this.setPreferredSize(new Dimension(screen.width, screen.height-100));
        
//        int x = (screen.width/2) - (this.getSize().width/2);
//        int y = (screen.height/2) - (this.getSize().height/2);
//        this.setPreferredSize(x,y);
    }

    @Override
    public void formrefresh() {
    }

}
