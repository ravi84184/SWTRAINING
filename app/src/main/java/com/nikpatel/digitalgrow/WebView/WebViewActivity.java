package com.nikpatel.digitalgrow.WebView;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.nikpatel.digitalgrow.R;

public class WebViewActivity extends AppCompatActivity {

    private WebView webView;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

//        webView = (WebView) findViewById(R.id.webView);
        webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://www.google.com");
        setContentView(webView);
        webView.setWebViewClient(new WebViewClient());

//        String web = "<html><body><h1>Hello   Ravi  </h1></body></html>";
//        webView.loadData(web,"text/html","UTF-8");
    }
}
