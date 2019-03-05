package com.a.arapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wikitude.NativeStartupConfiguration;
import com.wikitude.WikitudeSDK;
import com.wikitude.common.camera.CameraSettings;
import com.wikitude.rendering.ExternalRendering;
import com.wikitude.tracker.ObjectTarget;
import com.wikitude.tracker.ObjectTracker;
import com.wikitude.tracker.ObjectTrackerListener;

import java.lang.annotation.Native;

public class MainActivity extends AppCompatActivity, Activity implements ObjectTrackerListener, ExternalRendering {

    private static final String TAG = "SimpleObjectTracking";
    private WikitudeSDK wikitudeSDK;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        wikitudeSDK = new WikitudeSDK(this);
        NativeStartupConfiguration nativeStartupConfiguration = new NativeStartupConfiguration();
        nativeStartupConfiguration.setLicenseKey(WikitudeSDKConstants.WIKITUDE_SDK_KEY);
        nativeStartupConfiguration.setCameraPosition(CameraSettings.CameraPosition.BACK);
        nativeStartupConfiguration.setCameraResolution(CameraSettings.CameraResolution.AUTO);

        wikitudeSDK.onCreate(getApplicationContext(), this, nativeStartupConfiguration);

        //TODO: Create TargetCollectionResource
    }

    @Override
    public void onObjectRecognized(ObjectTracker objectTracker, ObjectTarget objectTarget) {
        //TODO:
    }

    @Override
    public void onObjectLost(ObjectTracker objectTracker, ObjectTarget objectTarget) {

    }
}
