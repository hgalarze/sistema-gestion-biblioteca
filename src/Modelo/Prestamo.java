package Modelo;

import java.sql.Date;
import java.util.ArrayList;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : SGB
//  @ File Name : Prestamo.java
//  @ Date : 23/09/2012
//  @ Author : Grupo 3
//
//




public class Prestamo {
	private Bibliotecario bibliotecario;
	private Socio socio;
	private ArrayList<Libro> libros;
	private Comprobante comprobante;
	private String fechaEntrega;
	private Date FechaDevolucion;
	private Enum tipoPrestamo;
	
	

	/**
	 * @param bibliotecario
	 * @param socio
	 * @param libros
	 * @param comprobante
	 * @param fechaEntrega
	 * @param fechaDevolucion
	 * @param tipoPrestamo
	 */
	public Prestamo(Bibliotecario bibliotecario, Socio socio,
			ArrayList<Libro> libros, Comprobante comprobante,
			String fechaEntrega, Date fechaDevolucion, Enum tipoPrestamo) {
		super();
		this.setBibliotecario(bibliotecario);
		this.setSocio(socio);
		this.setLibros(libros);
		this.setComprobante(comprobante);
		this.setFechaEntrega(fechaEntrega);
		this.setFechaDevolucion(fechaDevolucion);
		this.setTipoPrestamo(tipoPrestamo);
	}

	public void addComprobante(Comprobante comprobante) {
	
	}
	////////////////////////////////////geters y seters/////////////////////////////////////////

	public Bibliotecario getBibliotecario() {
		return bibliotecario;
	}

	public void setBibliotecario(Bibliotecario bibliotecario) {
		this.bibliotecario = bibliotecario;
	}

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}

	public ArrayList<Libro> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}

	public Comprobante getComprobante() {
		return comprobante;
	}

	public void setComprobante(Comprobante comprobante) {
		this.comprobante = comprobante;
	}

	public String getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public Date getFechaDevolucion() {
		return FechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		FechaDevolucion = fechaDevolucion;
	}

	public Enum getTipoPrestamo() {
		return tipoPrestamo;
	}

	public void setTipoPrestamo(Enum tipoPrestamo) {
		this.tipoPrestamo = tipoPrestamo;
	}
	
}