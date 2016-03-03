package Repositório;

import java.util.ArrayList;

import Basica.Aluno;

public class RepAluno implements IRepAluno {
	ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	int id = 0;

	@Override
	public void inserirAluno(Aluno a) {
		// TODO Auto-generated method stub
		try {
			alunos.add(a);
			id++;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}

	@Override
	public void alterarAluno(Aluno a) {
		// TODO Auto-generated method stub
		try {
			for (Aluno al : alunos) {
				if (al.getId() == a.getId()) {
					al.setNome(a.getNome());
					al.setIdade(a.getIdade());
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}

	@Override
	public void removerAluno(int id) {
		// TODO Auto-generated method stub
		try {
			Aluno a = (Aluno) alunos.get(id);
			alunos.remove(a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}

	}

	@Override
	public Aluno buscaAluno(int id) {
		// TODO Auto-generated method stub
		Aluno a = new Aluno();
		try {
			for(Aluno al : alunos){
				if(al.getId() == id){
					a = al;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		return a;
	}

	public ArrayList<Aluno> listaAluno() {
		return alunos;
	}

	@Override
	public int geraid() {
		// TODO Auto-generated method stub
		return id;
	}
	@Override
	public boolean comparaId(int id){
		boolean v = false;
		for(Aluno a : alunos){
			if(id == a.getId()){
				v = true;
			}
		}
		return v;
	}
	@Override
	public boolean comparaNome(String nome){
		boolean v = false;
		for(Aluno a : alunos){
			if(nome.equals(a.getNome())){
				v = true;
			}
		}
		return v;
	}
}
