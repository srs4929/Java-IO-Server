

//stores the string from keyboard and print




import java.io.*;
class editor
{
    public static void main(String[] args) throws IOException
    {
       
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
               // Reading the string from keyboard
        
        String []  s=new String[1000];
        System.out.println("Enter the strings and stop to end");
        for(int i=0;i<1000;i++)
        {
            s[i]=br.readLine(); //reading and storing
            if(s[i].equals("stop")) break;
        }
        System.out.println("The whole file :");
        for(int i=0;i<1000;i++)
        {
            if(s[i].equals("stop")) break;
            System.out.println(s[i]);
        }

        
               
    }
}

