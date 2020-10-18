package com.lizbyu.utils.log;

import com.lizbyu.utils.time.TimeUtils;

import java.util.Arrays;
import java.util.List;

@SuppressWarnings("unused")
public  class LogUtils {
    private LogUtils() {}

    public static void d(String tag, Object xMsg){
        String logLevel = "D/";
        String content = constructLogContent(logLevel, tag, xMsg + "");
        System.out.println(content);
    }

    public static void d(String tag, String msg){
        String logLevel = "D/";
        String content = constructLogContent(logLevel, tag, msg);
        System.out.println(content);
    }

    public static void e(String tag, String msg){
        String logLevel = "E/";
        String content = constructLogContent(logLevel, tag, msg);
        System.out.println(content);
    }

    public static void d(String tag, List<?> list){
        String logLevel = "D/";
        String msg = Arrays.toString(list.toArray());
        String content = constructLogContent(logLevel, tag, msg);
        System.out.println(content);
    }

    public static void d(String tag, int[] array){
        String logLevel = "D/";
        String msg = Arrays.toString(array);
        String content = constructLogContent(logLevel, tag, msg);
        System.out.println(content);
    }

    public static void d(String tag, char[] chArray){
        String logLevel = "D/";
        String msg = Arrays.toString(chArray);
        String content = constructLogContent(logLevel, tag, msg);
        System.out.println(content);
    }

    public static void d(String tag, Object[] array){
        String logLevel = "D/";
        String msg = Arrays.toString(array);
        String content = constructLogContent(logLevel, tag, msg);
        System.out.println(content);
    }

    public static void d(String tag, int[][] array){
        String logLevel = "D/";
        String msg = getTwoDimensionArrayMsg(array);
        String content = constructLogContent(logLevel, tag, msg);
        System.out.println(content);
    }

    private static String getTwoDimensionArrayMsg(int[][] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int[] ints : array) {
            sb.append(Arrays.toString(ints));
        }
        sb.append("]");
        return new String(sb);
    }

    private static String constructLogContent(String logLevel, String tag, String msg) {
        StringBuilder sb = new StringBuilder();
        sb.append(getCurrentTime());
        sb.append(logLevel);
        sb.append(getTagMessage(tag));
        sb.append(msg);
        return new String(sb);
    }

    private static String getCurrentTime() {
        return TimeUtils.getCurrentTime();
    }

    private static String getTagMessage(String tag) {
        return tag + ": ";
    }
}
