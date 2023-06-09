package com.bob.daggerhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

//    Note #2
    @Inject
    lateinit var engine: Engine

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Note #1
        Normal injection without dagger
        val engine = Engine()
        engine.startEngine()
         */

//        Note #3
        engine.startEngine()
    }
}