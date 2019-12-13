package com.tarumar.denemelerdenbiri;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    ImageView splashResim;
    TextView splashText;
    TextView splashText2;
    Animation kaydırma;
    Animation kaydırma2;
    private static int gecisSuresi=2100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        splashResim= findViewById(R.id.kayanImage);
       splashText= findViewById(R.id.kayanText);
        splashText2= findViewById(R.id.kayantext2);


        kaydırma= AnimationUtils.loadAnimation(this,R.anim.splashanimation);
        splashText.setAnimation(kaydırma);
        splashText2.setAnimation(kaydırma);
        kaydırma2=AnimationUtils.loadAnimation(this,R.anim.splashanimation2);
        splashResim.setAnimation(kaydırma2);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent gecis = new Intent(SplashScreen.this,GridView.class);
                startActivity(gecis);
                finish();
            }
        },gecisSuresi);

    }
}
