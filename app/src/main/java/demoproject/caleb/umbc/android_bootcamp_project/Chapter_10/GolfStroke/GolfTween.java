package demoproject.caleb.umbc.android_bootcamp_project.Chapter_10.GolfStroke;

import android.os.Bundle;
import android.app.Activity;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import demoproject.caleb.umbc.android_bootcamp_project.R;

public class GolfTween extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch10_golf_stroke_tween);
        ImageView imgRotate = (ImageView) findViewById(R.id.imgGolfTween);
        imgRotate.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotation2));
    }

}
