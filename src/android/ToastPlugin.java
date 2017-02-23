package cordovaplugin.bjzjns.com.cordovaplugin;

import android.widget.Toast;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

/**
 * Created by blade on 20/02/2017.
 */

public class ToastPlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("showToast")) {
            Toast.makeText(cordova.getActivity(),"AlphoGo",Toast.LENGTH_SHORT).show();
            callbackContext.success("Hens");
        }
        return false;
    }
}
