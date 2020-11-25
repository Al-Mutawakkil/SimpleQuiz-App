package com.example.kuisbola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HasilKuis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hasil_kuis);


        TextView hasil=findViewById(R.id.hasil);
        TextView nilai=findViewById(R.id.skor);

        hasil.setText("Jawaban Benar :"+ MainActivity.benar+"\nJawaban Salah :"+ MainActivity.salah);
        nilai.setText(""+MainActivity.hasil);
    }

    public void ulangi(View view){
        finish();
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
    }
}


