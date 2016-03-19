package repositorio;
import java.util.ArrayList;
import basica.Usuario;

public interface IRepUsuario {
	public void cadastraUsuario(Usuario u);
	public void alterarUsuario(Usuario u);
	public void excluirUsuario(int codigo);
	public Usuario buscaUsuario(int codigo);
	public Usuario buscaUsuario(String login);
	public ArrayList<Usuario> listaUsuarios();
	public int geraCodigo();
	public boolean verificaUsuario(String login,String senha);
}
