/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kullanicilar.Ekranlar;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import kullanicilar.KullaniciGirisi;

/**
 *
 * @author Rosegarden
 */
public class PersonelEkrani extends javax.swing.JFrame {

    /**
     * Creates new form PersonelEkrani
     */
    DefaultTableModel dtm = new DefaultTableModel();

    public PersonelEkrani() {
        initComponents();
        this.getContentPane().setBackground(Color.GRAY);
        this.setTitle("Personel Ekranı");
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        dtm.setColumnIdentifiers(new Object[]{"Araba Kodu", "Araba Modeli", "Günlük Ücret"});
        sistemdeOlanlarTable.setModel(dtm);
        ArabalariGetir();
        arabaKoduTxt.setText(String.valueOf(sistemdeOlanlarTable.getRowCount()));
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
        sistemdeOlanlarTable = new javax.swing.JTable();
        arabaEkleBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        arabaKoduTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        arabaModelTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        gunlukUcret = new javax.swing.JTextField();
        tabloyuGuncelleBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        arabaSilBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        sistemdeOlanlarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(sistemdeOlanlarTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 130, 452, 320);

        arabaEkleBtn.setText("Araba Ekle");
        arabaEkleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arabaEkleBtnActionPerformed(evt);
            }
        });
        getContentPane().add(arabaEkleBtn);
        arabaEkleBtn.setBounds(490, 130, 160, 25);

        jLabel1.setText("Araba Kodu:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 90, 16);

        arabaKoduTxt.setEnabled(false);
        getContentPane().add(arabaKoduTxt);
        arabaKoduTxt.setBounds(120, 10, 190, 30);

        jLabel2.setText("Araba Model:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 90, 90, 16);
        getContentPane().add(arabaModelTxt);
        arabaModelTxt.setBounds(120, 80, 190, 30);

        jLabel3.setText("Günlük Ücret:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(340, 16, 90, 20);

        gunlukUcret.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gunlukUcretKeyTyped(evt);
            }
        });
        getContentPane().add(gunlukUcret);
        gunlukUcret.setBounds(430, 10, 180, 30);

        tabloyuGuncelleBtn.setText("Tabloyu Güncelle");
        tabloyuGuncelleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabloyuGuncelleBtnActionPerformed(evt);
            }
        });
        getContentPane().add(tabloyuGuncelleBtn);
        tabloyuGuncelleBtn.setBounds(490, 210, 160, 25);

        jLabel4.setText("(Son eklenen kodu gösterir)");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 50, 190, 16);

        arabaSilBtn.setText("Araba Sil");
        arabaSilBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arabaSilBtnActionPerformed(evt);
            }
        });
        getContentPane().add(arabaSilBtn);
        arabaSilBtn.setBounds(490, 170, 160, 25);

        setSize(new java.awt.Dimension(739, 514));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        String[] options = {"ÇIKIŞ", "İPTAL"};
        int i = JOptionPane.showOptionDialog(this, "Bu işlem sizi Kullanıcı Girişine götürür." + "\n" + "Tekrar Kullanıcı Seçimi yapmak için ekranına dönersiniz." + "\n" + "Devam etmek istiyormusunuz?", "Personel Ekranından Çıkış", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (i == 0) {
            this.setVisible(false);
            new KullaniciGirisi().setVisible(true);
        }
    }//GEN-LAST:event_formWindowClosing

    private void arabaEkleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arabaEkleBtnActionPerformed
        // TODO add your handling code here:

        arabaKoduTxt.setText(String.valueOf(Integer.parseInt(arabaKoduTxt.getText()) + 1));

        if (arabaModelTxt.getText().isEmpty() || gunlukUcret.getText().isEmpty()) {
            JOptionPane.showMessageDialog(arabaEkleBtn, "Tüm Alanları Doldurunuz !..", "Boş Alan Hatası", JOptionPane.WARNING_MESSAGE);
        } else {
            ArabaListesi yeniArabam = new ArabaListesi();
            yeniArabam.aracNo = Integer.parseInt(arabaKoduTxt.getText());
            yeniArabam.model = arabaModelTxt.getText();
            yeniArabam.fiyat = Integer.parseInt(gunlukUcret.getText());

            ArabaListesi.arabalarim.add(yeniArabam);
        }
        arabaModelTxt.setText(null);
        gunlukUcret.setText(null);
    }//GEN-LAST:event_arabaEkleBtnActionPerformed

    private void gunlukUcretKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gunlukUcretKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_gunlukUcretKeyTyped

    private void tabloyuGuncelleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabloyuGuncelleBtnActionPerformed
        // TODO add your handling code here:
        dtm.setRowCount(0);
        for (int i = 0; i < ArabaListesi.arabalarim.size(); i++) {
            dtm.addRow(new Object[]{ArabaListesi.arabalarim.get(i).aracNo, ArabaListesi.arabalarim.get(i).model, ArabaListesi.arabalarim.get(i).fiyat});
        }
    }//GEN-LAST:event_tabloyuGuncelleBtnActionPerformed

    private void arabaSilBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arabaSilBtnActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_arabaSilBtnActionPerformed
    void ArabalariGetir() {
        ArabaListesi.arabaYukle();
        for (int i = 0; i < ArabaListesi.arabalarim.size(); i++) {
            dtm.addRow(new Object[]{ArabaListesi.arabalarim.get(i).aracNo, ArabaListesi.arabalarim.get(i).model, ArabaListesi.arabalarim.get(i).fiyat});
        }
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
            java.util.logging.Logger.getLogger(PersonelEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonelEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonelEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonelEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonelEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton arabaEkleBtn;
    private javax.swing.JTextField arabaKoduTxt;
    private javax.swing.JTextField arabaModelTxt;
    private javax.swing.JButton arabaSilBtn;
    private javax.swing.JTextField gunlukUcret;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable sistemdeOlanlarTable;
    private javax.swing.JButton tabloyuGuncelleBtn;
    // End of variables declaration//GEN-END:variables
}
