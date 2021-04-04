package telas;

import javax.swing.JFrame;
import javax.swing.JLabel;

import classes.Pessoa;

public class ViewLista extends JFrame{
	
	private JLabel LT;
	private Pessoa objPessoa;
	
	
	public ViewLista(Pessoa objpessoa) {
		super("Lista de Cadastro");
		setLayout(null);
		this.objPessoa = objPessoa;
		
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
