package com.example.tetimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    ImageView verde, matcha, menta, blanco, manzanilla, hibisco; //Imagenes
    TextView mTextField;
    long milisVerde = 420000; //Tiempo que se va a añadir en el timer.
    long milisMatcha = 20000; //Tiempo que se va a añadir en el timer.
    long milisBlanco = 20000; //Tiempo que se va a añadir en el timer.
    long milisManzanilla = 20000; //Tiempo que se va a añadir en el timer.
    long milisMenta = 20000; //Tiempo que se va a añadir en el timer.
    long milisHibisco = 20000; //Tiempo que se va a añadir en el timer.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextField = findViewById(R.id.textView); //Esto pasa el texto al TextView
        verde = findViewById(R.id.Verde);

        verde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IniciarContador(milisVerde);
            }
        });
    }

    void IniciarContador(long milis)
    {
        //Contador
        new CountDownTimer(milis, 1000) {

            public void onTick(long millisUntilFinished) {
                mTextField.setText("seconds remaining: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                mTextField.setText("done!");
            }
        }.start();//fin contador
        // }
    }
}
