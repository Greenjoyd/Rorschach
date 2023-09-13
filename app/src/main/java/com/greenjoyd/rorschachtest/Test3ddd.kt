package com.greenjoyd.rorschachtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.yandex.mobile.ads.banner.AdSize
import com.yandex.mobile.ads.banner.BannerAdView
import com.yandex.mobile.ads.common.AdRequest

class Test3ddd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test3ddd)

        val banner = findViewById<BannerAdView>(R.id.banner_ad_view)
        banner.setAdUnitId("R-M-2120579-1")
        banner.setAdSize(AdSize.BANNER_320x50)

        val adRequest = AdRequest.Builder().build()
        banner.loadAd(adRequest)
    }

    fun onClickTest3dddBut1(view: View) {
        intent = Intent(this, Test4::class.java)
        startActivity(intent)
    }

    fun onClickTest3dddBut2(view: View) {
        intent = Intent(this, Test4::class.java)
        startActivity(intent)
        Variables.addForm()
    }

    fun onClickTest3dddBut3(view: View) {
        intent = Intent(this, Test4::class.java)
        startActivity(intent)
        Variables.addColor()
    }
}