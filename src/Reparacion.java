
public class Reparacion {
	private String sistema; 
	
	public Reparacion(String sistema){
		this.sistema = sistema;
	}
	
	public String getSistema() {
		return sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	@Override
	public String toString() {
		return "Reparación " + sistema;
		
	}
	
	
}
