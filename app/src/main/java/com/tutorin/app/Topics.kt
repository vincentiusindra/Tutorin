package com.tutorin.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tutorin.app.`object`.dataHome
import com.tutorin.app.adapter.topicsAdapter
import com.tutorin.app.student.HomeFragment
import kotlinx.android.synthetic.main.activity_topics.*


class Topics : AppCompatActivity() {


    private var listJudul = mutableListOf<String>("Dasar Berbisnis", "Kewirausahawan", "Bisnis 1", "Bisnis 2", "Bisnis 3", "Bisnis 4")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_topics)
        val ss = intent.getSerializableExtra(HomeFragment.TOPICS_NAME) as dataHome
        val topicsName: TextView = findViewById(R.id.topicsName)
        topicsName.text = ss.topicName
        businessRecyclerView.adapter = topicsAdapter(listJudul)
        businessRecyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        businessRecyclerView.setHasFixedSize(true)

    }
}