package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;


public class Prestamo_modelo extends Conector{

	
	public Prestamo_modelo() {
		super();
	}

	
	public ArrayList<Prestamo> select() {
		ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
		try {
			Statement st = this.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from prestamos");
			while (rs.next()) {
				prestamos.add(new Prestamo(rs.getInt("id_libro"), rs.getInt("id_socio"), rs.getDate("fecha"),
						rs.getBoolean("devuelto")));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prestamos;
	}
	
	public Prestamo select(int id_libro, int id_socio, Date fecha){
		PreparedStatement pst;
		try {
			pst = this.conexion.prepareStatement("select * from prestamos where id_libro =? and id_socio = ? and fecha=?");
			pst.setInt(1, id_libro);
			pst.setInt(2, id_socio);
			
			//TODO 
			pst.setDate(3, (java.sql.Date)fecha);
			ResultSet rs = pst.executeQuery();
			rs.next();
			return new Prestamo(rs.getInt("id_libro"),rs.getInt("id_socio"), rs.getDate("fecha"), rs.getBoolean("devuelto"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public void insert(Prestamo prestamo){
		try {
			PreparedStatement ps = this.conexion.prepareStatement("insert into prestamos (id_libro, id_socio, fecha, devuelto) values(?,?,?,?)");
			
			ps.setInt(1, prestamo.getId_libro()); 
			ps.setInt(2, prestamo.getId_socio()); 
			java.sql.Date fecha = new java.sql.Date(prestamo.getFecha().getTime());
			ps.setDate(3,  fecha); 
			ps.setBoolean(4, prestamo.isDevuelto());
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Prestamo> prestamosDeSocio(int id_socio){
	 ArrayList<Prestamo>prestamosDeSocio = new ArrayList<Prestamo>();
	
	 
	 return null;
	
		 
	}
}
		 
	 
	
		
		





	

