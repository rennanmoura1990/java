package futebol;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Juiz{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_juiz;
	private String nome;
	@Temporal(TemporalType.DATE)
	private Calendar dtnasc;
	private BigDecimal salario;
	public int getId_juiz() {
		return id_juiz;
	}
	public void setId_juiz(int id_juiz) {
		this.id_juiz = id_juiz;
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
	public boolean equals(Object obj){
		boolean teste = false;
		if(obj instanceof Juiz){
			Juiz j = (Juiz)obj;
			if((j.getNome().equals(this.getNome()))&&(j.getDtnasc().equals(this.getDtnasc()))){
				teste = true;
			}
		}
		return teste;
	}
}
