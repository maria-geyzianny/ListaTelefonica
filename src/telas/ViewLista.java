package telas;

import javax.swing.JFrame;
import javax.swing.JLabel;

import classes.Contato;

public class ViewLista extends JFrame{
	
	private JLabel LT;
	private Contato objContato;
	
	
	public ViewLista(Contato objpessoa) {
		super("Lista de Cadastro");
		setLayout(null);
		this.objPessoa = objContato;
		
		this.LT = new JLabel("LISTA TELEFÔNICA");
		LT.setBounds(350,20,200,20);
		add(LT);
	}
	
	public void exibirTela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		setVisible(true);
	}
	
	
	

}
