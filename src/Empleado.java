import java.sql.Date;
/**
 * Clase que representa al Empleado
 * @author Manuel
 * @version 1.0
 */
public class Empleado extends Persona{
	//atributos
	/**
	 * Fecha de contrato de un Empleado
	 * Sueldo de un Empleado
	 * Indica el supervisor de cada uno de los empleados
	 */
	private Date fechaContrato;
	private double sueldo;
	private Empleado supervisor;
	
	//constructor
	/**
	 * M�todo constructor encargado de crear objetos indicando el valor de fechaContrato, sueldo, supervisor, nombre, edad como parametro de entrada 
	 * @param fechaContrato indicando la fecha del contrato
	 * @param sueldo que tenga cada Empleado
	 * @param supervisor que vigile a cada Empleado
	 * @param nombre de cada Empleado
	 * @param edad de cada Empleado
	 */
	public Empleado(Date fechaContrato, double sueldo, Empleado supervisor, String nombre,int edad) {
		super(nombre,edad);
		this.fechaContrato = fechaContrato;
		this.sueldo = sueldo;
		this.supervisor = supervisor;
	}
	
	//metodos
	/**
	 * M�todo que da la opci�n de subir el sueldo
	 * @param aumento que indica el dinero que se le subira a el Empleado
	 */
	public void subirSueldo (double aumento) {
		this.sueldo=sueldo+aumento;
	}
	/**
	 * M�todo que nos muestra la fecha del contrato
	 * @return la fecha del contrato
	 */
	public Date getFechaContrato() {
		return fechaContrato;
	}
	/**
	 * M�todo que asigna una fecha de contrato
	 * @param fechaContrato que queremos asignarle al Empleado
	 */
	public void setFechaContrato(Date fechaContrato) {
		this.fechaContrato = fechaContrato;
	}
	/**
	 * M�todo que nos muestra el sueldo del Empleado
	 * @return el sueldo del empleado
	 */
	public double getSueldo() {
		return sueldo;
	}
	/**
	 * M�todo que asigna el sueldo del Empleado
	 * @param sueldo que indica el sueldo que tendr� el Empleado
	 */
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	/**
	 * M�todo que nos muestra el supervisor del Empleado
	 * @return el supervisor de un Empleado
	 */
	public Empleado getSupervisor() {
		return supervisor;
	}
	/**
	 * M�todo que asigna un supervisor a un Empleado
	 * @param supervisor que queramos ponerle a un Empleado
	 */
	public void setSupervisor(Empleado supervisor) {
		this.supervisor = supervisor;
	}
	
	
	
}
