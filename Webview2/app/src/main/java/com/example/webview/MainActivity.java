package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    WebView webView;

    String htmlcode="<html><head>" +
            "<title>this is nothing</title>" +
            "</head>" +
            "<body> <h1>heading one</h1>" +
            "</body>" +
            "</html>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = findViewById(R.id.button);
        webView = findViewById(R.id.web);

        webView.setVisibility(View.INVISIBLE);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webView.setVisibility(View.VISIBLE);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://www.google.com");
                webView.loadData(htmlcode,"text/html","utf-8");
            }
        });


    }
}