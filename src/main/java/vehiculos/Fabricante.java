package vehiculos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fabricante {
	
	String nombre;
	Pais pais;
	static ArrayList<Fabricante> listadoFabricantes;
	
	public Fabricante(String n,Pais p) {
		this.nombre = n;
		this.pais = p;
	}
	public Fabricante(String n) {
		this.nombre = n;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Pais getPais() {
		return this.pais;
	}
	
	public static Fabricante fabricaMayorVentas() {
		
		for(Vehiculo i : Vehiculo.getListado()) {
	
			if(listadoFabricantes==null) {
				listadoFabricantes=new ArrayList<Fabricante>();
				 Fabricante.listadoFabricantes.add(i.getFabricante());
			 }else {
				 Fabricante.listadoFabricantes.add(i.getFabricante());
			 }
		}
		
		HashMap<Fabricante, Integer> hm = new HashMap();
		for (int i = 0; i < Fabricante.listadoFabricantes.size(); i++) {
			Fabricante key = new Fabricante(Fabricante.listadoFabricantes.get(i).getNombre());

			if ( hm.containsKey(key) ) {
				hm.put(key, hm.get(key) + 1);
			}else {
				hm.put(key, 1);
			}
		}
		//System.out.println(hm);
		int max = Collections.max(hm.values());
		List<Fabricante> keys = new ArrayList<>();
		for (Map.Entry<Fabricante, Integer> entry : hm.entrySet()) {
			if (entry.getValue()==max) {
				keys.add(entry.getKey());
			}
		}
		
		return keys.get(0);
	}

}