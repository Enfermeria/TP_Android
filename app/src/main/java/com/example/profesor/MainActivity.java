package com.example.profesor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Context contexto = getApplicationContext();
        CharSequence texto = "Bienvenido mi genio";
        int duracion = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(contexto, texto, duracion);
        toast.show();

        Button b1 = (Button) findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context contexto2 = getApplicationContext();
                CharSequence texto2 = "Solta el botón, boludo...";
                int duracion2 = Toast.LENGTH_SHORT;
                Toast toast2 = Toast.makeText(contexto2, texto2, duracion2);
                toast2.show();

                TextView textView = (TextView) findViewById(R.id.textView1);
                textView.setText("Ya está bien");
            } // onClick
        }); //setOnClickListener
    } // onCreate
} // class MainActiviti