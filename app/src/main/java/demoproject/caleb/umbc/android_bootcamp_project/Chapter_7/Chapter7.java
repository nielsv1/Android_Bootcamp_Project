package demoproject.caleb.umbc.android_bootcamp_project.Chapter_7;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Chapter7 extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] list = {"Endangered Species", "Car Dealership", "Seven Wonders"};

        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent(Chapter7.this, EndangeredSpecies.class));
                break;
            case 1:
                startActivity(new Intent(Chapter7.this, CarDealership.class));
                break;
            case 2:
                startActivity(new Intent(Chapter7.this, SevenWonders.class));
                break;
        }
    }
}
