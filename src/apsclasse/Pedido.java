package apsclasse;
import java.util.Date;

public class Pedido {
	private String nome;
	private String descricao;
	private Date validade;
	private boolean urgente;
	private String ONG_nome;



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
