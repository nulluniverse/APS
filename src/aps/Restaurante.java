package aps;

import java.util.List;
import telas.IntCasRes;

public class Restaurante 
        extends Usuario {
        
    private int codigo;
        private static int posicaoAutoIncremental = 1;
        
	private List <Pedido> pedidos;
	
	public Restaurante(	String user_nome, String user_email, String user_senha, String user_endereco, int user_cnpj) {
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
	
	public void Add_Pedidos(Pedido pedido) {
		pedidos.add(pedido); 
		
	}
	
	public void Del_Pedidos(Pedido pedido) {
		pedidos.remove(pedido);
		
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

