package com.example.cao19BIT0292;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class divisionbi extends AppCompatActivity {
    static int n;

    static String pad(String k) {
        String s = "";
        for (int i = 0; i < n - k.length(); i++)
            s += "0";
        return s + k;
    }

    static String add(String p, String d) {
        int i = n - 1;
        int c = 0;
        int s, a, b;
        while (i >= 0) {
            a = Character.getNumericValue(p.charAt(i));
            b = Character.getNumericValue(d.charAt(i));
            s = (a ^ b) ^ c;
            c = a & b | c & (a ^ b);
            d = d.substring(0, i) + s + d.substring(i + 1);
            i -= 1;
        }
        return c + d;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divisionbi);
        Intent in=getIntent();
        String m=in.getStringExtra(bd_in.e1);
        String ds= Integer.toBinaryString(Integer.parseInt(m));
        m=in.getStringExtra(bd_in.e2);
        String dd=Integer.toBinaryString(Integer.parseInt(m));
        String a, q, b;
        if(ds.length()>dd.length()/2)
        n = ds.length();
        else
            n=dd.length()/2;
        q = dd.substring(dd.length() - n);
        a = pad(dd.substring(0, dd.length() - n));
        b = pad(ds);
        int sc = n;
        String co="",eo="",ao=""+a,qo=""+q,sco=""+Integer.toBinaryString(sc);
        while (sc > 0) {
            char e = a.charAt(0);
            a = a.substring(1, n) + q.charAt(0);
            q = q.substring(1, n) + "0";
            co=co+"\n\n\nShl EAQ";
            eo=eo+"\n\n\n"+e;
            ao=ao+"\n\n\n"+a;
            qo=qo+"\n\n\n"+q;
            sco=sco+"\n\n\n";
            String s = "";
            for (int i = 0; i < n; i++)
                s = s + (b.charAt(i) == '0' ? "1" : "0");
            s = add(pad("1"), s).substring(1);
            a = add(a, s);
            co=co+"\nADD B'+1";
            eo=eo+"\n"+"";
            ao=ao+"\n"+s;
            qo=qo+"\n";
            sco=sco+"\n";
            if (e == '0')
                e = a.charAt(0);
            a = a.substring(1);
            if (e == '1') {
                q = q.substring(0, n - 1) + "1";
                co=co+"\nE = 1\nSET Qn = 1";
                eo=eo+"\n"+"1\n1";
                ao=ao+"\n"+a+"\n"+a;
                qo=qo+"\n\n"+q;
                sco=sco+"\n\n"+ Integer.toBinaryString(--sc);
            } else {
                co=co+"\nE=0\nleave Qn=0\nADD B";
                eo=eo+"\n\n"+"1\n";
                ao=ao+"\n"+a+"\n\n"+b;
                qo=qo+"\n"+q+"\n\n";
                sco=sco+"\n\n\n";
                a = add(a, b);
                e = a.charAt(0);
                a = a.substring(1);
                co=co+"\nRestore\nremainder";
                eo=eo+"\n\n"+e;
                ao=ao+"\n\n"+a;
                qo=qo+"\n\n";
                sco=sco+"\n\n"+ Integer.toBinaryString(--sc);
            }
        }
        TextView rel =  findViewById(R.id.c);
        rel.setText(co+"\n\nNeglect E\nRemainder in \nQoutient in Q");
        rel =  findViewById(R.id.e);
        rel.setText(eo+"\n\n\nA\n");
        rel =  findViewById(R.id.a);
        rel.setText(ao+"\n\n\n"+a+"\n");
        rel =  findViewById(R.id.q);
        rel.setText(qo+"\n\n\n\n"+q);
        rel =  findViewById(R.id.s);
        rel.setText(sco);
        rel =  findViewById(R.id.o);
        rel.setText("Qoutient in binary = "+q+"\nQoutient in integer = "+Integer.parseInt(q,2)+
                "\n\nRemainder in binary = "+a+"\nRemainder in integer = "+Integer.parseInt(a,2));
        rel.setGravity(Gravity.CENTER_HORIZONTAL);
    }
}