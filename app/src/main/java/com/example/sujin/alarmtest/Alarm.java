package com.example.sujin.alarmtest;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.widget.Toast;

public class Alarm extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Alarm...", Toast.LENGTH_LONG).show();
        Vibrator vibrator = (Vibrator) context.getSystemService(context.VIBRATOR_SERVICE);
        vibrator.vibrate(3000);
    }
}
