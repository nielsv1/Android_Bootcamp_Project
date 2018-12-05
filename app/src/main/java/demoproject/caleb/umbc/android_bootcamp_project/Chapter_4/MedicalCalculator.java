package demoproject.caleb.umbc.android_bootcamp_project.Chapter_4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

import demoproject.caleb.umbc.android_bootcamp_project.R;

public class MedicalCalculator extends AppCompatActivity {
    double conversionRate = 2.2;
    double weightEntered = 0.0;
    double convertedWeight = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch4_medical_calculator);

        final EditText weight = (EditText) findViewById(R.id.ch4_medical_editText_Input);
        final RadioButton lbToKilo = (RadioButton) findViewById(R.id.ch4_medical_rb_Lbtokg);
        final RadioButton kiloToLB = (RadioButton) findViewById(R.id.ch4_medical_rb_Kgtolb);
        final TextView result = (TextView) findViewById(R.id.ch4_medical_textView_Result);
        Button convert = (Button) findViewById(R.id.ch4_medical_btn_Convert);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weightEntered = Double.parseDouble(weight.getText().toString());
                DecimalFormat tenth = new DecimalFormat("#.#");

                if(lbToKilo.isChecked()){
                  if(weightEntered <= 500){
                        convertedWeight = weightEntered / conversionRate;
                        result.setText(tenth.format(convertedWeight) + " kilograms");
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Pounds must be less than 500", Toast.LENGTH_LONG).show();
                    }
                }
                else{
                     if(weightEntered <= 225){
                         convertedWeight = weightEntered * conversionRate;
                         result.setText(tenth.format(convertedWeight) + " pounds");
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Kilos must be less than 225", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}
