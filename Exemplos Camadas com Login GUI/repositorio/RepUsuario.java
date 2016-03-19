package repositorio;

import java.util.ArrayList;

import basica.Usuario;

public class RepUsuario implements IRepUsuario {
	ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	int codigo = 0;
	
	@Override
	public void cadastraUsuario(Usuario u) {
		// TODO Auto-generated method stub
		try {
			usuarios.add(u);
			codigo++;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void alterarUsuario(Usuario u) {
		// TODO Auto-generated method stub
		try {
			for (Usuario us : usuarios) {
				if (us.getCodigo() == u.getCodigo()) {
					us.setLogin(u.getLogin());
					us.setSenha(u.getSenha());
					us.setNome(u.getNome());
					us.setEmail(u.getEmail());	
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void excluirUsuario(int codigo) {
		// TODO Auto-generated method stub
		try {
			Usuario u = (Usuario)usuarios.get(codigo);
			usuarios.remove(u);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Usuario buscaUsuario(int codigo) {
		// TODO Auto-generated method stub
		Usuario u = new Usuario();
		try {
			for(Usuario us : usuarios){
				if(us.getCodigo() == codigo){
					u = us;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}

	@Override
	public Usuario buscaUsuario(String login) {
		// TODO Auto-generated method stub
		Usuario u = new Usuario();
		for(Usuario us : usuarios){
			if(us.getLogin().equals(login)){
				u = us;
			}
		}
		return u;
	}
	@Override
	public ArrayList<Usuario> listaUsuarios() {
		// TODO Auto-generated method stub
		return usuarios;
	}
	/**
	 * Retorna True se o login e senha exististem
	 */
	@Override
	public boolean verificaUsuario(String login, String senha) {
		boolean busca = false;
		for(Usuario u : usuarios){
			if(u.getLogin().equals(login) && u.getSenha().equals(senha)){
				busca = true;
			}
		}
		return busca;
	}
	@Override
	public int geraCodigo() {
		// TODO Auto-generated method stub
		return codigo;
	}
}
