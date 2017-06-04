import java.io.IOException;
import java.net.ServerSocket;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.net.Socket;

/**
 * 
 * @author kris
 */
public class ServerSide {

	public static void main(String[] args) throws IOException {
		ServerSocket s = new ServerSocket(8080);

		try {
			while (true) {
				// A new client connected, then we got a socket object.
				Socket socket = s.accept();
				
				// create a thread to handling the business through the socket.

				new ServerThread(socket).start();
			}
		} finally {
			s.close();
		}
	}
}
