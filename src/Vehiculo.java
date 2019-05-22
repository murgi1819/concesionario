public class Vehiculo {

	private int numRuedas;

	  private int peso;

	  private int numPlazas;

	  private double kilometraje;

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
