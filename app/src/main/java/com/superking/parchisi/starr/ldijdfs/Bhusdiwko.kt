package com.superking.parchisi.starr.ldijdfs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.superking.parchisi.starr.databinding.ActivityBhusdiwkoBinding
import com.superking.parchisi.starr.vcbfdf.Cfrfewsada
import com.superking.parchisi.starr.vcbfdf.Noislpdo
import kotlin.random.Random

class Bhusdiwko : AppCompatActivity() {
    private lateinit var ksndsan : ActivityBhusdiwkoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ksndsan = ActivityBhusdiwkoBinding.inflate(layoutInflater)
        setContentView(ksndsan.root)
        ksndsan.eokkods.text = Cfrfewsada.listrres[Random.nextInt(6)]
        ksndsan.bokvkovbji.setOnClickListener {
            startActivity(Intent(this,Noislpdo::class.java))
        }
    }
}