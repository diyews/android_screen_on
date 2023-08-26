package com.jelfish.android_screen_on;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyDeviceManagerReceiver extends DeviceAdminReceiver {

    void showToast(Context context, String msg) {
        String status = msg;
        Toast.makeText(context, status, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onEnabled(Context context, Intent intent) {
        showToast(context, "enabled");
    }

    @Override
    public CharSequence onDisableRequested(Context context, Intent intent) {
        return "onDisableRequested";
    }

    @Override
    public void onDisabled(Context context, Intent intent) {
        showToast(context, "onDisabled");
    }
}