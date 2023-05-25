package aps;
import java.util.Date;

public class Pedido {
	public String nome;
	public String descricao;
	public Date validade;
	public boolean urgente;
	public String ONG_nome;



	public Pedido( String Nome, String Descricao,  Date Validade, boolean Urgente, String ONG_nome) {
		this.nome = Nome;
		this.descricao =  Descricao;
		this.validade = Validade;
		this.urgente = Urgente;
		this.ONG_nome = ONG_nome;
	
	}

	public String getNome() {
		return nome;
	}
	

	
	

}
