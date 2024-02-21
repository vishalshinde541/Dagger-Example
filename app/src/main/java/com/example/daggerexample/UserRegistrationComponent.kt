package com.example.daggerexample

import dagger.Component

@Component(modules = [UserRepositoryModule::class, UserNotificationServiceModule::class])
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)

}