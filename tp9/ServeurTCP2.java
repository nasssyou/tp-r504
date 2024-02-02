import java.io.*;
import java.net.*;

public class ServeurTCP2
{
   public static void main( String[] args )
   {
	try
	{
		ServerSocket socketserver = new ServerSocket( 2016 );
		while (true) 
		{
			Socket socket = socketserver.accept();
			DataInputStream dIn = new DataInputStream( socket.getInputStream());
			System.out.println( "serveur en attente" );
			System.out.println( "Connection d'un client" );
			System.out.println( "Message: " + dIn.readUTF());
			socket.close(); 
		}

	}
   	catch( Exception ex ) 
	{
		System.out.println( "erreur !" );
		ex.printStackTrace();
   	}
   }
}