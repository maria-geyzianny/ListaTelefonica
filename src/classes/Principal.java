package classes;

import telas.ViewCadastro;
import telas.ViewLista;
import telas.ViewMenu;

public class Principal {
	
	public static void main(String[] args) {
		Pessoa objPessoa = null;
		
		
		ViewMenu viewMenu = new ViewMenu(objPessoa);
		viewMenu.exibirTela();
		
		/*Exibi��o da tela cadastrar atrav�s do Objeto viewCadastrar;
		ViewCadastro viewCadastrar = new ViewCadastro(objPessoa);
		viewCadastrar.exibirTela();
		*/
		
		
		/*Exibi��o da TelaListar;
		ViewLista viewLista = new ViewLista(objPessoa);
		viewLista.exibirTela();
		*/
		
		//Exibi��o da TelaRemover;
		
		
		//Exibi��o da Tela Alterar;
		
		 
		 
		 
		 
	}

}
