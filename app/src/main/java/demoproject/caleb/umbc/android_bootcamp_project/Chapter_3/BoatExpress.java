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

public class BoatExpress extends AppCompatActivity {
    double costPerTicket = 34;
    int ticketNum;
    double totalCost;
    String groupChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch3_boat_express);

        final EditText tickets = (EditText)findViewById(R.id. ch3_boat_num);
        final Spinner group = (Spinner)findViewById(R.id.ch_3_boat_spinner);
        final Button btnCost = (Button)findViewById(R.id.ch3_boat_btnSubmit);
        btnCost.setOnClickListener(new View.OnClickListener() {
            final TextView result = ((TextView)findViewById(R.id.ch3_boat_output));
            @Override
            public void onClick(View v) {
                ticketNum = Integer.parseInt(tickets.getText().toString());
                totalCost = ticketNum * costPerTicket;
                DecimalFormat currency = new DecimalFormat("$###,###.##");
                groupChoice = group.getSelectedItem().toString();
                result.setText("One Way Trip " + groupChoice + " - " + currency.format(totalCost));
            }
        });
    }
}