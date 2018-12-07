package demoproject.caleb.umbc.android_bootcamp_project.Chapter_2;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Chapter2 extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] list = {"Chapter 2: Simplify! The Android User Interface", "Bruschetta Recipe", "Segway Rental", "Youth Hostel"};

        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0:
                break;
            case 1:
                startActivity(new Intent(Chapter2.this, BruschettaMain.class));
                break;
            case 2:
                startActivity(new Intent(Chapter2.this, SegwayMain.class));
                break;
            case 3:
                startActivity(new Intent(Chapter2.this, Youth_Hostel_App.class));
                break;
        }
    }

}
