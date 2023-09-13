package com.greenjoyd.rorschachtest

import android.content.Intent
import android.content.Intent.createChooser
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.greenjoyd.rorschachtest.databinding.ActivityEndTestBinding
//подключаем библиотеки от Yandex
import com.yandex.mobile.ads.interstitial.InterstitialAd
import com.yandex.mobile.ads.common.AdRequest
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
import com.yandex.mobile.ads.common.AdRequestError
import com.yandex.mobile.ads.common.ImpressionData
import kotlinx.android.synthetic.main.activity_end_test.*


class endTest : AppCompatActivity() {
    private var mInterstitialAd: InterstitialAd? =
        null //создаем приватную переменную для полноэкранной рекламы


    private lateinit var binding: ActivityEndTestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEndTestBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Variables.Show()

        mInterstitialAd = InterstitialAd(this) // создание экземпляра объекта рекламы
        mInterstitialAd!!.setAdUnitId(AdUnitId)
        val adRequest = AdRequest.Builder().build() // построение и подготовка для показа
        mInterstitialAd!!.setInterstitialAdEventListener(object :
            InterstitialAdEventListener { //слушатель для различных событий показа полноэкранной рекламы
            override fun onAdLoaded() {
                mInterstitialAd!!.show()
            }

            override fun onAdFailedToLoad(adRequestError: AdRequestError) {}
            override fun onAdShown() {}
            override fun onAdDismissed() {}
            override fun onAdClicked() {}
            override fun onLeftApplication() {}
            override fun onReturnedToApplication() {}
            override fun onImpression(impressionData: ImpressionData?) {}
        })
        mInterstitialAd!!.loadAd(adRequest) //показ полноэкранной рекламы


        binding.Restart.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            Variables.Restart()
        }

        var content1 = ""
        var content2 = ""

        var result = Variables.MaxContain();
        if (result == 1) {
            val TV = binding.root;
            setContentView(TV)
            binding.TV.text = getString(R.string.Human)
            content1 = getString(R.string.Human)
        } else if (result == 2) {
            val TV = binding.root;
            setContentView(TV)
            binding.TV.text = getString(R.string.Animal)
            content1 = getString(R.string.Animal)
        } else if (result == 3) {
            val TV = binding.root;
            setContentView(TV)
            binding.TV.text = getString(R.string.Fantasy)
            content1 = getString(R.string.Fantasy)
        } else {
            val TV = binding.root;
            setContentView(TV)
            binding.TV.text = getString(R.string.Item)
            content1 = getString(R.string.Item)
        }

        var result2 = Variables.MaxFormal()
        if (result2 == 1) {
            val TV2 = binding.root;
            setContentView(TV2)
            binding.TV2.text = getString(R.string.Whole)
            content2 = getString(R.string.Whole)
        } else if (result2 == 2) {
            val TV2 = binding.root;
            setContentView(TV2)
            binding.TV2.text = getString(R.string.Color)
            content2 = getString(R.string.Color)
        } else if (result2 == 3) {
            val TV2 = binding.root;
            setContentView(TV2)
            binding.TV2.text = getString(R.string.Ditails)
            content2 = getString(R.string.Ditails)
        } else if (result2 == 4) {
            val TV2 = binding.root;
            setContentView(TV2)
            binding.TV2.text = getString(R.string.Form)
            content2 = getString(R.string.Form)
        } else {
            val TV2 = binding.root;
            setContentView(TV2)
            binding.TV2.text = getString(R.string.Movement)
            content2 = getString(R.string.Movement)
        }
        binding.share.setOnClickListener {
            val appLink = "https://play.google.com/store/apps/details?id=com.greenjoyd.rorschachtest"
            val intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "$content1 $content2 $appLink")
                type = "text/plain"
            }
            val startIntent = createChooser(intent, getString(R.string.chooser_share_post))
            startActivity(startIntent)
        }

    }


    companion object {
        private const val AdUnitId =
            "R-M-2120579-4" // содержит уникальный ID полноэкранной рекламы созданной в личном кабинете рекламной сети Яндекса
    }
}





