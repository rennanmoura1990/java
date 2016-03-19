package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCadastrarTelefone = new JButton("Cadastrar Telefone");
		btnCadastrarTelefone.setBounds(10, 28, 264, 53);
		contentPane.add(btnCadastrarTelefone);
		
		JButton btnListarContatosTelefnicos = new JButton("Listar Contatos Telef\u00F4nicos");
		btnListarContatosTelefnicos.setBounds(10, 92, 264, 53);
		contentPane.add(btnListarContatosTelefnicos);
		
		JButton btnDeslogar = new JButton("Deslogar");
		btnDeslogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Tchau!");
				Menu.this.dispose();
			}
		});
		btnDeslogar.setBounds(10, 156, 264, 53);
		contentPane.add(btnDeslogar);
	}

}
