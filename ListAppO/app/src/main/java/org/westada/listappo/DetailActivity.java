package org.westada.listappo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.widget.ImageView;

import org.westada.listappo.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent in = getIntent();
        int index = in.getIntExtra("org.westada.ITEM_INDEX", -1);

        if(index > -1){
            int pic = getImg(index);
            ImageView img = findViewById(R.id.imageView3);
            scaleImg(img, pic);
        }
    }
    private int getImg(int Index){

        switch(Index){
            case 0: return R.drawable.peaches;
            case 1: return R.drawable.tomatoes;
            case 2: return R.drawable.squash;
        }
        return Index;
    }
    private void scaleImg(ImageView img, int pic){
        Display screen = getWindowManager().getDefaultDisplay();
        BitmapFactory.Options options = new BitmapFactory.Options();

        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), pic, options);

        int imgWidth = options.outWidth;
        int screenWidth = screen.getWidth();

        if(imgWidth >  screenWidth){
            int ratio = Math.round( (float)imgWidth / (float)screenWidth);
            options.inSampleSize = ratio;
        }
        options.inJustDecodeBounds = false;
        Bitmap scaleImg = BitmapFactory.decodeResource(getResources(), pic, options);
        img.setImageBitmap(scaleImg);
    }
}