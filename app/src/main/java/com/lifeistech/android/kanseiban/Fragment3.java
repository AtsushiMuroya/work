package com.lifeistech.android.kanseiban;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by OWNER on 2017/05/13.
 */

public class Fragment3 extends Fragment {

    public Fragment3() {
    }

    public static Fragment3 newInstance(int page) {
        Fragment3 fragment = new Fragment3();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int page = getArguments().getInt("page", 0);
        View view = inflater.inflate(R.layout.fragment3, container, false);
        return view;
    }
}
