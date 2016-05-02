package model;

public class Usuario {
	long id;	
	String nome;
	String email;
	char senha;
	String telefone;
	
	
	public Usuario(long id, String nome, String email, char senha, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.telefone = telefone;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public long getId (){
		return id;
	}
	
	public void setId(long id){
		this.id = id;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getSenha() {
		return senha;
	}

	public void setSenha(char senha) {
		this.senha = senha;
	}

	public void setNome(String nome) {
		this.nome = nome;
	} 
}
