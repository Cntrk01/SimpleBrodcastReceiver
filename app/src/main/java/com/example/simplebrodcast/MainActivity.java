package com.example.simplebrodcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void innerClassButton(View view){
        //!!manifestte receiver yaptık unutursak çalışmaz
        Intent intent=new Intent(this,BrodcastingInnerClass.class);
        sendBroadcast(intent); //brodcasti göndericez  BrodcastingInnerClass çalışacak
    }

    //Dışardaki sınıftan aldığımız kısım
    public void brodcastClassButton(View view){
        Intent intent=new Intent(this,BrodcastingClass.class);
        sendBroadcast(intent);
    }
    public static class BrodcastingInnerClass extends BroadcastReceiver{

        @Override
        public void onReceive(Context context, Intent intent) {
            Toast.makeText(context, "Inner Class Brodcast", Toast.LENGTH_SHORT).show();
        }
    }
}