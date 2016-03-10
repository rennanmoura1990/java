import java.util.ArrayList;

public class CDPlayer extends Player {
	private String nomealbum;
	private String nomeartista;
	private int ano;
	private ArrayList<Musica> musicas;
	
	public String getNomealbum() {
		return nomealbum;
	}
	public void setNomealbum(String nomealbum) {
		this.nomealbum = nomealbum;
	}
	public String getNomeartista() {
		return nomeartista;
	}
	public void setNomeartista(String nomeartista) {
		this.nomeartista = nomeartista;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public ArrayList<Musica> getMusicas() {
		return musicas;
	}
	public void setMusicas(ArrayList<Musica> musicas) {
		this.musicas = musicas;
	}
	public String colocarCD(CDPlayer CD){
		CD = new CDPlayer();
		String msg = "Foi colocado o CD de ["+this.nomeartista+"]";
		return msg;
	}
	public String tirarCD(CDPlayer CD){
		CD = null;
		String msg = "Foi tirado o CD de ["+this.nomeartista+"]";
		return msg;
	}
}
