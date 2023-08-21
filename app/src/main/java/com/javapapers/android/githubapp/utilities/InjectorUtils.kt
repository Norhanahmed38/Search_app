package com.javapapers.android.githubapp.utilities

import com.javapapers.android.githubapp.data.Database
import com.javapapers.android.githubapp.data.MainRepository
import com.javapapers.android.githubapp.main.MainViewModelFactory

object InjectorUtils {

    // This will be called from QuotesActivity
    fun provideQuotesViewModelFactory(): MainViewModelFactory {
        // ViewModelFactory needs a repository, which in turn needs a DAO from a database
        // The whole dependency tree is constructed right here, in one place
        val mainRepository = MainRepository.getInstance(Database.getInstance().usersDao)
        return MainViewModelFactory(mainRepository)
    }
}