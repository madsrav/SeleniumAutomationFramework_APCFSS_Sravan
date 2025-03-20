package com.apcfss.constants;

public final class FrameworkConstants {
	
	

	public FrameworkConstants() {
	}

	private static final String RESOURCESPATH =  System.getProperty("user.dir")+"/src/test/resources";
	private static final String CONFIGFILEPATH = RESOURCESPATH+"/config/FrameworkConfigurations.properties";
	
	public static String getConfigFilePath() {
		return CONFIGFILEPATH;
	}
	
	
}
