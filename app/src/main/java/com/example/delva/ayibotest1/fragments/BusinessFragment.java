package com.example.delva.ayibotest1.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.delva.ayibotest1.R;

/**
 * Created by Delva on 8/21/2016.
 */
public class BusinessFragment extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";
     View myView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment_business, container, false);
        return myView;
    }

    public static BusinessFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        BusinessFragment fragment = new BusinessFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
