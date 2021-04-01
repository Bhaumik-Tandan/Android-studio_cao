package com.example.cao19BIT0292;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class BOOTH extends AppCompatActivity {
    public static final String e1="com.example.cao19BIT0292.extra.d1";
    public static final String e2="com.example.cao19BIT0292.extra.d2";
    public static final String e3="com.example.cao19BIT0292.extra.d3";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_o_o_t_h);
    }
    public void ac(View v)
    {
        Switch s= (Switch) findViewById(R.id.s1);
        Boolean sw = s.isChecked();
        TextView h=(TextView) findViewById(R.id.t4);
        EditText H=(EditText) findViewById(R.id.editTextNumber);
        if(sw==Boolean.FALSE)
        {
            H.setVisibility(View.GONE);
            h.setVisibility(View.GONE);
            H.setText("");
        }
        else
        {
            H.setVisibility(View.VISIBLE);
            h.setVisibility(View.VISIBLE);
        }
    }
    public void fun()
    {
        Context context = getApplicationContext();
        CharSequence text = "Number of bits cannot exceed 13!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void onc(View v)
    {
        Intent i=new Intent(this,BOOTH_MULTIPLICATION.class);
        Intent o=getIntent();
        String c=o.getStringExtra(Second.e);
        EditText a1 = findViewById(R.id.Au);
        EditText a2 = findViewById(R.id.Ade);
        EditText a3 = findViewById(R.id.editTextNumber);
        String d1= a1.getText().toString();
        String d2= a2.getText().toString();
        String d3= a3.getText().toString();
        int f=0;
        if(c.equals("2"))
        {
            try {

                int o1 = Integer.parseInt(d1, 2);
                int o2 = Integer.parseInt(d2, 2);
                d1=Integer.toString(o1);
                d2=Integer.toString(o2);
            }
            catch (Exception e)
            {
                Context context = getApplicationContext();
                CharSequence text = "ONLY 0 and 1 allowed!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                f=1;
            }
        }
        String ch1=Integer.toBinaryString(Integer.parseInt(d1));
        String ch2=Integer.toBinaryString(Integer.parseInt(d2));
        int d4=ch1.length()>ch2.length()?ch1.length():ch2.length();
        try {
            int g=Integer.parseInt(d3);
            d3=Integer.toString(d4);
            if(g<d4)
            {
                Context context = getApplicationContext();
                CharSequence text = "Numbers of bits cannot be less!";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                f=1;
            }
            else
                d3=Integer.toString(g);
        }
        catch(Exception e)
        {
            d3=Integer.toString(d4);;
        }
        if(Integer.parseInt(e3)>13)
        {
            fun();
            f=1;
        }
        if(f==0){
            i.putExtra(e1, d1);
            i.putExtra(e2, d2);
            i.putExtra(e3, d3);
            startActivity(i);}

    }
}