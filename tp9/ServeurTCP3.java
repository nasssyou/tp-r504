import java.io.*;
import java.net.*;

public class ServeurTCP3
{
   public static void main( String[] args )
   {
	try
	{
		ServerSocket socketserver = new ServerSocket( 2016 );
		Socket socket = socketserver.accept();
		while (true) 
		{
			System.out.println( "serveur en attente" );
			System.out.println( "Connection d'un client" );
			DataInputStream dIn = new DataInputStream( socket.getInputStream());
			System.out.println( "Message: " + dIn.readUTF());
			String rev = new StringBuilder(args[0]).reverse().toString();
		}

	}
   catch( Exception ex ) 
	{
	System.out.println( "erreur !" );
	ex.printStackTrace();
   	}
   }
}