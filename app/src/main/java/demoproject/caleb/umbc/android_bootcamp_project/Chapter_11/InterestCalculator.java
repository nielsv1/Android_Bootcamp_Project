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

public class InterestCalculator extends AppCompatActivity {

    int intMonths;
    float floatPrincipal;
    float floatPayment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch11_interest_calc);


        final EditText montly_payment = findViewById(R.id.ch11_paymentInput);
        final EditText num_years = findViewById(R.id.ch11_yearsInput);
        final EditText principalLoan = findViewById(R.id.ch11_principalInput);

        Button button = (Button)findViewById(R.id.ch11_int_compute);
        final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intMonths = Integer.parseInt(num_years.getText().toString());
                floatPrincipal = Float.parseFloat(montly_payment.getText().toString());
                floatPayment = Float.parseFloat(principalLoan.getText().toString());
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putInt("key1", intMonths);
                editor.putFloat("key2", floatPrincipal);
                editor.putFloat("key3", floatPayment);
                editor.commit();
                startActivity(new Intent(InterestCalculator.this, InterestPayment.class));


            }
        });




    }
}
