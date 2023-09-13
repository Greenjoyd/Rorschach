package com.greenjoyd.rorschachtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.yandex.mobile.ads.banner.AdSize
import com.yandex.mobile.ads.banner.BannerAdView

class Test2ddd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test2ddd)

        val banner = findViewById<BannerAdView>(R.id.banner_ad_view)
        banner.setAdUnitId("R-M-2120579-1")
        banner.setAdSize(AdSize.BANNER_320x50)

        val adRequest = com.yandex.mobile.ads.common.AdRequest.Builder().build()

        banner.loadAd(adRequest)

    }

    fun onClickTest2dddBut1(view: View) {
        intent = Intent(this, Test3::class.java)
        startActivity(intent)
    }

    fun onClickTest2dddBut2(view: View) {
        intent = Intent(this, Test3::class.java)
        startActivity(intent)
        Variables.addForm()
    }

    fun onClickTest2dddBut3(view: View) {
        intent = Intent(this, Test3::class.java)
        startActivity(intent)
        Variables.addColor()
    }
}