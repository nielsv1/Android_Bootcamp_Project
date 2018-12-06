package demoproject.caleb.umbc.android_bootcamp_project.Chapter_6;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import demoproject.caleb.umbc.android_bootcamp_project.R;

public class FarmSounds extends AppCompatActivity {

    Button button1, button2;
    MediaPlayer mpCow, mpPig;
    int playing;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch6_farm_sounds);
        button1 = (Button) findViewById(R.id.ch6_farm_btnCow);
        button2 = (Button) findViewById(R.id.ch6_farm_btnPig);

        button1.setOnClickListener(bJig);
        button2.setOnClickListener(bBagpipes);

        mpCow = new MediaPlayer();
        mpCow = MediaPlayer.create(this, R.raw.cows);
        mpPig = new MediaPlayer();
        mpPig = MediaPlayer.create(this, R.raw.pigs);
        playing = 0;

    }
    Button.OnClickListener bJig = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(playing) {
                case 0:
                    mpCow.start();
                    playing = 1;
                    button1.setText("Pause Cow Sound");
                    button2.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpCow.pause();
                    playing = 0;
                    button1.setText("Play Cow Sound");
                    button2.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };
    Button.OnClickListener bBagpipes = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(playing) {
                case 0:
                    mpPig.start();
                    playing = 1;
                    button2.setText("Pause Pig Sound");
                    button1.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpPig.pause();
                    playing = 0;
                    button2.setText("Play Cow Sound");
                    button1.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };
}
