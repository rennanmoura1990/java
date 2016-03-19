package negocio;

import java.util.ArrayList;

import basica.Usuario;
import repositorio.IRepUsuario;
import repositorio.RepUsuario;

public class ControlUsuario {
	IRepUsuario repUsuario;
	
	public ControlUsuario(){
		this.repUsuario = new RepUsuario();
	}
	public void cadastraUsuario(Usuario u){
		this.repUsuario.cadastraUsuario(u);
	}
	public void alterarUsuario(Usuario u){
		this.repUsuario.alterarUsuario(u);
	}
	public void excluirUsuario(int codigo){
		this.repUsuario.excluirUsuario(codigo);
	}
	public Usuario buscaUsuario(int codigo){
		return this.repUsuario.buscaUsuario(codigo);
	}
	public Usuario buscaUsuario(String login){
		return this.repUsuario.buscaUsuario(login);
	}
	public ArrayList<Usuario> listaUsuarios(){
		return this.repUsuario.listaUsuarios();
	}
	public int geraCodigo(){
		return this.repUsuario.geraCodigo();
	}
	public boolean verificaUsuario(String login,String senha){
		return this.repUsuario.verificaUsuario(login, senha);
	}
	/**
	 * Verifica se o objeto é nulo,ou se algum de seus atributos são nulos
	 * retorna true se os if forem cumpridos
	 * @param u
	 * @return
	 */
	public boolean verificaNulidade(Usuario u){
		boolean busca = false;
		if(u == null){
			busca = true;
		}
		if((u.getLogin().isEmpty())||(u.getSenha().isEmpty())||(u.getNome().isEmpty())){
			busca = true;
		}
		return busca;
	}
	/**
	 * Se o Email for deixado em branco
	 * ele seta como "Não Informado"
	 * @param email
	 */
	public void preencheEmail(String email){
		Usuario u = new Usuario();
		if(email.isEmpty()){
			u.setEmail("Não Informado");
		}
	}
	/**
	 * Verifica tamanho dos dados passados no cadastro
	 * retorna true se o tamanho estiver ok
	 * @param u
	 * @return
	 */
	public boolean verificaTamanho(Usuario u){
		boolean busca = false;
		int a = u.getLogin().length();
		int b = u.getSenha().length();
		int c = u.getNome().length();
		int d = u.getEmail().length();
		if(((a >=5) && (a<=10))&&((b >=6) && (b<=12))&&(c <=50)&&(d <=30)){
			busca = true;
		}
		return busca;
	}
	/**
	 * Confere se a Senha está igual ao campo para repetir senha
	 * retorna true se estiver iguais
	 * @param u
	 * @param nome
	 * @return
	 */
	public boolean conferirSenha(String senha,String repeteco){
		boolean verifica = false;
		if(senha.equals(repeteco)== true){
			verifica = true;
		}
		return verifica;
	}
	/**
	 * Verifica se o Login Digitado existe no sistema
	 * Se sim retorna true
	 * @param nome
	 * @return
	 */
	public boolean verificaLoginExistente(String nome){
		boolean verifica = false;
		for(Usuario u : this.repUsuario.listaUsuarios()){
			if(u.getLogin().equals(nome)){
				verifica = true;
			}
		}
		return verifica;
	}
	/**
	 * Retorna True se os campos de Login e Senha estiverem vazios
	 * @param u
	 * @return
	 */
	public boolean verificaNulidadeLogin(String login,String senha){
		boolean verifica = false;
		if(login.isEmpty() && senha.isEmpty()){
			verifica = true;
		}
		return verifica;
	}
}
