package com.example.estacion01.techoapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Toast;


public class Calculadora extends AppCompatActivity {
    private EditText et;
    private   SeekBar s;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        et=(EditText)findViewById(R.id.texto);
        s=(SeekBar)findViewById(R.id.seekBar);
        //et.setText(s.getMax());
        s.setProgress(5);
        s.setOnSeekBarChangeListener(this);
       // tranf();
    }
    public void test(View view){
        s.setProgress(s.getProgress()+5);
    }
    public void change(View view) {
        Intent siguiente=new Intent(this,TECHO.class);
        startActivity(siguiente);
    }



}
