package com.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

  public class PropertiesUtils {           //Read or write operation
	public static String readproperty(String key) throws IOException  {
		
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/config.properties");
		prop.load(fis);
		return prop.getProperty(key);
	}
   public static void main(String[] args) {
   System.out.println(System.getProperty("user.dir")+"/src/main/resources/config.properties");
}
}
