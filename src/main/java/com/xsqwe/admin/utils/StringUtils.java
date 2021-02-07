package com.xsqwe.admin.utils;

import java.util.*;

public abstract class StringUtils {
    public StringUtils() {
    }

    public static Random random = new Random();

    public static boolean isEmpty(String s) {
        boolean flg = true;
        if (s != null && s.trim().length() > 0) {
            return false;
        }

        return flg;
    }

    public static boolean isNotEmpty(String s) {
        return !isEmpty(s);
    }

    public static String getString(Object obj) {
        return obj == null ? "" : obj.toString();
    }


}
