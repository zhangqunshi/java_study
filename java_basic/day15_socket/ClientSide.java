
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kris
 */
public class ClientSide {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            try {
                new ClientThread("127.0.0.1", 8080).start();
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(ClientSide.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
