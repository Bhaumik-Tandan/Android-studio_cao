package com.example.cao19BIT0292;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import static android.R.color.black;
import static android.R.color.holo_purple;

public class ares extends AppCompatActivity {
    static String rsa(int  lk,int l)
    {
        String s="",sl=Integer.toBinaryString(lk);

        for(int i=0;i<l-sl.length();i++)
            s+="0";
        return s+sl;

    }

    static String add(int a,int b,int l)
    {
        String s="";
        String p=rsa(a,l);
        String d=rsa(b,l);
        int c=0;
        l-=1;
        while(l>=0){
            a=(Character.getNumericValue((d.charAt(l)))^(Character.getNumericValue((p.charAt(l)))))^c;
            c=(Character.getNumericValue((d.charAt(l)))&(Character.getNumericValue((p.charAt(l)))))|(c&((Character.getNumericValue((p.charAt(l)))^Character.getNumericValue((d.charAt(l))))));
            d=d.substring(0,l)+Integer.toString(a)+d.substring(l+1);
        l-=1;}
        return d;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ares);
        Intent i=getIntent();
        String m=i.getStringExtra(add.e1);
        int mu=Integer.parseInt(m);
        m=i.getStringExtra(add.e2);
        int mp=Integer.parseInt(m);
        LinearLayout tal = (LinearLayout) findViewById(R.id.res);
        LinearLayout p = new LinearLayout(this);
        TextView rel =  findViewById(R.id.asd);
        rel.setText("Result= "+mu*mp+"\nIn Binary= "+(Integer.toBinaryString(mu*mp)));
        rel.setGravity(Gravity.CENTER_HORIZONTAL);
        p.setOrientation(LinearLayout.HORIZONTAL);
        p.setWeightSum(450);
        TextView tv = new TextView(this);
        tv.setText(" ");
        tv.setWidth(0);
        tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT,104));
        tv.setGravity(Gravity.CENTER_HORIZONTAL);
        p.addView(tv);
        int a=Integer.toBinaryString(mp).length();
        String s="0";
        TextView tvp = new TextView(this);
        tvp.setWidth(0);
        tvp.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT,10));
        tvp.setText(s);
        tvp.setGravity(Gravity.CENTER_HORIZONTAL);
        p.addView(tvp);
       for(int t=1;t<a;t++)
            s+="0";
        TextView tvpi = new TextView(this);
        tvpi.setWidth(0);
        tvpi.setText(s);
        tvpi.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT,123));
        tvpi.setGravity(Gravity.CENTER_HORIZONTAL);
        p.addView(tvpi);
        TextView tvpii = new TextView(this);
        s=Integer.toBinaryString(mp);
        tvpii.setWidth(0);
        tvpii.setText(s);
        tvpii.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT,123));
        tvpii.setGravity(Gravity.CENTER_HORIZONTAL);
        p.addView(tvpii);
        TextView tvpiii = new TextView(this);
        tvpiii.setWidth(0);
        tvpiii.setText(Integer.toBinaryString(a));
        tvpiii.setGravity(Gravity.CENTER_HORIZONTAL);
        tvpiii.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT,90));
        p.addView(tvpiii);
        tal.addView(p);
        int lk=0,e=0,l,temp;
        //e is e
        //lk is a
        if(mu>mp)
            l=Integer.toBinaryString(mu).length();
        else
            l=Integer.toBinaryString(mp).length();
        String q=Integer.toBinaryString(mp);
        while(a!=0)
       {
           e=0;
           String lo;
           if(q.charAt(q.length()-1)=='1')
           {
               LinearLayout n = new LinearLayout(this);
               n.setWeightSum(450);
               TextView ea = new TextView(this);
               ea.setWidth(0);
               ea.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT,104));
               ea.setText("ADD");
               n.setMinimumHeight(100);
               ea.setGravity(Gravity.CENTER_HORIZONTAL);
               n.addView(ea);
               TextView eca = new TextView(this);
               lk+=mu;
               if(Integer.toBinaryString(lk).length()>l)
                   e=1;
               eca.setText(Integer.toString(e));
               eca.setWidth(0);
               eca.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT,10));
               eca.setGravity(Gravity.CENTER_HORIZONTAL);
               n.addView(eca);
               TextView aca = new TextView(this);
               s=rsa(mu,l)+"\n";
               if(e==1) {
                   lo = add(lk - mu, mu, l);
                   lk=Integer.parseInt(lo,2);
               }
               else
                   lo=rsa(lk,l);
               aca.setText(s+lo);
               aca.setWidth(0);
               aca.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT,123));
               aca.setGravity(Gravity.CENTER_HORIZONTAL);
               n.addView(aca);
               tal.addView(n);
           }
           LinearLayout n = new LinearLayout(this);
           n.setWeightSum(450);
           TextView ea = new TextView(this);
           ea.setWidth(0);
//           ea.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT,111));
           ea.setText("SHIFT");
           ea.setGravity(Gravity.CENTER_HORIZONTAL);
           n.addView(ea);
           TextView eca = new TextView(this);
           eca.setText("0");
           eca.setWidth(0);
//           eca.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT,25));
           eca.setGravity(Gravity.CENTER_HORIZONTAL);
           n.addView(eca);
           TextView aca = new TextView(this);
           lo=rsa(lk,l);
           aca.setText(e+lo.substring(0,lo.length()-1));
           lk=Integer.parseInt(e+lo.substring(0,lo.length()-1),2);
           aca.setWidth(0);
//           aca.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT,179));
           aca.setGravity(Gravity.CENTER_HORIZONTAL);
           n.addView(aca);
           TextView qca = new TextView(this);
           q=lo.charAt(lo.length()-1)+q.substring(0,q.length()-1);
           qca.setText(q);
           qca.setWidth(0);
//           qca.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT,179));
           qca.setGravity(Gravity.CENTER_HORIZONTAL);
           n.addView(qca);
           a--;
           e=0;
           TextView sca = new TextView(this);
           lo=rsa(a,Integer.toBinaryString(l).length());
           sca.setText(lo);
           aca.setWidth(0);
//           aca.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT,87));
           sca.setGravity(Gravity.CENTER_HORIZONTAL);
           n.addView(sca);
           ea.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT,104));
           eca.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT,30));
           aca.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT,130));
           qca.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT,123));
           sca.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT,90));
           tal.addView(n);
       }
    }
}