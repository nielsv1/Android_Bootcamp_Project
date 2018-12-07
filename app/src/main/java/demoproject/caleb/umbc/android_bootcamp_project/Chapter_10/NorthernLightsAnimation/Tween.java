package demoproject.caleb.umbc.android_bootcamp_project.Chapter_10.NorthernLightsAnimation;

import android.os.Bundle;
import android.app.Activity;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import demoproject.caleb.umbc.android_bootcamp_project.R;

public class Tween extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch10_northern_lights_animation_tween);
        ImageView imgRotate = (ImageView) findViewById(R.id.imgTween);
        imgRotate.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotation));
    }

}
