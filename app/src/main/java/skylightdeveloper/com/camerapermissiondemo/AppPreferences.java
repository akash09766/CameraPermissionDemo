package skylightdeveloper.com.camerapermissiondemo;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Akash Wangalwar on 19-05-2017.
 */
public class AppPreferences {


    private static final String APP_SHARED_PREFS = "camera_permission_demo";
    private SharedPreferences _sharedPrefs;
    private SharedPreferences.Editor _prefsEditor;
    private static final String CAMERA_PERMISSION = "camera_permission";

    public AppPreferences(Context context) {
        try {
            this._sharedPrefs = context.getSharedPreferences(APP_SHARED_PREFS,
                    Activity.MODE_PRIVATE);
            this._prefsEditor = _sharedPrefs.edit();
        } catch (Exception e) {
        }
    }

    public boolean getCameraPermissionDeniedStatus() {
        return _sharedPrefs.getBoolean(CAMERA_PERMISSION, false);
    }

    public void setCameraPermissionDeniedStatus(boolean isLoggedIn) {

        _prefsEditor.putBoolean(CAMERA_PERMISSION, isLoggedIn);
        _prefsEditor.commit();
    }
}
