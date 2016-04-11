package basicas;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tipo {
	@Id
	private int id_tipo;
	private String nome_tipo;
	public int getId_tipo() {
		return id_tipo;
	}
	public void setId_tipo(int id_tipo) {
		this.id_tipo = id_tipo;
	}
	public String getNome_tipo() {
		return nome_tipo;
	}
	public void setNome_tipo(String nome_tipo) {
		this.nome_tipo = nome_tipo;
	}
	
}
