package HumanResource;

import CustomResource.koneksi;
import Main.MasterForm;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author hi
 */
public class CandidateApplicationCareer extends MasterForm {
Statement stm;
    ResultSet rs;
    Connection koneksi;
    /**
     * Creates new form CandidateApplicationCareer
     */
    public CandidateApplicationCareer() {
        initComponents();
        openDB();
    
        ((DefaultTableCellRenderer)jTable4.getTableHeader().getDefaultRenderer())
        .setHorizontalAlignment(JLabel.CENTER);
    }
    private void openDB() {
        try {
            koneksi kon = new koneksi();
            koneksi = kon.getConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "maaf, Tidak terhubung database");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane22 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jSeparator33 = new javax.swing.JSeparator();
        jLabel89 = new javax.swing.JLabel();
        t_posisi = new CustomResource.CustomTextfield();
        t_nama = new CustomResource.CustomTextfield();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        bulan_awal = new com.toedter.calendar.JMonthChooser();
        jLabel4 = new javax.swing.JLabel();
        tahun_awal = new com.toedter.calendar.JYearChooser();
        jLabel5 = new javax.swing.JLabel();
        bulan_akhir = new com.toedter.calendar.JMonthChooser();
        tahun_akhir = new com.toedter.calendar.JYearChooser();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable4.setAutoCreateRowSorter(true);
        jTable4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Perusahaan / Company name", "Posisi Pekerjaan / Job Position", "Periode (mmm-yyyy - mmm-yyyy)", "Karir (Tahun atau Bulan) / Career (Years or Month)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setShowHorizontalLines(true);
        jTable4.setShowVerticalLines(true);
        jScrollPane22.setViewportView(jTable4);

        add(jScrollPane22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 872, 90));

        jSeparator33.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator33.setForeground(new java.awt.Color(255, 0, 0));
        add(jSeparator33, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 544, 20));

        jLabel89.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel89.setText("5. Ringkasan Status Karir / Summary of Carrer Status");
        add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 310, 30));

        t_posisi.setLabelText("Posisi Pekerjaan / Job Position");
        add(t_posisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 248, -1));

        t_nama.setLabelText("Nama Perusahaan / Company name");
        add(t_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 248, -1));

        jButton1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton1.setText("Simpan / Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, -1, 31));

        jButton3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton3.setText("Hapus / Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 440, -1, 31));

        jButton4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton4.setText("Lanjut / Next");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 510, -1, 31));

        jButton5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton5.setText("Kembali / Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, -1, 31));
        add(bulan_awal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel4.setText("Periode (dari Tahun)");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 190, -1));
        add(tahun_awal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel5.setText("Periode (sampai Tahun)");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 190, -1));
        add(bulan_akhir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));
        add(tahun_akhir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
String sql0 = "truncate cd_career_sementara";
        try {
             stm = koneksi.createStatement();
            stm.executeUpdate(sql0);
        } catch (SQLException ex) {
            Logger.getLogger(CandidateApplicationAcademic.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        DefaultTableModel tabelfamily = (DefaultTableModel) jTable4.getModel();
        int htabelfamily = jTable4.getRowCount();

        for (int i = 0; i <= htabelfamily - 1; i++) {
            if (jTable4.getValueAt(i, 0) == null) {
            } else {
                String dtabel_nama = jTable4.getValueAt(i, 0).toString();
                String dtabel_posisi = jTable4.getValueAt(i, 1).toString();
                String dtabel_periode = jTable4.getValueAt(i, 2).toString();
                String dtabel_lama = jTable4.getValueAt(i, 3).toString();
                
                try {
                    stm = koneksi.createStatement();
                    String sql = "insert into cd_career_sementara (nama,posisi,periode,lama) values('" + dtabel_nama + "'"
                            + ",'" + dtabel_posisi + "'"
                            + ",'" + dtabel_periode + "','" + dtabel_lama + "')";
                    stm.executeUpdate(sql);
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "error" + e, "GAGAL", JOptionPane.WARNING_MESSAGE);
                }
        
            }}

        Main.main.getMain().showForm(new CandidateApplicationIntroduction());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
int row = jTable4.getSelectedRow();
DefaultTableModel model = (DefaultTableModel)jTable4.getModel();
model.removeRow( row );         // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
int hari = 01;
        int bln_awal = Integer.valueOf(bulan_awal.getMonth() + 1);
        int bln_akhir = Integer.valueOf(bulan_akhir.getMonth() + 1);
        int thn_awal = Integer.valueOf(tahun_awal.getYear());
        int thn_akhir = Integer.valueOf(tahun_akhir.getYear());
        LocalDate tgl_awal = LocalDate.of(thn_awal, bln_awal, hari);
        LocalDate tgl_akhir = LocalDate.of(thn_akhir, bln_akhir, hari);
        int hasil_tahun = Period.between(tgl_awal, tgl_akhir).getYears();
        int hasil_bulan = Period.between(tgl_awal, tgl_akhir).getMonths();
        

        DefaultTableModel dataModel = (DefaultTableModel) jTable4.getModel();
        List list = new ArrayList<>();
        jTable4.setAutoCreateColumnsFromModel(true);
        list.add(t_nama.getText());
        list.add(t_posisi.getText());
        list.add("("+tgl_awal.getMonth() + "-" + tgl_awal.getYear() +")"+ " - " +"("+ tgl_akhir.getMonth() + "-" + tgl_akhir.getYear()+")");
        list.add(hasil_tahun + " Tahun " + hasil_bulan + " Bulan");
        dataModel.addRow(list.toArray());
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
Main.main.getMain().showForm(new CandidateApplicationCertificates());        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JMonthChooser bulan_akhir;
    private com.toedter.calendar.JMonthChooser bulan_awal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JTable jTable4;
    private CustomResource.CustomTextfield t_nama;
    private CustomResource.CustomTextfield t_posisi;
    private com.toedter.calendar.JYearChooser tahun_akhir;
    private com.toedter.calendar.JYearChooser tahun_awal;
    // End of variables declaration//GEN-END:variables

    @Override
    public void formrefresh() {
        
    }
}
