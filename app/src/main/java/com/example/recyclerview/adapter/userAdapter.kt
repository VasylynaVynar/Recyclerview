package com.example.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.model.userModel
import kotlinx.android.synthetic.main.item_user_layout.view.*

class userAdapter (private val context: Context ): RecyclerView.Adapter <userAdapter.UserViewHolder>() {

    private var userList = emptyList<userModel>()


    class UserViewHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user_layout, parent, false)
   return UserViewHolder (view)
    }

    override fun onBindViewHolder (holder: UserViewHolder, position: Int) {
       holder.itemView.tv_last_name.text = userList[position].lastName
        holder.itemView.tv_first_name.text = userList[position].firstName
        holder.itemView.setOnClickListener{
            Toast.makeText(context, "$position",Toast.LENGTH_LONG)
        }
    }

    override fun getItemCount(): Int {
        return userList.size
    }
    fun setList(list: List<userModel>){
        userList = list
        notifyDataSetChanged()
    }
}