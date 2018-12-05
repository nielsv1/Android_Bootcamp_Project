package demoproject.caleb.umbc.android_bootcamp_project.Chapter_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import demoproject.caleb.umbc.android_bootcamp_project.R;

public class HelloWorldApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch1_hello_world_app);
    }
}
