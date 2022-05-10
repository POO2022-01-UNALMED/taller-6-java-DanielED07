package vehiculos;

public class Camioneta extends Vehiculo{

	boolean volco;
	static int CantidadCamionetas;
	
	public Camioneta(String pl,int pu,String n,double pr,double pe,Fabricante Fab,boolean v) {
		super(pl,pu,90,n,pr,pe,"4X4",Fab);
		this.volco = v;
		CantidadCamionetas++;
	}
	public boolean isVolco() {
		return this.volco;
	}
	
	public void setVolco(boolean v) {
		this.volco=v;
	}
	
	public static int getCantidadCamionetas() {
		return Camioneta.CantidadCamionetas;
	}
}
