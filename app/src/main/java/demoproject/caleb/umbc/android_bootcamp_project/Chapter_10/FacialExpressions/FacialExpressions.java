package demoproject.caleb.umbc.android_bootcamp_project.Chapter_10.FacialExpressions;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import demoproject.caleb.umbc.android_bootcamp_project.R;

public class FacialExpressions extends Activity {
    AnimationDrawable actorAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch10_facial_expressions);
        ImageView imgFrame = (ImageView)findViewById(R.id.imgActors);
        imgFrame.setBackgroundResource(R.drawable.actor_animation);
        actorAnimation = (AnimationDrawable)imgFrame.getBackground();

        Button button1 = (Button) findViewById(R.id.ch10_btnStart2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actorAnimation.start();
            }
        });
    }

}
