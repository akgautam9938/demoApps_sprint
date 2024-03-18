package dataDrivernTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FatchDataFromPropertyFile {

	public FatchDataFromPropertyFile() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis= new FileInputStream("E:\\java qspider\\demoApps\\src\\test\\resources\\commonTestData\\commanTestData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		
		String email = prop.getProperty("email");
		System.out.println(email);
		
		String url = prop.getProperty("url");
		System.out.println(url);

	}

}
