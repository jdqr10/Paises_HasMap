package paises;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class Paises_Ciudades {


	ArrayList<String> ciudades;
	ArrayList<String> temporal;
	HashMap<String, ArrayList<String>> paises;
	String pais="", ciudad="";
	
	public Paises_Ciudades() {
		
		paises = new HashMap<String, ArrayList<String>>();
		
		
		iniciar();
	}

	public void iniciar() {
		
    int num=0;
		do {
			
			  num= Obtenernumeror();
		
			  validarOpcion(num);
		
		}while(num !=5);
		
	}
	
	
	

	private int Obtenernumeror() {
		 


			 String menu="";
		menu += "Seleccione una opción\n";
		 menu+="1.Registrar Pais\n";
		 menu+="2.Registrar Ciudades\n";
		 menu+="3.Consultar por pais la lista de ciudades asociadas\n";
		 menu+="4.Consultar ciudad\n";
		 menu+="5.Salir\n";
		 
		 int opc=Integer.parseInt(JOptionPane.showInputDialog(menu));
	    return opc;
		
		
	  
	}

	private void validarOpcion(int opcion) {
		
		switch (opcion) {
		case 1: registrarPais();break;
		case 2: registrarCiudad();break;
		case 3: ConsultarPorPais_ciudades();break;
		case 4: ConsultarCiudad();break;
		case 5: System.out.println("¡Saliendo!");break;
		default:
			System.out.println("Ingrese una opción correcta");break;
		}
	}
	
	

	private void registrarPais() {
		
		pais= JOptionPane.showInputDialog("Ingrese el pais a registrar");
		
		if(paises.containsKey(pais)) {
			System.out.println("El pais ya se encuentra registrado");
			
		}
		else {
			paises.put(pais, new ArrayList<String>());
			System.out.println("Pais Registrado exitosamente");
		}
		
	}
	
	
	
	
	
	private void registrarCiudad() {
		pais= JOptionPane.showInputDialog("Ingrese el nombre del pais de la ciudad que desea registrar");
		if(!paises.containsKey(pais)) {
		
			System.out.println("El país no esta registrado. Debe registrar el pais.");
			return;
		}
			
		ciudad= JOptionPane.showInputDialog("Ingrese la ciudadad a registrar");
		ciudades = paises.get(pais);
		ciudades.add(ciudad);
		System.out.println("Ciudad registrada exitosamente");	
	}
	
	
	
	
	private void ConsultarPorPais_ciudades() {
		pais= JOptionPane.showInputDialog("Ingrese el pais a consultar");

				
		if(!paises.containsKey(pais)) {
			
			System.out.println("El pais NO esta registrado, por lo tanto, no se encontraron ciudades asociadas");
		  return;
		}
		
			
			ciudades = paises.get(pais);
			System.out.println("Estas son las ciudades en "+pais+": ");
			for(String ciudad : ciudades) {
				System.out.println("- "+ciudad);
				
			
			
		}
	}
	
	
	
	private void ConsultarCiudad() {
		ciudad= JOptionPane.showInputDialog("Ingrese la ciudades a registrar");
		
		
          boolean ciudadEncontrada =false;
          
          for(String paiis : paises.keySet()) {
        	  
        	  ciudades = paises.get(paiis);
        	  
        	    if(ciudades.contains(ciudad)) {
        	    	
        	    	System.out.println(ciudad+" pertenece a "+paiis);
        	    	ciudadEncontrada =true;
        	    	
        	    }
          }
		
	}

	


	

	
	


}
