package com.example.cao19BIT0292;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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
        Intent o=getIntent();
        String c=o.getStringExtra(Second.e);
        EditText a1 = findViewById(R.id.Au);
        EditText a2 = findViewById(R.id.Ade);
        String d1= a1.getText().toString();
        String d2= a2.getText().toString();
        int f=0;
        if(c=="2")
        {
                int o1 = Integer.parseInt(d1, 2);
                int o2 = Integer.parseInt(d2, 2);
                d1=Integer.toString(o1);
                d2=Integer.toString(o1);
        }
        if(f==0) {
            i.putExtra(e1, d1);
            i.putExtra(e2, d2);
            startActivity(i);
        }
    }
}