package Controlador;

import Vista.BorrarSocio;
import Vista.FormularioSocio;
import Vista.GestionSocios;
import Vista.Principal;
import modelo.Socio;
import modelo.Socio_modelo;

public class SocioControlador {

	private Principal principal;
	private GestionSocios gestionSocios;
	private FormularioSocio formularioSocio;
	private Socio_modelo socioModelo;
	private BorrarSocio borrarSocio;
	
	public Principal getPrincipal() {
		return principal;
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	public GestionSocios getGestionSocios() {
		return gestionSocios;
	}

	public void setGestionSocios(GestionSocios gestionSocios) {
		this.gestionSocios = gestionSocios;
	}

	public FormularioSocio getFormularioSocio() {
		return formularioSocio;
	}

	public void setFormularioSocio(FormularioSocio formularioSocio) {
		this.formularioSocio = formularioSocio;
	}

	public Socio_modelo getSocioModelo() {
		return socioModelo;
	}

	public void setSocioModelo(Socio_modelo socioModelo) {
		this.socioModelo = socioModelo;
	}
	
	public BorrarSocio getBorrarSocio() {
		return borrarSocio;
	}

	public void setBorrarSocio(BorrarSocio borrarSocio) {
		this.borrarSocio = borrarSocio;
	}

	public void abrirGestionSocios() {
		this.gestionSocios.setVisible(true);
	}

	public void abrirFormularioSocio() {
		this.formularioSocio.setVisible(true);

	}

	public void cerrarFormularioSocio() {
		this.formularioSocio.setVisible(false);

	}

	public void guardarSocio(String nombre, String apellido, String direccion, String poblacion, String provincia,
			String dni) {
		
		Socio socio = new Socio();
		
		socio.setNombre(nombre);
		socio.setApellido(apellido);
		socio.setDireccion(direccion);
		socio.setPoblacion(poblacion);
		socio.setProvincia(provincia);
		socio.setDni(dni);
		
		this.socioModelo.insert(socio);
		
	}

	public void abrirBorrarSocio() {
		//Comboa bete //modelo -- > select.  return arrayList socios.  formdeborrado.rellenarCombo(socio)
		
		//Abrir ventana.
		this.borrarSocio.setVisible(true);
		
	}

}
