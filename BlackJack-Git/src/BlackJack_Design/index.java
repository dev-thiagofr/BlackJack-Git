/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BlackJack_Design;

import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Arthu
 */
public class index extends javax.swing.JFrame {

   
    public index() {
        initComponents();
        
        ImageIcon icone1= new ImageIcon("Imagens/icon_blackjack.jpg");
        setIconImage(icone1.getImage());
        
        setLocationRelativeTo(null);
        setResizable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnStart = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        img_tela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusableWindowState(false);
        setMaximumSize(new java.awt.Dimension(1024, 576));
        setMinimumSize(new java.awt.Dimension(1024, 576));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(1024, 576));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 576));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 576));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStart.setBackground(new java.awt.Color(178, 0, 0));
        btnStart.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnStart.setForeground(new java.awt.Color(255, 255, 255));
        btnStart.setText("COMEÇAR");
        btnStart.setBorder(null);
        btnStart.setMaximumSize(new java.awt.Dimension(150, 65));
        btnStart.setMinimumSize(new java.awt.Dimension(150, 65));
        btnStart.setPreferredSize(new java.awt.Dimension(140, 60));
        btnStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStartMouseClicked(evt);
            }
        });
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        jPanel1.add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));

        btnLoad.setBackground(new java.awt.Color(178, 0, 0));
        btnLoad.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnLoad.setForeground(new java.awt.Color(255, 255, 255));
        btnLoad.setText("CARREGAR");
        btnLoad.setBorder(null);
        btnLoad.setPreferredSize(new java.awt.Dimension(140, 60));
        btnLoad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoadMouseClicked(evt);
            }
        });
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });
        jPanel1.add(btnLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 400, -1, -1));

        btnExit.setBackground(new java.awt.Color(178, 0, 0));
        btnExit.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("SAIR");
        btnExit.setBorder(null);
        btnExit.setMaximumSize(new java.awt.Dimension(100, 50));
        btnExit.setMinimumSize(new java.awt.Dimension(100, 50));
        btnExit.setPreferredSize(new java.awt.Dimension(140, 60));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 400, -1, -1));

        img_tela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/StartScreenFinal.png"))); // NOI18N
        img_tela.setInheritsPopupMenu(false);
        jPanel1.add(img_tela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    //O que o botão COMEÇAR vai fazer:
    private void btnStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartMouseClicked
        //Inserir aqui a tela com o jogo começando
    }//GEN-LAST:event_btnStartMouseClicked

    //O que o botão CARREGAR vai fazer:
    private void btnLoadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoadMouseClicked
        //Inserir o código do save
    }//GEN-LAST:event_btnLoadMouseClicked
    
    //O que o botão SAIR vai fazer:
    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        //Inserir o código para tela fechar
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        Blackjack_tela tela2 = new Blackjack_tela();
        tela2.setVisible(true);
        index tela1 = new index();
        tela1.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        Load_tela load_screen = new Load_tela();
        load_screen.setVisible(true);
        index tela1 = new index();
        tela1.setVisible(false);
    }//GEN-LAST:event_btnLoadActionPerformed
    
   
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
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel img_tela;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
