package demoproject.caleb.umbc.android_bootcamp_project.Chapter_11;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

import demoproject.caleb.umbc.android_bootcamp_project.R;

public class BMIOutput extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch11_bmi_results);

        TextView titleText = (TextView)findViewById(R.id.ch11_bmi_out_titleText);
        ImageView image = (ImageView)findViewById(R.id.bmi2);
        image.setImageResource(R.drawable.bmi2);
        TextView output = (TextView)findViewById(R.id.ch11_bmi_out_bmiOutput);

        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        Long weight = sharedPref.getLong("weight", 0);
        Long height = sharedPref.getLong("height", 0);

        long result = (long) ((weight * 703) / (Math.pow(height, 2)));
        DecimalFormat bmi_format = new DecimalFormat("###.#");
        result = Long.parseLong(bmi_format.format(result));
        output.setText("Your body mass index is " + bmi_format.format(result));



    }
}
