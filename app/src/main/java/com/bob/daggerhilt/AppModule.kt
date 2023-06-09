package com.bob.daggerhilt

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
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

//    Note #6 inject with context
    @Singleton
    @Provides
    fun provideEngingeWithContext(
        @ApplicationContext context: Context
    ): EngineWithContext {
        return EngineWithContext(context)
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