package com.example.daggerexample

import dagger.Module
import dagger.Provides

@Module
class AnalyticsServiceModule {

    @Provides
    fun getAnalyticsService(): AnalyticsService {
        return MixPanel()
    }
}
