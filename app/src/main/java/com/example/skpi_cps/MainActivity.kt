package com.example.skpi_cps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnTambahBarang = findViewById<Button>(R.id.btnTambahData)
        var btnLihatData = findViewById<Button>(R.id.btnLihatData)
        var btnUbahData= findViewById<Button>(R.id.btnUbahdata)
        var btnHapusData= findViewById<Button>(R.id.btnHapusdata)

        btnLihatData.setOnClickListener {
            var lihat = Intent(applicationContext,LihatData::class.java)
            startActivity(lihat)
        }
        btnTambahBarang.setOnClickListener {
            var tambah = Intent(applicationContext,TambahData::class.java)
            startActivity(tambah)
        }
        btnUbahData.setOnClickListener {
            var ubah = Intent(applicationContext,UbahData::class.java)
            startActivity(ubah)
        }
        btnHapusData.setOnClickListener {
            var hapus = Intent(applicationContext,HapusData::class.java)
            startActivity(hapus)
        }

    }
}