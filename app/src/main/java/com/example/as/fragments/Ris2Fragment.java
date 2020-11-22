package com.example.as.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.as.R;

public class Ris2Fragment extends Fragment {

    private String args;
    private boolean stateAdmin;

    public Ris2Fragment(String args, boolean stateAdmin) {
        this.args = args;
        this.stateAdmin = stateAdmin;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ris2, container, false);
    }
}