package classes;

import telas.ViewCadastrar;
import telas.ViewLista;

public class Principal {
	
	public static void main(String[] args) {
		Pessoa objPessoa = null;
		
		//Exibi��o da tela cadastrar atrav�s do Objeto viewCadastrar;
		ViewCadastrar viewCadastrar = new ViewCadastrar(objPessoa);
		viewCadastrar.exibirTela();
		
		//Exibi��o da TelaListar;
		ViewLista viewLista = new viewLista(objPessoa);
		
		
		//Exibi��o da TelaRemover;
		
		
		//Exibi��o da Tela Alterar;
		
		 
		 
		 
		 
	}

}
