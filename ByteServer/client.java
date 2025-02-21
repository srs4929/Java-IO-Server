import java.io.*;
import java.net.*;
class client{
    public static void main(String[] args) throws IOException
    {
        Socket socket=new Socket("localhost",1234);
        System.out.println("Connected to Server");
        
        InputStream in=socket.getInputStream(); // receives raw byte from server
        ByteArrayOutputStream buffer=new ByteArrayOutputStream(); // store the data new dynamic buffer

        byte[] data=new byte[1024];
        int nread;
        while((nread=in.read(data,0,data.length))!=-1)
        {
            buffer.write(data,0,nread);
        }

        buffer.flush();
        byte [] byteMessage=buffer.toByteArray();
        String text=new String(byteMessage,"UTF-8");
        System.out.println(text);
        in.close();
        socket.close();
    }
}