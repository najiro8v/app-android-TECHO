package com.example.estacion01.techoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TECHO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_techo);
    }
    public void change(View view)
    {
        Intent siguiente=new Intent(this,Progreso_Constructivo.class);
        startActivity(siguiente);
    }
}
