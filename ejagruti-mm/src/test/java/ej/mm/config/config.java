package ej.mm.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class config {

	
	public static WebDriver driver=null;
	public static WebDriverWait wait=null;
	
	private String getParameterValue_child(String parametername)throws IOException
	{
		InputStream input=null;
		Properties prop=new Properties();
		
		
	
	input=getClass().getClassLoader().getResourceAsStream("config.properties");
	prop.load(input);
	
	String parametervalue=prop.getProperty(parametername);
	return parametervalue;
	}
	
	public static String getparameterValue(String parametername)throws IOException
	{
		config cfg=new config();
		return cfg.getParameterValue_child(parametername);
	}


	public static void main(String[] args) throws IOException {
		String parametervalue=config.getparameterValue("parameters_folder");
		System.out.println("Parameter Value:"+parametervalue);

	}

}

		


	
		
		
		
	
	
	
	

