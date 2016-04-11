package basicas;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
@Entity
public class Pedido {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_pedido;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dthr_inicio;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dthr_fechamento;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_pessoa",insertable=true,updatable=true)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.SAVE_UPDATE)
	private Cliente cliente;
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="produto_pedido",
	joinColumns=@JoinColumn(name="id_pedido"),
	inverseJoinColumns=@JoinColumn(name="id_produto"))
	private List<Produto>produtos;
	public int getId_pedido() {
		return id_pedido;
	}
	public void setId_pedido(int id_pedido) {
		this.id_pedido = id_pedido;
	}
	public Calendar getDthr_inicio() {
		return dthr_inicio;
	}
	public void setDthr_inicio(Calendar dthr_inicio) {
		this.dthr_inicio = dthr_inicio;
	}
	public Calendar getDthr_fechamento() {
		return dthr_fechamento;
	}
	public void setDthr_fechamento(Calendar dthr_fechamento) {
		this.dthr_fechamento = dthr_fechamento;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
}
