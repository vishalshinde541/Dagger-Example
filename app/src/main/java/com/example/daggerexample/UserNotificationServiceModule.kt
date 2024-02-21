package com.example.daggerexample

import dagger.Module
import dagger.Provides

@Module
class UserNotificationServiceModule {

    @Provides
    fun getMessageService() : NotificationService {
        return MessageService()
    }
}