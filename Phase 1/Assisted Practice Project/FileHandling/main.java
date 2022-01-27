import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class main{
    public static void main(String[] args) throws IOException {
   	 String input="simplilearn";
   	 FileWriter fw=new FileWriter("a.txt",true);
   	 fw.write(input);
   	 System.out.println("Data Written");   	 
   	 fw.close();
   	 
    }

}