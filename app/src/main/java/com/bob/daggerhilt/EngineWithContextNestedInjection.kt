package com.bob.daggerhilt

import android.content.Context

//Note #7
class EngineWithContextNestedInjection(private val context: Context, private val owner: String) {

    fun startEngineWithContextNestedInjection(){
        println("${context.getString(R.string.injection)} by $owner (EngineWithContextNestedInjection)")
    }
}