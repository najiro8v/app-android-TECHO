package com.example.estacion01.techoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;


public class Calculadora extends AppCompatActivity {
    private TextView et;
    private SeekBar s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        tranf();
        et=(TextView)findViewById(R.id.texto);
        s=(SeekBar)findViewById(R.id.seekBar);
    }
    public void change(View view)
    {
        Intent siguiente=new Intent(this,TECHO.class);

        startActivity(siguiente);
    }
    public void tranf(){
     et.setText(s.getProgress());
     s.setOnSeekBarChangeListener(
             new SeekBar.OnSeekBarChangeListener(){
                 int progreso;
                 public void onProgressChanged(SeekBar bara,int progress, boolean  fromuser){
                     progreso=progress;
                     et.setText(progreso);


                 }

                 @Override
                 public void onStartTrackingTouch(SeekBar seekBar) {

                 }

                 @Override
                 public void onStopTrackingTouch(SeekBar seekBar) {

                 }

             }
     );

    }
}
