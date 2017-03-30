package Vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.SocioControlador;
import modelo.Socio;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class BorrarSocio extends JDialog {
	
	private SocioControlador socioControlador;

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldId;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldDireccion;
	private JTextField textFieldPoblacion;
	private JTextField textFieldProvincia;
	private JTextField textFieldDni;
	private JComboBox comboBoxSocios;

	/**
	 * Create the dialog.
	 */
	public BorrarSocio(JDialog parent, boolean modal) {

		super(parent, modal);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblId = new JLabel("ID :");
			lblId.setBounds(32, 37, 46, 14);
			contentPanel.add(lblId);
		}
		{
			JLabel lblNombre = new JLabel("Nombre :");
			lblNombre.setBounds(32, 62, 46, 14);
			contentPanel.add(lblNombre);
		}
		{
			JLabel lblApellidos = new JLabel("Apellido :");
			lblApellidos.setBounds(32, 87, 46, 14);
			contentPanel.add(lblApellidos);
		}
		{
			JLabel lblDireccion = new JLabel("Direccion :");
			lblDireccion.setBounds(32, 112, 46, 14);
			contentPanel.add(lblDireccion);
		}
		{
			JLabel lblPoblacion = new JLabel("Poblacion :");
			lblPoblacion.setBounds(32, 137, 46, 14);
			contentPanel.add(lblPoblacion);
		}
		{
			JLabel lblProvincia = new JLabel("Provincia :");
			lblProvincia.setBounds(32, 162, 46, 14);
			contentPanel.add(lblProvincia);
		}
		{
			JLabel lblDni = new JLabel("DNI :");
			lblDni.setBounds(32, 187, 46, 14);
			contentPanel.add(lblDni);
		}
		{
			textFieldId = new JTextField();
			textFieldId.setEnabled(false);
			textFieldId.setEditable(false);
			textFieldId.setBounds(79, 34, 86, 20);
			contentPanel.add(textFieldId);
			textFieldId.setColumns(10);
		}
		{
			textFieldNombre = new JTextField();
			textFieldNombre.setEnabled(false);
			textFieldNombre.setEditable(false);
			textFieldNombre.setBounds(79, 59, 86, 20);
			contentPanel.add(textFieldNombre);
			textFieldNombre.setColumns(10);
		}
		{
			textFieldApellido = new JTextField();
			textFieldApellido.setEnabled(false);
			textFieldApellido.setEditable(false);
			textFieldApellido.setBounds(79, 87, 86, 20);
			contentPanel.add(textFieldApellido);
			textFieldApellido.setColumns(10);
		}
		{
			textFieldDireccion = new JTextField();
			textFieldDireccion.setEnabled(false);
			textFieldDireccion.setEditable(false);
			textFieldDireccion.setBounds(79, 109, 86, 20);
			contentPanel.add(textFieldDireccion);
			textFieldDireccion.setColumns(10);
		}
		{
			textFieldPoblacion = new JTextField();
			textFieldPoblacion.setEnabled(false);
			textFieldPoblacion.setEditable(false);
			textFieldPoblacion.setBounds(79, 134, 86, 20);
			contentPanel.add(textFieldPoblacion);
			textFieldPoblacion.setColumns(10);
		}
		{
			textFieldProvincia = new JTextField();
			textFieldProvincia.setEnabled(false);
			textFieldProvincia.setEditable(false);
			textFieldProvincia.setBounds(79, 159, 86, 20);
			contentPanel.add(textFieldProvincia);
			textFieldProvincia.setColumns(10);
		}
		{
			textFieldDni = new JTextField();
			textFieldDni.setEnabled(false);
			textFieldDni.setEditable(false);
			textFieldDni.setBounds(79, 187, 86, 20);
			contentPanel.add(textFieldDni);
			textFieldDni.setColumns(10);
		}

		comboBoxSocios = new JComboBox();
		comboBoxSocios.setBounds(213, 34, 171, 20);
		contentPanel.add(comboBoxSocios);

		JButton buttonBorrar = new JButton("Borrar");
		buttonBorrar.setBounds(238, 210, 89, 23);
		contentPanel.add(buttonBorrar);

		JButton buttonCancelar = new JButton("Cancelar");
		buttonCancelar.setBounds(335, 210, 89, 23);
		contentPanel.add(buttonCancelar);
	}

	public SocioControlador getSocioControlador() {
		return socioControlador;
	}

	public void setSocioControlador(SocioControlador socioControlador) {
		this.socioControlador = socioControlador;
	}

//	public void rellenarCombo(ArrayList<Socio> socios) {
//		Iterator<Socio> iterator = socios.iterator();
//		while (iterator.hasNext()) {
//			Socio socio = iterator.next();
//			this.comboBoxSocios.addItem(socio.getId(), socio.getNombre(), socio.getApellido(), socio.getDireccion(),
//					socio.getPoblacion(), socio.getProvincia(), socio.getDni());
//		}
	
}
