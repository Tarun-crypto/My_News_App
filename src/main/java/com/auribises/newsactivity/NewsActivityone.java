package com.auribises.newsactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class NewsActivityone extends AppCompatActivity {

    WebView webView;

    void initView(){

        webView = findViewById(R.id.WebviewOriginal);

        Intent rcv = getIntent();
        String url = rcv.getStringExtra("KeyUrl");

        String url2 = rcv.getStringExtra("KeyUrl2");
        String url3 = rcv.getStringExtra("KeyUrl3");
        String url4 = rcv.getStringExtra("KeyUrl4");
        String url5 = rcv.getStringExtra("KeyUrl5");
        String url6 = rcv.getStringExtra("KeyUrl6");
        String url7 = rcv.getStringExtra("KeyUrl7");

        WebViewClient client = new WebViewClient();
        webView.setWebViewClient(client);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
        webView.loadUrl(url2);
        webView.loadUrl(url3);
        webView.loadUrl(url4);
        webView.loadUrl(url5);
        webView.loadUrl(url6);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_activityone);
        getSupportActionBar().hide();
        initView();
    }
}
