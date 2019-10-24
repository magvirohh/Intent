package com.uty.datamahasiswa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val NIM = nim.text
        val NAMA = nama.text
        val NILAI = nilai.text

        supportActionBar?.title = "Input Data"
        supportActionBar?.subtitle = "Vivi Belajar Kotlin"

        button_p.setOnClickListener() {
        intent = Intent(this, ActivityTampil::class.java)
            intent.putExtra("Nim", NIM)
            intent.putExtra("Nama", NAMA)
            intent.putExtra("Nilai", NILAI)

            val nilaiKet = nilai.toString().toInt()
            if (nilaiKet >= 90){
                intent.putExtra("Keterangan","A")
            }else if (nilaiKet >= 70){
                intent.putExtra("Keterangan","B")
            }else if (nilaiKet >= 50){
                intent.putExtra("Keterangan","C")
            }else if (nilaiKet >= 30){
                intent.putExtra("Keterangan","D")
            }else if (nilaiKet >= 10){
                intent.putExtra("Keterangan","E")
            }
            startActivity(intent)
        }
    }
}