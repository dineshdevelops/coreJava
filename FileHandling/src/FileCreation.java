import java.io.File;
import java.io.IOException;

public class FileCreation {
    public static void main(String [] args) throws IOException {
        System.out.println("FileHandling - Create New File");
        File newFile = new File("C:\\Users\\dines\\Downloads\\temp.txt");
        if (newFile.createNewFile()){
            System.out.println("File "+newFile+" is created");
        }
        else{
            System.out.println("File already exists");
        }

    }
}
