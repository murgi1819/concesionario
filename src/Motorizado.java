
public class Motorizado extends Vehiculo{
	private int cilindrada;
	private double combustible;
	private double capacidadDeposito;
	private int consumo;
	
	public Motorizado(int cilindrada, double combustible, double capacidadDepostio, int consumo) {
		super();
		this.cilindrada = cilindrada;
		this.combustible = combustible;
		this.capacidadDeposito = capacidadDepostio;
		this.consumo = consumo;
	}
	@Override
	public boolean circula(int distancia) {
		boolean result=false;
		double gasto=(this.getConsumo())*distancia;
		if (gasto<=(this.getCombustible())) {
			
			result= true;
			this.setCombustible(this.getCombustible()-gasto);
			this.setKilometraje(this.getKilometraje()+distancia);
		}
		else {
			result=false;
		}
		return result;
	}
	public int reposta(int cantidad)  {
		double cabe=(this.getCapacidadDeposito())-(this.getCombustible());
		if (cantidad>cabe) {
			this.setCombustible((this.getCapacidadDeposito()));
			return (int)cabe;
			
		}else {
			this.setCombustible((this.getCapacidadDeposito())+cantidad);
			return cantidad;
			
		}
		
	}
	
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public double getCombustible() {
		return combustible;
	}
	public void setCombustible(double combustible) {
		this.combustible = combustible;
	}
	public double getCapacidadDeposito() {
		return capacidadDeposito;
	}
	public void setCapacidadDeposito(double capacidadDepostio) {
		this.capacidadDeposito = capacidadDepostio;
	}
	public int getConsumo() {
		return consumo;
	}
	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}
	
	
}
