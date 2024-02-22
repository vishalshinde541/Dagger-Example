package com.example.daggerexample

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AnalyticsServiceModule {

    @Singleton
    @Provides
    fun getAnalyticsService(): AnalyticsService {
        return MixPanel()
    }
}
