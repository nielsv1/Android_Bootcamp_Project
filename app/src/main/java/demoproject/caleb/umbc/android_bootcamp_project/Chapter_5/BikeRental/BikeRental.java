package demoproject.caleb.umbc.android_bootcamp_project.Chapter_5.BikeRental;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BikeRental extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[ ] bikeRental = {"Beach Bike Rental", "Mountain Bike Rental", "Bike Rental Website"};
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, bikeRental));
    }

    protected void onListItemClick(ListView l, View v, int position, long id){
        switch(position){
            case 0:
                startActivity(new Intent(BikeRental.this, Beach.class));
                break;
            case 1:
                startActivity(new Intent(BikeRental.this, Mountain.class));
                break;
            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("http://www.campusbikeshop.com")));
                break;
        }
    }
}
