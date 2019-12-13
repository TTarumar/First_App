package com.tarumar.denemelerdenbiri;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.text.InputType;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.muddzdev.styleabletoastlibrary.StyleableToast;

import java.util.ArrayList;


public class metre extends AppCompatActivity {


    EditText Girilen;
    Spinner secilenBirim;
    Button donustur;
    TextView metre,cm,mm,km,Nm,Dam,Dm;
    double x1;
    double sonucM;
    double sonucCm;
    double sonucMm;
    double sonucKm;
    double sonucDam;
    double sonucDm;
    double sonucNm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metre);

        Girilen= findViewById(R.id.girilen);
        secilenBirim= findViewById(R.id.birimSpinner);
        donustur=findViewById(R.id.donusturucuB);
        metre=findViewById(R.id.metre);
        cm=findViewById(R.id.santimetre);
        mm=findViewById(R.id.milimetre);
        km=findViewById(R.id.kilometre);
        Nm= findViewById(R.id.nanometre);
        Dam=findViewById(R.id.dekametre);
        Dm=findViewById(R.id.desimetre);


        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Nanometre");
        arrayList.add("Milimetre");
        arrayList.add("Santimetre");
        arrayList.add("Desimetre");
        arrayList.add("Metre");
        arrayList.add("Dekametre");
        arrayList.add("Kilometre");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                R.layout.color_spinner,arrayList);
        dataAdapter.setDropDownViewResource(R.layout.spinner_alt);
        secilenBirim.setAdapter(dataAdapter);


       donustur.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               String secilenSpinnerBirim = secilenBirim.getSelectedItem().toString();
               String noktaKontrol = Girilen.getText().toString();
               if (noktaKontrol.matches("")){
                   StyleableToast.makeText(getApplicationContext(),"Hatalı İşlem",R.style.ornekToast).show();
               }

              else if(secilenSpinnerBirim=="Metre") {
                   String contentM = Girilen.getText().toString();

                   x1 = Double.parseDouble(contentM);

                   sonucM = x1 * 1;
                   sonucCm= x1*100;
                   sonucMm=x1*1000;
                   sonucKm=x1/1000;
                   sonucDam=x1/10;
                   sonucDm=x1*10;
                   sonucNm=x1*1000000000;

                   metre.setText("" + sonucM+" m");
                   cm.setText(""+sonucCm +" cm");
                   mm.setText(""+sonucMm+" mm");
                   km.setText(""+sonucKm+" km");
                   Dam.setText(""+sonucDam+" dam");
                   Dm.setText(""+sonucDm+" dm");
                   Nm.setText(""+sonucNm+" nm");

               }

               else if(secilenSpinnerBirim=="Santimetre"){

                   String contentCm = Girilen.getText().toString();

                   x1 = Double.parseDouble(contentCm);

                   sonucM = x1 / 100;
                   sonucCm= x1*1;
                   sonucMm= x1*10;
                   sonucKm= x1/100000;
                   sonucDam=x1/1000;
                   sonucDm=x1/10;
                   sonucNm=x1*10000000;

                   metre.setText("" + sonucM+" m");
                   cm.setText(""+sonucCm +" cm");
                   mm.setText(""+sonucMm+" mm");
                   km.setText(""+sonucKm+" km");
                   Dam.setText(""+sonucDam+" dam");
                   Dm.setText(""+sonucDm+" dm");
                   Nm.setText(""+sonucNm+" nm");


               }

               else if(secilenSpinnerBirim=="Milimetre"){

                   String contentMm = Girilen.getText().toString();

                   x1 = Double.parseDouble(contentMm);
                   sonucM = x1 / 1000;
                   sonucCm= x1/10;
                   sonucMm= x1*1;
                   sonucKm= x1/10000000;
                   sonucDam=x1/10000;
                   sonucDm=x1/100;
                   sonucNm=x1*1000000;

                   metre.setText("" + sonucM+" m");
                   cm.setText(""+sonucCm +" cm");
                   mm.setText(""+sonucMm+" mm");
                   km.setText(""+sonucKm+" km");
                   Dam.setText(""+sonucDam+" dam");
                   Dm.setText(""+sonucDm+" dm");
                   Nm.setText(""+sonucNm+" nm");



               }

               else if(secilenSpinnerBirim=="Kilometre"){

                   String contentKm = Girilen.getText().toString();

                   x1 = Double.parseDouble(contentKm);
                   sonucM = x1 * 1000;
                   sonucCm= x1*100000;
                   sonucMm= x1*10000000;
                   sonucKm= x1*1;
                   sonucDam=x1*100;
                   sonucDm=x1*10000;
                   sonucNm=x1*(1000000000);

                   metre.setText("" + sonucM+" m");
                   cm.setText(""+sonucCm +" cm");
                   mm.setText(""+sonucMm+" mm");
                   km.setText(""+sonucKm+" km");
                   Dam.setText(""+sonucDam+" dam");
                   Dm.setText(""+sonucDm+" dm");
                   Nm.setText(""+sonucNm*1000+" nm");

               }

               else if(secilenSpinnerBirim=="Dekametre"){

                   String contentDam = Girilen.getText().toString();

                   x1 = Double.parseDouble(contentDam);
                   sonucM = x1 * 10;
                   sonucCm= x1*1000;
                   sonucMm= x1*10000;
                   sonucKm= x1/100;
                   sonucDam=x1*1;
                   sonucDm=x1*100;
                   sonucNm=x1*(1000000000*10);

                   metre.setText("" + sonucM+" m");
                   cm.setText(""+sonucCm +" cm");
                   mm.setText(""+sonucMm+" mm");
                   km.setText(""+sonucKm+" km");
                   Dam.setText(""+sonucDam+" dam");
                   Dm.setText(""+sonucDm+" mm");
                   Nm.setText(""+sonucNm+" nm");



               }
               else if(secilenSpinnerBirim=="Desimetre"){

                   String contentDm = Girilen.getText().toString();

                   x1 = Double.parseDouble(contentDm);
                   sonucM = x1 / 10;
                   sonucCm= x1*10;
                   sonucMm= x1*100;
                   sonucKm= x1/10000;
                   sonucDam=x1/100;
                   sonucDm=x1*1;
                   sonucNm=x1*(100000000);

                   metre.setText("" + sonucM+" M");
                   cm.setText(""+sonucCm +" Cm");
                   mm.setText(""+sonucMm+" mm");
                   km.setText(""+sonucKm+" Km");
                   Dam.setText(""+sonucDam+" Dam");
                   Dm.setText(""+sonucDm+" Dm");
                   Nm.setText(""+sonucNm+" Nm");


               }
               else if(secilenSpinnerBirim=="Nanometre"){

                   String contentNm = Girilen.getText().toString();

                   x1 = Double.parseDouble(contentNm);
                   sonucM = x1 / 1000000000;
                   sonucCm= x1/10000000;
                   sonucMm= x1/1000000;
                   sonucDm=x1/100000000;
                   sonucNm=x1*1;
                   sonucKm=x1/1000000000;
                   sonucDam=x1/1000000000;

                   metre.setText("" + sonucM+" m");
                   cm.setText(""+sonucCm +" cm");
                   mm.setText(""+sonucMm+" mm");
                   km.setText(""+sonucKm * 1/1000+" km");
                   Dam.setText(""+sonucDam * 1/10+" dam");
                   Dm.setText(""+sonucDm+" dm");
                   Nm.setText(""+sonucNm+" nm");


               }


           }




       });


    }
}
