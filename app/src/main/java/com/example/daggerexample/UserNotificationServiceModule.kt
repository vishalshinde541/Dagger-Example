package com.example.daggerexample

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class UserNotificationServiceModule {

    @Provides
    fun getMessageService() : NotificationService {
        return MessageService()
    }

//    @Binds
//    abstract fun getEmailService(emailService: EmailService) : NotificationService
}