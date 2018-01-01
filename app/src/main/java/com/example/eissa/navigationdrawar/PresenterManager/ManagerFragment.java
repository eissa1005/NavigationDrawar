package com.example.eissa.navigationdrawar.PresenterManager;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.eissa.navigationdrawar.MainPresenter.MainPersenter;
import com.example.eissa.navigationdrawar.MainPresenter.OnFragmentInteractionListener;
import com.example.eissa.navigationdrawar.R;

public class ManagerFragment extends MainPersenter<OnFragmentInteractionListener> {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public ManagerFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static ManagerFragment newInstance() {
        ManagerFragment fragment = new ManagerFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_manager, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttachView(OnFragmentInteractionListener context) {
        super.onAttachView(context);
        if(context instanceof OnFragmentInteractionListener){
            mListener= (OnFragmentInteractionListener)context;
        }else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }

    }

    @Override
    public void detachView() {
        super.detachView();
         mListener=null;
    }
}
