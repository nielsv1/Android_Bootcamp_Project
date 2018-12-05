package demoproject.caleb.umbc.android_bootcamp_project;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import demoproject.caleb.umbc.android_bootcamp_project.Chapter_1.Chapter1;
import demoproject.caleb.umbc.android_bootcamp_project.Chapter_10.Chapter10;
import demoproject.caleb.umbc.android_bootcamp_project.Chapter_11.Chapter11;
import demoproject.caleb.umbc.android_bootcamp_project.Chapter_2.Chapter2;
import demoproject.caleb.umbc.android_bootcamp_project.Chapter_3.Chapter3;
import demoproject.caleb.umbc.android_bootcamp_project.Chapter_4.Chapter4;
import demoproject.caleb.umbc.android_bootcamp_project.Chapter_5.Chapter5;
import demoproject.caleb.umbc.android_bootcamp_project.Chapter_6.Chapter6;
import demoproject.caleb.umbc.android_bootcamp_project.Chapter_7.Chapter7;
import demoproject.caleb.umbc.android_bootcamp_project.Chapter_8.Chapter8;
import demoproject.caleb.umbc.android_bootcamp_project.Chapter_9.Chapter9;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[ ] attraction = {"Chapter 1: Voila! Meet Android", "Chapter 2: Simplify! The Android User Interface", "Chapter 3: Engage! Android User Input, Variables, and Operations", "Chapter 4: Explore! Icons and Decision-Making Controls", "Chapter 5: Investigate! Android Lists, Arrays, and Web Browsers", "Chapter 6: Jam! Implementing Audio in Android Apps", "Chapter 7: Reveal! Displaying Pictures in a GridView", "Chapter 8: Design! Using a DataPicker on a Tablet", "Chapter 9: Customize! Navigating with a Master/Detail Flow Activity on a Tablet", "Chapter 10: Move! Creating Animation", "Chapter 11: Discover! Persistent Data"};

        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.bootcamp, attraction));
    }
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent(MainActivity.this, Chapter1.class));
                break;
            case 1:
                startActivity(new Intent(MainActivity.this, Chapter2.class));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, Chapter3.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, Chapter4.class));
                break;
            case 4:
                startActivity(new Intent(MainActivity.this, Chapter5.class));
                break;
            case 5:
                startActivity(new Intent(MainActivity.this, Chapter6.class));
                break;
            case 6:
                startActivity(new Intent(MainActivity.this, Chapter7.class));
                break;
            case 7:
                startActivity(new Intent(MainActivity.this, Chapter8.class));
                break;
            case 8:
                startActivity(new Intent(MainActivity.this, Chapter9.class));
                break;
            case 9:
                startActivity(new Intent(MainActivity.this, Chapter10.class));
                break;
            case 10:
                startActivity(new Intent(MainActivity.this, Chapter11.class));
                break;
        }
    }
}
