package com.tarumar.denemelerdenbiri;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.muddzdev.styleabletoastlibrary.StyleableToast;

public class MainActivity extends AppCompatActivity {

    boolean artiEksiKontrol=false;
    boolean islemSonrasiNokta=false;
    boolean basildi=false;
    boolean top,cik,boll,car;
    boolean x1Eksi=false;
    boolean ikinciBasim=false;
    boolean esitttirSonrasi=false;
    boolean ikinciBasimEsittir=false;
    boolean ikinciVirgul=false;
    boolean noktaSonrasiIslem=false;
    boolean islemSonrasiEsittir=false;
    boolean noktaSayiIslem=false;
    boolean bosEsittir=false;
    boolean eksiKontrol=false;
    boolean ikinciEksi=false;
    boolean ciftEksi=false;
    boolean artiEksiSonrasiParantez=false;
    boolean artiEksiSonrasiSayi=false;
    int silmeButonuDeger=0;
    int N=0;
    boolean Ndegerkontrolu=false;
    double x1;
    int x2Deger;
    char sonDeger;
    EditText girilen;
    Button btn00,btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btntopla,btncikar,btncarp,btnbol,btntemizle,btnsil,btnesittir,btnnokta,btnArtiEksi;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView sonuc = findViewById(R.id.sonuc);
        girilen=findViewById(R.id.girilen);
        btn0=findViewById(R.id.bnt0);
        btn1=findViewById(R.id.bnt1);
        btn2=findViewById(R.id.bnt2);
        btn3=findViewById(R.id.bnt3);
        btn4=findViewById(R.id.bnt4);
        btn5=findViewById(R.id.bnt5);
        btn6=findViewById(R.id.bnt6);
        btn7=findViewById(R.id.bnt7);
        btn8=findViewById(R.id.bnt8);
        btn9=findViewById(R.id.bnt9);
        btn00=findViewById(R.id.bnt00);
        btntopla=findViewById(R.id.topla);
        btncikar=findViewById(R.id.cikar);
        btncarp=findViewById(R.id.carp);
        btnbol=findViewById(R.id.bol);
        btnnokta=findViewById(R.id.virgul);
        btnsil=findViewById(R.id.delete);
        btntemizle=findViewById(R.id.c);
        btnArtiEksi=findViewById(R.id.ce);
        btnesittir=findViewById(R.id.esittir);
        girilen.setInputType(InputType.TYPE_NULL);



        final View.OnClickListener sayilariyaz = (new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String bosKontrol= girilen.getText().toString().trim();
                final int uzunlukBos = girilen.getText().length();
                boolean bosBooleanArtı= bosKontrol.contains("+");
                boolean bosBooleanBolu= bosKontrol.contains("/");
                boolean bosBooleanCarpi=bosKontrol.contains("x");

                int id = v.getId();

                switch (id){

                    case R.id.bnt00:
                        if(bosKontrol.matches("00")){

                        }
                        else{
                        girilen.append("00");
                        }


                        if (Ndegerkontrolu==true){
                            N++;
                        }
                        noktaSonrasiIslem=false;
                        islemSonrasiEsittir=false;
                        noktaSayiIslem=true;
                        islemSonrasiNokta=false;
                        eksiKontrol=false;
                        artiEksiSonrasiParantez=true;
                        artiEksiSonrasiSayi=true;
                        break;

                    case R.id.bnt0:
                        if(bosKontrol.matches("0"))
                        {

                        }
                        else{
                            girilen.append("0");
                            }


                        if (Ndegerkontrolu==true){
                            N++;
                        }
                        noktaSonrasiIslem=false;
                        islemSonrasiEsittir=false;
                        noktaSayiIslem=true;
                        islemSonrasiNokta=false;
                        eksiKontrol=false;
                        artiEksiSonrasiParantez=true;
                        artiEksiSonrasiSayi=true;
                        break;
                    case R.id.bnt1:
                        girilen.append("1");
                        if (Ndegerkontrolu==true){
                            N++;
                        }
                        noktaSonrasiIslem=false;
                        islemSonrasiEsittir=false;
                        noktaSayiIslem=true;
                        islemSonrasiNokta=false;
                        eksiKontrol=false;
                        artiEksiSonrasiParantez=true;
                        artiEksiSonrasiSayi=true;

                       break;
                    case R.id.bnt2:
                        girilen.append("2");
                        if (Ndegerkontrolu==true){
                            N++;
                        }
                        noktaSonrasiIslem=false;
                        islemSonrasiEsittir=false;
                        noktaSayiIslem=true;
                        islemSonrasiNokta=false;
                        eksiKontrol=false;
                        artiEksiSonrasiParantez=true;
                        artiEksiSonrasiSayi=true;
                        break;

                        case R.id.bnt3:
                        girilen.append("3");
                        if (Ndegerkontrolu==true){
                            N++;
                        }
                        noktaSonrasiIslem=false;
                        islemSonrasiEsittir=false;
                        noktaSayiIslem=true;
                        islemSonrasiNokta=false;
                        eksiKontrol=false;
                        artiEksiSonrasiParantez=true;
                            artiEksiSonrasiSayi=true;
                        break;
                    case R.id.bnt4:
                        girilen.append("4");
                        if (Ndegerkontrolu==true){
                            N++;
                        }
                        noktaSonrasiIslem=false;
                        islemSonrasiEsittir=false;
                        noktaSayiIslem=true;
                        islemSonrasiNokta=false;
                        eksiKontrol=false;
                        artiEksiSonrasiParantez=true;
                        artiEksiSonrasiSayi=true;
                        break;
                    case R.id.bnt5:
                        girilen.append("5");
                        if (Ndegerkontrolu==true){
                            N++;
                        }
                        noktaSonrasiIslem=false;
                        islemSonrasiEsittir=false;
                        noktaSayiIslem=true;
                        islemSonrasiNokta=false;
                        eksiKontrol=false;
                        artiEksiSonrasiParantez=true;
                        artiEksiSonrasiSayi=true;
                        break;
                    case R.id.bnt6:
                        girilen.append("6");
                        if (Ndegerkontrolu==true){
                            N++;
                        }
                        noktaSonrasiIslem=false;
                        islemSonrasiEsittir=false;
                        noktaSayiIslem=true;
                        islemSonrasiNokta=false;
                        eksiKontrol=false;
                        artiEksiSonrasiParantez=true;
                        artiEksiSonrasiSayi=true;
                        break;
                    case R.id.bnt7:
                        girilen.append("7");
                        if (Ndegerkontrolu==true){
                            N++;
                        }
                        noktaSonrasiIslem=false;
                        islemSonrasiEsittir=false;
                        noktaSayiIslem=true;
                        islemSonrasiNokta=false;
                        eksiKontrol=false;
                        artiEksiSonrasiParantez=true;
                        artiEksiSonrasiSayi=true;
                        break;
                    case R.id.bnt8:
                        girilen.append("8");
                        if (Ndegerkontrolu==true){
                            N++;
                        }
                        noktaSonrasiIslem=false;
                        islemSonrasiEsittir=false;
                        noktaSayiIslem=true;
                        islemSonrasiNokta=false;
                        eksiKontrol=false;
                        artiEksiSonrasiParantez=true;
                        artiEksiSonrasiSayi=true;
                        break;
                    case R.id.bnt9:
                        girilen.append("9");
                        if (Ndegerkontrolu==true){
                            N++;
                        }
                        noktaSonrasiIslem=false;
                        islemSonrasiEsittir=false;
                        noktaSayiIslem=true;
                        islemSonrasiNokta=false;
                        eksiKontrol=false;
                        artiEksiSonrasiParantez=true;
                        artiEksiSonrasiSayi=true;
                        break;
                    case R.id.topla:



                        if (bosKontrol.isEmpty()){
                            StyleableToast.makeText(getApplicationContext(),"Hatalı İşlem",R.style.ornekToast).show();
                        }
                        else if (bosBooleanArtı==true){
                            StyleableToast.makeText(getApplicationContext(),"Artı zaten var",R.style.ornekToast).show();
                        }
                        else if  (bosKontrol.contains("+")&&bosKontrol.contains("-")){

                            StyleableToast.makeText(getApplicationContext(),"Hatalı İşlem",R.style.ornekToast).show();

                        }
                        else if (bosKontrol.contains("/")&&bosKontrol.contains("-")){
                            StyleableToast.makeText(getApplicationContext(),"Hatalı İşlem",R.style.ornekToast).show();

                        }
                        else if ((bosKontrol.contains("+")||bosKontrol.contains("-")||bosKontrol.contains("x")||bosKontrol.contains("/"))&&eksiKontrol==false&&artiEksiSonrasiSayi==false){

                            StyleableToast.makeText(getApplicationContext(),"İşlemi Tamamlayınız",R.style.ornekToast).show();

                        }
                        else if (bosKontrol.contains("-")&&ikinciEksi==true ){// ****************************Buradaki Hatayı Çöz String Char Dönüşümü Hatası ***************************************

                           StyleableToast.makeText(getApplicationContext(),"Hatalı İşlem",R.style.ornekToast).show();
                        }

                        else if (bosKontrol.contains("x")&&bosKontrol.contains("-")){
                            StyleableToast.makeText(getApplicationContext(),"Hatalı İşlem",R.style.ornekToast).show();

                        }

                        else if (noktaSayiIslem==true){
                            String content = girilen.getText().toString();
                            x2Deger = content.length() + 1;
                            x1 = Double.parseDouble(content);
                            girilen.append("+");

                            basildi = true;
                            sonDeger = '+';
                            x1Eksi = true;
                            ikinciBasim = true;
                            ikinciBasimEsittir=false;
                            ikinciVirgul=false;
                            islemSonrasiNokta=true;
                            islemSonrasiEsittir=true;
                            bosEsittir=true;
                            artiEksiSonrasiSayi=false;

                        }
                        else if (bosKontrol.contains(".")){

                            StyleableToast.makeText(getApplicationContext(),"Hatalı İşlem",R.style.ornekToast).show();

                        }


                        else {
                            String content = girilen.getText().toString();
                            x2Deger = content.length() + 1;
                            x1 = Double.parseDouble(content);
                            girilen.append("+");

                            basildi = true;
                            sonDeger = '+';
                            x1Eksi = true;
                            ikinciBasim = true;
                            ikinciBasimEsittir=false;
                            ikinciVirgul=false;
                            islemSonrasiNokta=true;
                            islemSonrasiEsittir=true;
                            bosEsittir=true;
                            artiEksiSonrasiSayi=false;

                        }

                       break;

                    case R.id.bol:

                        if (bosKontrol.isEmpty()){
                            StyleableToast.makeText(getApplicationContext(),"Hatalı İşlem",R.style.ornekToast).show();
                        }
                        else if (bosBooleanBolu==true){

                            StyleableToast.makeText(getApplicationContext(),"Bölü zaten var",R.style.ornekToast).show();
                        }

                        else if  (bosKontrol.contains("+")&&bosKontrol.contains("-")){

                            StyleableToast.makeText(getApplicationContext(),"Hatalı İşlem",R.style.ornekToast).show();

                        }
                        else if (bosKontrol.contains("/")&&bosKontrol.contains("-")){
                            StyleableToast.makeText(getApplicationContext(),"Hatalı İşlem",R.style.ornekToast).show();

                        }
                        else if ((bosKontrol.contains("+")||bosKontrol.contains("-")||bosKontrol.contains("x")||bosKontrol.contains("/"))&&eksiKontrol==false&&artiEksiSonrasiSayi==false){

                            StyleableToast.makeText(getApplicationContext(),"İşlemi Tamamlayınız",R.style.ornekToast).show();

                        }
                        else if (bosKontrol.contains("-")&&ikinciEksi==true ){// ****************************Buradaki Hatayı Çöz String Char Dönüşümü Hatası ***************************************

                            StyleableToast.makeText(getApplicationContext(),"Hatalı İşlem",R.style.ornekToast).show();
                        }

                        else if (bosKontrol.contains("x")&&bosKontrol.contains("-")){
                            StyleableToast.makeText(getApplicationContext(),"Hatalı İşlem",R.style.ornekToast).show();

                        }

                        else if (noktaSayiIslem==true){

                            String contentB=girilen.getText().toString();
                            x2Deger=contentB.length()+1;
                            x1=Double.parseDouble(contentB);
                            girilen.append("/");
                            basildi=true;
                            sonDeger = '/';
                            x1Eksi=true;
                            ikinciBasim=true;
                            ikinciBasimEsittir=false;
                            ikinciVirgul=false;
                            islemSonrasiNokta=true;
                            islemSonrasiEsittir=true;
                            bosEsittir=true;
                            artiEksiSonrasiSayi=false;

                        }

                        else if (bosKontrol.contains(".")){

                            StyleableToast.makeText(getApplicationContext(),"Hatalı İşlem",R.style.ornekToast).show();

                        }
                        else{
                        String contentB=girilen.getText().toString();
                        x2Deger=contentB.length()+1;
                        x1=Double.parseDouble(contentB);
                        girilen.append("/");
                        basildi=true;
                        sonDeger = '/';
                        x1Eksi=true;
                        ikinciBasim=true;
                            ikinciBasimEsittir=false;
                            ikinciVirgul=false;
                            islemSonrasiNokta=true;
                            islemSonrasiEsittir=true;
                            bosEsittir=true;
                            artiEksiSonrasiSayi=false;

                        }
                        break;
                    case R.id.cikar:
                        if (bosKontrol.isEmpty()){
                            StyleableToast.makeText(getApplicationContext(),"Hatalı İşlem",R.style.ornekToast).show();
                        }



                        else if  (bosKontrol.contains("+")&&bosKontrol.contains("-")){

                            StyleableToast.makeText(getApplicationContext(),"Hatalı İşlem",R.style.ornekToast).show();

                        }
                        else if (bosKontrol.contains("/")&&bosKontrol.contains("-")){
                            StyleableToast.makeText(getApplicationContext(),"Hatalı İşlem",R.style.ornekToast).show();

                        }
                        else if ((bosKontrol.contains("+")||bosKontrol.contains("-")||bosKontrol.contains("x")||bosKontrol.contains("/"))&&eksiKontrol==false&&artiEksiSonrasiSayi==false){

                            StyleableToast.makeText(getApplicationContext(),"İşlemi Tamamlayınız",R.style.ornekToast).show();

                        }
                        else if (bosKontrol.contains("-")&&ciftEksi==true){// ****************************Buradaki Hatayı Çöz String Char Dönüşümü Hatası ***************************************

                            StyleableToast.makeText(getApplicationContext(),"Eksi zaten var",R.style.ornekToast).show();
                        }

                        else if (bosKontrol.contains("x")&&bosKontrol.contains("-")){
                            StyleableToast.makeText(getApplicationContext(),"Hatalı İşlem",R.style.ornekToast).show();

                        }


                        else if (noktaSayiIslem==true){
                            String contentC = girilen.getText().toString();
                            x2Deger = contentC.length() + 1;
                            x1 = Double.parseDouble(contentC);
                            girilen.append("-");

                            basildi = true;
                            sonDeger = '-';
                            x1Eksi = true;
                            ikinciBasim = true;
                            ikinciBasimEsittir=false;
                            esitttirSonrasi=true;
                            ikinciVirgul=false;
                            islemSonrasiNokta=true;
                            islemSonrasiEsittir=true;
                            bosEsittir=true;
                            ikinciEksi=true;
                            ciftEksi=true;
                            artiEksiSonrasiSayi=false;


                        }

                        else if (bosKontrol.contains(".")){

                            StyleableToast.makeText(getApplicationContext(),"Hatalı İşlem",R.style.ornekToast).show();

                        }

                        else {
                            String contentC = girilen.getText().toString();
                            x2Deger = contentC.length() + 1;
                            x1 = Double.parseDouble(contentC);
                            girilen.append("-");

                            basildi = true;
                            sonDeger = '-';
                            x1Eksi = true;
                            ikinciBasim = true;
                            ikinciBasimEsittir=false;
                            esitttirSonrasi=true;
                            ikinciVirgul=false;
                            islemSonrasiNokta=true;
                            islemSonrasiEsittir=true;
                            bosEsittir=true;
                            ikinciEksi=true;
                            artiEksiSonrasiSayi=false;
                        }


                        break;
                    case R.id.carp:
                        if (bosKontrol.isEmpty())
                        {
                            StyleableToast.makeText(getApplicationContext(),"Hatalı İşlem",R.style.ornekToast).show();
                        }
                        else if (bosBooleanCarpi==true)
                        {

                            StyleableToast.makeText(getApplicationContext(),"Carpı zaten var",R.style.ornekToast).show();

                        }


                        else if  (bosKontrol.contains("+")&&bosKontrol.contains("-"))
                        {

                            StyleableToast.makeText(getApplicationContext(),"Hatalı İşlem",R.style.ornekToast).show();

                        }
                        else if (bosKontrol.contains("/")&&bosKontrol.contains("-"))
                        {
                            StyleableToast.makeText(getApplicationContext(),"Hatalı İşlem",R.style.ornekToast).show();

                        }
                        else if ((bosKontrol.contains("+")||bosKontrol.contains("-")||bosKontrol.contains("x")||bosKontrol.contains("/"))&&eksiKontrol==false&&artiEksiSonrasiSayi==false)
                        {

                            StyleableToast.makeText(getApplicationContext(),"İşlemi Tamamlayınız",R.style.ornekToast).show();

                        }
                        else if (bosKontrol.contains("-")&&ikinciEksi==true )
                        {

                            StyleableToast.makeText(getApplicationContext(),"Hatalı İşlem",R.style.ornekToast).show();
                        }

                        else if (bosKontrol.contains("x")&&bosKontrol.contains("-"))
                        {
                            StyleableToast.makeText(getApplicationContext(),"Hatalı İşlem",R.style.ornekToast).show();

                        }


                        else if (noktaSayiIslem==true){
                            String content4 = girilen.getText().toString();
                            x2Deger = content4.length() + 1;
                            x1 = Double.parseDouble(content4);
                            girilen.append("x");
                            basildi = true;
                            sonDeger = 'x';
                            x1Eksi = true;
                            ikinciBasim = true;
                            ikinciBasimEsittir=false;
                            esitttirSonrasi=true;
                            ikinciVirgul=false;
                            islemSonrasiNokta=true;
                            islemSonrasiEsittir=true;
                            bosEsittir=true;
                            artiEksiSonrasiSayi=false;


                        }

                        else if (bosKontrol.contains(".")){

                            StyleableToast.makeText(getApplicationContext(),"Hatalı İşlem",R.style.ornekToast).show();

                        }

                        else {
                            String content4 = girilen.getText().toString();
                            x2Deger = content4.length() + 1;
                            x1 = Double.parseDouble(content4);
                            girilen.append("x");
                            basildi = true;
                            sonDeger = 'x';
                            x1Eksi = true;
                            ikinciBasim = true;
                            ikinciBasimEsittir=false;
                            esitttirSonrasi=true;
                            ikinciVirgul=false;
                            islemSonrasiNokta=true;
                            islemSonrasiEsittir=true;
                            bosEsittir=true;
                            artiEksiSonrasiSayi=false;

                        }

                        break;

                    case R.id.esittir:


                        String bosEsittirKontrol= girilen.getText().toString();

                        if ((bosKontrol.contains("+")||bosKontrol.contains("-")||bosKontrol.contains("x")||bosKontrol.contains("/"))&&eksiKontrol==false||artiEksiKontrol==true) {


                            if (ikinciBasimEsittir == false) {

                                if (basildi == true && sonDeger == '+') {

                                    if (esitttirSonrasi == true && eksiKontrol==true) {

                                        StyleableToast.makeText(getApplicationContext(), "Hatalı İşlem", R.style.ornekToast).show();

                                        esitttirSonrasi = false;

                                    } else {

                                        if (islemSonrasiEsittir == true) {

                                            StyleableToast.makeText(getApplicationContext(), "İşlem", R.style.ornekToast).show();
                                        } else {
                                            String content2 = girilen.getText().toString();

                                            String x2String = content2.substring(x2Deger, content2.length());

                                            Double x2 = Double.parseDouble(x2String);

                                            x2 = x2 + x1;

                                            sonuc.setText(String.valueOf(x2));


                                            girilen.setText("" + x2);


                                            ikinciBasim = false;

                                            esitttirSonrasi = false;

                                            ikinciBasimEsittir = true;

                                            bosEsittir = false;

                                            eksiKontrol=true;
                                            ikinciVirgul=true;
                                            ikinciEksi=false;
                                        }

                                    }


                                } else if (basildi && sonDeger == '-') {


                                    if (islemSonrasiEsittir == true) {

                                        StyleableToast.makeText(getApplicationContext(), "Hatalı İşlem", R.style.ornekToast).show();
                                    } else {
                                        String content9 = girilen.getText().toString();

                                        String x2String2 = content9.substring(x2Deger, content9.length());

                                        Double x2 = Double.parseDouble(x2String2);

                                        x2 = x1 - x2;
                                        sonuc.setText(String.valueOf(x2));

                                        girilen.setText("" + x2);

                                        ikinciBasim = false;

                                        ikinciBasimEsittir = true;

                                        bosEsittir = false;
                                        eksiKontrol=true;
                                        ikinciVirgul=true;
                                        ikinciEksi=false;
                                        ciftEksi=false;
                                    }


                                } else if (basildi && sonDeger == 'x') {


                                    if (islemSonrasiEsittir == true) {

                                        StyleableToast.makeText(getApplicationContext(), "Hatalı İşlem", R.style.ornekToast).show();
                                    } else {
                                        String content5 = girilen.getText().toString();

                                        String x2String = content5.substring(x2Deger, content5.length());
                                        Double x2 = Double.parseDouble(x2String);

                                        x2 = x2 * x1;

                                        sonuc.setText(String.valueOf(x2));


                                        girilen.setText("" + x2);
                                        ikinciBasim = false;

                                        ikinciBasimEsittir = true;
                                        bosEsittir = false;

                                        eksiKontrol=true;
                                        ikinciVirgul=true;
                                        ikinciEksi=false;
                                    }


                                } else if (basildi && sonDeger == '/') {


                                    if (islemSonrasiEsittir == true) {

                                        StyleableToast.makeText(getApplicationContext(), "Hatalı İşlem", R.style.ornekToast).show();
                                    } else {
                                        String content6 = girilen.getText().toString();
                                        String x2String = content6.substring(x2Deger, content6.length());
                                        Double x2 = Double.parseDouble(x2String);
                                        x2 = x1 / x2;
                                        sonuc.setText(String.valueOf(x2));


                                        girilen.setText("" + x2);

                                        ikinciBasim = false;

                                        ikinciBasimEsittir = true;
                                        bosEsittir = false;

                                        eksiKontrol=true;
                                        ikinciVirgul=true;
                                        ikinciEksi=false;
                                    }

                                }


                            }

                        }

                        else if (bosEsittirKontrol.matches("") || bosEsittir == false) {
                            StyleableToast.makeText(getApplicationContext(), "Hatalı İşlem", R.style.ornekToast).show();

                        }

                        else {

                            StyleableToast.makeText(getApplicationContext(),"İşlem giriniz",R.style.ornekToast).show();

                        }

                        ikinciBasimEsittir=false;


                        break;

                        case R.id.virgul:


                            int silmeLenght = girilen.getText().length();
                            int ikinciDeger = girilen.getText().length();
                            String sifirSonrasiVirgul = girilen.getText().toString();


                            if (ikinciVirgul==true){

                                    StyleableToast.makeText(getApplicationContext(),"Hatalı İşlem",R.style.ornekToast).show();

                                    noktaSonrasiIslem=false;
                                }

                               else if (ikinciDeger==0){
                                girilen.setText("0.");
                                ikinciVirgul=true;
                                noktaSonrasiIslem=true;
                                Ndegerkontrolu=true;
                                noktaSayiIslem=false;

                            }
                            else if (islemSonrasiNokta==true){

                                String girilenDeger = girilen.getText().toString();
                                girilen.setText(girilenDeger+"0.");
                                ikinciVirgul=true;
                                noktaSonrasiIslem=true;
                                noktaSayiIslem=false;

                            }
                            else if (sifirSonrasiVirgul=="0"){
                                girilen.append(".");
                                ikinciVirgul=true;
                                noktaSonrasiIslem=true;
                                noktaSayiIslem=false;
                            }
                               else {
                                girilen.append(".");
                                ikinciVirgul = true;
                                noktaSonrasiIslem = true;
                                Ndegerkontrolu = true;
                                noktaSonrasiIslem = true;
                                noktaSayiIslem = false;
                            }



                            break;
                }

                int uzunluk = girilen.getText().toString().length();

                if (uzunluk>17){

                   toastMessage(v);


                }


                btnsil.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String Lenght= girilen.getText().toString();
                        int silmeLenght = girilen.getText().length();


                        if (silmeLenght>0){

                            Lenght=Lenght.substring(0,silmeLenght-1);
                            girilen.setText(Lenght);
                            silmeButonuDeger++;
                            ikinciVirgul=false;

                        }

                        int silmeDegeri = silmeLenght-(N+1);
                        String virgulKontrol= girilen.getText().toString();

                        if (virgulKontrol.contains(".")) {
                            ikinciVirgul = true;
                        }
                        else
                            ikinciVirgul = false;




                    }
                });

                btntemizle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        ikinciBasim=false;
                        girilen.setText("");
                        sonuc.setText("");
                        ikinciVirgul=false;
                        islemSonrasiNokta=false;
                        ikinciEksi=false;
                        ciftEksi=false;


                    }
                });

                btnArtiEksi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String artiEksiString= girilen.getText().toString();

                        if (uzunlukBos==0){

                        }

                       else if (artiEksiString.contains("-")){
                            eksiKontrol = true;
                            basildi=true;
                            artiEksiKontrol=true;


                        }

                      else {
                            girilen.setText("-" + artiEksiString);

                            eksiKontrol = true;
                        }

                    }
                });



            }

        });

        btn0.setOnClickListener(sayilariyaz);
        btn1.setOnClickListener(sayilariyaz);
        btn2.setOnClickListener(sayilariyaz);
        btn3.setOnClickListener(sayilariyaz);
        btn4.setOnClickListener(sayilariyaz);
        btn5.setOnClickListener(sayilariyaz);
        btn6.setOnClickListener(sayilariyaz);
        btn7.setOnClickListener(sayilariyaz);
        btn8.setOnClickListener(sayilariyaz);
        btn9.setOnClickListener(sayilariyaz);
        btn00.setOnClickListener(sayilariyaz);
        btnnokta.setOnClickListener(sayilariyaz);
        btntopla.setOnClickListener(sayilariyaz);
        btncikar.setOnClickListener(sayilariyaz);
        btncarp.setOnClickListener(sayilariyaz);
        btnbol.setOnClickListener(sayilariyaz);
        btnesittir.setOnClickListener(sayilariyaz);

    }


    public void toastMessage(View v){

        StyleableToast.makeText(this,"Çok Fazla Basamak Girildi",R.style.ornekToast).show();

    }
}
