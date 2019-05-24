/**clase bicicleta, no tiene ningun hijo y 
 * es la unica clase no motorizada
 * 
 * @author nacho
 * 
 */
public class Bicicleta extends Vehiculo {
	/**	numero de estrellas de la bicilcleta */
	private int numEstrellas;
	/**	numero de piñones de la bicicleta */
	private int numPinones;
	
	/**
	 * metodo que nos facilitara a averiguar el numero 
	 * de marchas de una bicicleta
	 * @return numero de marchas (estrellas*poñones)
	 */
	public int numMarchas() {
		return numEstrellas*numPinones;
	}
	
	public int getNumEstrellas() {
		return numEstrellas;
	}

	public void setNumEstrellas(int numEstrellas) {
		this.numEstrellas = numEstrellas;
	}

	public int getNumPinones() {
		return numPinones;
	}

	public void setNumPinones(int numPinones) {
		this.numPinones = numPinones;
	}
	
	
}
