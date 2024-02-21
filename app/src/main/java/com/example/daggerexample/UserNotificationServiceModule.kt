package com.example.daggerexample

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class UserNotificationServiceModule(private val retryCount : Int) {

    @MessageQualifier
    @Provides
    fun getMessageService() : NotificationService {
        return MessageService(retryCount)
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService) : NotificationService {
        return EmailService()
    }
}