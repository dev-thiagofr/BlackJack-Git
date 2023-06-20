/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BlackJack_Design;
import BlackJack_Code.Baralho;
import BlackJack_Code.Fichas;
import BlackJack_Code.Jogadores;

import java.awt.Image;
import javax.swing.*;
/**
 *
 * @author Arthu
 */
public class Blackjack_tela extends javax.swing.JFrame {
    
    /**
     * Creates new form TelaPrincipal
     */
    private Baralho baralhodoJogo;
    private Jogadores dealer;
    private Jogadores player;
    private Fichas ficha_jogo;
    public Blackjack_tela() {
        baralhodoJogo = new Baralho();
        baralhodoJogo.embaralhando();
        
        dealer = new Jogadores();
        player = new Jogadores();
        ficha_jogo = new Fichas(200);
        initComponents();
        setSize(768,432);
        setLocationRelativeTo(null);
        setResizable(false);
        
        jogo();
        
        //teste para a carta já vir setada.
        //dealer.adicionarCarta(baralhodoJogo.comprar());
        //ImageIcon icon = new ImageIcon(getClass().getResource("/Imagens/"+dealer.toString()+".png"));
        //dealer_virada.setIcon(icon);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jogo_tela = new javax.swing.JPanel();
        dealer_virada = new javax.swing.JLabel();
        dealer_carta1 = new javax.swing.JLabel();
        dealer_carta3 = new javax.swing.JLabel();
        player_carta1 = new javax.swing.JLabel();
        player_carta2 = new javax.swing.JLabel();
        player_carta3 = new javax.swing.JLabel();
        compra_btn = new javax.swing.JButton();
        parar_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(1024, 576));
        setMinimumSize(new java.awt.Dimension(1024, 576));
        setPreferredSize(new java.awt.Dimension(1024, 576));
        setResizable(false);

        jogo_tela.setBackground(new java.awt.Color(255, 255, 255));
        jogo_tela.setMaximumSize(new java.awt.Dimension(1024, 576));
        jogo_tela.setMinimumSize(new java.awt.Dimension(1024, 576));
        jogo_tela.setPreferredSize(new java.awt.Dimension(1024, 576));
        jogo_tela.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dealer_virada.setText("cartaVirada");
        dealer_virada.setMaximumSize(new java.awt.Dimension(51, 93));
        dealer_virada.setMinimumSize(new java.awt.Dimension(51, 93));
        dealer_virada.setPreferredSize(new java.awt.Dimension(51, 93));
        jogo_tela.add(dealer_virada, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 140, -1, -1));
        // Carrega a imagem original
        ImageIcon imageIcon = new ImageIcon("caminho/para/imagem.png");

        // Redimensiona a imagem para o tamanho desejado
        int larguraDesejada = 51;
        int alturaDesejada = 93;
        Image imagemRedimensionada = imageIcon.getImage().getScaledInstance(larguraDesejada, alturaDesejada, Image.SCALE_DEFAULT);

        // Cria um novo ImageIcon com a imagem redimensionada
        ImageIcon imagemRedimensionadaIcon = new ImageIcon(imagemRedimensionada);

        dealer_carta1.setBackground(new java.awt.Color(102, 102, 0));
        dealer_carta1.setText("carta1");
        dealer_carta1.setMaximumSize(new java.awt.Dimension(51, 93));
        dealer_carta1.setMinimumSize(new java.awt.Dimension(51, 93));
        dealer_carta1.setPreferredSize(new java.awt.Dimension(51, 93));
        jogo_tela.add(dealer_carta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));

        dealer_carta3.setText("carta3");
        dealer_carta3.setMaximumSize(new java.awt.Dimension(51, 93));
        dealer_carta3.setMinimumSize(new java.awt.Dimension(51, 93));
        dealer_carta3.setPreferredSize(new java.awt.Dimension(51, 93));
        jogo_tela.add(dealer_carta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, -1, -1));
        dealer_carta3.getAccessibleContext().setAccessibleName("");
        dealer_carta3.getAccessibleContext().setAccessibleDescription("");

        player_carta1.setText("carta1");
        player_carta1.setMaximumSize(new java.awt.Dimension(51, 93));
        player_carta1.setMinimumSize(new java.awt.Dimension(51, 93));
        player_carta1.setName(""); // NOI18N
        player_carta1.setPreferredSize(new java.awt.Dimension(51, 83));
        jogo_tela.add(player_carta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 313, 50, 90));

        player_carta2.setText("carta2");
        player_carta2.setMaximumSize(new java.awt.Dimension(51, 93));
        player_carta2.setMinimumSize(new java.awt.Dimension(51, 93));
        player_carta2.setPreferredSize(new java.awt.Dimension(51, 93));
        player_carta2.setRequestFocusEnabled(false);
        jogo_tela.add(player_carta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 320, -1, -1));

        player_carta3.setText("carta3");
        player_carta3.setMaximumSize(new java.awt.Dimension(51, 93));
        player_carta3.setMinimumSize(new java.awt.Dimension(51, 93));
        player_carta3.setPreferredSize(new java.awt.Dimension(51, 93));
        jogo_tela.add(player_carta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, -1, -1));

        compra_btn.setBackground(new java.awt.Color(4, 54, 25));
        compra_btn.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        compra_btn.setText("COMPRAR");
        compra_btn.setPreferredSize(new java.awt.Dimension(140, 60));
        compra_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                compra_btnMouseClicked(evt);
            }
        });
        compra_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compra_btnActionPerformed(evt);
            }
        });
        jogo_tela.add(compra_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 420, -1, -1));

        parar_btn.setBackground(new java.awt.Color(4, 54, 25));
        parar_btn.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        parar_btn.setLabel("PARAR");
        parar_btn.setPreferredSize(new java.awt.Dimension(140, 60));
        jogo_tela.add(parar_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(836, 420, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BackgroundJogoF.png"))); // NOI18N
        jogo_tela.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jogo_tela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jogo_tela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void compra_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compra_btnActionPerformed
        
    }//GEN-LAST:event_compra_btnActionPerformed

    private void compra_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compra_btnMouseClicked
        //dealer.adicionarCarta(baralhodoJogo.comprar());
        //ImageIcon icon = new ImageIcon(getClass().getResource("/Imagens/"+dealer.toString()+".png"));
        //dealer_carta1.setIcon(icon);
        //dealer_carta1.setText(dealer.toString()+".png");
        
    }//GEN-LAST:event_compra_btnMouseClicked

    /**
     * @param args the command line arguments
     */
    public void jogo(){
        
        ImageIcon icon_virada = new ImageIcon(getClass().getResource("/Imagens/CartaVirada.png"));
        dealer_carta1.setIcon(icon_virada);
        
        player.adicionarCarta(baralhodoJogo.comprar());
        ImageIcon icon1 = new ImageIcon(getClass().getResource("/Imagens/"+player.toString()+".png"));
        player_carta1.setIcon(icon1);
        
        
        //dealer.adicionarCarta(baralhodoJogo.comprar());
        //player.adicionarCarta(baralhodoJogo.comprar());
        //dealer.adicionarCarta(baralhodoJogo.comprar());
        
        
    }
    public static void main(String args[]) {
        
        //Blackjack_tela teste1 = new Blackjack_tela();
        //teste1.jogo();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Blackjack_tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Blackjack_tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Blackjack_tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Blackjack_tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Blackjack_tela().setVisible(true);
        });
        ;
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton compra_btn;
    private javax.swing.JLabel dealer_carta1;
    private javax.swing.JLabel dealer_carta3;
    private javax.swing.JLabel dealer_virada;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jogo_tela;
    private javax.swing.JButton parar_btn;
    private javax.swing.JLabel player_carta1;
    private javax.swing.JLabel player_carta2;
    private javax.swing.JLabel player_carta3;
    // End of variables declaration//GEN-END:variables
}
