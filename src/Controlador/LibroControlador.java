package Controlador;

import java.util.ArrayList;

import Vista.FormularioLibros;
import Vista.GestionLibros;
import Vista.LiburuBilatzailea;
import Vista.Principal;
import modelo.Libro;
import modelo.Libro_modelo;

public class LibroControlador {
	
	private LiburuBilatzailea liburuBiltzailea;
	
	
	public LiburuBilatzailea getLiburuBiltzailea() {
		return liburuBiltzailea;
	}
	public void setLiburuBiltzailea(LiburuBilatzailea liburuBiltzailea) {
		this.liburuBiltzailea = liburuBiltzailea;
	}
	private Principal principal;
	private GestionLibros gestionLibros;
	private FormularioLibros formularioLibros;
	private Libro_modelo libroModelo;
	
	
	public Principal getPrincipal() {
		return principal;
	}
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	public GestionLibros getGestionLibros() {
		return gestionLibros;
	}
	public void setGestionLibros(GestionLibros gestionLibros) {
		this.gestionLibros = gestionLibros;
	}
	public FormularioLibros getFormularioLibros() {
		return formularioLibros;
	}
	public void setFormularioLibros(FormularioLibros formularioLibros) {
		this.formularioLibros = formularioLibros;
	}
	
	public Libro_modelo getLibroModelo() {
		return libroModelo;
	}
	public void setLibroModelo(Libro_modelo libroModelo) {
		this.libroModelo = libroModelo;
	}
	public void abrirGestionLibros() {
		this.gestionLibros.setVisible(true);
		
	}
	public void abrirFormularioLibro() {
		this.formularioLibros.setVisible(true);
		
	}
	public void guardarLibro(String titulo, String autor, int num_pag) {
		
		Libro libro = new Libro();
		
		libro.setTitulo(titulo);
		libro.setAutor(autor);
		libro.setNum_pag(num_pag);
		this.libroModelo.insert(libro);
		
	}
	public void cerrarFormularioLibro() {
		this.formularioLibros.dispose();
		
	}
	
	public void abrirLiburuBilatzailea(){
		ArrayList <Libro> libros = this.libroModelo.select();
		this.liburuBilatzailea.liburuComboaBete(libros);
		this.liburuBilatzailea.setVisible(true);	
		
	}
	
	public void bilatuTituluarekin(int idLiburua){
	Libro libro = this.libro_modelo.select(idLiburua);
	this.liburuBiltzailea.tituloPestanaBete(libro);
	
	
	
}
