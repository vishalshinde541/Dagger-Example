package com.example.daggerexample

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class UserNotificationServiceModule() {

    @MessageQualifier
    @Provides
    fun getMessageService(retryCount : Int) : NotificationService {
        return MessageService(retryCount)
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService) : NotificationService {
        return EmailService()
    }
}