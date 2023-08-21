package test;

public class Auto {
	
	public String modelo;
	public int precio;
	public Asiento[] asientos;
	public String marca;
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
	
	public int cantidadAsientos() {
		
		int cAsientos = 0;
		
		for (int i = 0; i < asientos.length; i++) {
			
			if (asientos[i] instanceof Asiento) {
				cAsientos++;
			}
		}
		
		return cAsientos;
	}
	
	public String verificarIntegridad() {
		
		if (this.registro == this.motor.registro){
			
			for (int i = 0; i < asientos.length; i++) {
				
				if (asientos[i].registro != this.registro){
					return "Las piezas no son originales";
				}else{
					return "Auto original";
				}
			}
		}
	}

}
