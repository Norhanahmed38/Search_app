package com.javapapers.android.githubapp.data

import com.google.gson.annotations.SerializedName
import com.javapapers.android.githubapp.data.User

data class UsersList(@SerializedName("items") val uList : List<User>)
