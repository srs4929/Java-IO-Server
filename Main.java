//Reading characters from the input, printing those characters,

import java.io.*;
class Main
{
    public static void main(String[] args) throws IOException
    {
        char c;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
               // Reading the character from keyboard
        
        System.out.println("Enter the character and for quit give q")   ;    
        do
        {
            c=(char)br.read(); //read the character
            System.out.println(c);

        } while(c!='q') ;     
    }
}

