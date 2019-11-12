package com.online.dealz.deal.util;

public class DataValidator {

    /**
     * isNotNull
     * @param ob
     * @return Boolean
     */
    public static Boolean isNotNull(Object ob) {
        if(ob!=null&&!"".equals(String.valueOf(ob))){
            return true;
        }else {
            return false;
        }
    }

    /**
     * isNull
     * @param ob
     * @return Boolean
     */
    public static Boolean isNull(Object ob){
        if(ob!=null&&!"".equals(String.valueOf(ob))){
            return false;
        }else {
            return true;
        }
    }
}
