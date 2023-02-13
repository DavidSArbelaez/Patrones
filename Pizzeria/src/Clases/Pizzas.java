package Clases;

public class Pizzas {
		String masa ="";
		String salsa ="";
		String relleno="";
		String sabor="";
		
		
		/**
		 * @param sabor the sabor to set
		 */
		public void setSabor(String sabor) {
			this.sabor = sabor;
		}
		/**
		 * @param masa the masa to set
		 */
		public void setMasa(String masa) {
			this.masa = masa;
		}
		/**
		 * @param salsa the salsa to set
		 */
		public void setSalsa(String salsa) {
			this.salsa = salsa;
		}
		/**
		 * @param relleno the relleno to set
		 */
		public void setRelleno(String relleno) {
			this.relleno = relleno;
		}
		
		/*
		 * 
		 */
		public void MostrarDescripcion() {
			System.out.println("La pizza "+sabor+" tiene una masa "+masa+", salsa de "+salsa+" y un relleno de "+relleno+".");
		}
}