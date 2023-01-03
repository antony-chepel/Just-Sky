package com.superking.parchisi.starr.ldijdfs

import android.app.Application
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk

class Vdsetwysd : Application() {
    companion object {
        var ibjjicv = "appsChecker"
        var qokkokosduij: String? = "c11"
        var cijvxicv = "link"

        var pldsokasd = "geo"
        const val rijfiddpsla = "75071878-c484-432f-9850-5d9121a72df2"
        var icjxvjixcvjiv: String? = "mainid"
        var cxvok: String? = "d11"

        var plasdokodas: String? = "countryCode"
    }

    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(rijfiddpsla)
        Hawk.init(this).build()
    }
}