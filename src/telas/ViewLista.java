package telas;

import javax.swing.JFrame;
import javax.swing.JLabel;

import classes.Pessoa;

public class ViewLista extends JFrame{
	
	private Pessoa objPessoa;
	
	public ViewLista() {
		super("Lista Telefonica");
		setLayout(null);
		this.objPessoa = objPessoa;
		
	}
	
	pulbic viewLista(Pessoa objpessoa) {
		//super(); N�O SEI O QUE FAZER AQUI
		setLayout(null);
		this.objPessoa = objPessoa;
		
		this.LT = new JLabel("LISTA TELEF�NICA");
		LT.setBounds(350,20,200,20);
		add(LT);
	}
	
	public void exibirTela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		setVisible(true);
	}
	
	
	

}
