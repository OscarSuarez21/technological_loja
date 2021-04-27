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
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

    Button home,equipo,oferta,matricula,contacto,servicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home =new Intent(MainActivity.this, HomeActivity.class);
                startActivity(home);
            }
        });

        equipo = (Button)findViewById(R.id.btnequipo);
        equipo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent equipo =new Intent(MainActivity.this, EquipoActivity.class);
                startActivity(equipo);
            }
        });
        oferta = (Button)findViewById(R.id.btnofertas);
        oferta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent oferta =new Intent(MainActivity.this, OfertasActivity.class);
                startActivity(oferta);
            }
        });
        matricula = (Button)findViewById(R.id.btnmatricula);
        matricula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent matricula =new Intent(MainActivity.this, MatriculaActivity.class);
                startActivity(matricula);
            }
        });
        contacto = (Button)findViewById(R.id.btncontacto);
        contacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contacto =new Intent(MainActivity.this, ContactoActivity.class);
                startActivity(contacto);
            }
        });
        servicio = (Button)findViewById(R.id.btnservicio);
        servicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent servicio =new Intent(MainActivity.this, ServicioActivity.class);
                startActivity(servicio);
            }
        });


        Drawable originalDrawable = getResources().getDrawable(R.drawable.ist);
        Bitmap originalBitmap = ((BitmapDrawable) originalDrawable).getBitmap();

        //creamos el drawable redondeado
        RoundedBitmapDrawable roundedDrawable =
                RoundedBitmapDrawableFactory.create(getResources(), originalBitmap);

        //asignamos el CornerRadius
        roundedDrawable.setCornerRadius(originalBitmap.getHeight());

        ImageView imageView = (ImageView) findViewById(R.id.istloja);

        imageView.setImageDrawable(roundedDrawable);

    }

    public void info(View v){
        Intent intent = new Intent(v.getContext(), InfoActivity.class);
        startActivityForResult(intent,0);
    }


}