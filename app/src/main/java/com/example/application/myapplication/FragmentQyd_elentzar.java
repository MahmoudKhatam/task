package com.example.application.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FragmentQyd_elentzar extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter rAdapter;
    private RecyclerView.LayoutManager rLayoutManager;
    View view;
    public FragmentQyd_elentzar() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.qyd_elentzar_fragment,container,false);
        ArrayList<MyItem> itemList = new ArrayList<>();
        itemList.add(new MyItem(R.drawable.car,R.drawable.sa3a,R.drawable.twoperson,R.drawable.pro,R.drawable.kf,"ابي اروح الهايبر و انا ماعندي سيارة","منذ ساعة","رجال","فزعة سيارة","2 فزعو"));
        itemList.add(new MyItem(R.drawable.food,R.drawable.sa3a,R.drawable.twoperson,R.drawable.pro,R.drawable.kf,"بنات ضروري عندي عزومة و ابي حد يساعدني","منذ ساعة","سيدات","فزعة كل","3 فزعو"));

        recyclerView = view.findViewById(R.id.recylerView_id);
        rLayoutManager = new LinearLayoutManager(getActivity());
        rAdapter = new RecyleViewAdapter(itemList);
        recyclerView.setLayoutManager(rLayoutManager);
        recyclerView.setAdapter(rAdapter);


        return view;


    }
}
