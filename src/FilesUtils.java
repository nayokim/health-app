import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilesUtils {

    private static String directory = "WeightManagement";
    private static String filename = "ALL DATA";


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
    }

    public static void writeFile(General general){
        String info = String.format("%9s | %13d | %15d|  %12s ", general.getDate(), general.getDailyWeight(), general.getCaloricIntake(),  general.getFoodEaten());
        try {
            Files.write(
                    dataFile,
                    Arrays.asList(info),
                    StandardOpenOption.APPEND);
        }catch (IOException e){
            System.out.println("problems writing to the file");
            e.printStackTrace();
        }
    }

    public static void readFile(){
        try {
            List<String> lines= Files.readAllLines(dataFile);
            System.out.printf("%11s %15s %17s %12s","Date |", "Daily weight |" , "Caloric Intake | " , "Foods Eaten");
            for (String line : lines ){
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("error with reading the file");
            e.printStackTrace();
        }
    }

    static void delete (String date) {
        try {
            List<String> lines = Files.readAllLines(dataFile);
            List<String> writeLines = new ArrayList<>();

            for(String line: lines){
                if(line.endsWith(date)){
                    writeLines.add(line);
                }
            }

            Files.write(
                    dataFile,
                    writeLines
            );
        } catch(IOException e){
            e.printStackTrace();
        }
    }




}//end FileUtils class
