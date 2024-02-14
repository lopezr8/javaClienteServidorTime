package clienteServidor;
import java.io.BufferedReader;
import java.io.InputStreamReader;

//logica de presentación

public class Cliente {
	public static void main(String[]args) {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
	try {
		System.out.print("Bienvenido al cliente Daytime.X n " + "¿Cual es el nombre edl servidor?");
		String nombreMaquina = br.readLine();
		if(nombreMaquina.length()==0)
			nombreMaquina = "localhost";
		System.out.print("Cual es el # de puerto del servidor?");
		String numPuerto = br.readLine();
		if(numPuerto.length()==0)
			numPuerto="13";
		System.out.print("Marca de tiempo recibida del servidor"+ClienteDayTimeAuxiliar1.obtenerMarcatiempo(nombreMaquina,numPuerto));
	}
	catch(Exception ex) {
		ex.printStackTrace();
	}
		
		
	}

}
