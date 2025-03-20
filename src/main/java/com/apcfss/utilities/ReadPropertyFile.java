package com.apcfss.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public class ReadPropertyFile {

	private ReadPropertyFile(){
	}

	private static Properties property = new Properties();
	private static final Map<String, String> CONFIGMAP = new HashMap<>();
	static
	{
		FileInputStream fis;
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config/FrameworkConfigurations.properties");
			property.load(fis);
			
			//conversion of hash table to hashMap
		for(Map.Entry<Object,Object> entry : property.entrySet())
			{
				CONFIGMAP.put(String.valueOf(entry.getKey()),String.valueOf(entry.getValue()));
			}
		
		//we can use any of the two types for conversion either above or exactly below one.
		//property.entrySet().forEach(entry -> CONFIGMAP.put(String.valueOf(entry.getKey()),String.valueOf(entry.getValue())));

		} catch (IOException e) {
			e.printStackTrace();
			e.getCause();
			e.getMessage();
		}
	}	

	public static String get(String key) throws FileNotFoundException
	{
		if(Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key)))
		{
			throw new FileNotFoundException("Property name "+key+" is not found. Please check config.properties");
		}
		return CONFIGMAP.get(key);
	}
}