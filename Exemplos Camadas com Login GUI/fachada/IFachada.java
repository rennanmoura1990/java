package fachada;

import java.util.ArrayList;

import basica.Usuario;

public interface IFachada {
	public void cadastraUsuario(Usuario u);
	public void alterarUsuario(Usuario u);
	public void excluirUsuario(int codigo);
	public Usuario buscaUsuario(int codigo);
	public Usuario buscaUsuario(String login);
	public ArrayList<Usuario> listaUsuarios();
	public int geraCodigo();
	public boolean verificaUsuario(String login,String senha);
	public boolean verificaNulidade(Usuario u);
	public void preencheEmail(String email);
	public boolean verificaTamanho(Usuario u);
	public boolean conferirSenha(String senha,String repeteco);
	public boolean verificaLoginExistente(String nome);
	public boolean verificaNulidadeLogin(String login,String senha);
}
