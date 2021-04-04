package classes;

import telas.ViewCadastro;
import telas.ViewLista;
import telas.ViewMenu;

public class Principal {
	public static void main(String[] args) {
		
		Contato objContato = null;
		
		ViewMenu viewMenu = new ViewMenu(objContato);
		viewMenu.exibirTela();
		
		/*Exibição da tela cadastrar através do Objeto viewCadastrar;
		ViewCadastro viewCadastrar = new ViewCadastro(objContato);
		viewCadastrar.exibirTela();
		*/
		
		
		/*Exibição da TelaListar;
		ViewLista viewLista = new ViewLista(objContato);
		viewLista.exibirTela();
		*/
		
		//Exibição da TelaRemover;
		
		
		//Exibição da Tela Alterar;
		
		 
		 
		 
		 
	}

}
