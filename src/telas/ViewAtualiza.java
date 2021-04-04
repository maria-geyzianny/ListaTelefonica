package telas;

import javax.swing.JFrame;
import javax.swing.JLabel;

import classes.Pessoa;

public class ViewAtualiza extends JFrame {

	private Pessoa objPessoa;
	private JLabel LT;

	
	public ViewAtualiza() {
		super("Atualizar Cadastro");
		setLayout(null);
		this.objPessoa = objPessoa;
		
		this.LT = new JLabel("LISTA TELEFÔNICA");
		
		
		
		}
		
	public void exibirTela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		setVisible(true);
		
	}

}
