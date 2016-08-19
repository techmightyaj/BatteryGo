package com.techmighty.batterygo.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.techmighty.batterygo.BuildConfig;
import com.techmighty.batterygo.util.AlarmUtil;
import com.techmighty.batterygo.util.SettingUtil;

public class BootCompletedReceiver extends BroadcastReceiver {
    private static final String TAG = "BootCompletedReceiver";

    public BootCompletedReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if (SettingUtil.isEnable(context)){
            if (BuildConfig.DEBUG){
                Log.d(TAG, "set all alarm.");
            }
            AlarmUtil.setSleepModeAlarm(context);
        }
    }
}
