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
	 * O Metódo em questão,recebe como parâmetros o arraylist das músicas e quanto eu quero avançar
	 * Ele executa um for pecorrendo o ArrayList para pegar o index e setar musica e artista
	 * se o index (que é a soma do valor da música atual + faixas pra avançar),for maior que o tamanho arraylist de músicas - 1 (porque arraylist conta apartir do 0)
	 * ele irar usar o atributo count,que zerar a contagem até atingir o tamanho do arraylist -1
	 * quando count ultrapassar o tamanho do arraylist - 1,ele é zerado,para nova contagem
	 * Resumindo :  ele volta pro começo,toda vez que passa da ultima faixa,se avanço,por exemplo 12 posições ele faz o seguinte trajeto (caso ele avance da faixa 0) : (atual->1-> 2-> 3-> 4-> 0-> 1-> 2-> 3-> 4-> 5-> 0-> 1)
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
	 * A mesma lógica do metódo de avançar música,sendo que ele só executarar o laço (for) quando o index (valor da música atual - retrocedência) for menor que 0
	 * O For começará da primeira retrocedência (por isso o "this.getMusicaatual()-1" até o valor negativo do index.
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
