package com.superking.parchisi.starr.ldijdfs
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.superking.parchisi.starr.ldijdfs.Vdsetwysd.Companion.cxvok
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.orhanobut.hawk.Hawk
import com.superking.parchisi.starr.databinding.ActivityJujxopdsaBinding
import com.superking.parchisi.starr.ldijdfs.Vdsetwysd.Companion.qokkokosduij
import com.superking.parchisi.starr.ldijdfs.Vdsetwysd.Companion.ibjjicv
import com.superking.parchisi.starr.ldijdfs.Vdsetwysd.Companion.plasdokodas
import com.superking.parchisi.starr.ldijdfs.Vdsetwysd.Companion.pldsokasd
import com.superking.parchisi.starr.vcbfdf.Noislpdo


class Trsudwujis : AppCompatActivity() {
    lateinit var odkfkoekokof: ActivityJujxopdsaBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        odkfkoekokof = ActivityJujxopdsaBinding.inflate(layoutInflater)
        setContentView(odkfkoekokof.root)

        val ocxkkoxcv: String? = Hawk.get(ibjjicv, "null")

        if (ocxkkoxcv == "1") {
            AppsFlyerLib.getInstance()
                .init("9m3D6NWEfwFFwHZCsyi2om", psodlasld, applicationContext)
            AppsFlyerLib.getInstance().start(this)
        }

        rpeldlpas()

    }

    private fun rpeldlpas() {

        val vockockvockijds: String = Hawk.get(pldsokasd)
        val qposldakdas: String = Hawk.get(plasdokodas, "null")

        val fusdhsdhfujisdf: String? = Hawk.get(cxvok, "null") //здесь нужен дефолтный ноль
        val xcokvkoxcv: String? = Hawk.get(ibjjicv, "null")
        var spadoasdkoasdkoasdkojixc: String? = Hawk.get(qokkokosduij)

        if (xcokvkoxcv == "1") {
            Log.d("AppsChecker", xcokvkoxcv)
            val gokfdkodfjdf = Executors.newSingleThreadScheduledExecutor()
            gokfdkodfjdf.scheduleAtFixedRate({
                if (spadoasdkoasdkoasdkojixc != null) {

                    if (spadoasdkoasdkoasdkojixc!!.contains("tdb2") || vockockvockijds.contains(qposldakdas) || fusdhsdhfujisdf!!.contains("tdb2")) {
                        Log.d("Apps Checker", "naming: $spadoasdkoasdkoasdkojixc")
                        gokfdkodfjdf.shutdown()
                        onokbnnbk()
                    } else {
                        gokfdkodfjdf.shutdown()
                        foksdsdsdojiwd()
                    }
                } else {
                    spadoasdkoasdkoasdkojixc = Hawk.get(qokkokosduij)
                    Log.d("TestInUIHawk", "Received null $spadoasdkoasdkoasdkojixc")
                }
            }, 0, 1, TimeUnit.SECONDS)
        }  else if (vockockvockijds.contains(qposldakdas)) {
            onokbnnbk()
        } else {
            foksdsdsdojiwd()
        }

    }



    private fun foksdsdsdojiwd() {
        val pelsdkoskoalp = Intent(this@Trsudwujis, Noislpdo::class.java)
        Hawk.put(pldsokasd, null)
        Hawk.put(plasdokodas, null)
        startActivity(pelsdkoskoalp)
        finish()
    }


    private fun onokbnnbk() {
        val osaodpasddals = Intent(this@Trsudwujis, Nysiidjwjid::class.java)
        Hawk.put(pldsokasd, null)
        Hawk.put(plasdokodas, null)
        startActivity(osaodpasddals)
        finish()
    }

    private val psodlasld = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(eokdskod: MutableMap<String, Any>?) {
            val sdjai = eokdskod?.get("campaign").toString()
            Hawk.put(qokkokosduij, sdjai)
        }
        override fun onConversionDataFail(p0: String?) {}
        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {}
        override fun onAttributionFailure(p0: String?) {}
    }




}