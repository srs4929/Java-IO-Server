import java.io.*;
import java.net.*;

class Student implements Serializable
{
    String name;
    int roll;
    Student(String name,int roll)
    {
        this.name=name;
        this.roll=roll;
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
        ObjectOutputStream obj=new ObjectOutputStream(socket.getOutputStream());
        Student s=new Student("Soma",07);
        obj.writeObject(s);
        obj.close();
        socket.close();
        serversocket.close();
    }
}
