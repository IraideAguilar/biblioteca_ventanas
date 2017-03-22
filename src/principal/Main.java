package principal;

import Controlador.LibroControlador;
import Controlador.SocioControlador;
import Vista.BorrarSocio;
import Vista.FormularioLibros;
import Vista.FormularioSocio;
import Vista.GestionLibros;
import Vista.GestionSocios;
import Vista.Principal;
import modelo.Config;
import modelo.Libro_modelo;
import modelo.Socio_modelo;

public class Main {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		//Sortu modelo.
		Socio_modelo socioModelo = new Socio_modelo();
		Libro_modelo libroModelo = new Libro_modelo();
		
		//Sortu controlador.
		SocioControlador socioControlador = new SocioControlador();
		LibroControlador libroControlador = new LibroControlador();
		
		//Sortu leihoak.
		Principal principal = new Principal();
		GestionSocios gestionSocios = new GestionSocios(principal,true);
		FormularioSocio formularioSocio = new FormularioSocio(gestionSocios,true);
		GestionLibros gestionLibros = new GestionLibros(principal,true);
		FormularioLibros formularioLibros = new FormularioLibros(gestionLibros,true);
		BorrarSocio borrarSocio = new BorrarSocio(gestionSocios,true);
		
		//Leihoei controladoreak ezarri, horrela erlazionatuta egongo dira.
		principal.setSocioControlador(socioControlador);
		gestionSocios.setSocioControlador(socioControlador);
		formularioSocio.setSocioControlador(socioControlador);
		gestionLibros.setLibroControlador(libroControlador);
		formularioLibros.setLibroControlador(libroControlador);
		principal.setLibroControlador(libroControlador);
		borrarSocio.setSocioControlador(socioControlador);
		
		//Controladoreari leiho eta modeloak asignatu.
		socioControlador.setPrincipal(principal);
		socioControlador.setGestionSocios(gestionSocios);
		socioControlador.setFormularioSocio(formularioSocio);
		socioControlador.setSocioModelo(socioModelo);
		socioControlador.setBorrarSocio(borrarSocio);
		libroControlador.setGestionLibros(gestionLibros);
		libroControlador.setFormularioLibros(formularioLibros);
		libroControlador.setLibroModelo(libroModelo);
		libroControlador.setPrincipal(principal);
		
		
		principal.setVisible(true);
		
		
		
		
	}

}
