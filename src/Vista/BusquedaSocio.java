package Vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import Controlador.SocioControlador;
import modelo.Socio;

import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class BusquedaSocio extends JDialog {
	private SocioControlador socioControlador;
	private JTable table;
	
	

	public SocioControlador getSocioControldor() {
		return socioControlador;
	}

	public void setSocioControlador(SocioControlador socioControldor) {
		this.socioControlador = socioControldor;
	}

	/**
	 * Create the dialog.
	 */
	public BusquedaSocio(JDialog parent, boolean modal) {
		super(parent,modal);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(348, 170, -309, -101);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}

	public void rellenarTabla(ArrayList<Socio> socios) {
		// TODO Apéndice de método generado automáticamente
	        DefaultTableModel dtm = new DefaultTableModel();

	        dtm.setColumnIdentifiers(new Object[] { "NOMBRE", "APELLIDO", "DIRECCION", "POBLACION", "PROVINCIA", "DNI"});

	        for (Socio socio : socios) {
	            dtm.addRow(new Object[] { socio.getNombre(), socio.getApellido(), socio.getDireccion(), socio.getPoblacion(), socio.getProvincia(), socio.getDni()});
	        }

	        table.setModel(dtm);

	        TableRowSorter<DefaultTableModel> modeloOrdenado = new TableRowSorter<DefaultTableModel>(dtm);

	        table.setRowSorter(modeloOrdenado);

	    }

		
	}

