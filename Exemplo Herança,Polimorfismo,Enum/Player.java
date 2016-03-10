import java.util.ArrayList;

public class Player {
	private int musicaatual;
	private int tempoatual;

	public int getMusicaatual() {
		return musicaatual;
	}

	public void setMusicaatual(int musicaatual) {
		this.musicaatual = musicaatual;
	}

	public int getTempoatual() {
		return tempoatual;
	}

	public void setTempoatual(int tempoatual) {
		this.tempoatual = tempoatual;
	}

	public String play(ArrayList<Musica> musicas) {
		Musica m = (Musica) musicas.get(0);
		String msg = "Executando Música [" + m.getNomemusica() + "]";
		this.setMusicaatual(0);
		return msg;
	}

	public String stop() {
		String msg = "Player parado";
		this.setMusicaatual(0);
		return msg;
	}

	public String avancarMusica(ArrayList<Musica> musicas, int avancar) {
		int index = this.getMusicaatual();
		index += avancar;
		String msg = null;
		if (index > musicas.size() - 1) {
			Musica m = (Musica) musicas.get(0);
			this.setMusicaatual(0);
			msg = "" + this.getMusicaatual() + " - [" + m.getNomemusica() + "] - [" + m.getNomeartista() + "]";
		} else {
			Musica m = (Musica) musicas.get(index);
			this.setMusicaatual(index);
			msg = "" + this.getMusicaatual() + " - [" + m.getNomemusica() + "] - [" + m.getNomeartista() + "]";
		}
		return msg;
	}

	public String recuarMusica(ArrayList<Musica> musicas, int retroceder) {
		int index = this.getMusicaatual();
		index -= retroceder;
		String msg = null;
		if (index < 0) {
			Musica m = (Musica) musicas.get(musicas.size() - 1);
			this.setMusicaatual(musicas.size() - 1);
			msg = "" + this.getMusicaatual() + " - [" + m.getNomemusica() + "] - [" + m.getNomeartista() + "]";
		} else {
			Musica m = (Musica) musicas.get(index);
			this.setMusicaatual(index);
			msg = "" + this.getMusicaatual() + " - [" + m.getNomemusica() + "] - [" + m.getNomeartista() + "]";
		}
		return msg;
	}
}
