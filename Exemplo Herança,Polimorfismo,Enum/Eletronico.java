public class Eletronico {
	private String marca;
	private String modelo;
	private boolean indicador;
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean isIndicador() {
		return indicador;
	}
	public void setIndicador(boolean indicador) {
		this.indicador = indicador;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void ligar(){
		this.indicador = true;
	}
	public void desligar(){
		this.indicador = false;
	}
	public String toString(){
		String msg = null;
		if(this.indicador == true){
			msg = "Ligado!";
		}else{
			msg = "Desligado!";
		}
		return msg;
	}
}
