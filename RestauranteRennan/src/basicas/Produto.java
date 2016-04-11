package basicas;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
@Entity
public class Produto {
	@Id
	private int id_produto;
	private String desc_produto;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_tipo",insertable=true,updatable=true) //recebe chave privada de time
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.SAVE_UPDATE)
	private Tipo tipo;
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="produto_pedido",
	joinColumns=@JoinColumn(name="id_produto"),
	inverseJoinColumns=@JoinColumn(name="id_pedido"))
	private List<Pedido>pedido;
	public int getId_produto() {
		return id_produto;
	}
	public void setId_produto(int id_produto) {
		this.id_produto = id_produto;
	}
	public String getDesc_produto() {
		return desc_produto;
	}
	public void setDesc_produto(String desc_produto) {
		this.desc_produto = desc_produto;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public List<Pedido> getPedido() {
		return pedido;
	}
	public void setPedido(List<Pedido> pedido) {
		this.pedido = pedido;
	}
	
}
