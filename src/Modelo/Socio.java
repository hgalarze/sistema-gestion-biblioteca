package Modelo;

import java.sql.Date;
import java.util.ArrayList;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : SGB
//  @ File Name : Socio.java
//  @ Date : 23/09/2012
//  @ Author : Grupo 3
//
//




public  class Socio extends Usuario {

	private Carnet carnet;
	private ArrayList<Reserva> reservas;
	private String nroSocio;
	
	



	/**
	 * 
	 */
	public Socio() {
		super();
		// TODO Auto-generated constructor stub
		}

	/**
	 * @param nombre
	 * @param direccion
	 * @param apellido
	 * @param dni
	 * @param telefono
	 * @param ciudad
	 * @param email
	 * @param estado
	 * @param fechaAlta
	 * @param fechaBaja
	 * @param carnet
	 * @param reservas
	 * @param nroSocio
	 */
	public Socio(String nombre, String direccion, String apellido, int dni,
			int telefono, String ciudad, String email, String estado,
			Date fechaAlta, Date fechaBaja, Carnet carnet,
			ArrayList<Reserva> reservas, String nroSocio) {
		super(nombre, direccion, apellido, dni, telefono, ciudad, email,
				estado, fechaAlta, fechaBaja);
		this.setCarnet(carnet);
		this.setReservas(reservas);
		this.setNroSocio(nroSocio);
	}

	@Override
	public ArrayList<Libro> consultarLibro(String titulo, String autor,
			String materia) {
		// TODO Auto-generated method stub
		return super.consultarLibro(titulo, autor, materia);
	}

	public boolean verificarReserva(Libro libro) {
		return false;
	
	}
	
	public boolean verificarCantidadReserva(Configuracion configuracion) {
		return false;
	
	}
	
	public void reservarLibro(ArrayList<Libro> libros, Configuracion configuracion) {
	
	}
	
	public void solicitudRenovacionCarnet() {
	
	}
	
	public boolean verificarExistenciaReserva(Libro libro, String tipoPrestamo) {
		return false;
	
	}
	
	public Reserva buscarReserva(Libro libro, String tipoPrestamo) {
		return null;
	
	}
	
	public void bajaReserva(Socio socio, Reserva reserva) {
	
	}
	
	public void modificarReserva(ArrayList<Libro> libros, Enum tipoReserva) {
	
	}
	////////////////////////////////////geters y seters/////////////////////////////////////////

	public Carnet getCarnet() {
		return carnet;
	}

	public void setCarnet(Carnet carnet) {
		this.carnet = carnet;
	}

	public ArrayList<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(ArrayList<Reserva> reservas) {
		this.reservas = reservas;
	}

	public String getNroSocio() {
		return nroSocio;
	}

	public void setNroSocio(String nroSocio) {
		this.nroSocio = nroSocio;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre();
	}

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(nombre);
	}

	@Override
	public String getDireccion() {
		// TODO Auto-generated method stub
		return super.getDireccion();
	}

	@Override
	public void setDireccion(String direccion) {
		// TODO Auto-generated method stub
		super.setDireccion(direccion);
	}

	@Override
	public String getApellido() {
		// TODO Auto-generated method stub
		return super.getApellido();
	}

	@Override
	public void setApellido(String apellido) {
		// TODO Auto-generated method stub
		super.setApellido(apellido);
	}

	@Override
	public int getDni() {
		// TODO Auto-generated method stub
		return super.getDni();
	}

	@Override
	public void setDni(int dni) {
		// TODO Auto-generated method stub
		super.setDni(dni);
	}

	@Override
	public int getTelefono() {
		// TODO Auto-generated method stub
		return super.getTelefono();
	}

	@Override
	public void setTelefono(int telefono) {
		// TODO Auto-generated method stub
		super.setTelefono(telefono);
	}

	@Override
	public String getCiudad() {
		// TODO Auto-generated method stub
		return super.getCiudad();
	}

	@Override
	public void setCiudad(String ciudad) {
		// TODO Auto-generated method stub
		super.setCiudad(ciudad);
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return super.getEmail();
	}

	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		super.setEmail(email);
	}

	@Override
	public String getEstado() {
		// TODO Auto-generated method stub
		return super.getEstado();
	}

	@Override
	public void setEstado(String estado) {
		// TODO Auto-generated method stub
		super.setEstado(estado);
	}

	@Override
	public Date getFechaAlta() {
		// TODO Auto-generated method stub
		return super.getFechaAlta();
	}

	@Override
	public void setFechaAlta(Date fechaAlta) {
		// TODO Auto-generated method stub
		super.setFechaAlta(fechaAlta);
	}

	@Override
	public Date getFechaBaja() {
		// TODO Auto-generated method stub
		return super.getFechaBaja();
	}

	@Override
	public void setFechaBaja(Date fechaBaja) {
		// TODO Auto-generated method stub
		super.setFechaBaja(fechaBaja);
	}

}