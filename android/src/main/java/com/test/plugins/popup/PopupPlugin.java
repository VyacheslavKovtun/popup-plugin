package com.test.plugins.popup;

import android.util.Log;

public class PopupPlugin {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }
}
