package com.app.myvaliu.views.activities

import android.content.Intent
import android.os.Handler
import com.app.myvaliu.R

class SplashA : BaseActivity() {

    override fun setLayout(): Int = R.layout.a_splash

    override fun create() {
        Handler().postDelayed({
            val i = Intent(this,WalkThroughA::class.java)
            startActivity(i)
        },2000)
    }


}