package futebol;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Jogador {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_jogador;
	private String nome;
	@Temporal(TemporalType.DATE)
	private Calendar dtnasc;
	private BigDecimal salario;
	private int ncamisa;
	private boolean emcampo;
	private boolean cartaoamarelo;
	private int qtd_amarelos;
	private int qtd_vermelhos;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_time",insertable=true,updatable=true) //recebe chave privada de time
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.SAVE_UPDATE)
	private Time time;
	public int getId_jogador() {
		return id_jogador;
	}
	public void setId_jogador(int id_jogador) {
		this.id_jogador = id_jogador;
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
	public int getNcamisa() {
		return ncamisa;
	}
	public void setNcamisa(int ncamisa) {
		this.ncamisa = ncamisa;
	}
	public boolean isEmcampo() {
		return emcampo;
	}
	public void setEmcampo(boolean emcampo) {
		this.emcampo = emcampo;
	}
	public boolean isCartaoamarelo() {
		return cartaoamarelo;
	}
	public void setCartaoamarelo(boolean cartaoamarelo) {
		this.cartaoamarelo = cartaoamarelo;
	}
	public int getQtd_amarelos() {
		return qtd_amarelos;
	}
	public void setQtd_amarelos(int qtd_amerelos) {
		this.qtd_amarelos = qtd_amerelos;
	}
	public int getQtd_vermelhos() {
		return qtd_vermelhos;
	}
	public void setQtd_vermelhos(int qtd_vermelhos) {
		this.qtd_vermelhos = qtd_vermelhos;
	}
	
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public boolean equals(Object obj){
		boolean teste = false;
		if(obj instanceof Jogador){
			Jogador j = (Jogador)obj;
			if((j.getNome().equals(this.getNome()))&&(j.getNcamisa() == this.ncamisa)){
				teste = true;
			}
		}
		return teste;
	}
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("ID : ");
		sb.append(this.getId_jogador());
		sb.append("\n");
		sb.append("Nome : ");
		sb.append(this.getNome());
		sb.append("\n");
		sb.append("Data Nascimento : ");
		sb.append(this.getDtnasc().getTime());
		sb.append("\n");
		sb.append("Salário : ");
		sb.append(this.getSalario());
		sb.append("\n");
		sb.append("Número da Camisa : ");
		sb.append(this.getNcamisa());
		sb.append("\n");
		sb.append("Cartão Amarelo? : ");
		sb.append(this.isCartaoamarelo());
		sb.append("\n");
		sb.append("Em Campo? : ");
		sb.append(this.isEmcampo());
		sb.append("\n");
		sb.append("QTD Cartão Amarelo : ");
		sb.append(this.getQtd_amarelos());
		sb.append("\n");
		sb.append("QTD Cartão Vermelho : ");
		sb.append(this.getQtd_vermelhos());
		sb.append("\n");
		sb.append("Time : ");
		sb.append(this.getTime().getId_time());
		return sb.toString();
	}
	
	
}
