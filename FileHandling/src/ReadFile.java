import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String [] args) throws FileNotFoundException {
        System.out.println("Read File");
        File file=new File("C:\\Users\\dines\\Downloads\\temp.txt");
        Scanner sc=new Scanner(file);
        while (sc.hasNextLine()){
            String data=sc.nextLine();
            System.out.println(data);
        }
        sc.close();
    }
}
