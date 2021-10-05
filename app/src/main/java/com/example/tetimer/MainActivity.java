package com.example.tetimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    ImageView verde, matcha, menta, blanco, manzanilla, hibisco; //Imagenes
    TextView mTextField;
    ProgressBar barraProgreso;

    long milisVerde = 420000; //Tiempo que se va a añadir en el timer.
    long milisMatcha = 20000; //Tiempo que se va a añadir en el timer.
    long milisBlanco = 60000; //Tiempo que se va a añadir en el timer.
    long milisManzanilla = 90000; //Tiempo que se va a añadir en el timer.
    long milisMenta = 20000; //Tiempo que se va a añadir en el timer.
    long milisHibisco = 5000; //Tiempo que se va a añadir en el timer.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextField = findViewById(R.id.textView); //Esto pasa el texto al TextView
        barraProgreso = findViewById(R.id.progressBar);
        barraProgreso.setVisibility(View.GONE);

        verde = findViewById(R.id.Verde);
        matcha = findViewById(R.id.Matcha);
        blanco = findViewById(R.id.Blanco);
        manzanilla = findViewById(R.id.Manzanilla);
        menta = findViewById(R.id.Menta);
        hibisco = findViewById(R.id.Hibisco);

        verde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                barraProgreso.setMax((int) (milisVerde) / 1000); //Setea el maximo de la barra de progreso
                IniciarContador(milisVerde);
                barraProgreso.setVisibility(View.VISIBLE);
            }
        });

        matcha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                barraProgreso.setMax((int) (milisMatcha) / 1000); //Setea el maximo de la barra de progreso
                IniciarContador(milisMatcha);
                barraProgreso.setVisibility(View.VISIBLE);
            }
        });

        blanco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                barraProgreso.setMax((int) (milisBlanco) / 1000); //Setea el maximo de la barra de progreso
                IniciarContador(milisBlanco);
                barraProgreso.setVisibility(View.VISIBLE);
            }
        });

        manzanilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                barraProgreso.setMax((int) (milisManzanilla) / 1000); //Setea el maximo de la barra de progreso
                IniciarContador(milisManzanilla);
                barraProgreso.setVisibility(View.VISIBLE);
            }
        });

        menta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                barraProgreso.setMax((int) (milisMenta) / 1000); //Setea el maximo de la barra de progreso
                IniciarContador(milisMenta);
                barraProgreso.setVisibility(View.VISIBLE);
            }
        });

        hibisco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                barraProgreso.setMax((int) (milisHibisco) / 1000); //Setea el maximo de la barra de progreso
                IniciarContador(milisHibisco);
                barraProgreso.setVisibility(View.VISIBLE);
            }
        });


    }

    void IniciarContador(long milis)
    {
        //Contador
        new CountDownTimer(milis, 1000) {

            public void onTick(long millisUntilFinished) {
                mTextField.setText("" + (millisUntilFinished / 1000)/60 + ":" + (millisUntilFinished / 1000)%60);
                barraProgreso.setProgress((int) (millisUntilFinished / 1000));
            }

            public void onFinish() {
                mTextField.setText("done!");
            }
        }.start();//fin contador
        // }
    }
}
