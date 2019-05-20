import java.sql.Date;

public class Empleado extends Persona{
	//atributos
	private Date fechaContrato;
	private double sueldo;
	private Empleado supervisor;
	
	//constructor
	public Empleado(Date fechaContrato, double sueldo, Empleado supervisor, String nombre,int edad) {
		super(nombre,edad);
		this.fechaContrato = fechaContrato;
		this.sueldo = sueldo;
		this.supervisor = supervisor;
	}
	
	//metodos
	public void subirSueldo (double aumento) {
		this.sueldo=sueldo+aumento;
	}

	public Date getFechaContrato() {
		return fechaContrato;
	}

	public void setFechaContrato(Date fechaContrato) {
		this.fechaContrato = fechaContrato;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public Empleado getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Empleado supervisor) {
		this.supervisor = supervisor;
	}
	
	
	
}
