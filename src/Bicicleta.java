
public class Bicicleta extends Vehiculo {
	private int numEstrellas;
	private int numPinones;
	
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
