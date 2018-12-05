package demoproject.caleb.umbc.android_bootcamp_project.Chapter_5;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import demoproject.caleb.umbc.android_bootcamp_project.Chapter_5.BikeRental.BikeRental;
import demoproject.caleb.umbc.android_bootcamp_project.Chapter_5.ChocolateCafe.ChocolateCafe;
import demoproject.caleb.umbc.android_bootcamp_project.Chapter_5.CityGuide.CityGuide;

public class Chapter5 extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] list = {"City Guide", "Bike Rental", "Chocolate Cake"};

        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent(Chapter5.this, CityGuide.class));
                break;
            case 1:
                startActivity(new Intent(Chapter5.this, BikeRental.class));
                break;
            case 2:
                startActivity(new Intent(Chapter5.this, ChocolateCafe.class));
                break;
        }
    }

}
