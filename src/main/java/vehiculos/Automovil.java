package vehiculos ;

public class Automovil extends Vehiculo {
	
	int puestos;
	static int CantidadAutomoviles;
	
	public Automovil(String pl,String n,double pr,double pe,Fabricante Fab,int p) {
		super(pl,4,100,n,pr,pe,"FWD",Fab);
		this.puestos = p;
		CantidadAutomoviles++;
	}
	
	public int getPuestos() {
		return this.puestos;
	}
	
	public void setPuestos(int p) {
		this.puestos=p;
	}
	
	public static int getCantidadAutomoviles() {
		return Automovil.CantidadAutomoviles;
	}

}
