package futebol;

import java.util.List;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Time {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_time;
	private String nome;
	private String estado;
	private int pontos;
	@OneToMany(mappedBy="time")
	@Cascade(CascadeType.ALL)
	private List<Jogador> jogadores; //Ele não pega ArrayList :/
	@OneToOne
	@JoinColumn(name="id_tecnico") //recebe chave privada de tecnico
	private Tecnico tecnico;

	public int getId_time() {
		return id_time;
	}

	public void setId_time(int id_time) {
		this.id_time = id_time;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}
	public boolean equals(Object obj){
		boolean teste = false;
		if(obj instanceof Time){
			Time t = (Time)obj;
			if(t.getNome().equals(this.nome)&&t.getEstado().equals(this.estado)){
				teste = true;
			}
		}
		return teste;
	}
}
