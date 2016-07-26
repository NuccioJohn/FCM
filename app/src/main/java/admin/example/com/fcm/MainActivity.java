package admin.example.com.fcm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.messaging.RemoteMessage;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent  i = getIntent();
        if(savedInstanceState.getString("MyKey") != null){
            Toast.makeText(this, "Code :" +
                    savedInstanceState.getString("MyKey"),
                    Toast.LENGTH_LONG).show();
        }

    }

}
