package basicas;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Pessoa {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_pessoa;
	private String nome;
	private String email;
	@Temporal(TemporalType.DATE)
	private Calendar dtnasc;
	public int getId_pessoa() {
		return id_pessoa;
	}
	public void setId_pessoa(int id_pessoa) {
		this.id_pessoa = id_pessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Calendar getDtnasc() {
		return dtnasc;
	}
	public void setDtnasc(Calendar dtnasc) {
		this.dtnasc = dtnasc;
	}
}
