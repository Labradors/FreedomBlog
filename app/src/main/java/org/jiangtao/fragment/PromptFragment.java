package org.jiangtao.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.jiangtao.freedomblog.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PromptFragment extends Fragment {


    public PromptFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_prompt, container, false);
    }

}