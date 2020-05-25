import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilesUtils {

    private static String directory = "WeightManagement";
    private static String filename = "Weight";

    private static Path dataDirectory = Paths.get(directory);
    private static Path dataFile = Paths.get(directory,filename);


    public static void createDir(){
        if (Files.notExists(dataDirectory)){
            try{
                Files.createDirectory(dataDirectory);
            }catch(IOException e){
                System.out.println("Problem create directory");
                e.printStackTrace();
            }
        }
    }//end createDir

    public static void createFile(){
        if (!Files.exists(dataFile)){
            try{
                Files.createFile(dataFile);
            }catch (IOException e){
                System.out.println("problems with creating the file");
                e.printStackTrace();
            }
        }
    }// end createFile
//
    public static void writeFile(General general){
       Scanner scanner = new Scanner(System.in);
        System.out.println("What was your weight today?");
       String dailyWeight = scanner.nextLine();
        try {
            Files.write(
                    dataFile,
                    Arrays.asList(dailyWeight),
                    StandardOpenOption.APPEND);
        }catch (IOException e){
            System.out.println("problems writing to the file");
            e.printStackTrace();
        }
    }

    public static void readFile(){
        try {
            List<String> lines= Files.readAllLines(dataFile);
            for (String line : lines ){
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("error with reading the file");
            e.printStackTrace();
        }
    }

    public static void deleteStudent(){};
    public static void  searchStudent(){};

}//end FileUtils class