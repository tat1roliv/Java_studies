package Listas;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		
		ArrayList<String> elementos = new ArrayList<String>();
		
		elementos.add("xyz");
		
		elementos.add(0,"abc");
		
		elementos.add("www");
		
		System.out.println(elementos);
		
		boolean existe = elementos.contains("www");
	
		if(existe) {
			System.out.println("está no array");
		}
		else {
			System.out.println("elemento solicitado não está no array");
		}
		
		boolean existeS = elementos.contains("s");
		
		if(existeS) {
			System.out.println("está no array");
		}
		else {
			System.out.println("elemento solicitado não está no array");
		}
		
		
	}

}
