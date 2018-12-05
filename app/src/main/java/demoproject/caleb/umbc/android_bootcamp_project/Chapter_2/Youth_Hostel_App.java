package demoproject.caleb.umbc.android_bootcamp_project.Chapter_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import demoproject.caleb.umbc.android_bootcamp_project.R;

public class Youth_Hostel_App extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch2_youth_hostel_activity);

        Button btnInformation = (Button) findViewById(R.id.ch2_hostel_buttonID);

        btnInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Youth_Hostel_App.this, Information_Page.class);
                startActivity(myIntent);
            }
        });
    }
}
