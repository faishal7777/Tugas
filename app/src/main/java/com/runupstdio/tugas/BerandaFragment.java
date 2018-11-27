package com.runupstdio.tugas;


import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class BerandaFragment extends Fragment {

    CardView mMenu, mReserve;
    ActionBar actionBar;
    public BerandaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_beranda, container, false);
        mMenu = v.findViewById(R.id.btnMenu);
        mMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                actionBar = getSupportActionBar();
//                actionBar.setTitle("Reservasi");
                MenuFragment fragment = new MenuFragment();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, fragment);
                fragmentTransaction.commit();
            }
        });
        mReserve = v.findViewById(R.id.btnReserve);
        mReserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                actionBar = getSupportActionBar();
//                actionBar.setTitle("Reservasi");
                ReserveFragment fragment = new ReserveFragment();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, fragment);
                fragmentTransaction.commit();
            }
        });

        return v;
    }

}
