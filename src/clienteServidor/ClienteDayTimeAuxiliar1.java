package clienteServidor;
import java.net.*;

public class ClienteDayTimeAuxiliar1 {

	public static String obtenerMarcatiempo(String nombreMaquina, String numPuerto) {
		String marcaTiempo ="";
		try {
			InetAddress serverHost =InetAddress.getByName(nombreMaquina);
			int serverPort = Integer.parseInt(numPuerto);
			
			MiSocketDatagramaCliente miSocket = new MiSocketDatagramaCliente();
			miSocket.enviaMensaje(serverHost,serverPort,"");
			marcaTiempo = miSocket.recibeMensaje();
			miSocket.close();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return marcaTiempo;
	}
	
}
