package com.tarumar.denemelerdenbiri;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class GridView extends AppCompatActivity {

    ImageButton resim1;
    ImageButton resim2;
    ImageButton resim3;
    ImageButton resim4;
    ImageButton resim5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        resim1= findViewById(R.id.hesapla);

        resim1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        resim2 = findViewById(R.id.krono);

        resim2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getBaseContext(),kronometre.class);
                startActivity(intent2);
            }
        });

        resim3=findViewById(R.id.ruler);

        resim3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(getBaseContext(),metre.class);
                startActivity(intent3);
            }
        });



        resim4=findViewById(R.id.deneme);

        resim4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4= new Intent(getBaseContext(),doviz.class);
                startActivity(intent4);
            }
        });

        resim5=findViewById(R.id.resim5);

        resim5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent paylasIntent= new Intent(Intent.ACTION_SEND);
                paylasIntent.setType("text/plain");
                String paylasbaslık="LinkedIn profilim";
                String paylas="https://www.linkedin.com/in/batuhan-y%C4%B1lmaz-51148b176/";
                paylasIntent.putExtra(Intent.EXTRA_SUBJECT,paylasbaslık);
                paylasIntent.putExtra(Intent.EXTRA_TEXT,paylas);
                startActivity(Intent.createChooser(paylasIntent,"Paylaşılacak Alan"));

            }
        });


    }
}

