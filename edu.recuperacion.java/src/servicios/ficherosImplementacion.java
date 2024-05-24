package servicios;

import java.io.FileWriter;
import java.io.IOException;

import controladores.Inicio;

public class ficherosImplementacion implements ficherosInterfaz {

	public void ficheroLog(Exception e) {
		try {
		 FileWriter escritor = new FileWriter(Inicio.rutaCompletaLog);
		 escritor.write("Se ha producido un error " + e.getMessage());
		 
		 escritor.close();
		 }catch(IOException io){
			 
			 System.out.println("Se ha producido un error " + e.getMessage());
			 
		 }
	}

}
