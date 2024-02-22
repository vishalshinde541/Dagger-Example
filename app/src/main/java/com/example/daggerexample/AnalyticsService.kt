package com.example.daggerexample

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Singleton

interface AnalyticsService {
    fun trackEvents(eventName: String, eventType: String)
}

@Singleton
class MixPanel : AnalyticsService {
    override fun trackEvents(eventName: String, eventType: String) {
        Log.d(TAG, "MixPanel : $eventName - $eventType")
    }

}

class FirebaseAnalytics : AnalyticsService {
    override fun trackEvents(eventName: String, eventType: String) {
        Log.d(TAG, "Firebase : $eventName - $eventType")
    }

}

