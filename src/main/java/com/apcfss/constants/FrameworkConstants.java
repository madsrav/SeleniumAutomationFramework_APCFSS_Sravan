package com.apcfss.constants;

public final class FrameworkConstants {
	
	

	public FrameworkConstants() {
	}

	//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 --> github token
	private static final String RESOURCESPATH =  System.getProperty("user.dir")+"/src/test/resources";
	private static final String CONFIGFILEPATH = RESOURCESPATH+"/config/FrameworkConfigurations.properties";
	
	public static String getConfigFilePath() {
		return CONFIGFILEPATH;
	}
	
	
}
