package futebol;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
@Entity
public class Tecnico {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_tecnico;
	private String nome;
	@Temporal(TemporalType.DATE)
	private Calendar dtnasc;
	private BigDecimal salario;
	@OneToOne(mappedBy="tecnico")
	@Cascade(CascadeType.ALL)
	private Time time;
	public int getId_tecnico() {
		return id_tecnico;
	}
	public void setId_tecnico(int id_tecnico) {
		this.id_tecnico = id_tecnico;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getDtnasc() {
		return dtnasc;
	}
	public void setDtnasc(Calendar dtnasc) {
		this.dtnasc = dtnasc;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public boolean equals(Object obj){
		boolean teste = false;
		if(obj instanceof Tecnico){
			Tecnico c = (Tecnico)obj;
			if((c.getNome().equals(this.getNome()))&&(c.getDtnasc().equals(this.getDtnasc()))){
				teste = true;
			}
		}
		return teste;
	}
	
}
