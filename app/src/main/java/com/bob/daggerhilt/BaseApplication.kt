package com.bob.daggerhilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/*
@HiltAndroidApp harus didefinisikan, dan class BaseApplication
harus didaftarkan juga di manifest seperti berikut
 android:name=".BaseApplication"
*/
@HiltAndroidApp
class BaseApplication: Application() {

}