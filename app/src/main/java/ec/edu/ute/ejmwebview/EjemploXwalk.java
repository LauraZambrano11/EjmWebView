package ec.edu.ute.ejmwebview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import org.xwalk.core.XWalkActivity;
import org.xwalk.core.XWalkView;

public class EjemploXwalk extends XWalkActivity {
    XWalkView xwalkview;

    @Override
    protected void onXWalkReady() {
        xwalkview.loadUrl("http://www.ute.edu.ec");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xwalk);

        xwalkview = (XWalkView)findViewById(R.id.xwalkview);
    }
}
