package fachada;

import java.util.ArrayList;

import basica.Usuario;
import negocio.ControlUsuario;

public class Fachada implements IFachada {
	private ControlUsuario controladorUsuario;
	public Fachada(){
		this.controladorUsuario = new ControlUsuario();
	}
	@Override
	public void cadastraUsuario(Usuario u) {
		// TODO Auto-generated method stub
		this.controladorUsuario.cadastraUsuario(u);
	}

	@Override
	public void alterarUsuario(Usuario u) {
		// TODO Auto-generated method stub
		this.controladorUsuario.alterarUsuario(u);
	}

	@Override
	public void excluirUsuario(int codigo) {
		// TODO Auto-generated method stub
		this.controladorUsuario.excluirUsuario(codigo);
	}

	@Override
	public Usuario buscaUsuario(int codigo) {
		// TODO Auto-generated method stub
		return this.controladorUsuario.buscaUsuario(codigo);
	}

	@Override
	public Usuario buscaUsuario(String login) {
		// TODO Auto-generated method stub
		return this.controladorUsuario.buscaUsuario(login);
	}

	@Override
	public ArrayList<Usuario> listaUsuarios() {
		// TODO Auto-generated method stub
		return this.controladorUsuario.listaUsuarios();
	}

	@Override
	public int geraCodigo() {
		// TODO Auto-generated method stub
		return this.controladorUsuario.geraCodigo();
	}

	@Override
	public boolean verificaUsuario(String login, String senha) {
		// TODO Auto-generated method stub
		return this.controladorUsuario.verificaUsuario(login, senha);
	}

	@Override
	public boolean verificaNulidade(Usuario u) {
		// TODO Auto-generated method stub
		return this.controladorUsuario.verificaNulidade(u);
	}

	@Override
	public void preencheEmail(String email) {
		// TODO Auto-generated method stub
		this.controladorUsuario.preencheEmail(email);
	}

	@Override
	public boolean verificaTamanho(Usuario u) {
		// TODO Auto-generated method stub
		return this.controladorUsuario.verificaTamanho(u);
	}

	@Override
	public boolean conferirSenha(String senha,String repeteco) {
		// TODO Auto-generated method stub
		return this.controladorUsuario.conferirSenha(senha,repeteco);
	}

	@Override
	public boolean verificaLoginExistente(String nome) {
		// TODO Auto-generated method stub
		return this.controladorUsuario.verificaLoginExistente(nome);
	}
	@Override
	public boolean verificaNulidadeLogin(String login, String senha) {
		// TODO Auto-generated method stub
		return this.controladorUsuario.verificaNulidadeLogin(login, senha);
	}

}
