package Vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.LibroControlador;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioLibros extends JDialog {

	private LibroControlador libroControlador;
	
	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldTitulo;
	private JTextField textFieldAutor;
	private JTextField textFieldPaginas;

	/**
	 * Create the dialog.
	 */
	public FormularioLibros(JDialog parent,boolean modal) {
		super(parent,modal);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		textFieldTitulo = new JTextField();
		textFieldTitulo.setBounds(128, 61, 86, 20);
		contentPanel.add(textFieldTitulo);
		textFieldTitulo.setColumns(10);
		
		textFieldAutor = new JTextField();
		textFieldAutor.setBounds(128, 92, 86, 20);
		contentPanel.add(textFieldAutor);
		textFieldAutor.setColumns(10);
		
		textFieldPaginas = new JTextField();
		textFieldPaginas.setBounds(128, 133, 86, 20);
		contentPanel.add(textFieldPaginas);
		textFieldPaginas.setColumns(10);
		
		JLabel lblTitulo = new JLabel("Titulo :");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTitulo.setBounds(35, 64, 46, 14);
		contentPanel.add(lblTitulo);
		
		JLabel lblAutor = new JLabel("Autor :");
		lblAutor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAutor.setBounds(35, 95, 46, 14);
		contentPanel.add(lblAutor);
		
		JLabel lblNmeroPginas = new JLabel("N\u00FAmero p\u00E1ginas :");
		lblNmeroPginas.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNmeroPginas.setBounds(10, 136, 108, 14);
		contentPanel.add(lblNmeroPginas);
		
		JLabel lblFormularioDeLibros = new JLabel("Formulario de libros");
		lblFormularioDeLibros.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFormularioDeLibros.setBounds(130, 20, 180, 14);
		contentPanel.add(lblFormularioDeLibros);
		
		JButton buttonGuardar = new JButton("Guardar");
		buttonGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				libroControlador.guardarLibro(textFieldTitulo.getText(),textFieldAutor.getText(),Integer.parseInt(textFieldPaginas.getText()));
				libroControlador.cerrarFormularioLibro();
				clear();
			}
		});
		buttonGuardar.setBounds(199, 210, 89, 23);
		contentPanel.add(buttonGuardar);
		
		JButton buttonCancelar = new JButton("Cancelar");
		buttonCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				libroControlador.cerrarFormularioLibro();
				clear();
			}
		});
		buttonCancelar.setBounds(307, 210, 89, 23);
		contentPanel.add(buttonCancelar);
	}

	protected void clear() {
		this.textFieldTitulo.setText("");
		this.textFieldAutor.setText("");
		this.textFieldPaginas.setText("");
		
	}

	public LibroControlador getLibroControlador() {
		return libroControlador;
	}

	public void setLibroControlador(LibroControlador libroControlador) {
		this.libroControlador = libroControlador;
	}
}
