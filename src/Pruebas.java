 //Clase Pruebas con un m�todo main() que prueba todos los m�todos del diagrama.
public class Pruebas{

	private static final Empleado Empleado = null;

	public static void main(String[] args) {
	//CREACI�N DE VARIABLES
	Bicicleta miBici = new Bicicleta();
	Cliente miCliente = new Cliente(null, null, 0);
	Empleado miEmpleado = new Empleado(null, 0, Empleado, null, 0);
	Factura miFactura = new Factura(0, false, null);
	Motocicleta miMotocicleta = new Motocicleta(0, 0, 0, 0);
	Motorizado miMotorizado = new Motorizado(0, 0, 0, 0);
	Reparacion miReparacion = new Reparacion(null);
	Revision miRevision = new Revision();
	Trabajo miTrabajo = new Trabajo();
	Turismo miTurismo = new Turismo();
	Vehiculo miVehiculo= new Vehiculo();
	
	//LLAMADA A LOS M�TODOS
	miBici.numMarchas();
	miCliente.antiguedad();
	miEmpleado.subirSueldo(0);
	miFactura.cliente();	
	miMotocicleta.bloquea(true);
	miMotorizado.circula(0);
	miMotorizado.reposta(0);
	miReparacion.toString();
	miRevision.toString();
	miTrabajo.valorar();
	miTurismo.aparca();
	miVehiculo.circula(0);
	
	}

}
