
package com.javapapers.android.githubapp.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.javapapers.android.githubapp.data.User
import com.javapapers.android.githubapp.databinding.ItemUserBinding

class UsersAdapter(private var usersList: List<User>) : RecyclerView.Adapter<UsersAdapter.UserViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = ItemUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user: User = usersList[position]
        holder.bind(user)
    }

    override fun getItemCount(): Int {
        return usersList.size
    }

    fun updateList(users: List<User>?) {
        users?.let{
            usersList = it
            notifyDataSetChanged()
        }
    }


    class UserViewHolder(var binding: ItemUserBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(user: User){
            binding.user=user
        }
    }
}