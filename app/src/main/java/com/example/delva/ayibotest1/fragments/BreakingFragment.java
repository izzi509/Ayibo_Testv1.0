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
public class BreakingFragment extends Fragment {

    View myView;
    public static final String ARG_PAGE = "ARG_PAGE";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment_breaking, container, false);
        return myView;
    }

    public static BreakingFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        BreakingFragment fragment = new BreakingFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
