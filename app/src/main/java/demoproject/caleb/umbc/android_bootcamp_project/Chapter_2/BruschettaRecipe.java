package demoproject.caleb.umbc.android_bootcamp_project.Chapter_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import demoproject.caleb.umbc.android_bootcamp_project.R;

public class BruschettaRecipe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch2_bruschetta_recipe_page);

        Button btnBack = (Button) findViewById(R.id.ch2_bruschetta_btnBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(BruschettaRecipe.this, BruschettaMain.class);
                startActivity(myIntent);
            }
        });
    }
}
