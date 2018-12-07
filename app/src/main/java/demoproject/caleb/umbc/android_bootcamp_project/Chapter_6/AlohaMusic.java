package demoproject.caleb.umbc.android_bootcamp_project.Chapter_6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

import demoproject.caleb.umbc.android_bootcamp_project.R;

public class AlohaMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch6_aloha_music);
        TimerTask task = new TimerTask( ) {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(AlohaMusic.this, AlohaMain.class));
            }
        };
        Timer opening = new Timer( );
        opening.schedule(task,5000);
    }
}
