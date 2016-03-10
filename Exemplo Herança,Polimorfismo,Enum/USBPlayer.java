import java.util.ArrayList;

public class USBPlayer extends Player {
	private ArrayList<Musica> musicas;

	public ArrayList<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(ArrayList<Musica> musicas) {
		this.musicas = musicas;
	}
	/**
	 * O Met�do em quest�o,recebe como par�metros o arraylist das m�sicas e quanto eu quero avan�ar
	 * Ele executa um for pecorrendo o ArrayList para pegar o index e setar musica e artista
	 * se o index (que � a soma do valor da m�sica atual + faixas pra avan�ar),for maior que o tamanho arraylist de m�sicas - 1 (porque arraylist conta apartir do 0)
	 * ele irar usar o atributo count,que zerar a contagem at� atingir o tamanho do arraylist -1
	 * quando count ultrapassar o tamanho do arraylist - 1,ele � zerado,para nova contagem
	 * Resumindo :  ele volta pro come�o,toda vez que passa da ultima faixa,se avan�o,por exemplo 12 posi��es ele faz o seguinte trajeto (caso ele avance da faixa 0) : (atual->1-> 2-> 3-> 4-> 0-> 1-> 2-> 3-> 4-> 5-> 0-> 1)
	 * @param musicas
	 * @param avancar
	 * @return
	 */
	public String avancarMusica(ArrayList<Musica> musicas,int avancar){
		int index = this.getMusicaatual();
		index += avancar;
		String msg = null;
		int count = 0;
		for(int i = 0;i<=index;i++){
			if(index > musicas.size()-1){
				if(count > musicas.size()-1){
					count = 0;
				}
				Musica m = (Musica)musicas.get(count);
				this.setMusicaatual(count);
				msg = ""+this.getMusicaatual()+" - ["+m.getNomemusica()+"] - ["+m.getNomeartista()+"]";
				count++;
			}else{
				Musica m = (Musica)musicas.get(index);
				this.setMusicaatual(index);
				msg = ""+this.getMusicaatual()+" - ["+m.getNomemusica()+"] - ["+m.getNomeartista()+"]";
			}
		}
		return msg;
	}
	/**
	 * A mesma l�gica do met�do de avan�ar m�sica,sendo que ele s� executarar o la�o (for) quando o index (valor da m�sica atual - retroced�ncia) for menor que 0
	 * O For come�ar� da primeira retroced�ncia (por isso o "this.getMusicaatual()-1" at� o valor negativo do index.
	 */
	public String recuarMusica(ArrayList<Musica> musicas,int retroceder){
		int index = this.getMusicaatual();
		index -= retroceder;
		String msg = null;
		int count = 0;
		if(index < 0 ){
		for(int i = this.getMusicaatual()-1;i>index;i--){
				if(count < 0){
					count = musicas.size()-1;
				}
				Musica m = (Musica)musicas.get(count);
				this.setMusicaatual(count);
				msg = ""+this.getMusicaatual()+" - ["+m.getNomemusica()+"] - ["+m.getNomeartista()+"]";
				count--;
			}
	}else{
		Musica m = (Musica)musicas.get(index);
		this.setMusicaatual(index);
		msg = ""+this.getMusicaatual()+" - ["+m.getNomemusica()+"] - ["+m.getNomeartista()+"]";
	}
		return msg;
	}
}
