package futebol;

import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Campeonato {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_campeonato;
	private String nome_campeonato;
	@Temporal(TemporalType.DATE)
	private Calendar dtinicio;
	@Temporal(TemporalType.DATE)
	private Calendar dtfim;
	public int getId_campeonato() {
		return id_campeonato;
	}
	public void setId_campeonato(int id_campeonato) {
		this.id_campeonato = id_campeonato;
	}
	public String getNome_campeonato() {
		return nome_campeonato;
	}
	public void setNome_campeonato(String nome_campeonato) {
		this.nome_campeonato = nome_campeonato;
	}
	public Calendar getDtinicio() {
		return dtinicio;
	}
	public void setDtinicio(Calendar dtinicio) {
		this.dtinicio = dtinicio;
	}
	public Calendar getDtfim() {
		return dtfim;
	}
	public void setDtfim(Calendar dtfim) {
		this.dtfim = dtfim;
	}
}
