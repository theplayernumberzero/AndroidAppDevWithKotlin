package com.example.services

import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.app.JobIntentService

// Job intent class not using right now because of Workspaces
// It doesn't use main thread
class JobIntentServiceExample : JobIntentService() {
    override fun onHandleWork(intent: Intent) {
        Log.d("Service","Job intent service started.")
        Log.d("Service Thread", Thread.currentThread().name)
    }

    companion object{   //We can access this func directly using the class name
        fun myBackgroundService(context: Context, intent: Intent){
            enqueueWork(context, JobIntentServiceExample::class.java,1,intent)
        }
    }

    override fun onDestroy() {  //Stop services itself
        super.onDestroy()
        Log.d("Service","Job intent service stopped.")
    }

}