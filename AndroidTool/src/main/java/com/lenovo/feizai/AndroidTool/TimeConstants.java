package com.lenovo.feizai.AndroidTool;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author feizai
 * @date 2021/5/29 0029 下午 3:11:24
 * @annotation
 */
public final class TimeConstants {

    public static final int MSEC = 1;
    public static final int SEC  = 1000;
    public static final int MIN  = 60000;
    public static final int HOUR = 3600000;
    public static final int DAY  = 86400000;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Unit {
    }
}
