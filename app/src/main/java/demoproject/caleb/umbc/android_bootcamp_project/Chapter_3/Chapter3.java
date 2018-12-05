package demoproject.caleb.umbc.android_bootcamp_project.Chapter_3;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class Chapter3 extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] list = {"Concert Tickets", "Catalina Island Boat Express", "Triathlon Registration "};

        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent(Chapter3.this, ConcertTicket.class));
                break;
            case 1:
                startActivity(new Intent(Chapter3.this, BoatExpress.class));
                break;
            case 2:
                startActivity(new Intent(Chapter3.this, TriathlonRegistration.class));
                break;
        }
    }

}
