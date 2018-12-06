package demoproject.caleb.umbc.android_bootcamp_project.Chapter_5.CityGuide;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import demoproject.caleb.umbc.android_bootcamp_project.R;

public class CityGuide extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[ ] attraction = {"Art Institute of Chicago", "Magnificent Mile", "Willis Tower", "Navy Pier", "Water Tower"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.ch5_city_guide, R.id.travel, attraction));
    }
    protected void onListItemClick(ListView l, View v, int position, long id){
        switch(position){
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("http://artic.edu ")));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("http://themagnificentmile.com" )));
                break;
            case 2:
                startActivity(new Intent(CityGuide.this, Willis.class));
                break;
            case 3:
                startActivity(new Intent(CityGuide.this, Pier.class));
                break;
            case 4:
                startActivity(new Intent(CityGuide.this, Water.class));
                break;
        }
    }
}
