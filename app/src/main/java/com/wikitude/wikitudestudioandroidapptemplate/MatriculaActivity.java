package com.wikitude.wikitudestudioandroidapptemplate;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.view.View;
import android.widget.ImageView;

public class MatriculaActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.matricula_activity);

        Drawable originalDrawable = getResources().getDrawable(R.drawable.ist);
        Bitmap originalBitmap = ((BitmapDrawable) originalDrawable).getBitmap();

        //creamos el drawable redondeado
        RoundedBitmapDrawable roundedDrawable =
                RoundedBitmapDrawableFactory.create(getResources(), originalBitmap);

        //asignamos el CornerRadius
        roundedDrawable.setCornerRadius(originalBitmap.getHeight());

        ImageView imageView = (ImageView) findViewById(R.id.is);

        imageView.setImageDrawable(roundedDrawable);

    }
    public void camara(View v){
        Intent intent = new Intent(v.getContext(), RuntimePermissionRequestActivity.class);
        startActivityForResult(intent,0);
    }
    public void camera(View v){
        Intent intent = new Intent(v.getContext(), RuntimePermissionRequestActivity.class);
        startActivityForResult(intent,0);
    }
}