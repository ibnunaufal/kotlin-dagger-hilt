package com.bob.daggerhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

//    Note #2
    @Inject
    lateinit var engine: Engine

//    Note #6
    @Inject
    lateinit var engineWithContext: EngineWithContext

//    Note #4
    @Inject
    @Named("string1")
    lateinit var injectedString: String

//    Note #5
    @Inject
    @Named("string2")
    lateinit var otherInjectedString: String

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

//        Note #4
        println("injectedString = $injectedString")

//        Note #5
        println("otherInjectedString = $otherInjectedString")

//        Note #6
        engineWithContext.startEngineWithContext()
    }
}