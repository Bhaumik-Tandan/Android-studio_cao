package com.example.cao19BIT0292;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class BOOTH_MULTIPLICATION extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_o_o_t_h__m_u_l_t_i_p_l_i_c_a_t_i_o_n);
        Intent i=getIntent();
        String m=i.getStringExtra(BOOTH.e1);
        int mu=Integer.parseInt(m);
        m=i.getStringExtra(BOOTH.e2);
        int mp=Integer.parseInt(m);
        m=i.getStringExtra(BOOTH.e3);
        int SC=Integer.parseInt(m);
        TextView rel1 =  findViewById(R.id.T1);
        TextView rel2 =  findViewById(R.id.T2);
        TextView rel3 =  findViewById(R.id.T3);
    }
}