package com.example.cao19BIT0292;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Second extends AppCompatActivity {
    public static final String e="com.example.cao19BIT0292.extra.d1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void inc(View v)
    {
        Intent i=new Intent(this,add.class);
        i.putExtra(e,"10");
        startActivity(i);
    }
    public void bnc(View v)
    {
        Intent i=new Intent(this,add.class);
        i.putExtra(e,"2");
        startActivity(i);
    }
    public void obnc(View v)
    {
        Intent i=new Intent(this,add.class);
        i.putExtra(e,"8");
        startActivity(i);
    }
    public void hbnc(View v)
    {
        Intent i=new Intent(this,add.class);
        i.putExtra(e,"16");
        startActivity(i);
    }
}