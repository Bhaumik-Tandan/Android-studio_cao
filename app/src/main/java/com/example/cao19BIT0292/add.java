package com.example.cao19BIT0292;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class add extends AppCompatActivity {
    public static final String e1="com.example.cao19BIT0292.extra.d1";
    public static final String e2="com.example.cao19BIT0292.extra.d2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
    }
    public void onc(View v)
    {
        Intent i=new Intent(this,ares.class);
        EditText a1 = findViewById(R.id.Au);
        EditText a2 = findViewById(R.id.Ade);
        String d1= a1.getText().toString();
        String d2= a2.getText().toString();
        i.putExtra(e1,d1);
        i.putExtra(e2,d2);
        startActivity(i);
    }
}