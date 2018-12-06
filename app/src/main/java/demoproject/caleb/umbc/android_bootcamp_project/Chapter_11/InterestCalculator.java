package demoproject.caleb.umbc.android_bootcamp_project.Chapter_11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import demoproject.caleb.umbc.android_bootcamp_project.R;

public class InterestCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch11_interest_calc);


        final EditText montly_payment = findViewById(R.id.ch11_paymentInput);
        final EditText num_years = findViewById(R.id.ch11_bmi_heightInput);
        final EditText principalLoan = findViewById(R.id.ch11_bmi_heightInput);


    }
}
