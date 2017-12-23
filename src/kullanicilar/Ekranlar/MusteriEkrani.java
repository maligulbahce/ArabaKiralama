/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kullanicilar.Ekranlar;

import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rosegarden
 */
public class MusteriEkrani extends javax.swing.JFrame {

    /**
     * Creates new form KullaniciEkrani
     */
   
    public MusteriEkrani() {
        initComponents();
        this.setTitle("Müşteri Ekranı");
        musteriIsmiTxt.setText(kullanicilar.MusteriGiris.girisYapan);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        musteriIsmiTxt = new javax.swing.JTextField();
        arabaKiralaBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        alinanArabalarTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        musteriIsmiTxt.setEnabled(false);
        getContentPane().add(musteriIsmiTxt);
        musteriIsmiTxt.setBounds(530, 10, 140, 30);

        arabaKiralaBtn.setText("Araba Kirala");
        arabaKiralaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arabaKiralaBtnActionPerformed(evt);
            }
        });
        getContentPane().add(arabaKiralaBtn);
        arabaKiralaBtn.setBounds(20, 10, 190, 30);

        alinanArabalarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(alinanArabalarTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 160, 480, 300);

        setSize(new java.awt.Dimension(697, 530));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void arabaKiralaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arabaKiralaBtnActionPerformed
        // TODO add your handling code here:
        new ArabaKirala().setVisible(true);
    }//GEN-LAST:event_arabaKiralaBtnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(MusteriEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusteriEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusteriEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusteriEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusteriEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable alinanArabalarTable;
    private javax.swing.JButton arabaKiralaBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField musteriIsmiTxt;
    // End of variables declaration//GEN-END:variables
}
