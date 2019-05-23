public class Factura
{
	private double importe;
	private boolean pagada;
	private Trabajo trabajo;
	
	public Factura(double importe, boolean pagada, Trabajo trabajo) {
		super();
		this.importe = importe;
		this.pagada = pagada;
		this.trabajo = trabajo;
	}

	public Cliente cliente()
	{
		return (trabajo.getVehiculo()).getPropietario();
	}
}