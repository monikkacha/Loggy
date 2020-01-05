package com.mohit.loggy2;

import android.util.Log;

public class Loggy {
    private static boolean showLog = true;

    public static void setShowLog(boolean set) {
        showLog = set;
    }

    public static void e(String TAG, String MSG) {
        printLogOnLogCat(1, TAG, MSG);
    }

    public static void w(String TAG, String MSG) {
        printLogOnLogCat(2, TAG, MSG);

    }

    public static void d(String TAG, String MSG) {
        printLogOnLogCat(3, TAG, MSG);

    }

    public static void i(String TAG, String MSG) {
        printLogOnLogCat(4, TAG, MSG);

    }

    public static void v(String TAG, String MSG) {
        printLogOnLogCat(5, TAG, MSG);

    }


    private static void printLogOnLogCat(int i, String tag, String msg) {
        if (showLog) {
            switch (i) {
                case 1:
                    Log.e(tag, msg);
                    break;
                case 2:
                    Log.w(tag, msg);
                    break;
                case 3:
                    Log.d(tag, msg);
                    break;
                case 4:
                    Log.i(tag, msg);
                    break;
                case 5:
                    Log.v(tag, msg);
                    break;
            }
        }
    }
}
