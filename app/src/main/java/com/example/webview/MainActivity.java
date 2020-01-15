package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView = findViewById(R.id.webview);
        String ss="https://www.be-practical.com/";

        //to load html data
       /* String customHtml = "<html><body><h1>Hello, WebView</h1></body></html>";
        webView.loadData(customHtml, "text/html", "UTF-8");*/

        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(ss);





    }


}
