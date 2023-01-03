package com.superking.parchisi.starr.vcbfdf

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

interface Jshddwijd {


    @GET("json/?key=mFBNVQSnCdDASI9")
    suspend fun asqpplqspl(): Response<Hiosdijw>

    @GET("const.json")
    suspend fun fijfooksd(): Response<Deosdokw>


}

@Keep
data class Deosdokw(
    @SerializedName("geo")
    val fopdosow: String,
    @SerializedName("view")
    val xijcokskoa: String,
    @SerializedName("appsChecker")
    val wokdw: String,
)

@Keep
data class Hiosdijw(
    @SerializedName("city")
    val mkxixocsa: String,
    @SerializedName("country")
    val fijjife: String,
    @SerializedName("countryCode")
    val wospsdokw: String,
)
