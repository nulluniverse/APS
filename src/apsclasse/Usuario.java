package apsclasse;

public abstract class Usuario {
	
	String user_nome;
	String user_email;
	String user_senha;
	String user_endereco;
	int user_cnpj;


	public Usuario(	String user_nome, String user_email, String user_senha, String user_endereco, int user_cnpj) {
		this.user_nome = user_nome;
		this.user_email = user_email;
		this.user_senha = user_senha;
		this.user_endereco = user_endereco;
		this.user_cnpj = user_cnpj;
	}
	
	public String getUser_nome() {
		return user_nome;
	}

	public String getUser_senha() {
		return user_senha;
	}

	public String getUser_endereco() {
		return user_endereco;
	}

	public String getUser_email() {
		return user_email;
	}
	
	public int getUser_cnpj() {
		return user_cnpj;
	}

}
	


