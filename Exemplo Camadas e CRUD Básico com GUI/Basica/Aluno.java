package Basica;

public class Aluno {
	private int id;
	private String nome;
	private int idade;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("ID : ");
		sb.append(this.getId());
		sb.append("\n");
		sb.append("Nome : ");
		sb.append(this.getNome());
		sb.append("\n");
		sb.append("Idade : ");
		sb.append(this.getIdade());
		return sb.toString();
	}
	public boolean equals(Object obj){
		if(obj instanceof Aluno){
			Aluno a = (Aluno) obj;
			if((a.getNome() == this.getNome())){
				return true;
			}
		}
		return false;
	}
}
