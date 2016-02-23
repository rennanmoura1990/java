
public class Quadrado extends Retangulo {
	public Quadrado(){
		
	}
	public Quadrado(int valor){
		this.setAltura(valor);
		this.setComprimento(valor);
	}
	public void aumentarQuadrado(int aumenta){
		int aumenta1 = this.getAltura()+1;
		int aumenta2 = this.getComprimento()+1;
		this.setAltura(aumenta1);
		this.setComprimento(aumenta2);
	}
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("Altura : ");
		sb.append(this.getAltura());
		sb.append(" ");
		sb.append("Comprimento : ");
		sb.append(this.getComprimento());
		return sb.toString();
	}
}
