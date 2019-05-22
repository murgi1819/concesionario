//import java.sql.Date;
import java.time.*;
import java.util.Date;
public class Cliente  extends Persona  {
	private Date fechaAlta;
	
	public  int  antiguedad() {
		Date hoy=new Date();		
		int dias=(int) ((hoy.getTime()-fechaAlta.getTime())/86400000);
		return dias;
	}
	
	public Cliente(Date fechaAlta, String nombre,int edad) {
		super(nombre,edad);
		this.fechaAlta = fechaAlta;
	}
}
