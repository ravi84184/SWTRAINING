package com.nikpatel.digitalgrow.ServiceDemo;


import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

import com.nikpatel.digitalgrow.R;

/**
 * Created by nikpatel on 17/09/17.
 */

public class ServiceDemo extends Service {


    private static final String TAG = "ServiceDemo";
    MediaPlayer mediaPlayer;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        Toast.makeText(this, "Srevice Create", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "onCreate:  starttttttt " );
        mediaPlayer = MediaPlayer.create(this, R.raw.music_demo);
        mediaPlayer.setLooping(false);


    }

    @Override
    public void onStart(Intent intent, int startId) {
        Toast.makeText(this, "Srevice Start", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "onStart: start" );
        mediaPlayer.start();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mediaPlayer.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, "Srevice Stop", Toast.LENGTH_SHORT).show();

        Log.e(TAG, "onDestroy: starttttttt" );
        mediaPlayer.stop();
    }
}
