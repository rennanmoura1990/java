package Negócio;

import java.util.ArrayList;

import Basica.Aluno;
import Repositório.IRepAluno;
import Repositório.RepAluno;

public class ControlAluno {
	private IRepAluno repAluno;

	public ControlAluno() {
		this.repAluno = new RepAluno();
	}
//--Controladores Básicos--
	public void inserirAluno(Aluno a) {
		this.repAluno.inserirAluno(a);
	}

	public void alterarAluno(Aluno a) {
		this.repAluno.alterarAluno(a);
	}

	public void removerAluno(int id) {
		this.repAluno.removerAluno(id);
	}

	public Aluno buscarAluno(int id) {
		return this.repAluno.buscaAluno(id);
	}

	public ArrayList<Aluno> listarAluno() {
		return this.repAluno.listaAluno();
	}
	public int geraid(){
		return this.repAluno.geraid();
	}
	public boolean comparaId(int id){
		return this.repAluno.comparaId(id);
	}
	public boolean comparaNome(String nome){
		return this.repAluno.comparaNome(nome);
	}
}
