package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.LibroControlador;
import Controlador.SocioControlador;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;

public class Principal extends JFrame {

	private JPanel contentPane;
	private SocioControlador socioControlador;
	private LibroControlador libroControlador;
	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGestionDeDatos = new JLabel("GESTION DE DATOS");
		lblGestionDeDatos.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblGestionDeDatos.setBounds(135, 34, 157, 14);
		contentPane.add(lblGestionDeDatos);
		
		JButton buttonGestionarPrestamos = new JButton("Gestionar prestamos");
		buttonGestionarPrestamos.setBounds(81, 169, 132, 23);
		contentPane.add(buttonGestionarPrestamos);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Gestionar libros");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Gestionar socios");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Prestamos");
		menuBar.add(mnNewMenu_2);
		
		JButton buttonGestionarLibros = new JButton("Gestionar libros");
		buttonGestionarLibros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				libroControlador.abrirGestionLibros();
			}
		});
		buttonGestionarLibros.setBounds(81, 77, 132, 19);
		contentPane.add(buttonGestionarLibros);
		
		JButton buttonGestionarSocios = new JButton("Gestionar socios");
		buttonGestionarSocios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			socioControlador.abrirGestionSocios();
			}
		});
		buttonGestionarSocios.setBounds(81, 120, 132, 19);
		contentPane.add(buttonGestionarSocios);
	}
	
	

	public SocioControlador getSocioControlador() {
		return socioControlador;
	}
	public void setSocioControlador(SocioControlador socioControlador) {
		this.socioControlador = socioControlador;
	}



	public LibroControlador getLibroControlador() {
		return libroControlador;
	}



	public void setLibroControlador(LibroControlador libroControlador) {
		this.libroControlador = libroControlador;
	}
	
}
