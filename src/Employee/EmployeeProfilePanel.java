/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Employee;

import CustomResource.MySession;
import Main.MasterForm;

/**
 *
 * @author hi
 */
public class EmployeeProfilePanel extends MasterForm {

    /**
     * Creates new form EmployeeProfilePanel
     */
    public EmployeeProfilePanel() {
        initComponents();
        
        labelJob.setText(MySession.get_JobPosition());
        labelSallary.setText(MySession.get_Sallary());
        labelKaryawan_id.setText(MySession.get_karyawanID());
        labelKTP.setText(MySession.get_ktp());
        labelName2.setText(MySession.get_nama());
        labelBirth.setText(MySession.get_birthPlace()+", "+MySession.get_Birthday());
        labelGender.setText(MySession.get_sex());
        labelMarital.setText(MySession.get_marital());
        labelEmail.setText(MySession.get_email());
        labelNumber.setText(MySession.get_mobileNumber());
        labelBPJS.setText(MySession.get_BPJS());
        labelNPWP.setText(MySession.get_NPWP());
        jScrollPane3.getVerticalScrollBar().setUnitIncrement(16);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        labelFoto = new javax.swing.JLabel();
        labelJob = new javax.swing.JLabel();
        labelKTP = new javax.swing.JLabel();
        labelKaryawan_id = new javax.swing.JLabel();
        labelBirth = new javax.swing.JLabel();
        labelGender = new javax.swing.JLabel();
        labelMarital = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textCurrent = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        labelBPJS = new javax.swing.JLabel();
        labelNPWP = new javax.swing.JLabel();
        labelNumber = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelSallary = new javax.swing.JLabel();
        labelJob1 = new javax.swing.JLabel();
        labelKTP1 = new javax.swing.JLabel();
        labelName1 = new javax.swing.JLabel();
        labelBirth1 = new javax.swing.JLabel();
        labelGender1 = new javax.swing.JLabel();
        labelMarital1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labelEmail1 = new javax.swing.JLabel();
        labelNumber1 = new javax.swing.JLabel();
        labelNPWP1 = new javax.swing.JLabel();
        labelBPJS1 = new javax.swing.JLabel();
        labelSallary1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane5 = new javax.swing.JScrollPane();
        textHome = new javax.swing.JTextArea();
        labelKTP3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        labelName2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        jScrollPane3.setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFoto.setText("FOTO");
        jPanel1.add(labelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 130, 140));
        jPanel1.add(labelJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 220, 30));

        labelKTP.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel1.add(labelKTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 190, 20));

        labelKaryawan_id.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        labelKaryawan_id.setText("Karyawan_id");
        jPanel1.add(labelKaryawan_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 190, 20));

        labelBirth.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        labelBirth.setText("TEMPAT, TANGGAL LAHIR");
        jPanel1.add(labelBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 190, 20));

        labelGender.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        labelGender.setText("JENIS KELAMIN");
        jPanel1.add(labelGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 190, 20));

        labelMarital.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        labelMarital.setText("Status Pernikahan");
        jPanel1.add(labelMarital, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 170, 20));

        jLabel13.setText("Alamat Rumah / Home Address");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, -1, -1));

        textCurrent.setColumns(20);
        textCurrent.setRows(5);
        jScrollPane2.setViewportView(textCurrent);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, 230, -1));

        jLabel14.setText("Tempat Tinggal saat ini / Current Address");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, -1, -1));

        labelBPJS.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        labelBPJS.setText("BPJS");
        jPanel1.add(labelBPJS, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, 190, 20));

        labelNPWP.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        labelNPWP.setText("NPWP");
        jPanel1.add(labelNPWP, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 190, 20));

        labelNumber.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        labelNumber.setText("No. Hp");
        jPanel1.add(labelNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 190, 20));

        labelEmail.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        labelEmail.setText("Email");
        jPanel1.add(labelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, 190, 20));

        labelSallary.setText("SALARRY");
        jPanel1.add(labelSallary, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 150, 30));

        labelJob1.setText("JOB :");
        jPanel1.add(labelJob1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 30, 30));

        labelKTP1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        labelKTP1.setText("Karyawan id");
        jPanel1.add(labelKTP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 80, 20));

        labelName1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        labelName1.setText("Nama ");
        jPanel1.add(labelName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 40, 20));

        labelBirth1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        labelBirth1.setText("Tempat, Tanggal Lahir ");
        jPanel1.add(labelBirth1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 140, 20));

        labelGender1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        labelGender1.setText("Jenis kelamin");
        jPanel1.add(labelGender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 80, 20));

        labelMarital1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        labelMarital1.setText("Status Pernikahan");
        jPanel1.add(labelMarital1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 110, 20));

        jLabel1.setText(":");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, 20, -1));

        jLabel2.setText(":");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 20, -1));

        jLabel3.setText(":");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 20, -1));

        jLabel4.setText(":");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 20, -1));

        jLabel5.setText(":");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 20, -1));

        jLabel6.setText(":");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 20, -1));

        jLabel7.setText(":");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 20, -1));

        jLabel9.setText(":");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 20, -1));

        jLabel10.setText(":");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 20, -1));

        labelEmail1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        labelEmail1.setText("Email");
        jPanel1.add(labelEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 40, 20));

        labelNumber1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        labelNumber1.setText("No. Hp");
        jPanel1.add(labelNumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 40, 20));

        labelNPWP1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        labelNPWP1.setText("NPWP");
        jPanel1.add(labelNPWP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 40, 20));

        labelBPJS1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        labelBPJS1.setText("BPJS");
        jPanel1.add(labelBPJS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 40, 20));

        labelSallary1.setText("SALARRY :");
        jPanel1.add(labelSallary1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 70, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Logo.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel16.setText("Riwayat Pendidikan / Academic");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, 30));

        jSeparator1.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 580, 590, 20));

        jTable2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tanggal Lulus", "Nama Sekolah/Universitas", "Lokasi", "Jurusan/Bidang Keahlian"
            }
        ));
        jTable2.setCellSelectionEnabled(true);
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable2.setShowHorizontalLines(true);
        jTable2.setShowVerticalLines(true);
        jTable2.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTable2InputMethodTextChanged(evt);
            }
        });
        jScrollPane20.setViewportView(jTable2);

        jPanel1.add(jScrollPane20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 820, 110));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel17.setText("Status Keluarga / Family");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 750, -1, 30));

        jSeparator2.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 770, 650, 20));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nama Anggota", "Hubungan", "Tanggal Lahir", "Tinggal Bersama  (Ya atau Tidak)", "No Handphone"
            }
        ));
        jTable3.setShowHorizontalLines(true);
        jTable3.setShowVerticalLines(true);
        jScrollPane21.setViewportView(jTable3);

        jPanel1.add(jScrollPane21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 790, 820, 110));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Diraih pada Tanggal", "Nama Sertifikat", "Nama Badan Penyelenggara", "Lokasi Penyelenggara", "No. Sertifikat"
            }
        ));
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
        jScrollPane4.setViewportView(jTable1);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 980, 820, 170));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 1260, 230, 30));

        jSeparator3.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 960, 580, 20));

        textHome.setColumns(20);
        textHome.setRows(5);
        jScrollPane5.setViewportView(textHome);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 230, -1));

        labelKTP3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        labelKTP3.setText("No. KTP");
        jPanel1.add(labelKTP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 50, 20));

        jLabel11.setText(":");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 20, -1));

        jLabel12.setText(":");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 20, -1));

        labelName2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        labelName2.setText("NAMA");
        jPanel1.add(labelName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 190, 20));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel19.setText("Sertifikat Keahlian / Certificate Skill");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 940, -1, 30));

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1053, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable2InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTable2InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2InputMethodTextChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel labelBPJS;
    private javax.swing.JLabel labelBPJS1;
    private javax.swing.JLabel labelBirth;
    private javax.swing.JLabel labelBirth1;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEmail1;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JLabel labelGender;
    private javax.swing.JLabel labelGender1;
    private javax.swing.JLabel labelJob;
    private javax.swing.JLabel labelJob1;
    private javax.swing.JLabel labelKTP;
    private javax.swing.JLabel labelKTP1;
    private javax.swing.JLabel labelKTP3;
    private javax.swing.JLabel labelKaryawan_id;
    private javax.swing.JLabel labelMarital;
    private javax.swing.JLabel labelMarital1;
    private javax.swing.JLabel labelNPWP;
    private javax.swing.JLabel labelNPWP1;
    private javax.swing.JLabel labelName1;
    private javax.swing.JLabel labelName2;
    private javax.swing.JLabel labelNumber;
    private javax.swing.JLabel labelNumber1;
    private javax.swing.JLabel labelSallary;
    private javax.swing.JLabel labelSallary1;
    private javax.swing.JTextArea textCurrent;
    private javax.swing.JTextArea textHome;
    // End of variables declaration//GEN-END:variables

    @Override
    public void formrefresh() {
    }
}
