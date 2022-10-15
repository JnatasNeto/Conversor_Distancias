/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cinversordistanciasleopoldina;

/**
 *
 * @author Jonatas Neto
 */
import javax.swing.*;
import java.awt.Container;
import java.awt.GridLayout;

public class CinversorDistanciasLeopoldina {
    public static void criarTela(){
    //cria um frame para tela
    JFrame tela = new JFrame("Conversor de distancia ");
    JTextField centimetrosTextField = new JTextField(10);
    JLabel metrosLabel = new JLabel("");
    JLabel milimetrosLabel = new JLabel("");
    JLabel kilometrosLabel = new JLabel("");
    JButton conversorJButton = new JButton("Converter");
    //Criar o painel de conteudo
    Container painelDeConteudo = tela.getContentPane();
    painelDeConteudo.setLayout(new GridLayout(3,2,3,2));
    painelDeConteudo.add(centimetrosTextField);
    painelDeConteudo.add(metrosLabel);
    painelDeConteudo.add(milimetrosLabel);
    painelDeConteudo.add(kilometrosLabel);
    painelDeConteudo.add(conversorJButton);
    //Programar o evento no Botão
    conversorJButton.addActionListener( (e) -> {
        double centimetros = Double.parseDouble(centimetrosTextField.getText());
        double metros = centimetros/100;
        double milimetros = centimetros * 10.0;
        double kilometros = metros/1000.0;
        
        metrosLabel.setText(
                String.format("%.2f m.", metros));
        milimetrosLabel.setText(
            String.format("%.2f mm.", milimetros));
        kilometrosLabel.setText(String.format("%.2f km.", kilometros));
    
    });
    //Ajuste da tela
    tela.pack();
    
    //Centralizar a tela
    tela.setLocationRelativeTo(null);
    //Alterar o comportamento do botão fechar
    tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //tornar a tela visivel 
    tela.setVisible(true);
    
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        criarTela();
        
        });
        // TODO code application logic here
    }
    
}
