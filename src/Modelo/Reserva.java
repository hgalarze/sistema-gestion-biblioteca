package Modelo;

import java.sql.Date;
import java.util.ArrayList;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : SGB
//  @ File Name : Reserva.java
//  @ Date : 23/09/2012
//  @ Author : Grupo 3
//
//




public class Reserva {
	private ArrayList<Libro> libros;
	private Socio socio;
	private Date FechaInicio;
	private String horasReserva;
	private Enum tipoReserva;
	
	
	
	
	/**
	 * @param libros
	 * @param socio
	 * @param fechaInicio
	 * @param horasReserva
	 * @param tipoReserva
	 */
	public Reserva(ArrayList<Libro> libros, Socio socio, Date fechaInicio,
			String horasReserva, Enum tipoReserva) {
		super();
		this.setLibros(libros);
		this.setSocio(socio);
		this.setFechaInicio(fechaInicio);
		this.setHorasReserva(horasReserva);
		this.setTipoReserva(tipoReserva);
	}
	////////////////////////////////////geters y seters/////////////////////////////////////////
	public ArrayList<Libro> getLibros() {
		return libros;
	}
	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}
	public Socio getSocio() {
		return socio;
	}
	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	public Date getFechaInicio() {
		return FechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		FechaInicio = fechaInicio;
	}
	public String getHorasReserva() {
		return horasReserva;
	}
	public void setHorasReserva(String horasReserva) {
		this.horasReserva = horasReserva;
	}
	public Enum getTipoReserva() {
		return tipoReserva;
	}
	public void setTipoReserva(Enum tipoReserva) {
		this.tipoReserva = tipoReserva;
	}
	
}
