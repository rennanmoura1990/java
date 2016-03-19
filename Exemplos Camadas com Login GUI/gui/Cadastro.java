package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import basica.Usuario;
import fachada.Fachada;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

import fachada.IFachada;
import fachada.Fachada;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
public class Cadastro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtLogin;
	private IFachada fachada;
	private JTextField txtSenha;
	private JTextField txtSenhaDenovo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cadastro() {
		setResizable(false);
		this.fachada = new Fachada();
		
		setTitle("Cadastro");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 354, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtCodigo = new JTextField();
		txtCodigo.setEditable(false);
		txtCodigo.setBounds(109, 11, 44, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel lblCodigo = new JLabel("ID");
		lblCodigo.setBounds(21, 14, 46, 14);
		contentPane.add(lblCodigo);
		
		txtNome = new JTextField();
		txtNome.setBounds(109, 42, 216, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome*");
		lblNome.setBounds(21, 45, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(21, 74, 46, 14);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(109, 73, 216, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblLogin = new JLabel("Login*");
		lblLogin.setBounds(21, 107, 46, 14);
		contentPane.add(lblLogin);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(109, 104, 216, 20);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha*");
		lblSenha.setBounds(21, 136, 46, 14);
		contentPane.add(lblSenha);
		
		JLabel lblSenhaDenovo = new JLabel("Repita Senha*");
		lblSenhaDenovo.setBounds(21, 167, 88, 14);
		contentPane.add(lblSenhaDenovo);
		iniciaCodigo();
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Usuario u = new Usuario();
				u.setCodigo(Integer.parseInt(txtCodigo.getText()));
				u.setLogin(txtLogin.getText());
				u.setSenha(txtSenha.getText());
				u.setNome(txtNome.getText());
				u.setEmail(txtEmail.getText());
				if(fachada.verificaNulidade(u)==true){
					JOptionPane.showMessageDialog(null,"Campos obrigatórios não informados!");
					return;
				}
				fachada.preencheEmail(txtEmail.getText());
				if(fachada.verificaTamanho(u)==false){
					JOptionPane.showMessageDialog(null,"Nome pode ter até 50 caracteres!\nEmail pode ter até 30 caracteres!\nLogin de 5 à 10\nSenha de 6 à 12");
					return;
				}
				String repeteco = txtSenhaDenovo.getText();
				//JOptionPane.showMessageDialog(null, senha);
				//JOptionPane.showMessageDialog(null,repeteco);
				String senha = txtSenha.getText();
				if(fachada.conferirSenha(senha,repeteco)==false){
					JOptionPane.showMessageDialog(null,"Senha não confere!");
					return;
				}
				if(fachada.verificaLoginExistente(txtLogin.getText())==true){
					JOptionPane.showMessageDialog(null,"Login indisponível!");
					return;
				}
				fachada.cadastraUsuario(u);
				JOptionPane.showMessageDialog(null,"Usuário Cadastrado!");
				iniciaCodigo();
				limpaTexto();
			}
		});
		btnCadastrar.setBounds(21, 195, 150, 26);
		contentPane.add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(182, 195, 150, 26);
		contentPane.add(btnCancelar);
		
		JLabel lblCamposObrigatriosEm = new JLabel("Campos Obrigat\u00F3rios em *");
		lblCamposObrigatriosEm.setForeground(UIManager.getColor("OptionPane.errorDialog.border.background"));
		lblCamposObrigatriosEm.setBounds(159, 13, 166, 16);
		contentPane.add(lblCamposObrigatriosEm);
		
		txtSenha = new JTextField();
		txtSenha.setBounds(109, 133, 216, 20);
		contentPane.add(txtSenha);
		txtSenha.setColumns(10);
		
		txtSenhaDenovo = new JTextField();
		txtSenhaDenovo.setColumns(10);
		txtSenhaDenovo.setBounds(109, 161, 216, 20);
		contentPane.add(txtSenhaDenovo);
		
		JButton btnLogar = new JButton("Logar");
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login l = new Login();
				l.setVisible(true);
				l.setAutoRequestFocus(true);
			}
		});
		btnLogar.setBounds(100, 233, 150, 26);
		contentPane.add(btnLogar);
	}
	public void iniciaCodigo(){
		String codigo = Integer.toString(this.fachada.geraCodigo());
		txtCodigo.setText(codigo);
	}
	public void limpaTexto(){
		txtNome.setText("");
		txtEmail.setText("");
		txtLogin.setText("");
		txtSenha.setText("");
		txtSenhaDenovo.setText("");
	}
}
