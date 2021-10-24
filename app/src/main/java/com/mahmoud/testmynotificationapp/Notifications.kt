package com.mahmoud.testmynotificationapp

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.ContextWrapper
import android.graphics.Color

class Notifications(context:Context):ContextWrapper(context) {
    val manager:NotificationManager by lazy {
        getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
    }
    init {

        val chan1=NotificationChannel(First_channel,"First channel",NotificationManager.IMPORTANCE_DEFAULT)
        chan1.lightColor=Color.MAGENTA
        chan1.lockscreenVisibility=Notification.VISIBILITY_PRIVATE
        manager.createNotificationChannel(chan1)


        val chan2=NotificationChannel(second_channel,"second channel",NotificationManager.IMPORTANCE_DEFAULT)
        chan2.lightColor=Color.MAGENTA
        chan2.lockscreenVisibility=Notification.VISIBILITY_PRIVATE
        manager.createNotificationChannel(chan2)


        val chan3=NotificationChannel(third_channel,"third channel",NotificationManager.IMPORTANCE_DEFAULT)
        chan3.lightColor=Color.MAGENTA
        chan3.lockscreenVisibility=Notification.VISIBILITY_PRIVATE
        manager.createNotificationChannel(chan3)

    }

    fun Notify1(title:String,body:String):Notification.Builder{
        return Notification.Builder(applicationContext, First_channel)
            .setContentText(body)
            .setContentTitle(title)
            .setSmallIcon(R.drawable.ic_launcher_background)
            .setAutoCancel(true)
    }

    fun Notify2(title:String,body:String):Notification.Builder{
        return Notification.Builder(applicationContext, second_channel)
            .setContentText(body)
            .setContentTitle(title)
            .setSmallIcon(R.drawable.ic_launcher_background)
            .setAutoCancel(true)
    }

    fun Notify3(title:String,body:String):Notification.Builder{
        return Notification.Builder(applicationContext, third_channel)
            .setContentText(body)
            .setContentTitle(title)
            .setSmallIcon(R.drawable.ic_launcher_background)
            .setAutoCancel(true)
    }

     fun Notify(id:Int,notification: Notification.Builder){
         manager.notify(id,notification.build())
     }


    companion object{
        val First_channel="First"
        val second_channel="second"
        val third_channel="third"

    }
}