package demoproject.caleb.umbc.android_bootcamp_project.Chapter_11;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Chapter11 extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] list = {};

        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list));
    }
/*
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent(Chapter11.this, Chapter1.class));
                break;
            case 1:
                startActivity(new Intent(Chapter11.this, Chapter2.class));
                break;
            case 2:
                startActivity(new Intent(Chapter11.this, Chapter3.class));
                break;
        }
    }
    */
}
