package Vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.LibroControlador;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class GestionLibros extends JDialog {

	private final JPanel contentPanel = new JPanel();
    private LibroControlador libroControlador;

	/**
	 * Create the dialog.
	 */
	public GestionLibros(JFrame parent,boolean modal) {
		super(parent,modal);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnInsertarLibro = new JButton("Insertar libro");
		btnInsertarLibro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				libroControlador.abrirFormularioLibro();
			}
		});
		btnInsertarLibro.setBounds(138, 66, 121, 23);
		contentPanel.add(btnInsertarLibro);
		
		JButton btnBorrarLibro = new JButton("Borrar libro");
		btnBorrarLibro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBorrarLibro.setBounds(138, 115, 121, 23);
		contentPanel.add(btnBorrarLibro);
		
		JButton btnCambiarLibro = new JButton("Cambiar libro");
		btnCambiarLibro.setBounds(138, 165, 121, 23);
		contentPanel.add(btnCambiarLibro);
		
		JLabel lblGestionDeLibros = new JLabel("Gestion de libros");
		lblGestionDeLibros.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblGestionDeLibros.setBounds(138, 24, 160, 14);
		contentPanel.add(lblGestionDeLibros);
	}

	public LibroControlador getLibroControlador() {
		return libroControlador;
	}

	public void setLibroControlador(LibroControlador libroControlador) {
		this.libroControlador = libroControlador;
	}
}
