/**
 * clase turismp que hereda de la clase vehiculo y motorizado
 * se definen los atributos especificos que necesita un turismo
 * @author nacho
 *
 */
public class Turismo extends Motorizado{
	/**	numero de puertas */
	private int numPuertas;
	/**	color del coche */
	private String color;
	
	/**
	 * metodo muy simple que nos permitira aparcar,
	 * y despues de realizar esta accion nos lo
	 * comunicara
	 */
	public void aparca() {
		System.out.println("Aparcado");
	}

}
