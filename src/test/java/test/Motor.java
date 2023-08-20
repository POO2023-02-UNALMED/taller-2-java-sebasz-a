package test;

public class Motor {
	
	public int numeroCilindros;
	public String tipo;
	public int  registro;
	
	public void cambiarRegistro(int registro) {
		
		this.registro = registro;
	}
	
	public void asignarTipo(String tipo) {
		 
		switch(tipo) {
			
			case "electrico":
				this.tipo = tipo;
				break;
			case "gasolina":
				this.tipo = tipo;
				break;
			default:
				break;
		}
	}
}
