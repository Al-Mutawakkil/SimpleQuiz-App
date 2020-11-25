package com.example.kuisbola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView pertanyaan,title;
    RadioGroup rg;
    RadioButton pil1,pil2,pil3,pil4;
    int nomor=0;
    public static int benar,salah,hasil;


    String[]pertanyaankuis= new String[]{
            "1.Siapa Pemenang Piala Dunia 2018 ?",
            "2.Siapa Top Player pada Piala Dunia 2018 ?",
            "3.Dimana Piala Dunia 2018 diadakan"

    };

    String[]pilihanjawaban = new String[]{
            "Argentina, Brazil,Prancis ,  Turkey ",
            "Griezmann , Mbappe,  Ronaldo, Messi",
            "Indonesia , German , Brazil, Russia "
    };

    String[]jawabanbenar = new String[]{
            "Prancis",
            "Mbappe",
            "Russia"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        pertanyaan=findViewById(R.id.tv_pertanyaan);
        rg=findViewById(R.id.radio_group);
        pil1=findViewById(R.id.pil1);
        pil2=findViewById(R.id.pil2);
        pil3=findViewById(R.id.pil3);
        pil4=findViewById(R.id.pil4);
        pertanyaan.setText(pertanyaankuis[nomor]);
        pil1.setText(pilihanjawaban[0]);
        pil2.setText(pilihanjawaban[1]);
        pil3.setText(pilihanjawaban[2]);
        pil4.setText(pilihanjawaban[3]);
    }

    public void lanjut(View view){
        RadioButton jawaban_user= findViewById(rg.getCheckedRadioButtonId());
        String ambil_jawaban_user=jawaban_user.getText().toString();
        nomor++;
        if (nomor<pertanyaankuis.length){
            pertanyaan.setText(pertanyaankuis[nomor]);
            pil1.setText(pilihanjawaban[(nomor*4)+0]);
            pil2.setText(pilihanjawaban[(nomor*4)+1]);
            pil3.setText(pilihanjawaban[(nomor*4)+2]);
            pil4.setText(pilihanjawaban[(nomor*4)+3]);
            if (ambil_jawaban_user.equalsIgnoreCase(jawabanbenar[nomor]))benar++;
            else salah++;
        }
        else {
            hasil=benar*20;
            Intent selesai=new Intent(getApplicationContext(),HasilKuis.class);
            startActivity(selesai);

        }

    }
}
