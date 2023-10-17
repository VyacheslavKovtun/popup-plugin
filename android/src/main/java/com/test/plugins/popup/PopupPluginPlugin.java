package com.test.plugins.popup;

import android.widget.Toast;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "PopupPlugin")
public class PopupPluginPlugin extends Plugin {

    private PopupPlugin implementation = new PopupPlugin();

    @PluginMethod
    public void echo(PluginCall call) {
      String value = call.getString("value");

      JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        call.resolve(ret);
    }

    @PluginMethod
    public void showPopup(PluginCall call) {
      String messageText = call.getString("message");

      Toast.makeText(getActivity(), messageText, Toast.LENGTH_LONG).show();

      call.resolve();
    }
}
