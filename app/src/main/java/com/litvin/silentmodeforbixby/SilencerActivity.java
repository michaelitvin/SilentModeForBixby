package com.litvin.silentmodeforbixby;

import android.content.Context;
import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SilencerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AudioManager am = (AudioManager) getBaseContext().getSystemService(Context.AUDIO_SERVICE);
        if (am.getRingerMode() == AudioManager.RINGER_MODE_NORMAL) {
            am.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
        } else {
            am.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
        }

        finish();
    }
}
