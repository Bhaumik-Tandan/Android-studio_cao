package com.example.cao19BIT0292;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Contackus extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance("https://madproj-4b232-default-rtdb.asia-southeast1.firebasedatabase.app/");
    public void reg(View v)
    {
        EditText f=(EditText) findViewById(R.id.n);
        String name=f.getText().toString();
        f=(EditText) findViewById(R.id.rn);
        String rgno=f.getText().toString();
        DatabaseReference myRef = database.getReference(name);
        myRef.setValue(rgno);
        Context context = getApplicationContext();
        CharSequence text = "SENT";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contackus);
    }
}