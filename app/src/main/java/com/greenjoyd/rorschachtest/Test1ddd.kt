package com.greenjoyd.rorschachtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.yandex.mobile.ads.banner.AdSize
import com.yandex.mobile.ads.banner.BannerAdView
import com.yandex.mobile.ads.common.AdRequest

class Test1ddd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test1ddd)

        val banner = findViewById<BannerAdView>(R.id.banner_ad_view)
        banner.setAdUnitId("R-M-2120579-1")
        banner.setAdSize(AdSize.BANNER_320x50)

        val adRequest = AdRequest.Builder().build()
        banner.loadAd(adRequest)
    }


    fun onClickTest1dddBut1(view: View) {
        intent = Intent(this, Test2::class.java)
        startActivity(intent)
    }

    fun onClickTest1dddBut2(view: View) {
        intent = Intent(this, Test2::class.java)
        startActivity(intent)
        Variables.addForm()
    }

    fun onClickTest1dddBut3(view: View) {
        intent = Intent(this, Test2::class.java)
        startActivity(intent)
        Variables.addColor()
    }
}