package com.example.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BroadcastExample : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {

        val isAirplaneMod : Boolean = intent!!.getBooleanExtra("state", false)

        if (isAirplaneMod){
            Toast.makeText(context,"The device is in airplane mod..",Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(context,"The device is NOT in airplane mod..",Toast.LENGTH_SHORT).show()
        }

    }
}