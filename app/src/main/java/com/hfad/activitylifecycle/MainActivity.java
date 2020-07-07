package com.hfad.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MyAndroid", "onCreate");
        Toast.makeText(MainActivity.this,"onCreate",Toast.LENGTH_LONG).show();

    }
    @Override
    public void onStart() {
        super.onStart();
        Log.d("MyAndroid", "onStart");
        Toast.makeText(MainActivity.this,"onStart",Toast.LENGTH_LONG).show();
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d("MyAndroid","onResume");
        Toast.makeText(MainActivity.this,"onResume",Toast.LENGTH_LONG).show();
    }
    public void onRestart(){
        super.onRestart();
        Log.d("MyAndroid","onRestart");
        Toast.makeText(MainActivity.this,"onRestart",Toast.LENGTH_LONG).show();
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d("MyAndroid","onPause");
        Toast.makeText(MainActivity.this,"onPause",Toast.LENGTH_LONG).show();
    }
    public void onStop() {
        super.onStop();
        Log.d("MyAndroid","onStop");
        Toast.makeText(MainActivity.this,"onStop",Toast.LENGTH_LONG).show();
    }
    public void onDestroy() {
        super.onDestroy();
        Log.d("MyAndroid","onDestroy");
        Toast.makeText(MainActivity.this,"onDestroy",Toast.LENGTH_LONG).show();
    }

}