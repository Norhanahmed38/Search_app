package com.javapapers.android.githubapp.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.javapapers.android.githubapp.data.MainRepository

class MainViewModelFactory(private val mainRepository: MainRepository)
    : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(mainRepository) as T
    }
}