package com.example.mobile_contentsapp.Commu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mobile_contentsapp.R;
import com.example.mobile_contentsapp.Recipe.Category_Adapter;
import com.example.mobile_contentsapp.Recipe.Category_Item;

import java.util.ArrayList;

public class Commu_Fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.commu_fragment,container,false);



        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
