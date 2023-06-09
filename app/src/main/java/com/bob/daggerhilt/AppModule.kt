package com.bob.daggerhilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import javax.inject.Singleton

@Module
@InstallIn(Singleton::class)
object AppModule {

    @Singleton
    @Provides
    fun provideEnginge(): Engine {
        return Engine()
    }
}