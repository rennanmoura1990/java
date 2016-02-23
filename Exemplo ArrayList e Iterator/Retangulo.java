
public class Retangulo extends FormaGeometrica {
	public Retangulo(){
		this.comprimento = 5;
		this.altura = 5;
	}
	public Retangulo(int valor){
		this.comprimento = valor;
		this.altura = valor;
	}
	public Retangulo(int comprimento,int altura){
		this.comprimento = comprimento;
		this.altura = altura;
	}
	private int comprimento;
	private int altura;
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int calcularArea(int comprimento,int altura){
		int area = 0;
		this.setAltura(altura);
		this.setComprimento(comprimento);
		area = getComprimento()*getAltura();
		return area;
	}
	public int calcularPerimetro(int comprimento,int altura){
		int perimetro = (2*comprimento)+(2*altura);
		return perimetro;
	}
	public boolean ehQuadrato(int comprimento,int altura){
		if (comprimento == altura){
			return true;
		}else{
			return false;
		}
	}
	public boolean equals(Object obj){
		if(obj instanceof Retangulo){
			Retangulo ret = (Retangulo) obj;
			if((ret.getComprimento() == this.getComprimento())&&(ret.getAltura()==this.getAltura()))
			return true;
		}
		return false;
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
