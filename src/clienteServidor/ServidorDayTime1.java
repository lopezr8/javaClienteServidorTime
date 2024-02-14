package clienteServidor;

import java.util.Date;

public class ServidorDayTime1 {
	public static void main(String[] args) {
		int puertoServidor =13; 
		if(args.length==1) 
			puertoServidor= Integer.parseInt(args[0]);
		try {
			MiSocketDatagramaServidor miSocket = new MiSocketDatagramaServidor(puertoServidor);
			System.out.println("El servidor Daytima esta listo");
			while(true) {
				MensajeDatagrama peticion = miSocket.recibeMensajeYEmisor();
				System.out.println("Peticion recibida");
				Date marcaTiempo = new Date();
				System.out.println("marca de tiempo enviada "+marcaTiempo.toString());
				
				miSocket.enviaMensaje(peticion.obtieneDireccion(),peticion.obtienePuerto(),marcaTiempo.toString());
				miSocket.close();
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
}
