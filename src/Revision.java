
public class Revision {

		private boolean cambioAceite; 
		public boolean isCambioAceite() {
			return cambioAceite;
		}

		public void setCambioAceite(boolean cambioAceite) {
			this.cambioAceite = cambioAceite;
		}

		public boolean isCambioFiltro() {
			return cambioFiltro;
		}

		public void setCambioFiltro(boolean cambioFiltro) {
			this.cambioFiltro = cambioFiltro;
		}

		private boolean cambioFiltro;
		
		@Override
		public String toString() {
			return "Revision [cambioAceite=" + cambioAceite + ", cambioFiltro=" + cambioFiltro + "]";
			
			
		} 
}
