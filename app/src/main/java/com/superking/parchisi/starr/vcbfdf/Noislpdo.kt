package com.superking.parchisi.starr.vcbfdf

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ImageView
import com.superking.parchisi.starr.databinding.ActivityNoislpdoBinding
import com.superking.parchisi.starr.ldijdfs.Bhusdiwko
import java.util.*
import kotlin.collections.ArrayList

class Noislpdo : AppCompatActivity() {
    private var cxiovjvxcojk: CountDownTimer? = null
    var icvjjbi: Handler = Handler(Looper.getMainLooper())
    var sodkaskod = ArrayList<ImageView>()

    private var qpslpdals : CountDownTimer? = null

    private lateinit var vockbcbko: ActivityNoislpdoBinding
    var psadoasdlasdk: Int = 0
    var sadaiojasdij: Runnable = Runnable { }






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vockbcbko = ActivityNoislpdoBinding.inflate(layoutInflater)
        setContentView(vockbcbko.root)


        psadoasdlasdk = 0
        vockbcbko.difjdfis.text = "0"






        vockbcbko.rokdos.setOnClickListener {
            rokokd()
        }

        vockbcbko.coxkvxcv.setOnClickListener {
            rokokd()
        }
        vockbcbko.wosodpls.setOnClickListener {
            rokokd()
        }
        vockbcbko.zpxlclpxzok.setOnClickListener {
            rokokd()
        }
        vockbcbko.vokcbobkcv.setOnClickListener {
            rokokd()
        }




        sodkaskod = arrayListOf(
            vockbcbko.wosodpls,
            vockbcbko.zpxlclpxzok,
            vockbcbko.rokdos,
            vockbcbko.coxkvxcv,
            vockbcbko.vokcbobkcv,
            vockbcbko.udiwqdo,

            )
        wopslxm()

        riojdfijsdf()
    }

    @SuppressLint("SetTextI18n")
    fun rokokd() {
        psadoasdlasdk++
        vockbcbko.difjdfis.text = "Catched : $psadoasdlasdk"
    }

    private fun rokekoerko() = with(vockbcbko){
        vokbv.visibility = View.VISIBLE
        kdsfisdij.visibility = View.GONE
        vokbkov.visibility = View.GONE
        psdodaslk.visibility = View.VISIBLE
        onkokbnobko.visibility = View.GONE
        xozoxkcs.visibility = View.GONE
        fpofgpf.visibility = View.VISIBLE
        var cioxvjixc = 0
        cxiovjvxcojk?.cancel()
        cxiovjvxcojk = object : CountDownTimer(3000,100){
            override fun onTick(millisUntilFinished: Long) {
                cioxvjixc++
                if(cioxvjixc>6)cioxvjixc = 0
                eoksodk.text = Cfrfewsada.listdi[cioxvjixc]
            }

            override fun onFinish() {
                eoksodk.text = Cfrfewsada.listdi[kotlin.random.Random.nextInt(7)]
                Handler().postDelayed({
                    startActivity(Intent(this@Noislpdo,Bhusdiwko::class.java))
                    fpofgpf.visibility = View.VISIBLE
                    psdodaslk.visibility = View.GONE
                    vokbv.visibility = View.GONE
                    onkokbnobko.visibility = View.VISIBLE
                    vokbkov.visibility = View.VISIBLE
                    xozoxkcs.visibility = View.VISIBLE
                    kdsfisdij.visibility = View.VISIBLE
                },2000)


            }

        }.start()

    }


    private fun wopslxm() {
        sadaiojasdij = Runnable {
            for (rasdfasdgasdgshad in sodkaskod) {
                rasdfasdgasdgshad.visibility = View.INVISIBLE
            }
            val fidj = Random()
            val coxkv = fidj.nextInt(5 - 0)
            sodkaskod[coxkv].visibility = View.VISIBLE
            icvjjbi.postDelayed(sadaiojasdij, 400)
        }
        icvjjbi.post(sadaiojasdij)
    }




    override fun onDestroy() {
        super.onDestroy()
        qpslpdals?.cancel()
    }

    @SuppressLint("SetTextI18n")
    fun riojdfijsdf() {
        psadoasdlasdk = 0
        vockbcbko.difjdfis.text = "Catched : $psadoasdlasdk"
        wopslxm()
        vockbcbko.xozoxkcs.text = "Time : " + 15000 / 1000

        for (gio in sodkaskod) {
            gio.visibility = View.INVISIBLE
        }

        qpslpdals = object : CountDownTimer(10000, 1000) {
            @SuppressLint("SetTextI18n")
            override fun onFinish() {
                vockbcbko.xozoxkcs.text = "Time's up!!!"
                icvjjbi.removeCallbacks(sadaiojasdij)
                rokekoerko()
            }

            @SuppressLint("SetTextI18n")
            override fun onTick(p0: Long) {
                vockbcbko.xozoxkcs.text = "Time : " + p0 / 1000
            }
        }.start()
    }
}