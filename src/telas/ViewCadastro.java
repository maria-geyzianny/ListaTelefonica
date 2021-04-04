package telas;
//Bibliotecas do GUI;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

import javax.swing.*;

import classes.Pessoa;

	//Classe JFrame instância os métodos e atributos de interface grafica;
	public class ViewCadastro extends JFrame{
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
		public ViewCadastro(Pessoa objPessoa) {
			super("Cadastro");
			setLayout(null);
			this.objPessoa = objPessoa;
			
			this.LT = new JLabel("LISTA TELEFÔNICA");
			LT.setBounds(350,20,200,20);
			add(LT);
			
			
			//Texto (JLabel); Caixa de texto (nomeField);
			//Linhas 49 a 96
			
			/*this.ID = new JLabel("ID: ");
			ID.setBounds(200, 200, 100, 40);
			add(ID);
			this.IDField = new JTextField(null);
			IDField.setBounds(250, 210, 300, 20);
			add(IDField);
			*/
			
			this.nome = new JLabel("Nome: ");
			nome.setBounds(200, 100, 100, 40);
			add(nome);
			this.nomeField = new JTextField(null);
			nomeField.setBounds(250, 110, 300, 20);
			add(nomeField);
			
			this.sobrenome = new JLabel("Sobrenome: ");
			sobrenome.setBounds(200, 150, 100, 40);
			add(sobrenome);
			this.sobrenomeField = new JTextField(null);
			sobrenomeField.setBounds(285, 160, 265, 20);
			add(sobrenomeField);
			
			this.tellPessoal = new JLabel("Tel Pessoal: ");
			tellPessoal.setBounds(200, 300, 100, 40);
			add(tellPessoal);
			this.tellPessoalField = new JTextField(null);
			tellPessoalField.setBounds(285, 310, 265, 20);
			add(tellPessoalField);
			
			this.tellComercial = new JLabel("Tel Comercial: ");
			tellComercial.setBounds(200, 350, 100, 40);
			add(tellComercial);
			this.tellComercialField = new JTextField(null);
			tellComercialField.setBounds(285, 360, 265, 20);
			add(tellComercialField);
			
			this.email = new JLabel("E-mail: ");
			email.setBounds(200, 250, 100, 40);
			add(email);
			this.emailField = new JTextField(null);
			emailField.setBounds(250, 260, 300, 20);
			add(emailField);
			
			this.sexo = new JLabel("Sexo (M ou F): ");
			sexo.setBounds(200, 400, 100, 40);
			add(sexo);
			this.sexoField = new JTextField(null);
			sexoField.setBounds(285, 410, 265, 20);
			add(sexoField);

			
			//Buttons
			this.cadastroButton = new JButton("Cadastrar");
			cadastroButton.setBounds(40, 280,  100, 40);
			add(cadastroButton);

			
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
			public void actionPerformed(ActionEvent acao) {
				
				if (acao.getSource() == cadastroButton) {
					String inforNome = nomeField.getText();
				}
				//Condição para verificar se há caracteres para o cadastro;
				if((nomeField.getText().length() > 0) && (IDField.getText().length() > 0) && (sobrenomeField.getText().length() > 0)
					&& (tellPessoal.getText().length() > 0) && (tellComercial.getText().length() > 0 && (sexo.getText().length() > 0))) {
						JOptionPane.showMessageDialog(null, "Telefone Cadastrado com Sucesso!");
				}
				else {
					JOptionPane.showMessageDialog(null, "Impossivel cadastrar por haver campo(s) vazio(s).");
					
				}
			
			}
		}
		
		
}
