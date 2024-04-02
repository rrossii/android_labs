package com.example.pmp_lab3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_connect_to_wifi)

        val recyclerView: RecyclerView = findViewById(R.id.listOfNetworks)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val wifiNetworks = listOf(
            WifiNetwork("Network 1"),
            WifiNetwork("Network 2"),
            WifiNetwork("Network 3"),
            WifiNetwork("Network 3"),
            WifiNetwork("Network 3"),
            WifiNetwork("Network 3")
        )

        val adapter = WifiNetworkAdapter(wifiNetworks)
        recyclerView.adapter = adapter
    }
}

