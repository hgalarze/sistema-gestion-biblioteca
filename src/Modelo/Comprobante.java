package Modelo;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : SGB
//  @ File Name : Comprobante.java
//  @ Date : 23/09/2012
//  @ Author : Grupo 3
//
//




public class Comprobante {
	private Prestamo prestamo;
	private String estado;
	
	
	/**
	 * @param prestamo
	 * @param estado
	 */
	public Comprobante(Prestamo prestamo, String estado) {
		super();
		this.setPrestamo(prestamo);
		this.setEstado(estado);
	}
	////////////////////////////////////geters y seters/////////////////////////////////////////
	public Prestamo getPrestamo() {
		return prestamo;
	}
	public void setPrestamo(Prestamo prestamo) {
		this.prestamo = prestamo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	

}
