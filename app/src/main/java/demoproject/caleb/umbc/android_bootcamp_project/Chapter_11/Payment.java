package demoproject.caleb.umbc.android_bootcamp_project.Chapter_11;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

import demoproject.caleb.umbc.android_bootcamp_project.R;

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch11_activity_payment);

        ImageView image = (ImageView)findViewById(R.id.imgYears);
        TextView monthlyPayment = (TextView)findViewById(R.id.txtMonthlyPayment);

        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        int intYears = sharedPref.getInt ("key1", 0);
        int intLoan = sharedPref.getInt("key2", 0);
        float decInterest = sharedPref.getFloat("key3", 0);
        float decMonthlyPayment;

        decMonthlyPayment = (intLoan * (1 + (decInterest * intYears))) / (12 * intYears);
        DecimalFormat currency = new DecimalFormat("$###,###.##");
        monthlyPayment.setText("Monthly Payment " + currency.format(decMonthlyPayment));
        if (intYears == 3) {
            image.setImageResource(R.drawable.three);
        }else if (intYears == 4) {
            image.setImageResource(R.drawable.four);
        } else if (intYears == 5) {
            image.setImageResource(R.drawable.five);
        }
        else {
            monthlyPayment.setText("Enter 3, 4, or 5 years");
        }

    }
}
