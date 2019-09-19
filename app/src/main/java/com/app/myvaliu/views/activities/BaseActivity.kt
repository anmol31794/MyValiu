package com.app.myvaliu.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import com.app.myvaliu.R
import com.app.myvaliu.utils.Const

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(setLayout())
        getDefaults()
        create()
    }

    abstract fun create()

    abstract fun setLayout() : Int

    private fun getDefaults() {
        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        Const.screenHeight = displayMetrics.heightPixels
        Const.screenWidth = displayMetrics.widthPixels
    }


}
