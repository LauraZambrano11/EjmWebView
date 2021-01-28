package ec.edu.ute.ejmwebview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnWv, btnWv2, btnWv3, btnWv4;
    public void primerwv(){
        Intent i =new Intent(this,primer_ejemplo.class);
        startActivity(i);
    }
    private void segundowv() {
        Intent i =new Intent(this,segundo_ejemplo.class);
        startActivity(i);
    }
    private void tercerwv() {
        Intent i =new Intent(this,tercer_ejemplo.class);
        startActivity(i);
    }

    private void cuartowv() {
        //xwalk
        startActivity(new Intent(this,EjemploXwalk.class));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnWv = (Button) findViewById(R.id.btnWv);
        btnWv2 = (Button) findViewById(R.id.btnWv2);
        btnWv3 = (Button) findViewById(R.id.btnWv3);
        btnWv4 = (Button) findViewById(R.id.btnWv4);

        btnWv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                primerwv();
            }
        });

        btnWv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                segundowv();
            }
        });

        btnWv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tercerwv();
            }
        });

        btnWv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cuartowv();
            }
        });


    }


}