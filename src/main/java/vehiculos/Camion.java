package vehiculos;

public class Camion extends Vehiculo{
	
	int ejes;
	static int CantidadCamiones;
	
	public Camion(String pl,String n,double pr,double pe,Fabricante Fab,int ej) {
		super(pl,2,80,n,pr,pe,"4X2",Fab);
		this.ejes = ej;
		CantidadCamiones++;
	}
	
	public int getEjes() {
		return this.ejes;
	}
	
	public void setPuestos(int ej) {
		this.ejes=ej;
	}
	
	public static int getCantidadCamiones() {
		return Camion.CantidadCamiones;
	}

}
