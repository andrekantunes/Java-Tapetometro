package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JList;

public class Interface {

	private JFrame frame = new JFrame();
	private JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private JPanel tabCliente = new JPanel();
	private JPanel pnlDadosCliente = new JPanel();
	private JLabel lblNome = new JLabel("Nome:");
	private JTextField txtNome = new JTextField();
	private JLabel lblSobrenome = new JLabel("Sobrenome:");
	private JTextField txtSobrenome = new JTextField();
	private JLabel lblCPF = new JLabel("CPF:");
	private JTextField txtCPF;
	private JButton btnCancelar = new JButton("Cancelar");
	private JButton btnSalvar = new JButton("Incluir");
	private JPanel pnlCadastrosCliente = new JPanel();
	private JLabel lblPesquisar = new JLabel("Pesquisar:");
	private JTextField txtPesquisar = new JTextField();
	private JButton btnEditar = new JButton("Editar");
	private JButton btnExcluir = new JButton("Excluir");
	private JPanel tabPedido = new JPanel();
	private JPanel tabMaterial = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame.getContentPane().setFont(new Font("Calibri", Font.PLAIN, 12));
		frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		tabbedPane.setFont(new Font("Calibri", Font.PLAIN, 12));
		frame.getContentPane().add(tabbedPane);
		
		tabbedPane.addTab("Clientes", null, tabCliente, null);
		tabCliente.setLayout(null);
		
		tabbedPane.addTab("Pedidos", null, tabPedido, null);
		tabPedido.setLayout(new GridLayout(1, 0, 0, 0));
		
		tabbedPane.addTab("Materiais", null, tabMaterial, null);
		tabMaterial.setLayout(new GridLayout(1, 0, 0, 0));
		
		pnlDadosCliente.setBorder(new TitledBorder(null, "Dados do Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlDadosCliente.setBounds(10, 11, 469, 150);
		tabCliente.add(pnlDadosCliente);
		pnlDadosCliente.setLayout(null);
		
		lblNome.setBounds(10, 27, 73, 14);
		pnlDadosCliente.add(lblNome);
		lblNome.setFont(new Font("Calibri", Font.PLAIN, 12));
		
		txtNome.setBounds(93, 24, 345, 20);
		pnlDadosCliente.add(txtNome);
		txtNome.setFont(new Font("Calibri", Font.PLAIN, 12));
		txtNome.setColumns(10);
		
		lblSobrenome.setBounds(10, 52, 73, 14);
		pnlDadosCliente.add(lblSobrenome);
		lblSobrenome.setFont(new Font("Calibri", Font.PLAIN, 12));

		txtSobrenome.setBounds(93, 49, 345, 20);
		pnlDadosCliente.add(txtSobrenome);
		txtSobrenome.setFont(new Font("Calibri", Font.PLAIN, 12));
		txtSobrenome.setColumns(10);
		
		lblCPF.setBounds(10, 77, 73, 14);
		pnlDadosCliente.add(lblCPF);
		lblCPF.setFont(new Font("Calibri", Font.PLAIN, 12));
		
		try {
			txtCPF = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
		} catch (Exception e) {
			txtCPF.setText(""); 
		}
		txtCPF.setBounds(93, 75, 126, 18);
		pnlDadosCliente.add(txtCPF);
		txtCPF.setFont(new Font("Calibri", Font.PLAIN, 12));
		
		btnSalvar.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnSalvar.setBounds(370, 116, 89, 23);
		pnlDadosCliente.add(btnSalvar);
		
		btnCancelar.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnCancelar.setBounds(271, 116, 89, 23);
		pnlDadosCliente.add(btnCancelar);
		
		pnlCadastrosCliente.setBorder(new TitledBorder(null, "Clientes Cadastrados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlCadastrosCliente.setBounds(10, 172, 469, 311);
		tabCliente.add(pnlCadastrosCliente);
		pnlCadastrosCliente.setLayout(null);
		
		btnEditar.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnEditar.setBounds(271, 24, 89, 23);
		pnlCadastrosCliente.add(btnEditar);
		
		btnExcluir.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnExcluir.setBounds(370, 24, 89, 23);
		pnlCadastrosCliente.add(btnExcluir);
		
		lblPesquisar.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblPesquisar.setBounds(10, 28, 65, 14);
		pnlCadastrosCliente.add(lblPesquisar);
		
		txtPesquisar.setFont(new Font("Calibri", Font.PLAIN, 12));
		txtPesquisar.setColumns(10);
		txtPesquisar.setBounds(73, 25, 188, 20);
		pnlCadastrosCliente.add(txtPesquisar);
		
		JList list = new JList();
		list.setBounds(10, 53, 449, 247);
		pnlCadastrosCliente.add(list);
		frame.setBounds(100, 100, 510, 563);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
