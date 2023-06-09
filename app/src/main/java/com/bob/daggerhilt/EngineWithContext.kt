package com.bob.daggerhilt

import android.content.Context

//Note #6
class EngineWithContext(private val context: Context) {

    fun startEngineWithContext(){
        println(context.getString(R.string.injection))
    }
}