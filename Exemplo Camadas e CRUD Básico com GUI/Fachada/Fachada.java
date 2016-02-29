package Fachada;

import java.util.ArrayList;

import Basica.Aluno;
import Negócio.ControlAluno;

public class Fachada implements IFachada {
	private ControlAluno controladorAluno;
	public Fachada(){
		this.controladorAluno = new ControlAluno();
	}
	@Override
	public void inserirAluno(Aluno a) {
		// TODO Auto-generated method stub
		this.controladorAluno.inserirAluno(a);
	}

	@Override
	public void alterarAluno(Aluno a) {
		// TODO Auto-generated method stub
		this.controladorAluno.alterarAluno(a);
	}

	@Override
	public void removerAluno(int id) {
		// TODO Auto-generated method stub
		this.controladorAluno.removerAluno(id);
	}

	@Override
	public Aluno buscarAluno(int id) {
		// TODO Auto-generated method stub
		return this.controladorAluno.buscarAluno(id);
	}

	@Override
	public ArrayList<Aluno> listarAluno() {
		// TODO Auto-generated method stub
		return this.controladorAluno.listarAluno();
	}
	@Override
	public int geraid() {
		// TODO Auto-generated method stub
		return this.controladorAluno.geraid();
	}
}
