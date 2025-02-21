import java.io.*;
import java.util.Scanner;
class write
{   
    void writesomething()  
    {
        try
        {
            File file=new File("text.txt");
            BufferedWriter writer=new BufferedWriter(new FileWriter(file,true));
            writer.write("Hello World\n");
            writer.close();
            System.out.println("File written successfully");
        }
        catch(IOException e)
        {
             e.printStackTrace();
        }
    }

    void appendtext()
    {
        try{
           
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            File file=new File("text.txt");
            BufferedWriter writer=new BufferedWriter(new FileWriter(file,true));
            writer.write(s);
            writer.write("\n");
            writer.close();
            System.out.println("Text appended");

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) 
    {
       write obj=new write();
       obj.writesomething ();
       obj.appendtext();
    }
}

    
