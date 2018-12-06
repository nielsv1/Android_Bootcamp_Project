package demoproject.caleb.umbc.android_bootcamp_project.Chapter_7;

import android.content.Context;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import demoproject.caleb.umbc.android_bootcamp_project.R;

public class SevenWonders extends Activity {
    Integer[] Wonders = {R.drawable.wonder1, R.drawable.wonder2,
            R.drawable.wonder3, R.drawable.wonder4, R.drawable.wonder5,
            R.drawable.wonder6, R.drawable.wonder7};

    ImageView pic;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch7_seven_wonders);
        GridView grid = (GridView)findViewById(R.id.wonderView);
        final ImageView pic = (ImageView)findViewById(R.id.imgLarge2);
        grid.setAdapter(new SevenWonders.ImageAdapter(this));
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener( ) {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext( ), "Selected Wonder " + (position + 1), Toast.LENGTH_SHORT).show( );
                pic.setImageResource(Wonders[position]);
            }
        });
    }
    public class ImageAdapter extends BaseAdapter {
        private Context context;
        public ImageAdapter (Context c) {
            context = c;
        }

        @Override
        public int getCount() {
            return Wonders.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            pic = new ImageView(context);
            pic.setImageResource(Wonders[position]);
            pic.setScaleType(ImageView.ScaleType.FIT_XY);
            pic.setLayoutParams(new GridView.LayoutParams(330,300));
            return pic;
        }
    }

}
