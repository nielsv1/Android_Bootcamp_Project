package demoproject.caleb.umbc.android_bootcamp_project.Chapter_6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

import demoproject.caleb.umbc.android_bootcamp_project.R;

public class CelticSplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch6_celtic_splash);
        TimerTask task = new TimerTask( ) {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(CelticSplash.this, CelticMusic.class));
            }
        };
        Timer opening = new Timer( );
        opening.schedule(task,4000);
    }

}
