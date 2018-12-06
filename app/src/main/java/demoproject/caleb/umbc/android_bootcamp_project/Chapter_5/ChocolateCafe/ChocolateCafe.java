package demoproject.caleb.umbc.android_bootcamp_project.Chapter_5.ChocolateCafe;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ChocolateCafe extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[ ] attraction = {"Chocolate Mousse", "Chocolate Cake", "Chocolate Macaron", "Chocolate Dessert Website"};
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, attraction));
    }
    protected void onListItemClick(ListView l, View v, int position, long id){
        switch(position){
            case 0:
                startActivity(new Intent(ChocolateCafe.this, Mousse.class));
                break;
            case 1:
                startActivity(new Intent(ChocolateCafe.this, Cake.class));
                break;
            case 2:
                startActivity(new Intent(ChocolateCafe.this, Macaron.class));
                break;
            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("http://www.chocolatharlem.com")));
                break;
        }
    }
}
