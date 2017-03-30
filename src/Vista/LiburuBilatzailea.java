package Vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.LibroControlador;

import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class LiburuBilatzailea extends JDialog {
	
	
private LibroControlador libroControlador;	


	public LibroControlador getLibroControlador() {
	return libroControlador;
}

public void setlibroControlador(LibroControlador libroControlador) {
	this.libroControlador = libroControlador;
}

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	
	public LiburuBilatzailea(GestionLibros gestionLibro, boolean modal) {
	super(gestionLibro,modal);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel textFieldAutorea = new JPanel();
		tabbedPane.addTab("T\u00EDtulo Autor", null, textFieldAutorea, null);
		textFieldAutorea.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(159, 33, 101, 20);
		textFieldAutorea.add(comboBox);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(159, 97, 101, 20);
		textFieldAutorea.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(159, 156, 101, 20);
		textFieldAutorea.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("T\u00EDtulua aukeratu");
		lblNewLabel.setBounds(64, 36, 46, 14);
		textFieldAutorea.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Autorea");
		lblNewLabel_1.setBounds(64, 100, 46, 14);
		textFieldAutorea.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Orri Kopurua");
		lblNewLabel_2.setBounds(64, 159, 46, 14);
		textFieldAutorea.add(lblNewLabel_2);
		
		JPanel textFieldOrriKop = new JPanel();
		tabbedPane.addTab("Orri Kopurua", null, textFieldOrriKop, null);
		textFieldOrriKop.setLayout(null);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(149, 40, 108, 20);
		textFieldOrriKop.add(comboBox_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(149, 101, 108, 20);
		textFieldOrriKop.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(149, 158, 108, 20);
		textFieldOrriKop.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Autorea");
		lblNewLabel_6.setBounds(57, 43, 46, 14);
		textFieldOrriKop.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(57, 104, 46, 14);
		textFieldOrriKop.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(57, 161, 46, 14);
		textFieldOrriKop.add(lblNewLabel_8);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		panel_2.setLayout(null);
		
		textField_4 = new JTextField();
		textField_4.setBounds(159, 101, 86, 20);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(159, 174, 86, 20);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(159, 35, 86, 20);
		panel_2.add(comboBox_2);
		
		JLabel lblNewLabel_3 = new JLabel("T\u00EDtulua");
		lblNewLabel_3.setBounds(64, 38, 46, 14);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Autorea");
		lblNewLabel_4.setBounds(64, 104, 46, 14);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Orri Kopurua");
		lblNewLabel_5.setBounds(64, 177, 46, 14);
		panel_2.add(lblNewLabel_5);
	}
}