package com.tina.alcphase1challenge;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import java.net.URL;

public class AboutActivity extends AppCompatActivity {
    //initialize controls
    private WebView webView;
    private String urlToNavigate="http://www.andela.com/alc";
    //private String urlToNavigate="WWW.andela.coOm/alc";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        webView =(WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.setOverScrollMode(WebView.OVER_SCROLL_NEVER);

        webView.loadUrl(urlToNavigate);
        //webView.loadUrl("https://andela.com/alc/");
        Toast.makeText(this, urlToNavigate, Toast.LENGTH_SHORT).show();
        //webView.getOriginalUrl(;);
    }
}
