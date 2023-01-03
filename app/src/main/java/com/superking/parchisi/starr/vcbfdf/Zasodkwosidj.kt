package com.superking.parchisi.starr.vcbfdf


import com.superking.parchisi.starr.ldijdfs.Vdsetwysd.Companion.ibjjicv
import kotlinx.coroutines.Dispatchers
import com.orhanobut.hawk.Hawk
import com.superking.parchisi.starr.ldijdfs.Trsudwujis
import kotlinx.coroutines.GlobalScope
import android.content.Intent
import com.superking.parchisi.starr.ldijdfs.Vdsetwysd.Companion.pldsokasd
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.util.Log
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.superking.parchisi.starr.R

import com.superking.parchisi.starr.ldijdfs.Vdsetwysd.Companion.icjxvjixcvjiv
import com.superking.parchisi.starr.ldijdfs.Vdsetwysd.Companion.plasdokodas





import kotlinx.coroutines.launch

class Zasodkwosidj : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jujxopdsa)
        foooosdak()
    }


    private fun qposldlw() {
        val bovkkovb = Intent(this@Zasodkwosidj, Trsudwujis::class.java)
        startActivity(bovkkovb)
        finish()
    }

    private fun cokokkdsf() {
        val eoksdkoa = Intent(this@Zasodkwosidj, Noislpdo::class.java)
        Hawk.put(pldsokasd, null)
        Hawk.put(plasdokodas, null)
        startActivity(eoksdkoa)
        finish()
    }


    private fun djsijfjs(): String? {
        val psdoasld: String? = Hawk.get(ibjjicv)
        Log.d("ADACt Data", psdoasld.toString())
        return psdoasld
    }



    private fun foooosdak() {

        val qpsdkdso = djsijfjs()

        if (qpsdkdso == "0") {
            cokokkdsf()

        } else {
            GlobalScope.launch(Dispatchers.Default) {
                polkisajjiasd()
            }
            qposldlw()
        }
    }
    private fun polkisajjiasd(){
        val dsuhad = AdvertisingIdClient(applicationContext)
        dsuhad.start()
        val qplsd = dsuhad.info.id
        Log.d("getAdvertisingId = ", qplsd.toString())
        Hawk.put(icjxvjixcvjiv, qplsd)
    }
















}