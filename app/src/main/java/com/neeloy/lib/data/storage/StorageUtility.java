package com.neeloy.lib.data.storage;

import android.content.Context;

import com.neeloy.lib.data.storage.utils.Prefs;
import com.neeloy.lib.data.storage.utils.TinyDB;

import java.util.ArrayList;
/*
 * Copyright 2018 @Neeloy Ghosh
 *
 */

public class StorageUtility {
    private static Prefs mPrefs;
    private static TinyDB tinydb;

    /**
     * @param Context mContext
     */
    public static void initLibrary(Context mContext) {
        mPrefs = new Prefs(mContext);
        tinydb = new TinyDB(mContext);
    }

    /**
     * @param String key
     * @param String value
     */
    public static void setStringData(String key, String value) {
        mPrefs.setStringData(key, value);
    }

    /**
     * @param String key
     * @return String
     */
    public static String getStringData(String key) {
        return mPrefs.getStringData(key);
    }

    /**
     * @param String key
     * @param int    value
     */
    public static void setIntData(String key, int value) {
        mPrefs.setIntData(key, value);
    }

    /**
     * @param String key
     * @return int
     */
    public static int getIntData(String key) {
        return mPrefs.getIntData(key);
    }

    /**
     * @param String key
     * @param double value
     */
    public static void setDoubleData(String key, double value) {
        mPrefs.setDoubleData(key, value);
    }

    /**
     * @param String key
     * @return double
     */
    public static double getDoubleData(String key) {
        return mPrefs.getDoubleData(key);
    }

    /**
     * @param String key
     * @param long   value
     */
    public static void setLongData(String key, long value) {
        mPrefs.setLongData(key, value);
    }

    /**
     * @param String key
     * @return long
     */
    public static long getLongData(String key) {
        return mPrefs.getLongData(key);
    }

    /**
     * @param String key
     * @param long   value
     */
    public static void setBooleanData(String key, boolean value) {
        mPrefs.setBooleanData(key, value);
    }

    /**
     * @param String key
     * @return boolean
     */
    public static boolean getBooleanData(String key) {
        return mPrefs.getBooleanData(key);
    }

    /**
     * @param String key
     * @param Object obj
     */
    public static void setObject(String key, Object obj) {
        tinydb.putObject(key, obj);
    }

    /**
     * @param String   key
     * @param Class<T> classOfT
     * @return T
     */
    public static <T> T getObject(String key, Class<T> classOfT) {
        return tinydb.getObject(key, classOfT);
    }

    /**
     * @param String            key
     * @param ArrayList<Object> obj
     */
    public static void setListObject(String key, ArrayList<Object> obj) {
        tinydb.putListObject(key, obj);
    }

    /**
     * @param String   key
     * @param Class<?> mClass
     * @return ArrayList<Object>
     */
    public static ArrayList<Object> getListObject(String key, Class<?> mClass) {
        return tinydb.getListObject(key, mClass);
    }

    /**
     * Clear all Data
     */
    public static void clearAllData() {
        if (mPrefs != null)
            mPrefs.clearPreferences();

    }
}
