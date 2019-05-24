
/**nueva clase motorizado que desciende de vehiculo,
 * esta clase va a declarar los atributos necesarios
 * para un vehiculo motoriazo 
 * @author nacho
 *
 */
public class Motorizado extends Vehiculo{
	/**	cilindrada de la moto */
	private int cilindrada;
	/**	combustible que tiene */
	private double combustible;
	/**	capacidad de combustible */
	private double capacidadDeposito;
	/**	consumo de combustible */
	private int consumo;
	
	/**
	 * constructor que nos permitira dar valor a los atributos de 
	 * nuestro turismo o motocicleta 
	 * @param cilindrada cilindrada de la moto
	 * @param combustible combustible que tiene
	 * @param capacidadDepostio capacidad de combustible
	 * @param consumo consumo de combustible
	 */
	public Motorizado(int cilindrada, double combustible, double capacidadDepostio, int consumo) {
		super();
		this.cilindrada = cilindrada;
		this.combustible = combustible;
		this.capacidadDeposito = capacidadDepostio;
		this.consumo = consumo;
	}
	
	/**
	 * metodo sobreescrito de la clase vehiculo que nos permitira
	 * circular con nuestro vehiculo motorizado, si no tenemos suficiente
	 * gasolina no podremos circular.
	 * @param distancia distancia recorrida por el vehiculo
	 */
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
	/**
	 * este metodo va a facilitarnos repostar nuestro vehiculo motorizado
	 * @param cantidad cantidad de gasolina que quiere repostar
	 * @return
	 */
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
