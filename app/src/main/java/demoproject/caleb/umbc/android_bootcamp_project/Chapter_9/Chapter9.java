package demoproject.caleb.umbc.android_bootcamp_project.Chapter_9;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import demoproject.caleb.umbc.android_bootcamp_project.Chapter_1.Chapter1;
import demoproject.caleb.umbc.android_bootcamp_project.Chapter_2.Chapter2;
import demoproject.caleb.umbc.android_bootcamp_project.Chapter_3.Chapter3;

public class Chapter9 extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] list = {};

        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent(Chapter9.this, Chapter1.class));
                break;
            case 1:
                startActivity(new Intent(Chapter9.this, Chapter2.class));
                break;
            case 2:
                startActivity(new Intent(Chapter9.this, Chapter3.class));
                break;
        }
    }
}
