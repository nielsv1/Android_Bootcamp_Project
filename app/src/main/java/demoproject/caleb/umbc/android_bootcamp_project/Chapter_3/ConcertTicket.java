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

public class ConcertTicket extends AppCompatActivity {
    double costPerTicket = 79.99;
    int ticketNum;
    double totalCost;
    String groupChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch3_concert_ticket);

        final EditText tickets = (EditText)findViewById(R.id.ch_3_concert_editText);
        final Spinner group = (Spinner)findViewById(R.id.ch_3_concert_group);
        final Button btnCost = (Button)findViewById(R.id.ch_3_concert_btnCost);
        btnCost.setOnClickListener(new View.OnClickListener() {
            final TextView result = ((TextView)findViewById(R.id.ch_3_concert_results));
            @Override
            public void onClick(View v) {
                ticketNum = Integer.parseInt(tickets.getText().toString());
                totalCost = ticketNum * costPerTicket;
                DecimalFormat currency = new DecimalFormat("$###,###.##");
                groupChoice = group.getSelectedItem().toString();
                result.setText("Cost for " + groupChoice + " is " + currency.format(totalCost));
            }
        });
    }
}
