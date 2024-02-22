package com.example.daggerexample

import android.content.ContentValues.TAG
import android.util.Log

interface AnalyticsService {
    fun trackEvents(eventName: String, eventType: String)
}

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

