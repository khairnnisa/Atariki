package com.example.atariki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //MAKANAN
        final CheckBox makanan1 = findViewById(R.id.Ramen0riginal);
        final CheckBox makanan2 = findViewById(R.id.ChizuRamen);
        final CheckBox makanan3 = findViewById(R.id.BeefTeriyaki);
        final CheckBox makanan4 = findViewById(R.id.BeefCurry);
        final CheckBox makanan5 = findViewById(R.id.Takoyaki);
        final CheckBox makanan6 = findViewById(R.id.ChickenKaraage);



        //JUMLAH MAKANAN
        final EditText jml_mkn1 = findViewById(R.id.jumlahRamenOriginal);
        final EditText jml_mkn2 = findViewById(R.id.jumlahChizuRamen);
        final EditText jml_mkn3 = findViewById(R.id.jumlahBeefTeriyaki);
        final EditText jml_mkn4 = findViewById(R.id.jumlahBeefCurry);
        final EditText jml_mkn5 = findViewById(R.id.jumlahTakoyaki);
        final EditText jml_mkn6 = findViewById(R.id.jumlahChickenKaraage);
        Button btn = findViewById(R.id.submit);

        //HARGA MAKANAN
        final int harga_ramenoriginal = 29000;
        final int harga_chizuramen = 31000;
        final int harga_beefteriyaki = 31000;
        final int harga_beefcurry = 31000;
        final int harga_takoyaki = 20000;
        final int harga_chickenkaraage = 25000;

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!makanan1.isChecked() && !makanan2.isChecked() && !makanan3.isChecked() && !makanan4.isChecked() && !makanan5.isChecked() && !makanan6.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Silahkan Pilih Makanan", Toast.LENGTH_SHORT).show();
                } else {
                    String text = "";
                    int totOrder = 0;
                    int discount = 0;
                    if (makanan1.isChecked()) {
                        String hasil = "Ramen Original ";
                        int jml = Integer.parseInt(String.valueOf(jml_mkn1.getText()));
                        int cal = jml * harga_ramenoriginal;
                        text += jml + "\t\t" + hasil + "\t\t\t\t\t\t\t\t\t" + "Rp. " + cal + "\n\n";
                        totOrder = totOrder + cal;

                    }
                    if (makanan2.isChecked()) {
                        String hasil = "Chizu Ramen ";
                        int jml = Integer.parseInt(String.valueOf(jml_mkn2.getText()));
                        int cal = jml * harga_chizuramen;
                        text += jml + "\t\t" + hasil + "\t\t\t\t\t\t\t\t\t" + "Rp. " + cal + "\n\n";
                        totOrder = totOrder + cal;
                    }
                    if (makanan3.isChecked()) {
                        String hasil = "Beef Teriyaki ";
                        int jml = Integer.parseInt(String.valueOf(jml_mkn3.getText()));
                        int cal = jml * harga_beefteriyaki;
                        text += jml + "\t\t" + hasil + "\t\t\t\t\t\t\t\t\t" + "Rp. " + cal + "\n\n";
                        totOrder = totOrder + cal;
                    }
                    if (makanan4.isChecked()) {
                        String hasil = "Beef Curry ";
                        int jml = Integer.parseInt(String.valueOf(jml_mkn4.getText()));
                        int cal = jml * harga_beefcurry;
                        text += jml + "\t\t" + hasil + "\t\t\t\t\t\t\t\t\t" + "Rp. " + cal + "\n\n";
                        totOrder = totOrder + cal;
                    }
                    if (makanan5.isChecked()) {
                        String hasil = "Takoyaki ";
                        int jml = Integer.parseInt(String.valueOf(jml_mkn5.getText()));
                        int cal = jml * harga_takoyaki;
                        text += jml + "\t\t" + hasil + "\t\t\t\t\t\t\t\t\t" + "Rp. " + cal + "\n\n";
                        totOrder = totOrder + cal;
                    }
                    if (makanan6.isChecked()) {
                        String hasil = "Chicken Karaage ";
                        int jml = Integer.parseInt(String.valueOf(jml_mkn6.getText()));
                        int cal = jml * harga_chickenkaraage;
                        text += jml + "\t\t" + hasil + "\t\t\t\t\t\t\t\t\t" + "Rp. " + cal + "\n\n";
                        totOrder = totOrder + cal;
                    }
                    if (totOrder > 100000) {
                        discount = 10000;
                    }
                    Intent intent = new Intent(MainActivity.this, HalamanUtama.class);
                    intent.putExtra("Coba", text);
                    intent.putExtra("Bayar", totOrder);
                    intent.putExtra("Discout", discount);
                    startActivity(intent);
                }
            }

        });

    }
}