package Modelo;

import java.awt.Image;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : SGB
//  @ File Name : Carnet.java
//  @ Date : 23/09/2012
//  @ Author : Grupo 3
//
//




public class Carnet {
	private Socio socio;
	private int nroCopia;
	private Image fotoCarnet;
	
	
	/**
	 * @param socio
	 * @param nroCopia
	 */
	public Carnet(Socio socio, int nroCopia) {
		super();
		this.setSocio(socio);
		this.setNroCopia(nroCopia);
		this.setFotoCarnet(fotoCarnet);
	}
	////////////////////////////////////geters y seters/////////////////////////////////////////
	public Socio getSocio() {
		return socio;
	}
	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	public int getNroCopia() {
		return nroCopia;
	}
	public void setNroCopia(int nroCopia) {
		this.nroCopia = nroCopia;
	}
	public Image getFotoCarnet() {
		return fotoCarnet;
	}
	public void setFotoCarnet(Image fotoCarnet) {
		this.fotoCarnet = fotoCarnet;
	}
	
}
