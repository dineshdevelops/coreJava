import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String [] args){
        System.out.println("Java file write Operation");
        try{
            FileWriter file = new FileWriter("C:\\Users\\dines\\Downloads\\temp.txt");
            file.write("Dinesh wrote this program");
            file.close();
        }
        catch (IOException ioException){
            System.out.println("An error occured");
            ioException.printStackTrace();
        }
    }
}
