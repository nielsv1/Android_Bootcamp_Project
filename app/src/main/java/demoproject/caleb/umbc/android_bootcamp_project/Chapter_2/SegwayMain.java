package demoproject.caleb.umbc.android_bootcamp_project.Chapter_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import demoproject.caleb.umbc.android_bootcamp_project.R;

public class SegwayMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch2_segway_main);

        Button btnSegway = (Button) findViewById(R.id.ch2_segway_buttonID);

        btnSegway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(SegwayMain.this, SegwayOther.class);
                startActivity(myIntent);
            }
        });
    }
}
