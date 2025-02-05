import java.io.*;
import java.net.*;

class server
{
    public static void  main(String[] args) throws Exception
    {
            ServerSocket ss=new ServerSocket(880) ; // creating a port and socket
            System.out.println("Server has started");
            //connect to client
            Socket s=ss.accept();
            //to send data to the client

            PrintStream p=new PrintStream(s.getOutputStream());

            //to read data from the client

            BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));

            // to read data from keyboard

            BufferedReader key =new BufferedReader(new InputStreamReader(System.in));

            //exceuting server continuosly

            while(true)
            {
                String str1,str2;

                //read from client until null character
                while((str1=br.readLine())!=null)
                {
                    System.out.println("Client : "+str1); 
                    str2 = key.readLine();  // read from keyboard
      
                    // send to client 
                    p.println(str2); 
                }
                p.close();
                br.close();
                key.close();
                ss.close();
                s.close();
                System.exit(0);
    }

            }
                
        }
