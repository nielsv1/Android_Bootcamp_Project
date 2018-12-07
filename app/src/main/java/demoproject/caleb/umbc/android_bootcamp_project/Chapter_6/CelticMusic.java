package demoproject.caleb.umbc.android_bootcamp_project.Chapter_6;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import demoproject.caleb.umbc.android_bootcamp_project.R;

public class CelticMusic extends AppCompatActivity {

    Button button1, button2;
    MediaPlayer mpJig, mpBagpipes;
    int playing;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch6_celtic_music);
        button1 = (Button) findViewById(R.id.ch6_celtic_btnJig2);
        button2 = (Button) findViewById(R.id.ch6_celtic_btnBagpipe2);

        button1.setOnClickListener(bJig);
        button2.setOnClickListener(bBagpipes);

        mpJig = new MediaPlayer();
        mpJig = MediaPlayer.create(this, R.raw.jig);
        mpBagpipes = new MediaPlayer();
        mpBagpipes = MediaPlayer.create(this, R.raw.bagpipes);
        playing = 0;

    }
    Button.OnClickListener bJig = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(playing) {
                case 0:
                    mpJig.start();
                    playing = 1;
                    button1.setText("Pause Jig Song");
                    button2.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpJig.pause();
                    playing = 0;
                    button1.setText("Play Jig Song");
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
                    mpBagpipes.start();
                    playing = 1;
                    button2.setText("Pause Bagpipes Song");
                    button1.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpBagpipes.pause();
                    playing = 0;
                    button2.setText("Play Bagpipes Song");
                    button1.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };
}
