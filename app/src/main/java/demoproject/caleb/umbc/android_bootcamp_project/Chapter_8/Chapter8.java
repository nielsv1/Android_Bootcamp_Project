package demoproject.caleb.umbc.android_bootcamp_project.Chapter_8;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class Chapter8 extends ListActivity {
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
                startActivity(new Intent(Chapter8.this, Chapter1.class));
                break;
            case 1:
                startActivity(new Intent(Chapter8.this, Chapter2.class));
                break;
            case 2:
                startActivity(new Intent(Chapter8.this, Chapter3.class));
                break;
        }
    }
    */
}
