package demoproject.caleb.umbc.android_bootcamp_project.Chapter_10.NorthernLightsAnimation;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import demoproject.caleb.umbc.android_bootcamp_project.R;

public class NorthernLightsAnimation extends Activity {
    AnimationDrawable lightsAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch10_northern_lights_animation);
        ImageView imgFrame = (ImageView)findViewById(R.id.imgLights);
        imgFrame.setBackgroundResource(R.drawable.northernlights_animation);
        lightsAnimation = (AnimationDrawable)imgFrame.getBackground();

        Button button1 = (Button) findViewById(R.id.ch10_btnStart);
        Button button2 = (Button) findViewById(R.id.ch10_btnStop);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lightsAnimation.start();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lightsAnimation.stop();
                startActivity(new Intent(NorthernLightsAnimation.this, Tween.class));
            }
        });
    }

}
