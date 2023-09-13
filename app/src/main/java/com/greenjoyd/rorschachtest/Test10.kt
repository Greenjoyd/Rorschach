package com.greenjoyd.rorschachtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.yandex.mobile.ads.banner.AdSize
import com.yandex.mobile.ads.banner.BannerAdView
import com.yandex.mobile.ads.common.AdRequest


class Test10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test10)

        val banner = findViewById<BannerAdView>(R.id.banner_ad_view)
        banner.setAdUnitId("R-M-2120579-1")
        banner.setAdSize(AdSize.BANNER_320x50)

        val adRequest = AdRequest.Builder().build()
        banner.loadAd(adRequest)
    }

    fun onClick10test1(view: View) {
        intent = Intent(this, Test10d::class.java)
        startActivity(intent)
        Variables.addHuman()
    }

    fun onClick10test2(view: View) {
        intent = Intent(this, Test10d::class.java)
        startActivity(intent)
        Variables.addAnimal()
    }

    fun onClick10test3(view: View) {
        intent = Intent(this, Test10d::class.java)
        startActivity(intent)
        Variables.addFantasy()
    }

    fun onClick10test4(view: View) {
        intent = Intent(this, Test10d::class.java)
        startActivity(intent)
        Variables.addItem()
    }

}