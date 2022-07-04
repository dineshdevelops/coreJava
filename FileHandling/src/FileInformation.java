import java.io.File;

public class FileInformation {
    public static void main(String [] args){
        System.out.println(":: File Information ::");
        File file=new File("C:\\Users\\dines\\Downloads\\temp.txt");
        if(file.exists()){
            System.out.println("File Exists");
            System.out.println("File Name"+file.getName());
            System.out.println("Absolute Path"+file.getAbsolutePath());
            System.out.println("Writeable "+file.canWrite());
            System.out.println("Readable "+file.canRead());
            System.out.println("File Size"+file.length());
        }
        else{
            System.out.println("File Does not exists");
        }
    }
}
