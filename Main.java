import java.io.*;
class Main
{
    public static void main(String[] args) throws IOException
    {
        String c;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
               // Reading the string from keyboard
        
        System.out.println("Enter the string and for 'stop' to give quit")   ;    
        do
        {
            c=br.readLine(); //readLine() reads string
            System.out.println(c);

        } while(!c.equals("stop")) ;     
    }
}

