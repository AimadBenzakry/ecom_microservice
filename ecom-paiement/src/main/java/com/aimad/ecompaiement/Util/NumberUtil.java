package com.aimad.ecompaiement.Util;

public class NumberUtil {
    public static Double toDouble(String value){
        if(value.isEmpty() || value==null){
            return 0D;
        } else{
            return Double.parseDouble(value);
        }
    }

    public static String toString(Double d){
        if (d==null){
            return "";
        }else{
            return d.toString();
        }
    }
}
