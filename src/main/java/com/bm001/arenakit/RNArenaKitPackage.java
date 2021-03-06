package com.bm001.arenakit;

import com.bm001.arenakit.picker.view.PickerViewModule;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by heng on 16/9/5.
 */

public class RNArenaKitPackage implements ReactPackage {

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        return Arrays.<NativeModule>asList(new PickerViewModule(reactContext));
    }

    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return  Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return  Collections.emptyList();
    }
}
