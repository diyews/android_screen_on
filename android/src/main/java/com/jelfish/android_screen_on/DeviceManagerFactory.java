package com.jelfish.android_screen_on;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;
import android.view.View;

import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;

public class DeviceManagerFactory extends PlatformViewFactory {
    /**
     * @param createArgsCodec the codec used to decode the args parameter of {@link #create}.
     */
    public DeviceManagerFactory(MessageCodec<Object> createArgsCodec) {
        super(createArgsCodec);
    }

    @Override
    public PlatformView create(Context context, int viewId, Object args) {
        return new DeviceManagerView(context, viewId);
    }
}

class DeviceManagerView implements PlatformView {

    DeviceManagerView(Context context, int viewId) {

    }
    @Override
    public View getView() {
        Intent intent = new Intent(DevicePolicyManager.ACTION_ADD_DEVICE_ADMIN);
        intent.putExtra(DevicePolicyManager.EXTRA_ADD_EXPLANATION, "Additional text explaining why we need this permission");
        return null;
    }

    @Override
    public void dispose() {

    }
}
