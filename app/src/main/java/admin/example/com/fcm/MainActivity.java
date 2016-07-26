package admin.example.com.fcm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.messaging.RemoteMessage;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        startService(new Intent(this, MyFirebaseMessagingService.class));
        Intent intent = new Intent("admin.example.com.fcm.MyFirebaseMessagingService");
        this.startService(intent);

    }

}
