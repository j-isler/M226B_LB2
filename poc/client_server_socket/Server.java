import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Write a description of class Server here.
 * 
 * @author Jenia Isler
 * @version 16.01.2021
 */
public class Server  
{
    //deklarierter Server Port
    private static final int SERVER_PORT = 9000;
    
    /**
     * Constructor for objects of class Server
     */
    public Server()
    {
    }
    
    public Server(boolean jsonObject){
        
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */

    public void ServerSocket() throws IOException{
        ServerSocket listener = new ServerSocket(SERVER_PORT);

        // TODO [Popup] Waiting for client connection
        Socket client = listener.accept();
        // TODO [Popup] Client connected


        // for Buffer outgoing messages
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);

        // for Buffer incoming messages
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));


        //close
        out.close();
        in.close();

        //
        listener.close();

    }
    
    
    public static String SocketGetJSON() throws IOException{
        
        System.out.println("[SERVER] Waiting for client connection on Port: " + SERVER_PORT + "...");
        
        ServerSocket listener = new ServerSocket(SERVER_PORT);

        // TODO [Popup] Waiting for client connection
        Socket client = listener.accept();
        // TODO [Popup] Client connected


        // for Buffer outgoing messages
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);

        // for Buffer incoming messages
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        
        //get String form incoming buffer
        String jsonString = in.readLine();
        
        // returns JSON Sting
        

        //close
        out.close();
        in.close();

        //close listener
        listener.close();
        
        return jsonString;
    }

}
