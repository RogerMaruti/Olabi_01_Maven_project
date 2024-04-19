package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class readpropertyfile {

	public static void main(String[] args) throws IOException {
		FileReader Fr= new FileReader("C:\\Users\\Dell\\eclipse-workspace\\Olabi_01_Maven_Project\\src\\test\\resources\\configfiles\\config.properties");
		Properties p =new Properties();
		p.load(Fr);
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("olabiurl"));
	}

}
