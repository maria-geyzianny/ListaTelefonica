package telas;

import javax.swing.JFrame;
import javax.swing.JLabel;

import classes.Contato;

public class ViewAtualiza extends JFrame {

	private Contato objContato;
	private JLabel LT;

	
	public ViewAtualiza() {
		super("Atualizar Cadastro");
		setLayout(null);
		this.objContato = objContato;
		
		this.LT = new JLabel("LISTA TELEFÔNICA");
		
		}
		
	public void exibirTela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		setVisible(true);
		
	}

}
