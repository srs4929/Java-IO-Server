import java.io.*;
import java.net.*;
class server
{
    public static void main(String[] args) throws IOException
    {
        ServerSocket serversocket=new ServerSocket(1234);
        System.out.println("Server started.....");
        Socket socket=serversocket.accept();
        System.out.println("Client connected");
        String message="Hello from server!!";
        byte[] bytemessage=message.getBytes("UTF-8");
        OutputStream out=socket.getOutputStream();
        out.write(bytemessage);
        out.close();
        serversocket.close();
    }
}