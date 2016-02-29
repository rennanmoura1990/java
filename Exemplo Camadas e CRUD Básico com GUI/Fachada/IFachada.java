package Fachada;

import java.util.ArrayList;

import Basica.Aluno;

public interface IFachada {
	public int geraid();
	public void inserirAluno(Aluno a);
	public void alterarAluno (Aluno a);
	public void removerAluno (int id);
	public Aluno buscarAluno (int id);
	public ArrayList<Aluno> listarAluno();
}
