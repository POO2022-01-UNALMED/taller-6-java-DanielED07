package vehiculos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class Pais {

	String nombre;
	static ArrayList<Pais> listadoPaises;
	
	public Pais(String n) {
		this.nombre = n;
	}
	public String getNombre() {
		return this.nombre;
	}

	
	public static Pais paisMasVendedor() {
		
		for(Vehiculo i : Vehiculo.getListado()) {
	
			if(listadoPaises==null) {
				 listadoPaises=new ArrayList<Pais>();
				 Pais.listadoPaises.add(i.getFabricante().getPais());
			 }else {
				 Pais.listadoPaises.add(i.getFabricante().getPais());
			 }
		}
		
		HashMap<Pais, Integer> hm = new HashMap();
		for (int i = 0; i < Pais.listadoPaises.size(); i++) {
			Pais key = new Pais(Pais.listadoPaises.get(i).getNombre());

			if ( hm.containsKey(key) ) {
				hm.put(key, hm.get(key) + 1);
			}else {
				hm.put(key, 1);
			}
		}
		//System.out.println(hm);
		int max = Collections.max(hm.values());
		List<Pais> keys = new ArrayList<>();
		for (Map.Entry<Pais, Integer> entry : hm.entrySet()) {
			if (entry.getValue()==max) {
				keys.add(entry.getKey());
			}
		}
		
		return keys.get(0);
	}
}
