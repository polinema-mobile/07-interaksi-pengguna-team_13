package com.example.interaksipengguna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SimpanData extends AppCompatActivity {
    TextView txtNama, txtNomerInduk, txtTanggalLahir, txtJenisKelamin, txtJurusan;
    String nama, nomerInduk,tanggalLahir, jenisKelamin, jurusan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simpan_data);

        txtNama = findViewById(R.id.tvUsername);
        txtNomerInduk = findViewById(R.id.tvNim);
        txtTanggalLahir = findViewById(R.id.tvTglLahir);
        txtJenisKelamin = findViewById(R.id.tvJnsKelamin);
        txtJurusan = findViewById(R.id.tvJurusan);

        Intent intent = getIntent();
        Parcelable p = intent.getParcelableExtra("pr");

        nama = p.getNama();
        nomerInduk = p.getNomerInduk();
        tanggalLahir = p.getTanggalLahir();
        jenisKelamin = p.getJenisKelamin();
        jurusan = p.getJurusan();

        txtNama.setText(nama);
        txtNomerInduk.setText(nomerInduk);
        txtTanggalLahir.setText(tanggalLahir);
        txtJenisKelamin.setText(jenisKelamin);
        txtJurusan.setText(jurusan);

    }
}