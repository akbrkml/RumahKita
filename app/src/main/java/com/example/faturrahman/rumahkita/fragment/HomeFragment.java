package com.example.faturrahman.rumahkita.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.faturrahman.rumahkita.R;
import com.example.faturrahman.rumahkita.elektrikkita.activity_elektrik_kita;
import com.example.faturrahman.rumahkita.main.MainActivity2;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class HomeFragment extends Fragment {

    @BindView(R.id.view_electric)
    LinearLayout llElectric;

    public HomeFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

    }

    @OnClick(R.id.view_electric)
    public void ElectricMenu(){
        Intent intent = new Intent(HomeFragment.this.getActivity(), activity_elektrik_kita.class);
        startActivity(intent);
    }
}
