package demoproject.caleb.umbc.android_bootcamp_project.Chapter_3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

import demoproject.caleb.umbc.android_bootcamp_project.R;

public class TriathlonRegistration extends AppCompatActivity {
    double costPerTicket = 725;
    int ticketNum;
    double totalCost;
    String groupChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch3_triathlon_registration);

        final EditText racers = (EditText) findViewById(R.id.ch3_triathlon_num);
        final Spinner group = (Spinner) findViewById(R.id.ch3_triathlon_spinner);
        final Button btnCost = (Button) findViewById(R.id.ch3_triathlon_btnSubmit);
        btnCost.setOnClickListener(new View.OnClickListener() {
            final TextView result = ((TextView) findViewById(R.id.ch3_triathlon_output));

            @Override
            public void onClick(View v) {
                ticketNum = Integer.parseInt(racers.getText().toString());
                totalCost = ticketNum * costPerTicket;
                DecimalFormat currency = new DecimalFormat("$###,###.##");
                groupChoice = group.getSelectedItem().toString();
                result.setText(groupChoice + " race team fee is " + currency.format(totalCost));
            }
        });
    }
}