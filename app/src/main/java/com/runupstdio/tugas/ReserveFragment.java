package com.runupstdio.tugas;


import android.app.ActionBar;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ReserveFragment extends Fragment {

    public ReserveFragment() {
        // Required empty public constructor
    }
    ActionBar actionBar;
    TextView mjamMulai;
    TimePickerDialog timePickerDialog;
    Button mbtnPesan, mbtnBatalPesan;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_reserve, container, false);

//        String [] values =
//                {"Time at Residence","Under 6 months","6-12 months","1-2 years","2-4 years","4-8 years","8-15 years","Over 15 years",};
        Spinner mspinnerTgl = v.findViewById(R.id.spinnerTgl);
        ArrayAdapter<String> adapterTgl = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.Tanggal));
        adapterTgl.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        mspinnerTgl.setAdapter(adapterTgl);

        Spinner mspinnerBln = v.findViewById(R.id.spinnerBulan);
        ArrayAdapter<String> adapterBln = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.Bulan));
        adapterBln.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        mspinnerBln.setAdapter(adapterBln);

//        mjamMulai = v.findViewById(R.id.jamAwal);

        mbtnPesan = v.findViewById(R.id.btn_pesan);
        mbtnPesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });

        mbtnBatalPesan = v.findViewById(R.id.batalReserve);
        mbtnBatalPesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                actionBar = getSupportActionBar();
//                actionBar.setTitle("Reservasi");
                BerandaFragment fragment = new BerandaFragment();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, fragment);
                fragmentTransaction.commit();
            }
        });

        return v;
    }

    public void openDialog(){
        ReserveDialog ReserveDialog = new ReserveDialog();
        ReserveDialog.show(getFragmentManager(), "reserve dialog");
    }

}
