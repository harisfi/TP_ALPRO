
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hryzx
 */
public class AplikasiPembelianTiket extends javax.swing.JFrame {
    static String wahana[] = {"Jatim Park 1", "Jatim Park 2", "Eco Green Park"};
    static String jenisHari[] = {"Weekend", "Weekday"};
    DefaultComboBoxModel<String> mdl = new DefaultComboBoxModel(wahana),
                                 mdl1 = new DefaultComboBoxModel(jenisHari);

    static Object kolom[] = {"Wahana", "Jenis Hari", "Harga", "Jumlah Tiket", "Subtotal"};
    int baris = 0;
    DefaultTableModel tbl = new DefaultTableModel(kolom, baris);

    static int harga[][] = {{100000, 120000, 70000}, {80000, 100000, 50000}};
    /**
     * Creates new form AplikasiPembelianTiket
     */
    public AplikasiPembelianTiket() {
        initComponents();
        
        CWahana.setModel(mdl);
        CJenisHari.setModel(mdl1);
        TBLRincian.setModel(tbl);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Panel1 = new javax.swing.JPanel();
        LWahana = new javax.swing.JLabel();
        LJenisHari = new javax.swing.JLabel();
        LHarga = new javax.swing.JLabel();
        LJumlahTiket = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        CWahana = new javax.swing.JComboBox<>();
        CJenisHari = new javax.swing.JComboBox<>();
        THarga = new javax.swing.JTextField();
        TJumlahTiket = new javax.swing.JTextField();
        BTambah = new javax.swing.JButton();
        BReset = new javax.swing.JButton();
        SPTabel = new javax.swing.JScrollPane();
        TBLRincian = new javax.swing.JTable();
        Panel3 = new javax.swing.JPanel();
        LTotal = new javax.swing.JLabel();
        TTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pembelian Tiket");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pembelian Tiket");

        LWahana.setText("Wahana");

        LJenisHari.setText("Jenis Hari");

        LHarga.setText("Harga");

        LJumlahTiket.setText("Jumlah Tiket");

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LWahana)
                    .addComponent(LJenisHari)
                    .addComponent(LHarga)
                    .addComponent(LJumlahTiket))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LWahana)
                .addGap(18, 18, 18)
                .addComponent(LJenisHari)
                .addGap(18, 18, 18)
                .addComponent(LHarga)
                .addGap(18, 18, 18)
                .addComponent(LJumlahTiket)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CWahana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CWahanaActionPerformed(evt);
            }
        });

        CJenisHari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CJenisHariActionPerformed(evt);
            }
        });

        THarga.setEditable(false);

        BTambah.setText("Tambah");
        BTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTambahActionPerformed(evt);
            }
        });

        BReset.setText("Reset");
        BReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(THarga)
                    .addComponent(CWahana, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CJenisHari, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TJumlahTiket)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addComponent(BTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BReset)
                        .addGap(0, 99, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addComponent(CWahana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CJenisHari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(THarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TJumlahTiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTambah)
                    .addComponent(BReset)))
        );

        TBLRincian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        SPTabel.setViewportView(TBLRincian);

        LTotal.setText("Total");

        TTotal.setEditable(false);

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LTotal)
                .addGap(58, 58, 58)
                .addComponent(TTotal)
                .addContainerGap())
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LTotal)
                    .addComponent(TTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SPTabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Panel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SPTabel, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTambahActionPerformed
        int hargaTerpilih = harga[CJenisHari.getSelectedIndex()][CWahana.getSelectedIndex()],
                jmlTiket, subtotal;
        
        if (TJumlahTiket.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masukkan jumlah tiket", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try {
            jmlTiket = Integer.valueOf(TJumlahTiket.getText());
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan harus berupa angka", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        subtotal = hargaTerpilih * jmlTiket;
        
        tbl.addRow(new Object[]{wahana[CWahana.getSelectedIndex()],
            jenisHari[CJenisHari.getSelectedIndex()], hargaTerpilih, jmlTiket, subtotal});
        TBLRincian.setModel(tbl);
        
        buatTotalan();
    }//GEN-LAST:event_BTambahActionPerformed

    private void CWahanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CWahanaActionPerformed
        THarga.setText(String.valueOf(harga[CJenisHari.getSelectedIndex()][CWahana.getSelectedIndex()]));
    }//GEN-LAST:event_CWahanaActionPerformed

    private void CJenisHariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CJenisHariActionPerformed
        THarga.setText(String.valueOf(harga[CJenisHari.getSelectedIndex()][CWahana.getSelectedIndex()]));
    }//GEN-LAST:event_CJenisHariActionPerformed

    private void BResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BResetActionPerformed
        CWahana.setSelectedIndex(0);
        CJenisHari.setSelectedIndex(0);
        TJumlahTiket.setText(null);
        tbl.getDataVector().removeAllElements();
        tbl.fireTableDataChanged();
        buatTotalan();
    }//GEN-LAST:event_BResetActionPerformed

    public void buatTotalan() {
        int total = 0;
        for (int i = 0; i < TBLRincian.getRowCount(); i++) {
            total += (int) TBLRincian.getValueAt(i, 4);
        }
        TTotal.setText(String.valueOf(total));
    }
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AplikasiPembelianTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiPembelianTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiPembelianTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiPembelianTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiPembelianTiket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BReset;
    private javax.swing.JButton BTambah;
    private javax.swing.JComboBox<String> CJenisHari;
    private javax.swing.JComboBox<String> CWahana;
    private javax.swing.JLabel LHarga;
    private javax.swing.JLabel LJenisHari;
    private javax.swing.JLabel LJumlahTiket;
    private javax.swing.JLabel LTotal;
    private javax.swing.JLabel LWahana;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JScrollPane SPTabel;
    private javax.swing.JTable TBLRincian;
    private javax.swing.JTextField THarga;
    private javax.swing.JTextField TJumlahTiket;
    private javax.swing.JTextField TTotal;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
