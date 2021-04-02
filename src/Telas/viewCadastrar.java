package Telas;
//Bibliotecas do GUI;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

import javax.swing.*;

import Classes.Pessoa;
import Classes.Principal;

	//Classe JFrame instância os métodos e atributos de interface grafica;
	public class viewCadastrar extends JFrame{
		//Atributos 
		private JLabel LT;
		private JLabel ID;
		private JLabel nome;
		private JLabel sobrenome;
		private JLabel tellPessoal;
		private JLabel tellComercial;
		private JLabel email;
		private JLabel sexo;
		
		private JTextField IDField;
		private JTextField nomeField;
		private JTextField sobrenomeField;
		private JTextField tellPessoalField;
		private JTextField tellComercialField;
		private JTextField emailField;
		private JTextField sexoField;
		
		private JButton cadastroButton;
		private JButton limparButton;
		
		private Pessoa objPessoa;
		
		//Construtor 
		public viewCadastrar(Pessoa objPessoa) {
			super("Lista Telefonica");
			setLayout(null);
			this.objPessoa = objPessoa;
			
			this.LT = new JLabel("LISTA TELEFÔNICA");
			LT.setBounds(350,20,200,20);
			add(LT);
			
			
			//Texto (JLabel); Caixa de texto (nomeField);
			this.nome = new JLabel("Nome: ");
			nome.setBounds(200, 100, 100, 40);
			add(nome);
			this.nomeField = new JTextField(null);
			nomeField.setBounds(250, 110, 300, 20);
			add(nomeField);
			
			//Buttons
			this.cadastroButton = new JButton("Cadastrar");
			cadastroButton.setBounds(210,  360,  100, 40);
			add(cadastroButton);
			this.limparButton = new JButton("Limpar");
			limparButton.setBounds(440, 360, 100, 40);
			add(limparButton);
			
			cadastroButton.addActionListener(new ControleEvento());
		}
		
		public void exibirTela() {
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setSize(800, 600);
			setVisible(true);	
		}

		//Estabelecendo e Definindo o controle das ações da GUI;
		private class ControleEvento implements ActionListener{
			@Override
			//Método para proporcionar ação instanciado da classe (Interface) ActionListener;
			public void actionPerformed(ActionEvent e) {
				
				if (e.getSource() == cadastroButton) {
					String inforNome = nomeField.getText();
				}
				//Condição para verificar se há caracteres para o cadastro;
				if(nomeField.getText().length()>0) {
					JOptionPane.showMessageDialog(null, "Telefone Cadastrado com Sucesso!");
				}
				else {
					JOptionPane.showMessageDialog(null, "Impossivel cadastrar, existe(m) campo(s) nulo(s).");
					
				}
				if(e.getSource()==limparButton) {
					nomeField.setText("");
				}
			
			}
		}
		
		
}
