package ec.edu.ute.ejmwebview;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class segundo_ejemplo extends AppCompatActivity{

    Button btnCon1, btnCon2;
    WebView myWebView;
    WebSettings webSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segundo_ejemplo);

        myWebView = (WebView) findViewById(R.id.webview2);


        btnCon1 = (Button) findViewById(R.id.btnCon1);
        btnCon2 = (Button) findViewById(R.id.btnCon2);

        //objeto de configuraciones del webview
        webSettings = myWebView.getSettings();
        //habilitar javascript
        webSettings.setJavaScriptEnabled(true);

        btnCon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                con1();
            }
        });

        btnCon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                con2();
            }
        });
    }

    private void con1() {
        myWebView.loadUrl("https://dordonez-ute-android.github.io/HTML/Parciales/Segundo%20Parcial/Consulta_Detalle4.html");
        //myWebView.setWebViewClient(new WebViewClient());
    }

    private void con2() {
        myWebView.loadUrl("https://dordonez-ute-android.github.io/HTML/Parciales/Primer%20Parcial/Sesi%C3%B3n%201.html");
        myWebView.setWebViewClient(new WebViewClient());
    }
}
