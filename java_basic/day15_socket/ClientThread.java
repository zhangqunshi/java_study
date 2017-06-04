
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
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kris
 */
class ClientThread extends Thread {

    private BufferedReader in;
    private PrintWriter out;
    Socket s;

    ClientThread(String ip, int port) {
        try {
            s = new Socket(ip, port);
            System.err.println("与服务器连接成功");
            in = new BufferedReader(new InputStreamReader(s.getInputStream()));

            // Enable auto-flush:
            out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(
                    s.getOutputStream())), true);
        } catch (UnknownHostException ex) {
            Logger.getLogger(ClientThread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ClientThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void run() {
        try {
            String msg = in.readLine();
            System.out.println(msg);

            for (int i = 0; i < 5; i++) {
                out.println("kris" + i);
            }
            out.println("END");
        } catch (IOException ex) {
            Logger.getLogger(ClientThread.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (s != null) {
                    s.close();
                }
                
            } catch (IOException ex) {
                Logger.getLogger(ClientThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
