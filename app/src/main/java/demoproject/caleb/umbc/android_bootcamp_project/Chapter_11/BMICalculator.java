package demoproject.caleb.umbc.android_bootcamp_project.Chapter_11;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import demoproject.caleb.umbc.android_bootcamp_project.R;

public class BMICalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch11_activity_bmicalculator);
        final EditText weight_select = findViewById(R.id.ch11_bmi_weightInput);
        final EditText height_select = findViewById(R.id.ch11_bmi_heightInput);
        Button button = findViewById(R.id.ch11_bmi_btnCompute);
        final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Long weight = Long.parseLong(weight_select.getText().toString());
                Long height = Long.parseLong(height_select.getText().toString());
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putLong("weight", weight);
                editor.putLong("height", height);
                editor.commit();
                startActivity(new Intent(BMICalculator.this, BMIOutput.class));


            }
        });


    }
}