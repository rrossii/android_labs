package com.example.pmp_lab3

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WifiNetworkAdapter(private val context: Context, private val wifiNetworks: List<WifiNetwork>) : RecyclerView.Adapter<WifiNetworkAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val networkNameSSID: TextView = itemView.findViewById(R.id.networkSSID)

        fun bindData(network: WifiNetwork) {
            networkNameSSID.text = network.ssid
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.wifi_network_item, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return wifiNetworks.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val wifiNetwork = wifiNetworks[position]
        holder.bindData(wifiNetwork)

        holder.itemView.setOnClickListener {
            val intent = Intent(context, MainActivity::class.java)
            intent.putExtra("networkSSID", wifiNetworks[position].ssid)
            context.startActivity(intent)
        }
    }

}