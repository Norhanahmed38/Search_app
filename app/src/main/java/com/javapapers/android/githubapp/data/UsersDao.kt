package com.javapapers.android.githubapp.data

import androidx.lifecycle.MutableLiveData
import com.javapapers.android.githubapp.services.RetrofitService
import com.javapapers.android.githubapp.data.User
import com.javapapers.android.githubapp.data.UsersList
import retrofit2.Call

class UsersDao constructor(private val retrofitService: RetrofitService) {
    private var usersList = mutableListOf<User>()
    private val users = MutableLiveData<List<User>>()
    private val userProfile = MutableLiveData<User>()

    init {
        users.value = usersList
    }


    fun searchForUsers(queryMap: Map<String, String>): Call<UsersList> {
        return retrofitService.getSearchUsers(queryMap)
    }

    fun getUserProfile(username: String): Call<User> {
        return retrofitService.getUserProfile(username)
    }


}