package futebol;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Jogo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_jogo;
	@OneToOne
	@JoinColumn(name="id_timecasa")
	private Time timecasa;
	@OneToOne
	@JoinColumn(name="id_timevisitante")
	private Time timevisitante;
	private String nomecampo;
	@OneToOne
	@JoinColumn(name="id_juiz")
	private Juiz juiz;
	private int placar1;
	private int placar2;
	@Temporal(TemporalType.DATE)
	private Calendar datajogo;
	public int getId_jogo() {
		return id_jogo;
	}
	public void setId_jogo(int id_jogo) {
		this.id_jogo = id_jogo;
	}
	public Time getTimecasa() {
		return timecasa;
	}
	public void setTimecasa(Time timecasa) {
		this.timecasa = timecasa;
	}
	public Time getTimevisitante() {
		return timevisitante;
	}
	public void setTimevisitante(Time timevisitante) {
		this.timevisitante = timevisitante;
	}
	public String getNomecampo() {
		return nomecampo;
	}
	public void setNomecampo(String nomecampo) {
		this.nomecampo = nomecampo;
	}
	public Juiz getJuiz() {
		return juiz;
	}
	public void setJuiz(Juiz juiz) {
		this.juiz = juiz;
	}
	public int getPlacar1() {
		return placar1;
	}
	public void setPlacar1(int placar1) {
		this.placar1 = placar1;
	}
	public int getPlacar2() {
		return placar2;
	}
	public void setPlacar2(int placar2) {
		this.placar2 = placar2;
	}
	public Calendar getDatajogo() {
		return datajogo;
	}
	public void setDatajogo(Calendar datajogo) {
		this.datajogo = datajogo;
	}
	public boolean equals(Object obj){
		boolean teste = false;
		if(obj instanceof Jogo){
			Jogo jogo = (Jogo)obj;
			if(jogo.timecasa.equals(this.timecasa)&& jogo.timevisitante.equals(this.timevisitante) && jogo.datajogo.equals(this.datajogo)){
				teste = true;
			}
		}
		return teste;
	}
}
