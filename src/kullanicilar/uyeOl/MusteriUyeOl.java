package kullanicilar.uyeOl;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import kullanicilar.Musteri;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rosegarden
 */
public class MusteriUyeOl extends javax.swing.JFrame {

    /**
     * Creates new form musteriUyeOl
     */
    public MusteriUyeOl() {
        initComponents();
        this.setTitle("Müşteri Üye Olma");
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        isimTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sifreTxt = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        sifreTekrarTxt = new javax.swing.JPasswordField();
        uyeOlBtn = new javax.swing.JButton();
        vazgecBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        kimlikNoTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setBackground(new java.awt.Color(51, 204, 0));
        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 23)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MÜŞTERİ ÜYELİK");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 20, 210, 30);

        jLabel1.setText("İsim:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 160, 50, 16);
        getContentPane().add(isimTxt);
        isimTxt.setBounds(260, 150, 220, 30);

        jLabel2.setText("Şifre:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 220, 50, 16);
        getContentPane().add(sifreTxt);
        sifreTxt.setBounds(260, 210, 220, 30);

        jLabel4.setText("Şifre (Tekrar):");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 290, 100, 16);
        getContentPane().add(sifreTekrarTxt);
        sifreTekrarTxt.setBounds(260, 280, 220, 30);

        uyeOlBtn.setText("Üye Ol");
        uyeOlBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyeOlBtnActionPerformed(evt);
            }
        });
        getContentPane().add(uyeOlBtn);
        uyeOlBtn.setBounds(390, 370, 100, 25);

        vazgecBtn.setText("Vazgeç");
        vazgecBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vazgecBtnActionPerformed(evt);
            }
        });
        getContentPane().add(vazgecBtn);
        vazgecBtn.setBounds(270, 370, 90, 25);

        jLabel5.setText("Kimlik No:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 100, 60, 16);

        kimlikNoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                kimlikNoTxtKeyTyped(evt);
            }
        });
        getContentPane().add(kimlikNoTxt);
        kimlikNoTxt.setBounds(260, 90, 220, 30);

        setSize(new java.awt.Dimension(631, 542));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void vazgecBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vazgecBtnActionPerformed
        // TODO add your handling code here:
        new kullanicilar.MusteriGiris().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_vazgecBtnActionPerformed

    private void uyeOlBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyeOlBtnActionPerformed
        // TODO add your handling code here:
        Musteri m1 = new Musteri();
        m1.kimlikNo = Long.parseLong(kimlikNoTxt.getText());
        m1.isim = isimTxt.getText();
        m1.sifre = String.copyValueOf(sifreTxt.getPassword());

        String[] options = {"ONAYLA", "VAZGEÇ"};
        int i = JOptionPane.showOptionDialog(this, "Bilgilerin Doğruluğundan Emin misiniz ? \n" + "(Onayla dedikten sonra geri dönüş yapılamaz)", "Kayıt Etme Sistemi",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        char[] c1 = sifreTxt.getPassword();
        char[] c2 = sifreTekrarTxt.getPassword();
        String s1 = new String(c1);
        String s2 = new String(c2);
        boolean kontrol = false;
        if (i == 0) {
            if ((kimlikNoTxt.getText().isEmpty()) || (isimTxt.getText().isEmpty()) || (sifreTxt.getText().isEmpty()) || (String.valueOf(sifreTekrarTxt.getPassword()).isEmpty())) {
                JOptionPane.showMessageDialog(uyeOlBtn, "Tüm Alanları Doldurunuz !..", "Boş Alan Hatası", JOptionPane.WARNING_MESSAGE);

            } else if (!(kimlikNoTxt.getText().length() == 11)) {
                JOptionPane.showMessageDialog(uyeOlBtn, "Eksik kimlik numarası girdiniz", "Kimlik Numarası Hatası", JOptionPane.WARNING_MESSAGE);
            } else {

                if (s1.equals(s2)) {

                    for (kullanicilar.Musteri musterim : kullanicilar.Musteri.musteriler) {
                        if (musterim.kimlikNo == (m1.kimlikNo)) {
                            kontrol = true;
                           
                            break;
                        }
                    }

                    if (kontrol) {
                        JOptionPane.showMessageDialog(uyeOlBtn, "Böyle bir kimlik no ya sahip kullanıcı zaten var...", "Kimlik No Hatası", JOptionPane.WARNING_MESSAGE);
                    } else {
                        kullanicilar.Musteri.musteriler.add(m1);
                        JOptionPane.showMessageDialog(this, "Kaydınız başarıyla gerçekleştirilmiştir.");

                    }
                } else {
                    JOptionPane.showMessageDialog(uyeOlBtn, "Şifreler Eşleşmedi", "Şifre Hatası", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
       
    }//GEN-LAST:event_uyeOlBtnActionPerformed

    private void kimlikNoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kimlikNoTxtKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
        }
        if (!(kimlikNoTxt.getText().length() < 11)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_kimlikNoTxtKeyTyped

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
            java.util.logging.Logger.getLogger(MusteriUyeOl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusteriUyeOl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusteriUyeOl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusteriUyeOl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusteriUyeOl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField isimTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField kimlikNoTxt;
    private javax.swing.JPasswordField sifreTekrarTxt;
    private javax.swing.JPasswordField sifreTxt;
    private javax.swing.JButton uyeOlBtn;
    private javax.swing.JButton vazgecBtn;
    // End of variables declaration//GEN-END:variables
}
