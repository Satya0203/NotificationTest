package com.example.anew.notificationtest;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.NotificationBuilderWithBuilderAccessor;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void notification(View view)
    {
        NotificationCompat.Builder builder= (NotificationCompat.Builder)new NotificationCompat.Builder(this,"");
        builder.setContentTitle("helllo");
        builder.setSubText("tjsglg");
        builder.setSmallIcon(R.drawable.ic_android_black_24dp);
        NotificationManager n=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        builder.setAutoCancel(true);
        n.notify(12,builder.build());
        }
}
