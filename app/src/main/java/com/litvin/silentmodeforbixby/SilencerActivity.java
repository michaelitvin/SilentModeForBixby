package com.litvin.silentmodeforbixby;

import android.content.Context;
import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SilencerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            AudioManager am = (AudioManager) getBaseContext().getSystemService(Context.AUDIO_SERVICE);
            if (am.getRingerMode() == AudioManager.RINGER_MODE_NORMAL) {
                am.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
                Toast.makeText(this, "Vibrate mode", Toast.LENGTH_SHORT).show();
            } else {
                am.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
                Toast.makeText(this, "Ringer sound enabled", Toast.LENGTH_SHORT).show();
            }
        } catch (Exception ex) {
            Toast.makeText(this, "Could not set ringer: " + ex.getMessage(), Toast.LENGTH_LONG).show();
        }

        finish();
    }
}
