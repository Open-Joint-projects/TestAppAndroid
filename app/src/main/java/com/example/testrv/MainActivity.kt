package com.example.testrv
import CustomAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.my_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomAdapter() // Замените CustomAdapter на фактический класс вашего адаптера

        val customAdapter = CustomAdapter()
        customAdapter.addData("Значение 1")
        customAdapter.addData("Значение 2")
        // И так далее
        recyclerView.adapter = customAdapter
    }
}