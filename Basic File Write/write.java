import java.io.*;

class write
{
    public static void main(String[] args) 
    {
    try {
        File file = new File("text.txt");
        BufferedWriter write = new BufferedWriter(new FileWriter(file, true));
    
        write.write("Hello Bangladesh\n");
        write.write("I am Soma\n");
    
       // write.flush();  // Force writing to file
        write.close();  
    
        System.out.println("File written successfully!");
    } catch (IOException e) {
        e.printStackTrace(); // Print error if file writing fails
    }
}
    
}