package com.example.cao19BIT0292;

import androidx.appcompat.app.AppCompatActivity;

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
    public void onc(View v)
    {
        Intent i=new Intent(this,Second.class);
        startActivity(i);
    }
    public void ap(View v)
    {
        Intent i=new Intent(this,Contackus.class);
        startActivity(i);
    }
    public void apc(View v)
    {
        Intent i=new Intent(this,bot_dec.class);
        startActivity(i);
    }
    public void bd(View v)
    {
        Intent i=new Intent(this,bd_i.class);
        startActivity(i);
    }
}