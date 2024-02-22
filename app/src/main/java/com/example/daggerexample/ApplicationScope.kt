package com.example.daggerexample

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Scope


@Scope
@MustBeDocumented
@Retention(RetentionPolicy.RUNTIME)
annotation class ApplicationScope()
