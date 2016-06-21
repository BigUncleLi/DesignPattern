package org.uncle.lee.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LogUtils {
	private LogUtils(){}
	
	private static final String SIMPLE_DATE_FORMAT = "MM-dd HH:mm:ss";
	private static final String SLASH = "/";
	private static final String COLON = ":";
	private static final String SPACE = " ";
	private static final String LEVEL_DEBUG = "D";
	private static final String LEVEL_ERROR = "E";
	
	public static void d(String TAG, String content){
		String logMessage = assembleLogMessage(LEVEL_DEBUG, TAG, content);
		showLogMessage(logMessage);
	}
	
	public static void e(String TAG, String content){
		String logMessage = assembleLogMessage(LEVEL_ERROR, TAG, content);
		showLogMessage(logMessage);
	}

	private static String assembleLogMessage(String logLevel, String TAG, String content) {
		String timeMessage = getCurrentTimeMessage();
		String textMessage = getTextMessage(logLevel, TAG, content);
		String logMessage = combineTimeAndTextMessage(timeMessage, textMessage);
		return logMessage;
	}
	
	private static String getCurrentTimeMessage() {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat(SIMPLE_DATE_FORMAT);
		return dateFormat.format(date);
	}
	
	private static String getTextMessage(String logLevel, String TAG, String content) {
		return logLevel + SLASH + TAG + COLON + SPACE + content;
	}
	
	private static String combineTimeAndTextMessage(String timeMessage, String textMessage) {
		return timeMessage + SPACE + textMessage;
	}
	
	private static void showLogMessage(String logMessage){
		System.out.println(logMessage);
	}
}
