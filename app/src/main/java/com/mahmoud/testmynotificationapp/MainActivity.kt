package com.mahmoud.testmynotificationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var notificationHelper:Notifications?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        notificationHelper= Notifications(this)
    }

    fun ch1oncklick(view: View) {

        notificationHelper!!.Notify(1,notificationHelper!!.Notify1("First",etmessage.text.toString()))
    }
    fun ch2oncklick(view: View) {
        notificationHelper!!.Notify(2,notificationHelper!!.Notify2("Second",etmessage.text.toString()))

    }
    fun ch3oncklick(view: View) {
        notificationHelper!!.Notify(3,notificationHelper!!.Notify3("third",etmessage.text.toString()))

    }
}