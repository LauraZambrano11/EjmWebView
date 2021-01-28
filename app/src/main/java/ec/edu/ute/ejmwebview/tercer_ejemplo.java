package ec.edu.ute.ejmwebview;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class tercer_ejemplo extends AppCompatActivity{
    EditText txtDireccion;
    Button btnBuscar;
    WebView webview3;
    WebSettings webSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tercer_ejemplo);

        webview3 = (WebView) findViewById(R.id.webview3);
        txtDireccion = (EditText) findViewById(R.id.txtDireccion);
        btnBuscar = (Button) findViewById(R.id.btnBuscar);
        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargarweb();
            }
        });

        //objeto de configuraciones del webview
        webSettings = webview3.getSettings();
        //habilitar javascript
        webSettings.setJavaScriptEnabled(true);

    }

    private void cargarweb() {
        String dirurl = txtDireccion.getText().toString();
        webview3.loadUrl("https://"+dirurl);
        webview3.setWebViewClient(new WebViewClient());
    }
}
