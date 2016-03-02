package Neg�cio;

import java.util.ArrayList;

import Basica.Aluno;
import Reposit�rio.IRepAluno;
import Reposit�rio.RepAluno;

public class ControlAluno {
	private IRepAluno repAluno;

	public ControlAluno() {
		this.repAluno = new RepAluno();
	}
//--Controladores B�sicos--
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
