package com.example.hoangtri58131427lifecyle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.d("Lifecycle", "onCreate");

        Toast toast = Toast.makeText(getApplicationContext(),"...",Toast.LENGTH_LONG);
        toast.show();


        textView = findViewById(R.id.textview);

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");
        String datetime =simpleDateFormat.format(calendar.getTime());
        textView.setText(datetime);
    }



    @Override
    protected void onStart() {
        super.onStart();

        Log.d("Lifecycle", "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("Lifecycle", "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("Lifecycle", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("Lifecycle", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("Lifecycle", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("Lifecycle", "onDestroy");
    }
}
