package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import Keyword.Const;

public class Propertyfile {
	public static  String getProperty(String key) 
	{
		String value=null;
		try {
			Const.fis=new FileInputStream("Input/Objectrepository.properties");
            Const.prop=new Properties();
            Const.prop.load(Const.fis);
            value=Const.prop.getProperty(key);
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("Unable to open repository");
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
	public static String getProperty(String key,String filepath) 
	{
		String value=null;
		try {
			Const.fis = new FileInputStream(filepath);
			Const.prop=new Properties();
			Const.prop.load(Const.fis);
            value=Const.prop.getProperty(key);
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("File"+filepath+"not found");
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			System.out.println("unable to load File"+filepath);
			e.printStackTrace();
		}
		return value;	
	}
	public static String[] getLocator(String key)
	{
		String[] value=null;
		try {
			Const.fis=new FileInputStream("Input/Objectrepository.properties");
			Const.prop=new Properties();
			Const.prop.load(Const.fis);
            String part=Const.prop.getProperty(key);
            value=part.split("##");
            System.out.println("Locator Type:"+value[0]);
            System.out.println("Locator Value:"+value[1]);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return value;	
   }
}

