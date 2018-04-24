package com.nikpatel.digitalgrow.Notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.nikpatel.digitalgrow.R;
import com.nikpatel.digitalgrow.ServiceDemo.ServiceActivityDemo;
import com.nikpatel.digitalgrow.ServiceDemo.ServiceDemo;

public class NotificationActivityDemo extends AppCompatActivity implements View.OnClickListener {


    Toolbar toolbar;
    Button btnStart,btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_demo);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnStart = (Button) findViewById(R.id.btnStart);
        btnStop = (Button) findViewById(R.id.btnStop);

        btnStart.setOnClickListener(this);
        btnStop.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.btnStart:

                NotificationCompat.Builder builder = new NotificationCompat.Builder(this);

                builder.setSmallIcon(R.drawable.ic_android);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                PendingIntent pendingIntent = PendingIntent.getActivity(this,0,intent,0);
                builder.setContentIntent(pendingIntent);
                builder.setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher_round));
                builder.setContentTitle("Title of Notification");
                builder.setContentText("textttt offfff notificationnnnnnnnnn");
                builder.setSubText("kjhgfdsdfghjkljhgfdsrtyukljhgfdrtyhjgfdgykhfykjhgftyhjmdgfgjhggdftg");


                NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

                notificationManager.notify(3,builder.build());
                break;

            case R.id.btnStop:
                NotificationManager notificationManager1 = (NotificationManager) getApplicationContext().getSystemService(NOTIFICATION_SERVICE);
                notificationManager1.cancel(3);

                break;

            default:
                break;

        }
    }
}
