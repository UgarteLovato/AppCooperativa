package app.tecsup.com.appcooperativa.DashboardActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import app.tecsup.com.appcooperativa.R;

public class Activity_productos extends AppCompatActivity {

    private int[] photos = {
            R.drawable.vinos,
            R.drawable.paneton,
            R.drawable.union,
            R.drawable.paneton2,
    };
    private int index = 0;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);

        imageView = (ImageView)findViewById(R.id.imageview);
    }

    public void nextImage(View view) {
        if(++index > photos.length-1)
            index = 0;
        imageView.setImageResource(photos[index]);
    }
    public void previousImage(View view) {
        if(--index < 0)
            index = photos.length-1;
        imageView.setImageResource(photos[index]);
    }

}



