package classes;

import telas.ViewCadastrar;
import telas.ViewLista;

public class Principal {
	
	public static void main(String[] args) {
		Pessoa objPessoa = null;
		
		//Exibição da tela cadastrar através do Objeto viewCadastrar;
		ViewCadastrar viewCadastrar = new ViewCadastrar(objPessoa);
		viewCadastrar.exibirTela();
		
		//Exibição da TelaListar;
		ViewLista viewLista = new viewLista(objPessoa);
		
		
		//Exibição da TelaRemover;
		
		
		//Exibição da Tela Alterar;
		
		 
		 
		 
		 
	}

}
