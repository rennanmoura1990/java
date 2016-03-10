
public class AparelhodeSom extends Eletronico {
	public enum ControladorFuncao{
		CD(1), USB(2), Radio(3);
		//Nessas variaveis enumeradas vc passa o valor que vc vai passar no construtor.
		//No caso,meus enumerados recebem um int como parâmetro em seu contrutor
		private final int numerofuncao; // Constante
		private ControladorFuncao(int numerofuncao) {
			this.numerofuncao = numerofuncao;
		}
		public int getNumerofuncao() { // Retorna o Valor do Enum
			return this.numerofuncao;
		}
	}
	private int potencia;
	private Player player;
	private int volume = 0;
	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void aumetaVolume() {
		int volume = this.getVolume();
		volume++;
		this.setVolume(volume);
		if (this.getVolume() > 20) {
			this.setVolume(20);
		}
		if (this.getVolume() < 0) {
			this.setVolume(0);
		}
	}

	public void diminuiVolume() {
		int volume = this.getVolume();
		volume--;
		this.setVolume(volume);
		if (this.getVolume() > 20) {
			this.setVolume(20);
		}
		if (this.getVolume() < 0) {
			this.setVolume(0);
		}
	}
	public Player AlteraFuncao(int op){
		if(op==1){
			Player cd = new CDPlayer();
			this.setPlayer(cd);
		}
		if(op==2){
			Player usb = new USBPlayer();
			this.setPlayer(usb);
		}
		if(op==3){
			this.setPlayer(null);
		}
		return this.getPlayer();
	}
	public String ExibirMensagem(int op){
		String mensagem = null;
		if(op==1){
			mensagem = "CD Player";
		}
		if(op==2){
			mensagem = "USB Player";
		}
		if(op==3){
			mensagem = "Radio";
		}
		return mensagem;
	}
}
