package futebol;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class CampeonatoTime {
	@EmbeddedId
	private CampeonatoTimePK chaves;
	private int posicao;

	public CampeonatoTimePK getChaves() {
		return chaves;
	}

	public void setChaves(CampeonatoTimePK chaves) {
		this.chaves = chaves;
	}

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	
}
