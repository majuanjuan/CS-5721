package com.online.dealz.deal.util;

import java.sql.Timestamp;

public class DataUtility {

    /**
     *
     * @param string
     * @return
     */
    //todo what this function for..?
    public static String getString(String  string) {
        return string;
    }

    /**
     * getLong
     * @param string
     * @return Long
     */
    public static Long getLong(String  string) {
        Long re ;
        try{
            re = Long.parseLong(string);
        }catch (Exception e){
            re = null;
        }
        return re;
    }

    /**
     * @param string
     * @return int
     */
    public static int getInt(String string) {
        int re;
        try {
            re = Integer.valueOf(string);
        }catch (Exception e){
            re = Integer.parseInt(null);
        }
        return  re;
    }

    /**
     * getTimestamp
     * @param string
     * @return Timestamp
     */
    public static Timestamp getTimestamp(Long  string) {
        return new Timestamp(string);
    }

    /**
     * getCurrentTimestamp
     * @return Timestamp
     */
    public static Timestamp getCurrentTimestamp() {
        return new Timestamp(System.currentTimeMillis());
    }


}
