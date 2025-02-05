import java.io.*;
import java.net.*;

class client
{
    public static void main(String[] args) throws Exception
    {
        //creating a socket
        Socket s=new Socket("localhost",880);
        System.out.println("Connected to server");
        //to send data to client

        PrintStream p=new PrintStream(s.getOutputStream ());

        // to read from keyboard

        BufferedReader kb= new BufferedReader(new InputStreamReader(System.in));

        // to read data from server
        BufferedReader br= new BufferedReader(new InputStreamReader(s.getInputStream()));

        String str, str1; 
  
        // repeat as long as exit 
        // is not typed at client 
        while (!(str = kb.readLine()).equals("exit")) { 
  
            // send to the server 
            p.println(str); 
  
            // receive from the server 
            str1 = br.readLine(); 
  
            System.out.println("Server : "+str1); 
        }
        //close connection
        p.close() ;
        kb.close();
        br.close();
        s.close();
    }
}