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

public class PhotoPrint extends AppCompatActivity {
    Double total = 0.0;
    Double quantityInt = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch4_photo_print);

        final TextView quantity = (TextView) findViewById(R.id.ch4_photoprint_editText);
        final RadioButton rb1 = (RadioButton) findViewById(R.id.ch4_photoprint_radioButton1);
        final RadioButton rb2 = (RadioButton) findViewById(R.id.ch4_photoprint_radioButton2);
        final RadioButton rb3 = (RadioButton) findViewById(R.id.ch4_photoprint_radioButton3);
        final TextView cost = (TextView) findViewById(R.id.ch4_photoprint_costTextView);
        Button order = (Button) findViewById(R.id.ch4_photoprint_submitButton);

        order.setOnClickListener(new View.OnClickListener() {
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
                    if(quantityInt <= 50){
                        total = quantityInt * 0.19;
                        cost.setText("$" + currency.format(total));
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Quantity must be less than or equal to 50", Toast.LENGTH_LONG).show();
                    }
                }
                else if(rb2.isChecked()){
                    if(quantityInt <= 50){
                        total = quantityInt * 0.49;
                        cost.setText("$" + currency.format(total));
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Quantity must be less than or equal to 50", Toast.LENGTH_LONG).show();
                    }
                }
                else if(rb3.isChecked()){
                    if(quantityInt <= 50){
                        total = quantityInt * 0.79;
                        cost.setText("$" + currency.format(total));
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Quantity must be less than or equal to 50", Toast.LENGTH_LONG).show();
                    }
                }
                else {
                    Toast.makeText(getApplicationContext(), "Must select one of the RadioButtons", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
