package com.example.homework4android1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class TitlesFragment extends Fragment {
    private RecyclerView recyclerView;
    private TitleAdapter adapter;
    private ArrayList<User> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_titles, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycler_view);
        adapter = new TitleAdapter();
        createList();
        adapter.addItems(list);
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));

    }

    private void createList() {
        list.add(new User("Кайрат", "Равшанов"));
        list.add(new User("Марс", "Равшанов"));
        list.add(new User("Максат", "Равшанов"));
        list.add(new User("Марсианин", "Равшанов"));
        list.add(new User("Аселя", "Равшанов"));
        list.add(new User("Орозбек", "Равшанов"));
        list.add(new User("Даниель", "Равшанов"));
        list.add(new User("Марсель", "Марсов"));
        list.add(new User("Мээрим", "Равшанова"));

    }
}