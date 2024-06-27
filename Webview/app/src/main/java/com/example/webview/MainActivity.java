package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String s="<html><h1>This is heading</h1></html>";

        webView=(WebView) findViewById(R.id.webvieww);
//        webView.setWebViewClient(new WebViewClient());
//        webView.loadUrl("http://www.google.com");

        webView.loadData(s,"text/html","UTF-8");

    }
}