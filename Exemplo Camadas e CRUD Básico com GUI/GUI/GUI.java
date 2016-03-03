package GUI;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Basica.Aluno;
import Fachada.Fachada;
import Fachada.IFachada;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ListSelectionModel;

public class GUI {

	private JFrame frmCrudAlunos;
	private JTextField txtID;
	private JTextField txtNome;
	private JTextField txtIdade;
	private IFachada fachada;
	private JTable table;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmCrudAlunos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		this.fachada = new Fachada();
		initialize();
		// preechetabela();
		iniciaid();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCrudAlunos = new JFrame();
		frmCrudAlunos.setTitle("CRUD Alunos");
		frmCrudAlunos.setBounds(100, 100, 640, 480);
		frmCrudAlunos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCrudAlunos.getContentPane().setLayout(null);

		txtID = new JTextField();
		txtID.setEnabled(false);
		txtID.setBounds(75, 12, 86, 20);
		frmCrudAlunos.getContentPane().add(txtID);
		txtID.setColumns(10);

		txtNome = new JTextField();
		txtNome.setBounds(75, 44, 271, 20);
		frmCrudAlunos.getContentPane().add(txtNome);
		txtNome.setColumns(10);

		txtIdade = new JTextField();
		txtIdade.setBounds(75, 76, 86, 20);
		frmCrudAlunos.getContentPane().add(txtIdade);
		txtIdade.setColumns(10);

		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(12, 15, 46, 14);
		frmCrudAlunos.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(12, 47, 46, 14);
		frmCrudAlunos.getContentPane().add(lblNewLabel_1);

		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(12, 79, 46, 14);
		frmCrudAlunos.getContentPane().add(lblIdade);
		/**
		 * Cadastrar Aluno
		 */
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((txtNome.getText().isEmpty()) || (txtIdade.getText().isEmpty())){
					JOptionPane.showMessageDialog(null,"Erro ao Cadastrar!");
					return;
				}
				Aluno a = new Aluno();
				a.setNome(txtNome.getText());
				a.setIdade(Integer.parseInt(txtIdade.getText()));
				a.setId(Integer.parseInt(txtID.getText()));
				if(fachada.comparaId(a.getId()) == true){
					JOptionPane.showMessageDialog(null, "ID existente!");
					return;
				}
				if(fachada.comparaNome(a.getNome())== true){
					JOptionPane.showMessageDialog(null, "Nome Existente");
					return;
				}
				fachada.inserirAluno(a);
				JOptionPane.showMessageDialog(null, "Aluno Inserido!");
				iniciaid();
				limpacampos();
				preechetabela();
			}
		});
		btnCadastrar.setBounds(12, 108, 106, 23);
		frmCrudAlunos.getContentPane().add(btnCadastrar);
		
		/**
		 * Ao clicar na linha da JTable,ela joga o valor pras JTextField
		 */
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int index = table.getSelectedRow();
				//JOptionPane.showMessageDialog(null, index); Mostra o index da linha selecionada
				//Jogar Linha selecionada para JtextField
				txtID.setText(table.getValueAt(index, 0).toString());
				txtNome.setText(table.getValueAt(index, 1).toString());
				txtIdade.setText(table.getValueAt(index, 2).toString());
			}
		});
		table.setBounds(12, 142, 600, 287);
		frmCrudAlunos.getContentPane().add(table);
		
		/**
		 * Metódo pra exibir o nome das colunas
		 * Tem que vincular a JTable ao JScrollPane :/
		 */
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(12, 142, 600, 287);
		frmCrudAlunos.getContentPane().add(scrollPane);

		/**
		 * Altera os Alunos
		 */
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(table.getSelectedRowCount() > 0){
				Aluno a = new Aluno();
				a.setId(Integer.parseInt(txtID.getText()));
				a.setNome(txtNome.getText());
				a.setIdade(Integer.parseInt(txtIdade.getText()));
				fachada.alterarAluno(a);
				JOptionPane.showMessageDialog(null, "Aluno Alterado!");
				iniciaid();
				limpacampos();
				preechetabela();
			}else{
				JOptionPane.showMessageDialog(null,"Erro ao Alterar!");
				return;
			}
			}
		});
		btnAlterar.setBounds(128, 108, 106, 23);
		frmCrudAlunos.getContentPane().add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(table.getSelectedRowCount() > 0){
			        int index = table.getSelectedRow();
					fachada.removerAluno(index);
					JOptionPane.showMessageDialog(null, "Aluno Removido!");
					//modelo.removeRow(table.getSelectedRow());
					iniciaid();
					preechetabela();
			}else{
				JOptionPane.showMessageDialog(null,"Erro ao remover!");
				return;
			}
			}
		});
		btnExcluir.setBounds(244, 108, 106, 23);
		frmCrudAlunos.getContentPane().add(btnExcluir);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					Aluno a = new Aluno(); 
					if(txtBuscaID.getText().isEmpty()){
						JOptionPane.showMessageDialog(null, "Digite Algum Número!");
						return;
					}
					a = fachada.buscarAluno(Integer.parseInt(txtBuscaID.getText()));
					if((a.getNome() == null)){
						JOptionPane.showMessageDialog(null, "Não Achou!");
						return;
					}
					String buscou = a.toString();
					JOptionPane.showMessageDialog(null, buscou);
			}
		});
		btnBuscar.setBounds(171, 75, 124, 23);
		frmCrudAlunos.getContentPane().add(btnBuscar);
		
		txtBuscaID = new JTextField();
		txtBuscaID.setBounds(300, 76, 46, 20);
		frmCrudAlunos.getContentPane().add(txtBuscaID);
		txtBuscaID.setColumns(10);
		
		JButton btnVoltarCadastrar = new JButton("Voltar Cadastrar");
		btnVoltarCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				iniciaid();
				limpacampos();
			}
		});
		btnVoltarCadastrar.setBounds(171, 11, 175, 23);
		frmCrudAlunos.getContentPane().add(btnVoltarCadastrar);
	}

	/**
	 * Gera um ID para o Aluno
	 */
	public void iniciaid() {
		String id = Integer.toString(this.fachada.geraid());
		// JOptionPane.showMessageDialog(null, id); Mostra o id gerado no metódo
		// lá no repositório
		txtID.setText(id);
	}
	/**
	 * Model das minha tabela
	 */
	DefaultTableModel modelo = new DefaultTableModel();
	private JTextField txtBuscaID;
	/**
	 * Zera e depois preenche (refresh) na Jtable,toda vez que cadastra,atualiza ou
	 * exclui,Tipo o DataGridView.dataSource =
	 * s.metododelistar() e depois DataGridView.dataSource = null do C#
	 */
	public void preechetabela() {
		modelo.setNumRows(0);
		modelo.setColumnIdentifiers(new String[] { "ID", "Nome", "Idade" });
		for (Aluno a : fachada.listarAluno()) {
			modelo.addRow(new Object[] { a.getId(), a.getNome(), a.getIdade() });
			table.setModel(modelo);
		}
	}

	/**
	 * Limpa os Campos,após as operações de cadastrar e alterar
	 */
	public void limpacampos() {
		txtNome.setText("");
		txtIdade.setText("");
	}
}
