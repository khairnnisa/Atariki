package com.example.atariki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HalamanUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_utama);

        TextView text = findViewById(R.id.berhasil);
        TextView total1 = findViewById(R.id.total);
        TextView disc = findViewById(R.id.discount);
        TextView bel = findViewById(R.id.belanja);
        Intent intent = getIntent();
        String sum = intent.getStringExtra("Coba");

        int tot = intent.getIntExtra("Bayar", 0);
        int discount = intent.getIntExtra("Discount", 0);
        int belanja = tot - discount;
        text.setText(sum);
        total1.setText("Rp. " + tot);
        disc.setText("RP. " + disc);
        bel.setText("Rp. " + belanja);
    }
}