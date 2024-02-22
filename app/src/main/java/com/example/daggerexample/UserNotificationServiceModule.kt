package com.example.daggerexample

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class UserNotificationServiceModule() {

    @ActivityScope
    @MessageQualifier
    @Provides
    fun getMessageService() : NotificationService {
        return MessageService(3)
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService) : NotificationService {
        return EmailService()
    }
}