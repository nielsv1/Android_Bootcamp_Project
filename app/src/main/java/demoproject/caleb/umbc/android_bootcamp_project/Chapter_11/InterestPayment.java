package demoproject.caleb.umbc.android_bootcamp_project.Chapter_11;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

import demoproject.caleb.umbc.android_bootcamp_project.R;

public class InterestPayment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch11_interest_payment);

        ImageView image = (ImageView)findViewById(R.id.imgYears);
        TextView monthlyPayment = (TextView)findViewById(R.id.totalInterestPaid);

        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        int intMonths = sharedPref.getInt ("key1", 0);
        float floatPrincipal = sharedPref.getFloat("key2", 0);
        float floatPayment = sharedPref.getFloat("key3", 0);
        float totalInterest;

        totalInterest = (floatPayment * intMonths) - floatPrincipal;
        DecimalFormat currency = new DecimalFormat("$###,###,###.##");
        monthlyPayment.setText("Total interest paid " + currency.format(totalInterest));
        if (intMonths == 10) {
            image.setImageResource(R.drawable.ten);
        }else if (intMonths == 20) {
            image.setImageResource(R.drawable.twenty);
        } else if (intMonths == 30) {
            image.setImageResource(R.drawable.thirty);
        }
        else {
            monthlyPayment.setText("Enter 10, 20, or 30 years");
        }

    }
}
