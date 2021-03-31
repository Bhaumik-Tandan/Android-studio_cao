package com.example.cao19BIT0292;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }
    public static final String e="com.example.cao19BIT0292.extra.d1";
  /*  public void inc(View v)
    {
        Intent i=new Intent(this,SecondFragment.class);
        i.putExtra(e,"10");
        startActivity(i);
    }
    public void bnc(View v)
    {
        Intent i=new Intent(this,SecondFragment.class);
        i.putExtra(e,"2");
        startActivity(i);
    }*/
}