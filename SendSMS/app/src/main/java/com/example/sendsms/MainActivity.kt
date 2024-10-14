package com.example.sendsms

import android.os.Build
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // on below line we are creating variable
    // for edit text phone and message and button
    lateinit var phoneEdt: EditText
    lateinit var messageEdt: EditText
    lateinit var sendMsgBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initializing variables of phone edt,
        // message edt and send message btn.
        phoneEdt = findViewById(R.id.idEdtPhone)
        messageEdt = findViewById(R.id.idEdtMessage)
        sendMsgBtn = findViewById(R.id.idBtnSendMessage)

        // adding on click listener for send message button.
        sendMsgBtn.setOnClickListener {

            // on below line we are creating two
            // variables for phone and message
            val phoneNumber = phoneEdt.text.toString()
            val message = messageEdt.text.toString()

            // on the below line we are creating a try and catch block
            try {

                // on below line we are initializing sms manager.
                //as after android 10 the getDefault function no longer works
                //so we have to check that if our android version is greater
                //than or equal to android version 6.0 i.e SDK 23
                val smsManager:SmsManager
                if (Build.VERSION.SDK_INT>=23) {
                    //if SDK is greater that or equal to 23 then
                    //this is how we will initialize the SmsManager
                    smsManager = this.getSystemService(SmsManager::class.java)
                }
                else{
                    //if user's SDK is less than 23 then
                    //SmsManager will be initialized like this
                    smsManager = SmsManager.getDefault()
                }

                // on below line we are sending text message.
                smsManager.sendTextMessage(phoneNumber, null, message, null, null)

                // on below line we are displaying a toast message for message send,
                Toast.makeText(applicationContext, "Message Sent", Toast.LENGTH_LONG).show()

            } catch (e: Exception) {

                // on catch block we are displaying toast message for error.
                Toast.makeText(applicationContext, "Please enter all the data.."+e.message.toString(), Toast.LENGTH_LONG)
                    .show()
            }
        }
    }
}