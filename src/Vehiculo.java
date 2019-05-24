/**Clase padre de todos los vehiculos que se van a vender en el concesionario
 * esta clase definira los atributos minimos que van a tener todos nuestros vehiculos
 * 
 * @author nacho
 * @version 1.0
 *
 */
public class Vehiculo {
	
	/**numero de ruedas del vehiculo */
	private int numRuedas;
	/**peso del vehiculo */
	  private int peso;
	  /**numero de plazas */
	  private int numPlazas;
	  /**numero de kilometros recorridos por el vehiculo */
	  private double kilometraje;
	  
	  /**
	   * metodo que permite al vehiculo circular tras recibir
	   * una variable la cual nos dira cual ha sido la longuitud que ha recorrido
	   * @param distancia distancia que ha recorrido el vehiculo
	   * @return
	   */
	  public boolean circula(int distancia) {
		  return false;
	  }
	
	
	//getter
	public int getNumRuedas(){
		return this.numRuedas;
	}
	public int getPeso(){
		return this.peso;
	}
	public int getNumPlazas(){
		return this.numPlazas;
	}
	public double getKilometraje(){
		return this.kilometraje;
	}
	
	//setter
	public void setNumRuedas (int numRuedas){
		this.numRuedas = numRuedas;
	}
	public void setPeso (int peso){
		this.peso = peso;
	}
	public void setNumPlazas (int numPlazas){
		this.numPlazas = numPlazas;
	}
	public void setKilometraje(double kilometraje){
		this.kilometraje = kilometraje;
	}
	
}
