package Repositório;

import java.util.ArrayList;

import Basica.Aluno;

public interface IRepAluno {

	public int geraid();
	public void inserirAluno(Aluno a);
	public void alterarAluno(Aluno a);
	public void removerAluno(int id);
	public Aluno buscaAluno (int id);
	public ArrayList<Aluno> listaAluno();
}
