package com.example.android.alc4androidfirstchallenge;

import android.net.http.SslError;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutAlc extends AppCompatActivity {
    private WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        wv = findViewById(R.id.webview);
        wv.setWebViewClient(new WebViewClient());
        wv.loadUrl("http://andela.com/alc");

        WebSettings webSettings = wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    public void onBackPressed() {
        if (wv.canGoBack()) {
            wv.goBack();
        }
        else {
            super.onBackPressed();
        }
    }

//    @Override
//    public void onReceivedSslError(WebView view, SslErrorHandler handler,
//                                   SslError error) {
//
//        switch (error.getPrimaryError()) {
//            case SslError.SSL_UNTRUSTED:
////                Log.debug("SslError : The certificate authority is not trusted.");
//                break;
//            case SslError.SSL_EXPIRED:
////                LogUtility.debug("SslError : The certificate has expired.");
//                break;
//            case SslError.SSL_IDMISMATCH:
////                LogUtility.debug("The certificate Hostname mismatch.");
//                break;
//            case SslError.SSL_NOTYETVALID:
////                LogUtility.debug("The certificate is not yet valid.");
//                break;
//        }
//        handler.proceed();
//    }
}
