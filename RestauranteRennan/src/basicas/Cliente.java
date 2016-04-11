package basicas;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@PrimaryKeyJoinColumn(name="Pessoa_ID")
public class Cliente extends Pessoa {
	private String pag_facebook;
	private String user_twitter;
	@OneToMany(mappedBy="cliente")
	@Cascade(CascadeType.ALL)
	private List<Pedido> pedidos;
	public String getPag_facebook() {
		return pag_facebook;
	}
	public void setPag_facebook(String pag_facebook) {
		this.pag_facebook = pag_facebook;
	}
	public String getUser_twitter() {
		return user_twitter;
	}
	public void setUser_twitter(String user_twitter) {
		this.user_twitter = user_twitter;
	}
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
}
