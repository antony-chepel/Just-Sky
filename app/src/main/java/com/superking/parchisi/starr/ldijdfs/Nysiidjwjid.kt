package com.superking.parchisi.starr.ldijdfs
import android.content.pm.PackageManager
import android.net.Uri
import android.annotation.SuppressLint
import android.app.Activity

import java.io.IOException
import android.widget.Toast
import android.util.Log
import android.webkit.*

import com.appsflyer.AppsFlyerLib
import com.google.android.material.snackbar.Snackbar
import com.onesignal.OneSignal
import android.content.Intent



import com.superking.parchisi.starr.ldijdfs.Vdsetwysd.Companion.cxvok
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.provider.MediaStore

import com.orhanobut.hawk.Hawk
import com.superking.parchisi.starr.R
import com.superking.parchisi.starr.databinding.ActivityOpshbxBinding

import com.superking.parchisi.starr.ldijdfs.Vdsetwysd.Companion.icjxvjixcvjiv
import com.superking.parchisi.starr.ldijdfs.Vdsetwysd.Companion.cijvxicv


import org.json.JSONException
import org.json.JSONObject
import com.superking.parchisi.starr.ldijdfs.Vdsetwysd.Companion.qokkokosduij
import java.io.File


class Nysiidjwjid : AppCompatActivity() {
    lateinit var lsodakoaksd: WebView
    lateinit var ifjijsdok: ActivityOpshbxBinding
    var ewposod = ""
    private val bviokkobn = 1
    private var xcovkkoxcvokxcv = false

    var gijkookefokf: ValueCallback<Array<Uri>>? = null
    var irjokrkog: String? = null




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ifjijsdok = ActivityOpshbxBinding.inflate(layoutInflater)
        setContentView(ifjijsdok.root)

        lsodakoaksd = ifjijsdok.udijfsd
        Snackbar.make(
            ifjijsdok.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()


        val goktlplpfds = CookieManager.getInstance()
        goktlplpfds.setAcceptCookie(true)
        goktlplpfds.setAcceptThirdPartyCookies(lsodakoaksd, true)
        roeplplasdkasdoasd()
        val gokooflppd: Activity = this
        lsodakoaksd.webViewClient = object : WebViewClient() {


            override fun shouldOverrideUrlLoading(kockvx: WebView, apslaps: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(apslaps)) {
                        return false
                    }
                    if (xopxlzc(apslaps)) {

                        val tokrlpflef = Intent(Intent.ACTION_VIEW)
                        tokrlpflef.data = Uri.parse(apslaps)
                        startActivity(tokrlpflef)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
                kockvx.loadUrl(apslaps)
            }


            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)

                vjijfj(url)
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(gokooflppd, description, Toast.LENGTH_SHORT).show()
            }


        }
        lsodakoaksd.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                fodk: WebView, ockoxkcv: ValueCallback<Array<Uri>>,
                wpdls: FileChooserParams
            ): Boolean {
                gijkookefokf?.onReceiveValue(null)
                gijkookefokf = ockoxkcv
                var fokkroodsfok: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (fokkroodsfok!!.resolveActivity(packageManager) != null) {

                    var bokkvkovbkv: File? = null
                    try {
                        bokkvkovbkv = rijjikodsadsij()
                        fokkroodsfok.putExtra("PhotoPath", irjokrkog)
                    } catch (ex: IOException) {

                    }

                    if (bokkvkovbkv != null) {
                        irjokrkog = "file:" + bokkvkovbkv.absolutePath
                        fokkroodsfok.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(bokkvkovbkv)
                        )
                    } else {
                        fokkroodsfok = null
                    }
                }
                val forkokfdlps = Intent(Intent.ACTION_GET_CONTENT)
                forkokfdlps.addCategory(Intent.CATEGORY_OPENABLE)
                forkokfdlps.type = "image/*"
                val ijvcjicx: Array<Intent?> =
                    fokkroodsfok?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val ldsoaksdaoksad = Intent(Intent.ACTION_CHOOSER)
                ldsoaksdaoksad.putExtra(Intent.EXTRA_INTENT, forkokfdlps)
                ldsoaksdaoksad.putExtra(Intent.EXTRA_TITLE, getString(R.string.image_chooser))
                ldsoaksdaoksad.putExtra(Intent.EXTRA_INITIAL_INTENTS, ijvcjicx)
                startActivityForResult(
                    ldsoaksdaoksad, bviokkobn
                )
                return true
            }

            @Throws(IOException::class)
            private fun rijjikodsadsij(): File {
                var vockbokcvij = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!vockbokcvij.exists()) {
                    vockbokcvij.mkdirs()
                }

                vockbokcvij =
                    File(vockbokcvij.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return vockbokcvij
            }

        }

        lsodakoaksd.loadUrl(roeoisdkkoad())
    }


    @SuppressLint("SetJavaScriptEnabled")
    private fun roeplplasdkasdoasd() {
        val ffdko = lsodakoaksd.settings
        ffdko.builtInZoomControls = true
        ffdko.setSupportMultipleWindows(false)

        ffdko.domStorageEnabled = true
        ffdko.userAgentString = ffdko.userAgentString.replace("; wv", "")
        ffdko.useWideViewPort = true

        ffdko.displayZoomControls = false
        ffdko.setSupportZoom(true)
        ffdko.setAppCacheEnabled(true)


        ffdko.pluginState = WebSettings.PluginState.ON
        ffdko.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW

        ffdko.javaScriptCanOpenWindowsAutomatically = true
        ffdko.javaScriptEnabled = true
        ffdko.allowContentAccess = true
        ffdko.loadWithOverviewMode = true
        ffdko.allowFileAccess = true

    }
    private fun xopxlzc(sidj: String): Boolean {

        val dsokad = packageManager
        try {

            dsokad.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)

            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }



    override fun onActivityResult(tysdu: Int, ovkokbv: Int, lsdaosop: Intent?) {
        if (tysdu != bviokkobn || gijkookefokf == null) {
            super.onActivityResult(tysdu, ovkokbv, lsdaosop)
            return
        }
        var froidso: Array<Uri>? = null


        if (ovkokbv == AppCompatActivity.RESULT_OK) {
            if (lsdaosop == null || lsdaosop.data == null) {

                froidso = arrayOf(Uri.parse(irjokrkog))
            } else {
                val bigkokfb = lsdaosop.dataString
                if (bigkokfb != null) {
                    froidso = arrayOf(Uri.parse(bigkokfb))
                }
            }
        }
        gijkookefokf?.onReceiveValue(froidso)
        gijkookefokf = null
    }





    private fun roeoisdkkoad(): String {
        val vockkocijdsij = "com.superking.parchisi.starr"
        val ijsaidas = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
        val kxcijijxcvxcv = "ad_id="
        val dsijasdjijisad = Build.VERSION.RELEASE
        val ovbkvb = AppsFlyerLib.getInstance().getAppsFlyerUID(this)
        val frooefkkoksda: String? = Hawk.get(cxvok, "null")
        val wodslplpasd:String? = Hawk.get(qokkokosduij, "null")
        val apsoldkwodw: String? = Hawk.get(icjxvjixcvjiv, "null")
        AppsFlyerLib.getInstance().setCollectAndroidID(true)
        val wokdkosakod = "naming"
        val qpwokdsajisjd = "sub_id_6="
        val viockcv = "deviceID="
        val ropllpsda = "sub_id_4="
        val qpldpaskodas = "deeporg"
        val ijzxcjixij = "sub_id_5="
        val qplspds = "sub_id_1="

        val xcijvoxcj = Hawk.get(cijvxicv, "null")

        var opkoasdkkasd = ""
        if (wodslplpasd != "null"){
            opkoasdkkasd = "$xcijvoxcj$qplspds$wodslplpasd&$viockcv$ovbkvb&$kxcijijxcvxcv$apsoldkwodw&$ropllpsda$vockkocijdsij&$ijzxcjixij$dsijasdjijisad&$qpwokdsajisjd$wokdkosakod"
            ijokdsadjias(ovbkvb.toString())
        } else {
            opkoasdkkasd = "$xcijvoxcj$qplspds$frooefkkoksda&$viockcv$ovbkvb&$kxcijijxcvxcv$apsoldkwodw&$ropllpsda$vockkocijdsij&$ijzxcjixij$dsijasdjijisad&$qpwokdsajisjd$qpldpaskodas"
            ijokdsadjias(ovbkvb.toString())
        }

        Log.d("TESTAG", "Test Result $opkoasdkkasd")
        return ijsaidas.getString("SAVED_URL", opkoasdkkasd).toString()
    }









    fun vjijfj(clvopbjks: String?) {
        if (!clvopbjks!!.contains("t.me")) {

            if (ewposod == "") {
                ewposod = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    clvopbjks
                ).toString()

                val xczijxc = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val posdoakdasji = xczijxc.edit()
                posdoakdasji.putString("SAVED_URL", clvopbjks)
                posdoakdasji.apply()
            }
        }
    }

    private fun ijokdsadjias(xozckzokxsji: String) {
        OneSignal.setExternalUserId(
            xozckzokxsji,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(qowkwdkokod: JSONObject) {
                    try {
                        if (qowkwdkokod.has("push") && qowkwdkokod.getJSONObject("push").has("success")) {
                            val xizcjxjizij = qowkwdkokod.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $xizcjxjizij"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (qowkwdkokod.has("email") && qowkwdkokod.getJSONObject("email").has("success")) {
                            val mcxjzcijzxhusa =
                                qowkwdkokod.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $mcxjzcijzxhusa"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (qowkwdkokod.has("sms") && qowkwdkokod.getJSONObject("sms").has("success")) {
                            val forkkoefejkosd = qowkwdkokod.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $forkkoefejkosd"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }


    override fun onBackPressed() {


        if (lsodakoaksd.canGoBack()) {
            if (xcovkkoxcvokxcv) {
                lsodakoaksd.stopLoading()
                lsodakoaksd.loadUrl(ewposod)
            }
            this.xcovkkoxcvokxcv = true
            lsodakoaksd.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                xcovkkoxcvokxcv = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }





}