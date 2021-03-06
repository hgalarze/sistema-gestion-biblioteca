package Modelo;

import java.sql.Date;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : SGB
//  @ File Name : Sancion.java
//  @ Date : 23/09/2012
//  @ Author : Grupo 3
//
//




public class Sancion {
	private Socio socio;
	private Bibliotecario bibliotecario;
	private Date fechaAplicacion;
	private Date fechaCumplimiento;
	private double valorMonetario;
	private int duracion;
	
	
	/**
	 * @param socio
	 * @param bibliotecario
	 * @param fechaAplicacion
	 * @param fechaCumplimiento
	 * @param valorMonetario
	 * @param duracion
	 */
	public Sancion(Socio socio, Bibliotecario bibliotecario,
			Date fechaAplicacion, Date fechaCumplimiento,
			double valorMonetario, int duracion) {
		super();
		this.setSocio(socio);
		this.setBibliotecario(bibliotecario);
		this.setFechaAplicacion(fechaAplicacion);
		this.setFechaCumplimiento(fechaCumplimiento);
		this.setValorMonetario(valorMonetario);
		this.setDuracion(duracion);
	}
	////////////////////////////////////geters y seters/////////////////////////////////////////
	public Socio getSocio() {
		return socio;
	}
	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	public Bibliotecario getBibliotecario() {
		return bibliotecario;
	}
	public void setBibliotecario(Bibliotecario bibliotecario) {
		this.bibliotecario = bibliotecario;
	}
	public Date getFechaAplicacion() {
		return fechaAplicacion;
	}
	public void setFechaAplicacion(Date fechaAplicacion) {
		this.fechaAplicacion = fechaAplicacion;
	}
	public Date getFechaCumplimiento() {
		return fechaCumplimiento;
	}
	public void setFechaCumplimiento(Date fechaCumplimiento) {
		this.fechaCumplimiento = fechaCumplimiento;
	}
	public double getValorMonetario() {
		return valorMonetario;
	}
	public void setValorMonetario(double valorMonetario) {
		this.valorMonetario = valorMonetario;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	

}
