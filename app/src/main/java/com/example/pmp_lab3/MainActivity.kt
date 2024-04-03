package com.example.pmp_lab3

import android.app.Dialog
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : ComponentActivity() {
    private lateinit var dialog: Dialog
    private lateinit var dialogCancelBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_of_wifi_networks)

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

        val adapter = WifiNetworkAdapter(this, wifiNetworks)
        recyclerView.adapter = adapter

//        dialog = Dialog(this)
//        dialogCancelBtn = dialog.findViewById(R.id.cancelButton)
//        dialog.window?.setBackgroundDrawableResource(R.drawable.rounded_white_background)
//
//        dialogCancelBtn.setOnClickListener {
//            dialog.dismiss()
//        }
//
//        dialog.setContentView(R.layout.dialog_connect_to_network)
//        dialog.setCancelable(true)
//        val networkSSID = intent.getStringExtra("networkSSID")
//        val tvEnterPasswordForNetwork: TextView = dialog.findViewById(R.id.tvEnterPassword)
//        val tvWithNetworkSSID = tvEnterPasswordForNetwork.text.toString() + networkSSID
//        tvEnterPasswordForNetwork.text = tvWithNetworkSSID
//
//        dialog.show()
    }
}

