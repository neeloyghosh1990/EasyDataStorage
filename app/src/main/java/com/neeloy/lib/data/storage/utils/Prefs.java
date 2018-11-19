package com.neeloy.lib.data.storage.utils;

import android.content.Context;

/*
 * Copyright 2018 @Neeloy Ghosh
 *
 */
public class Prefs extends AbsPrefs {

    public Prefs(Context context) {
        super(context);
    }

    public void setStringData(String key, String value) {
        setString(key, value);
    }

    public String getStringData(String key) {
        return getString(key, "");
    }

    public void setIntData(String key, int value) {
        setInt(key, value);
    }

    public int getIntData(String key) {
        return getInt(key, 0);
    }

    public void setBooleanData(String key, boolean value) {
        setBoolean(key, value);
    }

    public boolean getBooleanData(String key) {
        return getBoolean(key, true);
    }

    public void setDoubleData(String key, double value) {
        setDouble(key, value);
    }

    public double getDoubleData(String key) {
        return getDouble(key, 0);
    }


    public void setLongData(String key, long value) {
        setLong(key, value);
    }

    public long getLongData(String key) {
        return getLong(key, 0);
    }



}