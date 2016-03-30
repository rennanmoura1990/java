package futebol;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class CampeonatoTimePK implements Serializable{
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_campeonato")
	private Campeonato campeonato;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_time")
	private Time time;
	public Campeonato getCampeonato() {
		return campeonato;
	}
	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	
}
