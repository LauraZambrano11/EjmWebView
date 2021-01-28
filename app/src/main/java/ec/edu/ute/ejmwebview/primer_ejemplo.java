package ec.edu.ute.ejmwebview;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class primer_ejemplo extends AppCompatActivity {
    String urlgoogle;
    WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.primer_ejemplo);

        //instancia al objeto del layout
        myWebView = (WebView) findViewById(R.id.webview);
        //objeto de configuraciones del webview
        WebSettings webSettings = myWebView.getSettings();
        //habilitar javascript
        webSettings.setJavaScriptEnabled(true);
        //url en variable
        urlgoogle = "https://www.google.com/";
        //carga de la página en el webview
        myWebView.loadUrl(urlgoogle);
        //permite usar
        myWebView.setWebViewClient(new WebViewClient());

    }

    //método que habilita el historial para poder navegar dentro del webview con la flecha
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // Check if the key event was the Back button and if there's history
        if ((keyCode == KeyEvent.KEYCODE_BACK) && myWebView.canGoBack()) {
            myWebView.goBack();
            return true;
        }
        // If it wasn't the Back key or there's no web page history, bubble up to the default
        // system behavior (probably exit the activity)
        return super.onKeyDown(keyCode, event);
    }

}
