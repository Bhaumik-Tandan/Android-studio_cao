package com.example.cao19BIT0292;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bot_dec extends AppCompatActivity {
    public static final String e="com.example.cao19BIT0292.extra.d1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bot_dec);
    }
     public void inc(View v)
    {
        Intent i=new Intent(this,BOOTH.class);
        i.putExtra(e,"10");
        startActivity(i);
    }
    public void bnc(View v)
    {
        Intent i=new Intent(this,BOOTH.class);
        i.putExtra(e,"2");
        startActivity(i);
    }
}