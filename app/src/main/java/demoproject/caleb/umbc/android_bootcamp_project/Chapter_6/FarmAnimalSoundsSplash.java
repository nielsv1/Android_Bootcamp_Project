package demoproject.caleb.umbc.android_bootcamp_project.Chapter_6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

import demoproject.caleb.umbc.android_bootcamp_project.R;

public class FarmAnimalSoundsSplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch6_farm_animal_sounds_splash);
        TimerTask task = new TimerTask( ) {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(FarmAnimalSoundsSplash.this, FarmSounds.class));
            }
        };
        Timer opening = new Timer( );
        opening.schedule(task,6000);
    }
}
