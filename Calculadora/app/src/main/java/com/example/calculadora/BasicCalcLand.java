package com.example.calculadora;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class BasicCalcLand extends Fragment implements View.OnClickListener{


    public BasicCalcLand() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_basic_calc_land, container, false);
    }
    @Override
    public void onClick(View view) {

    }
    public void funcionesGrandes(View view){

    }

}
