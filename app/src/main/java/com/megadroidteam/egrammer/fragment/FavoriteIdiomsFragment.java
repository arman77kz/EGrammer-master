package com.megadroidteam.egrammer.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.megadroidteam.egrammer.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FavoriteIdiomsFragment extends Fragment {


    public FavoriteIdiomsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_favorite_idioms, container, false);
        return view;
    }

}
