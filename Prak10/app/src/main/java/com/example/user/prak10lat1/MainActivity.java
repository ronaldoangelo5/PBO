package com.example.user.prak10lat1;

import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText edtJari,edtTinggi;
    private TextView txtVolume;
    private Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Hitung Luas Persegi Panjang");

        edtJari = (EditText) findViewById(R.id.jari);
        edtTinggi = (EditText) findViewById(R.id.tinggi);
        btnHitung = (Button) findViewById(R.id.hitung);
        txtVolume = (TextView) findViewById(R.id.volume);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String jari = edtJari.getText().toString().trim();
            String tinggi = edtTinggi.getText().toString().trim();

            double j = Double.parseDouble(jari);
            double t = Double.parseDouble(tinggi);

            double volume = 0.3*3.14*(j*j)* t;
            txtVolume.setText("Volume = "+volume);
            }
        });
    }
}
