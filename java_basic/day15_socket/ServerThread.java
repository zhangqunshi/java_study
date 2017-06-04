
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.net.SocketAddress;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Send a message to client when it connected firstly. (etc. show "Welcome")
 * Then got the message from clients util client say "END".
 * 
 * @author kris
 */
class ServerThread extends Thread {

    private Socket s;
    private PrintWriter out;
    private BufferedReader in;

    public ServerThread(Socket socket) {
        s = socket;
        try {
            out = new PrintWriter(new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream())), true);
            in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
        } catch (IOException ex) {
            Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void run() {
        try {
            SocketAddress sa = s.getRemoteSocketAddress();
            out.println("Welcome" + sa);

            while (true) {
                String m = in.readLine();
                if (m.equalsIgnoreCase("END")) {
                    break;
                }
                System.out.print("[" + sa + "]=" + m);
            }
        } catch (IOException ex) {
            Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                in.close();
                out.close();
                s.close();
            } catch (IOException ex) {
                Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
