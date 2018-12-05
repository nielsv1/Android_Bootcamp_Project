package demoproject.caleb.umbc.android_bootcamp_project.Chapter_4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

import demoproject.caleb.umbc.android_bootcamp_project.R;

public class CarWash extends AppCompatActivity {

    double quantityInt = 0.0;
    double total = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch4_car_wash);

        final TextView quantity = (TextView) findViewById(R.id.ch4_carwash_editText);
        final RadioButton rb1 = (RadioButton) findViewById(R.id.ch4_carwash_RB1);
        final RadioButton rb2 = (RadioButton) findViewById(R.id.ch4_carwash_RB2);
        final TextView cost = (TextView) findViewById(R.id.ch4_carwash_totalCost);
        Button calculate = (Button) findViewById(R.id.ch4_carwash_calculateBtn);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    quantityInt = Double.parseDouble(quantity.getText().toString());
                }
                catch(NumberFormatException e){
                    Toast.makeText(getApplicationContext(), "Number Format Exception Error", Toast.LENGTH_LONG).show();
                }
                DecimalFormat currency = new DecimalFormat("0.00");

                if(rb1.isChecked()){
                    if(quantityInt < 12){
                        Toast.makeText(getApplicationContext(), "You must purchase more than 12 for the discount", Toast.LENGTH_LONG).show();
                        total = quantityInt * 10.99;
                        cost.setText("$" + currency.format(total));
                    }
                    else if (quantityInt >= 12){
                        total = quantityInt * 8.99;
                        cost.setText("$" + currency.format(total));
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Please enter the Number of Washes", Toast.LENGTH_LONG).show();
                    }
                }
                else if(rb2.isChecked()){
                    if(quantityInt <= 50){
                        total = quantityInt * 15.99;
                        cost.setText("$" + currency.format(total));
                    }
                    else if (quantityInt >= 12){
                        total = quantityInt * 12.99;
                        cost.setText("$" + currency.format(total));
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Please enter the Number of Washes", Toast.LENGTH_LONG).show();
                    }
                }
                else {
                    Toast.makeText(getApplicationContext(), "Must select one of the RadioButtons", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
