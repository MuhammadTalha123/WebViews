package com.example.webviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final WebView webView = findViewById(R.id.webView);
        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);


        webView.getSettings().setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("https://www.google.com/");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                webView.loadData("<hmtl><body><h1>Hello world!</h1><p>THis is my cool website!</p></body></html>","text/html","UTF-8");

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                webView.loadUrl("https://www.google.com/");

            }
        });


    }
}