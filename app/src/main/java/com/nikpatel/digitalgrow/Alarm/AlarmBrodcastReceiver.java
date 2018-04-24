package com.nikpatel.digitalgrow.Alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.util.Log;
import android.widget.Toast;

import com.nikpatel.digitalgrow.R;

/**
 * Created by nikpatel on 22/09/17.
 */

public class AlarmBrodcastReceiver extends BroadcastReceiver{
    private static final String TAG = "AlarmBrodcastReceiver";
    MediaPlayer mp;
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e(TAG, "onReceive: " );
        mp = MediaPlayer.create(context, R.raw.ringtone);
        mp.start();

        Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(5000);
        Toast.makeText(context, "Alarm.........", Toast.LENGTH_SHORT).show();
    }

}
