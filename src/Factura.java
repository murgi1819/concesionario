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

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public boolean isPagada() {
		return pagada;
	}

	public void setPagada(boolean pagada) {
		this.pagada = pagada;
	}

	public Trabajo getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(Trabajo trabajo) {
		this.trabajo = trabajo;
	}

	public Cliente cliente()
	{
		return (trabajo.getVehiculo()).getPropietario();
	}
}