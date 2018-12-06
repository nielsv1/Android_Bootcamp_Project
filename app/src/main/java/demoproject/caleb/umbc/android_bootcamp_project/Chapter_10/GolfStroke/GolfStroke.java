package demoproject.caleb.umbc.android_bootcamp_project.Chapter_10.GolfStroke;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import demoproject.caleb.umbc.android_bootcamp_project.Chapter_10.NorthernLightsAnimation.NorthernLightsAnimation;
import demoproject.caleb.umbc.android_bootcamp_project.Chapter_10.NorthernLightsAnimation.Tween;
import demoproject.caleb.umbc.android_bootcamp_project.R;

public class GolfStroke extends Activity {
    AnimationDrawable golfAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch10_golf_stroke);
        ImageView imgFrame = (ImageView)findViewById(R.id.imgGolfer);
        imgFrame.setBackgroundResource(R.drawable.golfer_animation);
        golfAnimation = (AnimationDrawable)imgFrame.getBackground();

        Button button1 = (Button) findViewById(R.id.ch10_btnStart3);
        Button button2 = (Button) findViewById(R.id.ch10_btnStart4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                golfAnimation.start();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                golfAnimation.stop();
                startActivity(new Intent(GolfStroke.this, GolfTween.class));
            }
        });
    }

}
