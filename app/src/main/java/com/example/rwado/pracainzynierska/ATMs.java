package com.example.rwado.pracainzynierska;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class ATMs extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.atms_layout, container, false);

        Spinner spinner2 = (Spinner) view.findViewById(R.id.spinner2);

        List<String> banks = new ArrayList<String>();
        banks.add("Wszystkie banki");
        banks.add("mBank");
        banks.add("PKO");
        banks.add("PKOBP");

        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, banks);
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        spinner2.setAdapter(dataAdapter1);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("Bankomaty");
        super.onViewCreated(view, savedInstanceState);
    }
}
