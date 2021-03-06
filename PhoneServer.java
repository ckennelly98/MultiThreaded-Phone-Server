import java.io.*;
import java.util.*;
import java.net.*;
public class PhoneServer {
    // The port number on which the server will be listening
    private static int port = 2014;
    // The server socket.
    private static ServerSocket listener = null;
    // The client socket.
    private static Socket clientSocket = null;
    public static void main(String[] args)throws Exception
    {
        /**
         Open a server socket on the specified port number(2014)
         and monitor the port for connection requests. When a
         connection request is received, create a client request
         thread, passing to its constructor a reference to the
         Socket object that represents the established connection
         with the client.
         */
    }
}
class ClientThread extends Thread
{
    Socket socket;

    //constructor
    public ClientThread(Socket socket)
    {
        this.socket = socket;
    }

    //implement the run method
    public void run()
    {
        handleConnection(socket);
    }
    //implement the handleConnection method here.
}
