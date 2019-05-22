
public class Bicicleta extends Vehiculo {
	private int numEstrellas;
	private int numPinones;
	
	public int numMarchas() {
		return numEstrellas*numPinones;
	}
}
