import java.net.*;
import java.io.*;
import java.util.*;

public class Client {
    public static void main(String[] args) throws IOException {
        try(Socket s = new Socket("localhost", 4999);
             PrintWriter pr = new PrintWriter(s.getOutputStream())) {
            pr.println("Client Connecting");
            pr.flush();

        }
    }
}
