package Helper;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utiles {
public static String getPropret(String proprety) throws IOException, InterruptedException {
		
		InputStream input =new FileInputStream("src\\test\\resources\\Propreties\\propreti");
		//class Properties predefinie de java 
		
		Properties properties =new Properties();
		properties.load(input);
		return(properties.getProperty(proprety));
	}
	
}
