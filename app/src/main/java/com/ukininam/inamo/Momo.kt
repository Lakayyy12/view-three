package com.ukininam.inamo

import android.os.Bundle
import com.wishland.advertisement.ui.AdsActivity
import com.wishland.advertisement.ui.WebViewActivity

class Momo : AdsActivity(test = false) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }

        override fun onAdsFallback() {
            startActivity(WebViewActivity.createIntent(this, "https://blog.bigo.tv/en/best-apps/hot-live-streaming-app/" ))
            finish()
        }

        override fun onAdsLinkLoaded(adsLink: String) {
            startActivity(WebViewActivity.createIntent(this, adsLink))
            finish()
        }
}