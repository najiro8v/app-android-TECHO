package com.example.estacion01.techoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TECHO extends AppCompatActivity {
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_techo);

    }
    public void changeCalculo(View view)
    {
        Intent siguiente=new Intent(this,Calculadora.class);
        startActivity(siguiente);
    }
    public void changeProgreso(View view)
    {
        Intent siguiente=new Intent(this,Progreso_Constructivo.class);
        startActivity(siguiente);
    }
    public void changeNivel(View view)
    {
        Intent siguiente=new Intent(this,Nivel.class);
        startActivity(siguiente);
    }
}
