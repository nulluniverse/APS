package aps;


import java.util.Date;
import telas.IntCasRes;

public class ONG
        
        extends Usuario {
        private int codigo;
        private static int posicaoAutoIncremental = 1;
	public ONG( String user_nome, String user_email, String user_senha, String user_endereco, int user_cnpj) {
		
                super(
				user_nome,
				user_email,
				user_senha,
				user_endereco,
				user_cnpj
		);
                this.codigo = posicaoAutoIncremental;
                posicaoAutoIncremental++;
        }
        

        
        public void Criar_pedido(String Nome, String Descricao,  Date Validade, boolean Urgente, Restaurante restaurante) {
		Pedido Pedido = new Pedido(Nome, Descricao, Validade, Urgente, super.getUser_nome());
		restaurante.Add_Pedidos(Pedido);
		
	}
	
@Override
public String toString(){
 
    String relatorio = "";
    relatorio += "Codigo: "+codigo;
    relatorio += "\nNome: "+user_nome;
    relatorio += "\nEmail: "+user_email;
    relatorio += "\nSenha: "+user_senha;
    relatorio += "\nEndereco: "+user_endereco;
    relatorio += "\nCNPJ: "+user_cnpj;
    
    return relatorio;	
}


}
