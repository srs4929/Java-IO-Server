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

public class client
{
    public static void main(String[] args) throws IOException,ClassNotFoundException
    {
        Socket socket=new Socket("localhost",1234);
        System.out.println("Client is connected");
        ObjectInputStream obj=new ObjectInputStream(socket.getInputStream());
        Student s=(Student)obj.readObject();
        System.out.println("name : "+s.name+" roll "+s.roll);
        obj.close();

        socket.close();
    }
}
