package com.bob.daggerhilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideEnginge(): Engine {
        return Engine()
    }

//    Note #4
    @Singleton
    @Provides
    @Named("string1")
    fun provideString() = "example of string injection"

//    Note #5
    @Singleton
    @Provides
    @Named("string2")
    fun otherProvideString() = "another example of string injection"
}