package com.example.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class ClassicServiceExample : Service() {
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()

        Log.d("Service", "Classic service is created")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        Log.d("Service", "Classic service is started")
        Log.d("Service Thread", Thread.currentThread().name)

        //  stopSelf() //Automatically stop after finish the task

        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        Log.d("Service", "Classic service is stopped")
        super.onDestroy()
    }
}