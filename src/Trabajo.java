import java.util.Date;

public class Trabajo {
	private Date fecha;
	private double kilometraje;
	private String incidencias;
	
	public double valorar() {
		double resultado = Math.random()*500;
		return resultado;
		
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(double kilometraje) {
		this.kilometraje = kilometraje;
	}

	public String getIncidencias() {
		return incidencias;
	}

	public void setIncidencias(String incidencias) {
		this.incidencias = incidencias;
	}
}