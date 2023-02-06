package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.adapter.userAdapter
import com.example.recyclerview.databinding.ActivityMainBinding
import com.example.recyclerview.model.userModel

class MainActivity : AppCompatActivity () {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter: userAdapter
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initial()
    }

    private fun initial() {
       recyclerView = binding.rvUser
        adapter = userAdapter(this)
        recyclerView.adapter = adapter
        adapter.setList(myUser())

    }

    fun myUser (): ArrayList<userModel> {
        val userList = ArrayList<userModel>()
        val user = userModel("Кравець","Андрій")
        userList.add(user)

        val user2 = userModel("Винар","Василина")
        userList.add(user2)

        val user3 = userModel("Хомяк","Олександра")
        userList.add(user3)

        val user4 = userModel("Петров","Андрій")
        userList.add(user4)

        return userList
    }
}