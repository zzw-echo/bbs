package com.liang.utils;

import java.io.IOException;

public class PathUtil {
	
	private static String commonPath;	//公共路径
	private static String serverPath;	//服务器路径
	
	public static String getCommonPath() {
		
		serverPath=System.getProperty("catalina.home");
		commonPath = serverPath +PropertyUtil.getPropertiesPath().getProperty("webapps");
		return commonPath;
	}

	public static String getArticlePath() {
	
		return PropertyUtil.getPropertiesPath().getProperty("articlePath");
	}


	public static String getUserPath() {
		
		return PropertyUtil.getPropertiesPath().getProperty("userPath");
		}
}
