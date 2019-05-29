//import java.sql.Date;
import java.time.*;
import java.util.Date;
/**
 * Clase que representa a un cliente
 * @author Manuel
 * @version 1.0
 */
public class Cliente  extends Persona  {
	/*
	 * Fecha en la que se dio de alta el Cliente
	 */
	private Date fechaAlta;
	/**
	 * Calcula los dias de antiguedad de un cliente
	 * @return los dias que tiene de antiguedad
	 */
	public  int  antiguedad() {
		Date hoy=new Date();		
		int dias=(int) ((hoy.getTime()-fechaAlta.getTime())/86400000);
		return dias;
	}
	/**
	 * Método constructor encargado de crear objetos indicando el valor de fechaAlta, nombre y edad como parametro de entrada
	 * @param fechaAlta en la que se dio de alta el Cliente
	 * @param nombre del Cliente
	 * @param edad del Cliente
	 */
	public Cliente(Date fechaAlta, String nombre,int edad) {
		super(nombre,edad);
		this.fechaAlta = fechaAlta;
	}
//METODO GET Y SET DE FECHA
	/**
	 * Método que nos muestra la informacion de un la fecha de alta de la clase Cliente
	 * @return la fecha de alta
	 */
	public Date getFechaAlta() {
		return fechaAlta;
	}
	/**
	 * Asignamos la fecha de alta a nuestro Cliente
	 * @param fechaAlta de el Cliente
	 */
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	
}
