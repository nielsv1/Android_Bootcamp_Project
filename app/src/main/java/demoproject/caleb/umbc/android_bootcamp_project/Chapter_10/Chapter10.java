package demoproject.caleb.umbc.android_bootcamp_project.Chapter_10;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import demoproject.caleb.umbc.android_bootcamp_project.Chapter_10.FacialExpressions.FacialExpressions;
import demoproject.caleb.umbc.android_bootcamp_project.Chapter_10.GolfStroke.GolfStroke;
import demoproject.caleb.umbc.android_bootcamp_project.Chapter_10.NorthernLightsAnimation.NorthernLightsAnimation;

public class Chapter10 extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] list = {"Northern Lights Animation", "Facial Expressions", "Golf Stroke"};

        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent(Chapter10.this, NorthernLightsAnimation.class));
                break;
            case 1:
                startActivity(new Intent(Chapter10.this, FacialExpressions.class));
                break;
            case 2:
                startActivity(new Intent(Chapter10.this, GolfStroke.class));
                break;
        }
    }

}