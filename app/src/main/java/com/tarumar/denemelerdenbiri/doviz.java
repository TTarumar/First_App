package com.tarumar.denemelerdenbiri;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class doviz extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doviz);

    }

    public void foreks(View v){
        Intent openForeks = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.foreks.com/doviz"));
        startActivity(openForeks);

    }
    public void bloom(View v2){
        Intent openBloom = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.bloomberght.com/doviz"));
        startActivity(openBloom);
    }

    public void isbank(View v3){
        Intent openİs = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.isbank.com.tr/TR/fiyatlar-ve-oranlar/doviz-kurlari/Sayfalar/doviz-kurlari.aspx"));
        startActivity(openİs);

    }
    public void akbank(View v4){
        Intent openAkb = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.akbank.com/doviz-kurlari"));
        startActivity(openAkb);
    }
    public void yapikredi(View v5){
        Intent openYapi = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.yapikredi.com.tr/yatirimci-kosesi/doviz-bilgileri"));
        startActivity(openYapi);
    }
    public void ptt( View v6){
        Intent openPtt = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.ptt.gov.tr/Sayfalar/Doviz.aspx"));
        startActivity(openPtt);
    }
    public void canliDoviz(View v7){
        Intent openCanli = new Intent(Intent.ACTION_VIEW,Uri.parse("https://canlidoviz.com/"));
        startActivity(openCanli);
    }

}
