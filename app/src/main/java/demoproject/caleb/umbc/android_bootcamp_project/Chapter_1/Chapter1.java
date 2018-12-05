package demoproject.caleb.umbc.android_bootcamp_project.Chapter_1;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class Chapter1 extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] list = {"Hello World App", "Famous Technology Quotes App", "Android Dessert Names App", "Large Tech Companies"};

        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent(Chapter1.this, HelloWorldApp.class));
                break;
            case 1:
                startActivity(new Intent(Chapter1.this, Tech_Quotes.class));
                break;
            case 2:
                startActivity(new Intent(Chapter1.this, Dessert_Names.class));
                break;
            case 3:
                startActivity(new Intent(Chapter1.this, Large_Tech_Companies.class));
                break;
        }
    }
}