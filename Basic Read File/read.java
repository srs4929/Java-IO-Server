import java.io.*;
import java.util.Scanner;
class read
{   
    void readsomething()  
    {
        try
        {
            File file=new File("text.txt");
            BufferedReader reader=new BufferedReader(new FileReader(file));
            String line;
            while((line=reader.readLine())!=null)
            {
                System.out.println(line);
            }
            reader.close();
        }
        catch(IOException e)
        {
             e.printStackTrace();
        }
    }

   

    public static void main(String[] args) 
    {
       read obj=new read();
       obj.readsomething ();
      
    }
}

    
