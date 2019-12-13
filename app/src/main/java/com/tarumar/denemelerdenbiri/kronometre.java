package com.tarumar.denemelerdenbiri;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.muddzdev.styleabletoastlibrary.StyleableToast;

public class kronometre extends AppCompatActivity {
TextView chronometer;
Button btn1,btn2,btn3;
private boolean devamkontrolu=true;
private boolean pausekontrolu=false;
Handler handler;
int dakka,saniye,salise;
long tmillisec=0L,tstart=0L,tbuff=0L,tupdate=0L;
LinearLayout linearLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kronometre);
        handler = new Handler();

        btn1= findViewById(R.id.btnstart);
        btn2= findViewById(R.id.btnpause);
        btn3= findViewById(R.id.btnlaps);
        chronometer= findViewById(R.id.kronometre);
        linearLayout= findViewById(R.id.conteiner);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pausekontrolu=false;

                if ((dakka>0 || saniye>0 || salise>0 )&&devamkontrolu==false){



                    Toast.makeText(getApplicationContext(), "Kronometre zaten çalışıyor", Toast.LENGTH_LONG).show();

                }

                else{
                    devamkontrolu=false;
                tstart=SystemClock.uptimeMillis();
                handler.postDelayed(runnable,0);

                }

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                devamkontrolu=true;

                if (pausekontrolu==true){
                    Toast.makeText(getApplicationContext(),"Kronometre zaten durdu",Toast.LENGTH_SHORT).show();
                }

                else
                tbuff+=tmillisec;
                handler.removeCallbacks(runnable);
                pausekontrolu=true;

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater layoutInflater = (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View addview = layoutInflater.inflate(R.layout.row,null);
                TextView textView = addview.findViewById(R.id.txtContent);
                textView.setText(chronometer.getText());
                linearLayout.addView(addview);



            }
        });




    }

    public Runnable runnable = new Runnable() {
        @Override
        public void run() {
            tmillisec= SystemClock.uptimeMillis()-tstart;
            tupdate=tbuff+tmillisec;
            saniye=(int) (tupdate/1000);
            dakka=saniye/60;
            saniye=saniye%60;
            salise = (int) (tupdate%100);

            chronometer.setText(String.format("%02d",dakka)+":"+String.format("%02d",saniye)+":"+String.format("%02d",salise));
            handler.postDelayed(this,60);



        }
    };
}
