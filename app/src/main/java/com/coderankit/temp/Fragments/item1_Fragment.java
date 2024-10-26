package com.coderankit.temp.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.coderankit.temp.R;

public class item1_Fragment extends Fragment {

    public item1_Fragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item1_, container, false);

        TextView textView = view.findViewById(R.id.example1);
        return view ;
    }
}