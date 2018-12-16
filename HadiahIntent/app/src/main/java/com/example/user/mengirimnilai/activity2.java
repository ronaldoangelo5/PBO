package com.example.user.mengirimnilai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

        TextView tvHasil = (TextView) findViewById(R.id.hasil);

        tvHasil.setText("Hasilnya adalah = " + getIntent().getStringExtra("hasil"));
    }

}
