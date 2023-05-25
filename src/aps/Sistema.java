package aps;
 
public class Sistema {
	

	public void Cadastrar_ONG(String user_nome, String user_email, String user_senha, String user_endereco, int user_cnpj) {
                ONG ong = new ONG (user_nome, user_email, user_senha, user_endereco,cnpj);
        }
	
	public void Cadastrar_Restaurante(String user_nome, String user_email, String user_senha, String user_endereco, int user_cnpj) {
		Restaurante Restaurante = new Restaurante(user_nome, user_email, user_senha, user_endereco,cnpj); 
	}
	
	public boolean User_LogIn (String Email, String Senha, Usuario usuario) {
		if(Email == usuario.getUser_email() && Senha == usuario.getUser_senha() ) {
			return true;
		} 
		return false;
		
	}

}

