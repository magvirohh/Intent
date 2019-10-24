package com.uty.datamahasiswa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tampil.*
import kotlinx.android.synthetic.main.activity_main.*

class ActivityTampil : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampil)

        val bundle = intent.extras
        val getNim = bundle?.get("Nim")
        val getName = bundle?.get("Nama")
        val getNilai = bundle?.get("Nilai")
        val getKet = bundle?.get("Keterangan")

        Nim.text = getNim.toString()
        Nama.text = getName.toString()
        Nilai.text = getNilai.toString()
        Keterangan.text= getKet.toString()

    }
}