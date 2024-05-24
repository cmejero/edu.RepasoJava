package controladores;

import java.util.Scanner;

import servicios.ficherosImplementacion;
import servicios.ficherosInterfaz;
import servicios.menuImplementacion;
import servicios.menuInterfaz;

public class Inicio {

	public static final String rutaRaizLogs = "C:\\Users\\Carlos\\workspace-recuperacion-java\\logs\\";
	public static final String nombreLog = "log.txt";
	public static final String rutaCompletaLog = rutaRaizLogs.concat(nombreLog);

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int opcionUsuario;
		boolean cerrarMenu = false;
		menuInterfaz mi = new menuImplementacion();
		ficherosInterfaz fi = new ficherosImplementacion();
		
	do {
		try {
			String nulo = null;
			nulo.length();
		opcionUsuario= mi.menuYSeleccionPrincipal(sc);
		
		switch(opcionUsuario) {
		
		case 0:
			System.out.println("Has seleccionado cerrar menu");
			cerrarMenu= true;
			break;
			
		case 1:
			System.out.println("Has seleccionado dar alta objeto");
			
			break;
		default:
			System.out.println("La opcion seleccionada no correspònde con ninguna");
			break;
		}
		}catch(Exception e){
			 fi.ficheroLog(e);

			System.out.println("Se ha producido un error " + e.getMessage());
			
	
		}
	}while(!cerrarMenu);

	}

	
}
