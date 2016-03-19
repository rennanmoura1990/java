package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import basica.Usuario;
import fachada.Fachada;
import fachada.IFachada;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	private JTextField txtSenha;
	private IFachada fachada;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		fachada = new Fachada();
		cadastroTeste();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 188);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(10, 11, 46, 14);
		contentPane.add(lblLogin);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(66, 8, 158, 20);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(10, 36, 46, 14);
		contentPane.add(lblSenha);
		
		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(66, 33, 158, 20);
		contentPane.add(txtSenha);
		
		JButton btnLogar = new JButton("Logar");
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Testar Login (ArrayList é apagado quando se muda de janela,por isso é bom usar persistência no banco!)
				String login = txtLogin.getText();
				String senha = txtSenha.getText();
				if(fachada.verificaUsuario(login,senha)== false){
					JOptionPane.showMessageDialog(null, "Login/Senha inválidos!");
					return;
				}else{
					JOptionPane.showMessageDialog(null,"Bem vindo!");
					Menu m = new Menu();
					m.setVisible(true);
				}
			}
		});
		btnLogar.setBounds(10, 64, 214, 23);
		contentPane.add(btnLogar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cadastro c = new Cadastro();
				c.setVisible(true);
			}
		});
		btnCadastrar.setBounds(10, 98, 214, 23);
		contentPane.add(btnCadastrar);
		
		JLabel lblloginESenha = new JLabel("*Login e Senha padr\u00E3o : rennan e rennan");
		lblloginESenha.setBounds(10, 132, 214, 14);
		contentPane.add(lblloginESenha);
	}
	public void cadastroTeste(){
		Usuario u = new Usuario();
		u.setCodigo(0);
		u.setNome("Rennan");
		u.setEmail("rennan@teste.com");
		u.setLogin("rennan");
		u.setSenha("rennan");
		fachada.cadastraUsuario(u);
	}
}
