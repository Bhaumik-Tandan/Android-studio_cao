package com.example.cao19BIT0292;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class bd_in extends AppCompatActivity {
    public static final String e1="com.example.cao19BIT0292.extra.d1";
    public static final String e2="com.example.cao19BIT0292.extra.d2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bd_in);
    }
    public void onc(View v)
    {
        Intent i=new Intent(this,divisionbi.class);
        Intent o=getIntent();
        String c=o.getStringExtra(bd_i.e);
        EditText a1 = findViewById(R.id.Au);
        EditText a2 = findViewById(R.id.Ade);
        String d1= a1.getText().toString();
        String d2= a2.getText().toString();
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
        else if(c.equals("8"))
        {
            try {

                int o1 = Integer.parseInt(d1, 8);
                int o2 = Integer.parseInt(d2, 8);
                d1=Integer.toString(o1);
                d2=Integer.toString(o2);
            }
            catch (Exception e)
            {
                Context context = getApplicationContext();
                CharSequence text = "ONLY NUMBERS BETWEEN 0 to 7 allowed!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                f=1;
            }

        }
        else if(c.equals("16"))
        {
            try {

                int o1 = Integer.parseInt(d1, 16);
                int o2 = Integer.parseInt(d2, 16);
                d1=Integer.toString(o1);
                d2=Integer.toString(o2);
            }
            catch (Exception e)
            {
                Context context = getApplicationContext();
                CharSequence text = "INVALID INPUT!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                f=1;
            }

        }
        if(Integer.toBinaryString(Integer.parseInt(d1)).length()>13 || Integer.toBinaryString(Integer.parseInt(d2)).length()>26)
        {
            Context context = getApplicationContext();
            CharSequence text = "Limit exceeded";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            f=1;
        }
        if(Integer.parseInt(d1)>Integer.parseInt(d2))
        {
            Context context = getApplicationContext();
            CharSequence text = "DIVISOR cannot exceed DIVIDEND";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            f=1;
        }
        if(f==0){
            i.putExtra(e1, d1);
            i.putExtra(e2, d2);
            startActivity(i);}

    }
}