package classes;

import telas.ViewCadastro;
import telas.ViewLista;
import telas.ViewMenu;

public class Principal {
	
	public static void main(String[] args) {
		Pessoa objPessoa = null;
		
		
		ViewMenu viewMenu = new ViewMenu(objPessoa);
		viewMenu.exibirTela();
		
		/*Exibição da tela cadastrar através do Objeto viewCadastrar;
		ViewCadastro viewCadastrar = new ViewCadastro(objPessoa);
		viewCadastrar.exibirTela();
		*/
		
		
		/*Exibição da TelaListar;
		ViewLista viewLista = new ViewLista(objPessoa);
		viewLista.exibirTela();
		*/
		
		//Exibição da TelaRemover;
		
		
		//Exibição da Tela Alterar;
		
		 
		 
		 
		 
	}

}
