package com.example.whatsappclone.camera;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.support.annotation.RequiresApi;

public class WhatsappCameraManager {

    private static final String TAG = "WhatsappCameraManager";

    private Context context;

    public WhatsappCameraManager(Context context) {
        this.context = context;
    }

    /**
     * A safe way to get an instance of the Camera object.
     */
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public static void getCamera() {
        try {
            CameraManager cameraManager = CameraManager.class.newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
