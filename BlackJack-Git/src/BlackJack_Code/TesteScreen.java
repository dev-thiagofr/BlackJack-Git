package BlackJack_Code;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class TesteScreen extends JFrame{
    JTextField caixa_txt;
    JLabel label1;
    String caminho ="C:\\Users\\user\\Documents\\NetBeansProjects\\BlackJack-Git\\BlackJack-Git\\src\\Imagens\\c10.png";
    ImageIcon icone = new ImageIcon(caminho);
    Image imagem_redi;
    Image imagem_padrão;
    ImageIcon icone_redi;
    public TesteScreen(){
        //new TesteScreen();
        //JFrame teste = new JFrame();
        //teste.setVisible(true);
        //teste.setSize(800,400);
        //teste.setTitle("aula1");
        
        //Definindo a tela principal
        setTitle("BlackJack Game");
        setSize(620,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        
        
        Color cor = new Color(55,21,29);
        Color cor2 = new Color(9,10,9);
        //Criação de um JButton
        JButton botao = new JButton();
        JButton botao_texto = new JButton();
        botao.setText("Clique-me");
        botao.setBounds(180, 300, 250 , 70 );
        botao.setForeground(cor);
        botao.setBackground(cor2);
        add(botao);
        
        
        //Falando para o botão chamar o método de ativação 
        //this::nomeDoMetodo é tipo fazer o construtor this só q mais fácil
        botao.addActionListener(this::primeiraAção);
        
        //Outro botão
        botao_texto.setBounds(10, 300, 130 , 80 );
        add(botao_texto);
        botao_texto.setText("Aparecer");
        
        
        botao_texto.addActionListener(this::segundaAção);
        
        
        
        //TextField
        caixa_txt = new JTextField();
        caixa_txt.setText("Vai aparecer aqui");
        caixa_txt.setBackground(cor);
        caixa_txt.setBounds(100,100,100,100);
        add(caixa_txt);
        caixa_txt.setVisible(false);
        
        //Redimensionando a img
        imagem_padrão=icone.getImage();
        imagem_redi=imagem_padrão.getScaledInstance(150, 200,Image.SCALE_SMOOTH);

        
        icone_redi = new ImageIcon(imagem_redi);
        //Criando uma Label
        label1 = new JLabel();
        label1.setBounds(2,1,400,400);
        label1.setForeground(cor2);
        label1.setVisible(false);
        label1.setIcon(icone_redi);
        add(label1);
        
                
    }

    //Criando a ação do botão
    public void primeiraAção(ActionEvent primeira_tela) {
        JOptionPane.showMessageDialog(
                null,
                "Voce clicou!",
                "Dealer",
                JOptionPane.WARNING_MESSAGE);
        
    }
    //Criando a ação que quando eu clicar no botão vai aparecer a caixa de texto
    public void segundaAção(ActionEvent texto_aparece){
        label1.setVisible(true);
    }
    
   
}
 