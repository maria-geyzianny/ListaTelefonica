package classes;

import telas.ViewCadastro;
import telas.ViewLista;
import telas.ViewMenu;

public class Principal {
	public static void main(String[] args) {
		
		Contato objContato = null;
		
		ViewMenu viewMenu = new ViewMenu(objContato);
		viewMenu.exibirTela();
		
		/*Exibi��o da tela cadastrar atrav�s do Objeto viewCadastrar;
		ViewCadastro viewCadastrar = new ViewCadastro(objContato);
		viewCadastrar.exibirTela();
		*/
		
		
		/*Exibi��o da TelaListar;
		ViewLista viewLista = new ViewLista(objContato);
		viewLista.exibirTela();
		*/
		
		//Exibi��o da TelaRemover;
		
		
		//Exibi��o da Tela Alterar;
		
		 
		 
		 
		 
	}

}
