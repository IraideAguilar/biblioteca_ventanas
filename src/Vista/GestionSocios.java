package Vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.SocioControlador;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionSocios extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private SocioControlador socioControlador;

	/**
	 * Create the dialog.
	 */
	public GestionSocios(JFrame parent,boolean modal) {
		
		super(parent,modal);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton buttonAnadirSocio = new JButton("A\u00F1adir socio");
			buttonAnadirSocio.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					socioControlador.abrirFormularioSocio();
				}
			});
			buttonAnadirSocio.setBounds(140, 61, 106, 23);
			contentPanel.add(buttonAnadirSocio);
		}
		{
			JButton buttonBorrarSocio = new JButton("Borrar socio");
			buttonBorrarSocio.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					socioControlador.abrirBorrarSocio();
				}
			});
			buttonBorrarSocio.setBounds(140, 108, 106, 23);
			contentPanel.add(buttonBorrarSocio);
		}
		{
			JButton buttonCambiarSocio = new JButton("Cambiar socio");
			buttonCambiarSocio.setBounds(140, 155, 106, 23);
			contentPanel.add(buttonCambiarSocio);
		}
		{
			JLabel lblGestionDeSocios = new JLabel("GESTION DE SOCIOS");
			lblGestionDeSocios.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
			lblGestionDeSocios.setBounds(107, 21, 169, 14);
			contentPanel.add(lblGestionDeSocios);
		}
	}

	public SocioControlador getSocioControlador() {
		return socioControlador;
	}

	public void setSocioControlador(SocioControlador socioControlador) {
		this.socioControlador = socioControlador;
	}

}
