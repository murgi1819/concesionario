/**
 * clase motoclicleta que hereda de la clase vehiculo y motorizado
 * se definen los atributos especificos que necesita una motocicleta  
 * @author nacho
 *
 */
public class Motocicleta extends Motorizado {
	/**	tipo de motocicleta */
	String tipo;
	/**	booleano para saber si esta bloqueada */
	boolean bloqueada;
	
	/**
	 * constructor que nos permite definir un objeto de 
	 * la clase motocicleta, reutiliza el constructor padre 
	 * de la clase motorizado
	 * @param cilindrada cilindrada de la moto
	 * @param combustible combustible que tiene
	 * @param capacidadDepostio capacidad de combustible
	 * @param consumo consumo de combustible
	 */
	public Motocicleta(int cilindrada, double combustible, double capacidadDepostio, int consumo) {
		super(cilindrada, combustible, capacidadDepostio, consumo);
		
	}
	
	/**
	 * metodo para llegar a saber si la 
	 * motocicleta esta bloqueada
	 * @param estado bloqueada o no
	 */
	public void bloquea(boolean estado) {
		this.bloqueada=estado;
		
	}
}
