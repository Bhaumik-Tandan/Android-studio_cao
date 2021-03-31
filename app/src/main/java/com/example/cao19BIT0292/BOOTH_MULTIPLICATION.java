package com.example.cao19BIT0292;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.Html;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BOOTH_MULTIPLICATION extends AppCompatActivity {
    static int n,sc;
    static String qr,br,ac;
    static String pad(String k)
    {
        String s="";
        for(int i=0;i<n-k.length();i++)
            s+="0";
        return s+k;
    }
    static String add(String p,String d)
    {
        int i=n-1;
        int c=0;
        int s,a,b;
        while(i>=0)
        {
            a=Character.getNumericValue(p.charAt(i));
            b=Character.getNumericValue(d.charAt(i));
            s=(a^b)^c;
            c=a&b|c&(a^b);
            d=d.substring(0,i)+s+d.substring(i+1);
            i-=1;
        }
        return d;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_o_o_t_h__m_u_l_t_i_p_l_i_c_a_t_i_o_n);
        Intent i=getIntent();
        String m=i.getStringExtra(BOOTH.e1);
        TextView text = (TextView) findViewById(R.id.textVw3);
        text.setText(Html.fromHtml("Q<sub>r</sub>"));
        TextView rel =  findViewById(R.id.asd);
        rel.setGravity(Gravity.CENTER_HORIZONTAL);
        TextView tex = (TextView) findViewById(R.id.ttView3);
        tex.setText(Html.fromHtml("Q<sub>n+1</sub>"));
        int mu=Integer.parseInt(m);
        m=i.getStringExtra(BOOTH.e2);
        int mp=Integer.parseInt(m);
        m=i.getStringExtra(BOOTH.e3);
        n=Integer.parseInt(m);
        qr=pad(Integer.toBinaryString(mp));
        br=pad(Integer.toBinaryString(mu));
        ac=pad("");
        rel.setText("Result= "+Integer.parseInt(qr,2)*Integer.parseInt(br,2)+"\nIn Binary= "+(Integer.toBinaryString(Integer.parseInt(qr,2)*Integer.parseInt(br,2))));
        sc=n;
        char q1='0';
        LinearLayout tal = (LinearLayout) findViewById(R.id.res);
        String c="",a=""+ac,q=""+qr,qn=""+q1,si=""+Integer.toBinaryString(sc);
        while(sc>0)
        {
            //condition for 10 we will subtract
            if(qr.charAt(n-1)=='1' && q1=='0')
            {
                String s="";
                for(int j=0;j<n;j++)
                    s=s+(br.charAt(j)=='0'?"1":"0");//finding complement
                s=add(pad("1"),s);//2's complement
                c=c+"\n"+"AC+BR'+1\n";
                ac=add(ac,s);
                a=a+"\n"+s+"\n"+ac;
                q=q+"\n\n";
                qn=qn+"\n\n";
                si=si+"\n\n";
            }
            else if(qr.charAt(n-1)=='0' && q1=='1')
            {
                c=c+"\n"+"AC+BR"+"\n";
                ac=add(ac,br);
                a=a+"\n"+br+"\n"+ac;
                q=q+"\n\n";
                qn=qn+"\n\n";
                si=si+"\n\n";
            }
            q1=qr.charAt(n-1);
            qr=ac.charAt(n-1)+qr.substring(0,n-1);
            ac=ac.charAt(0)+ac.substring(0,n-1);
          //  System.out.printf("%20s %10s %10s %10s %5s\n","SHIFT",ac,qr,q1,--sc);
            c=c+"\nSHIFT";
            a=a+"\n"+ac;
            q=q+"\n"+qr;
            qn=qn+"\n"+q1;
            si=si+"\n"+(Integer.toBinaryString(--sc));
        }
        TextView tv = new TextView(this);
        tv.setText(c);
        tv.setWidth(0);
        tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT,8));
        tv.setGravity(Gravity.CENTER_HORIZONTAL);
        tal.addView(tv);
        TextView tva = new TextView(this);
        tva.setText(a);
        tva.setWidth(0);
        tva.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT,13));
        tva.setGravity(Gravity.CENTER_HORIZONTAL);
        tal.addView(tva);
        TextView tvq = new TextView(this);
        tvq.setText(q);
        tvq.setWidth(0);
        tvq.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT,13));
        tvq.setGravity(Gravity.LEFT);
        tal.addView(tvq);
        TextView tvn = new TextView(this);
        tvn.setText(qn);
        tvn.setWidth(0);
        tvn.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT,1));
        tvn.setGravity(Gravity.LEFT);
        tal.addView(tvn);
        TextView tvs = new TextView(this);
        tvs.setText(si);
        tvs.setWidth(0);
        tvs.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT,5));
        tvs.setGravity(Gravity.CENTER_HORIZONTAL);
        tal.addView(tvs);

    }

}