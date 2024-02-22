package com.example.daggerexample

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsServiceModule::class])
interface AppComponent {

    fun getAnalyticsService() : AnalyticsService

}