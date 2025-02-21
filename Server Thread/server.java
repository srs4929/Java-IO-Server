import java.io.*;
import java.net.*;

class send extends Thread
{
    Socket socket;
    public send(String name,Socket socket)
    {
        super(name);
        this.socket=socket;
        start();
    }
    public void run()
    {
        try{
            PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
            for(int i=0;i<=50;i++)
            {
                //System.out.println("Server sending : Hello from server ! "+i);
                out.println("Hello from server "+i);
                try{
                    Thread.sleep(1000);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}

class receive extends Thread{
    Socket socket;
    public receive(String name,Socket socket)
    {
        super(name);
        this.socket=socket;
        start();
    }
    public void run()
    {
        try
        {
            BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while(true)
            {
                String msg=in.readLine();
                System.out.println("Received message from client "+msg);
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}

public class server
{
    public static void main(String[] args) throws IOException,ClassNotFoundException
    {
        ServerSocket serversocket=new ServerSocket(1234);
        System.out.println("Server has started");
        Socket socket=serversocket.accept();
        System.out.println("Client is connected to server");
        
        send st=new send("Sending server",socket);
        receive r=new receive("Listening server",socket);
    }
}
