package telas;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import telas.ViewCadastro;
import classes.Contato;

public class ViewMenu extends JFrame {
	
	private Contato objContato;
	
	private JLabel LT;
	private Button opcCadastro;
	private Button opcLista;
	private Button opcAtualiza;
	private Button opcDeleta;

	
	//Construtor
	public ViewMenu(Contato objPessoa) {
		super("Menu Lista Telefônica");
		this.objContato = objContato;
		setLayout(null);
		setVisible(true);
		
		//Botões e Texto
		this.LT = new JLabel("MENU DA LISTA TELEFÔNICA");
		LT.setBounds(262, 20, 200, 20);
		add(LT);
		
		this.opcCadastro = new Button("Cadastro");
		opcCadastro.setBounds(60, 170,  100, 40);
		add(opcCadastro);
		
		this.opcLista = new Button("Lista");
		opcLista.setBounds(210, 170, 100, 40);
		add(opcLista);
		
		this.opcAtualiza = new Button("Atualiza");
		opcAtualiza.setBounds(360, 170, 100, 40);
		add(opcAtualiza);
		
		this.opcDeleta = new Button("Deleta");
		opcDeleta.setBounds(510, 170, 100, 40);
		add(opcDeleta);
		
		
		//Criar ação nos botões (eventos)
		this.opcCadastro.addActionListener(new ControleEvento());
		this.opcLista.addActionListener(new ControleEvento());
		
	}
	
	
	public void exibirTela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(690, 390);
		setVisible(true);		
	}
	
	
	private class ControleEvento implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent acao) {
			
			if (acao.getSource() == opcCadastro) {
				ViewCadastro viewCadastro = new ViewCadastro(objContato);
				viewCadastro.exibirTela();
			}
			
			else if (acao.getSource() == opcLista) {
				ViewLista viewLista = new ViewLista(objContato);
				viewLista.exibirTela();
			}
			
		}
		
	}

}
