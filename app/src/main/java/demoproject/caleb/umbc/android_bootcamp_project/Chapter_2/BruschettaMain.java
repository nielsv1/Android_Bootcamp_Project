package demoproject.caleb.umbc.android_bootcamp_project.Chapter_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import demoproject.caleb.umbc.android_bootcamp_project.R;

public class BruschettaMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch2_bruschetta_main_page);

        Button btnRecipe = (Button) findViewById(R.id.ch2_bruschetta_btnRecipe);

        btnRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(BruschettaMain.this, BruschettaRecipe.class);
                startActivity(myIntent);
            }
        });
    }
}
