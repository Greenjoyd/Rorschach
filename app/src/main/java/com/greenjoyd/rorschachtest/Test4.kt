package com.greenjoyd.rorschachtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.yandex.mobile.ads.banner.AdSize
import com.yandex.mobile.ads.banner.BannerAdView
import com.yandex.mobile.ads.common.AdRequest

class Test4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test4)
    }

    fun onClick4test1(view: View) {
        intent = Intent(this, Test4d::class.java)
        startActivity(intent)
        Variables.addHuman()

        val banner = findViewById<BannerAdView>(R.id.banner_ad_view)
        banner.setAdUnitId("R-M-2120579-1")
        banner.setAdSize(AdSize.BANNER_320x50)

        val adRequest = AdRequest.Builder().build()
        banner.loadAd(adRequest)
    }

    fun onClick4test2(view: View) {
        intent = Intent(this, Test4d::class.java)
        startActivity(intent)
        Variables.addAnimal()
    }

    fun onClick4test3(view: View) {
        intent = Intent(this, Test4d::class.java)
        startActivity(intent)
        Variables.addFantasy()
    }

    fun onClick4test4(view: View) {
        intent = Intent(this, Test4d::class.java)
        startActivity(intent)
        Variables.addItem()
    }

}