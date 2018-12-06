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

public class CarDealership extends Activity {
    Integer[] Cars = {R.drawable.car1, R.drawable.car2,
            R.drawable.car3, R.drawable.car4, R.drawable.car5,
            R.drawable.car6};

    ImageView pic;

    Double[] Prices = {11340.99,13450.99,10730.99,12620.98,6240.90,9704.99};
    String[] Models = {"Sedan","Sedan","Sedan","Sedan","Minivan","Hatchback"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch7_car_dealership);
        GridView grid = (GridView)findViewById(R.id.carView);
        final ImageView pic = (ImageView)findViewById(R.id.imgLarge3);
        grid.setAdapter(new CarDealership.ImageAdapter(this));
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener( ) {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext( ), String.format("Type: "+Models[position] + "\nPrice: $" + Prices[position]), Toast.LENGTH_SHORT).show( );
                pic.setImageResource(Cars[position]);
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
            return Cars.length;
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
            pic.setImageResource(Cars[position]);
            pic.setScaleType(ImageView.ScaleType.FIT_XY);
            pic.setLayoutParams(new GridView.LayoutParams(330,275));
            return pic;
        }
    }

}
