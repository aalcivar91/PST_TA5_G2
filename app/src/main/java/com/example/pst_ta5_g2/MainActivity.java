package com.example.pst_ta5_g2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnUbicacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnUbicacion=(Button) findViewById(R.id.btnUbicacion);

        btnUbicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MapsActivity.class);
                startActivity(intent);
            }
        });
    }
    public void video(View view) {
        Intent i = new Intent(this, Main2Activity.class );
        startActivity(i);
    }

    public void calendario(View view) {
        Intent i = new Intent(this, Main3Activity.class );
        startActivity(i);
    }
}
