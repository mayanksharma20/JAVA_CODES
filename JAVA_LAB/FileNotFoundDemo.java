import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundDemo {
    public static void main(String[] args) {
        try{
            //following files doesnot exist
            File file=new File("E://file.txt");
            FileReader fr=new FileReader(file);
        }catch(FileNotFoundException e){
            System.out.println("file dont exist");
        }
    }    
}
