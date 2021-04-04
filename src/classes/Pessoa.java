package classes;

public class Pessoa {

	//Atributos pessoais
	private int ID;
	private String nome, sobrenome;
	private String tellPessoal, tellComcercial;
	private String email;
	private char sexo;
		
	//Construtores para cada atributos
	public Pessoa(int ID, String nome, String sobrenome, String tellPessoal,
				  String tellComercial, String email, char sexo) {
		this.ID = ID;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.tellPessoal = tellPessoal;
		this.tellComcercial = tellComercial;
		this.email = email;
		this.sexo = sexo;
	}
	// tirar o ID para auto Incremente é MAIS SEGUROOOOOO
	
	
	//Get's e Set's
	public int getID() {
		return ID;		
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getTellPessoal() {
		return tellPessoal;
	}

	public void setTellPessoal(String tellPessoal) {
		this.tellPessoal = tellPessoal;
	}

	public String getTellComcercial() {
		return tellComcercial;
	}

	public void setTellComcercial(String tellComcercial) {
		this.tellComcercial = tellComcercial;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
}