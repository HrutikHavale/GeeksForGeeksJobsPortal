package utilities;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    public static Properties readPropertyFileData(){
        Properties properties= new Properties();

        try{
        FileInputStream ip = new FileInputStream("/home/gfg19539@gfg.geeksforgeeks.org/IdeaProjects/orange-hrm-demo/src/main/java/resources/config.properties");
        properties.load(ip);
    }
 catch (FileNotFoundException e){
     e.printStackTrace();
 }
 catch (IOException e){
     e.printStackTrace();
 }
 return properties;
 }
}
