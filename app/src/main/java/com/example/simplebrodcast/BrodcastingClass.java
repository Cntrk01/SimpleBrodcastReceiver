package com.example.simplebrodcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BrodcastingClass extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Brodcasting Class", Toast.LENGTH_SHORT).show();
    }
}
