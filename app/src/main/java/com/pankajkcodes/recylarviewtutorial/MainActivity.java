package com.pankajkcodes.recylarviewtutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Initialize first recycler view
        recyclerView = findViewById(R.id.recyclerview);

        // Create Model array list to add items
        ArrayList<Model> list = new ArrayList<>();
        list.add(new Model(R.drawable.ic_launcher_background, "Item 1"));
        list.add(new Model(R.drawable.ic_launcher_background, "Item 2"));
        list.add(new Model(R.drawable.ic_launcher_background, "Item 3"));
        list.add(new Model(R.drawable.ic_launcher_background, "Item 4"));
        list.add(new Model(R.drawable.ic_launcher_background, "Item 5"));
        list.add(new Model(R.drawable.ic_launcher_background, "Item 6"));
        list.add(new Model(R.drawable.ic_launcher_background, "Item 7"));

        // Make a object of Adapter and set on recycler view
        Adapter adapter = new Adapter(list, this);
        recyclerView.setAdapter(adapter);


        // Initialize a object of A layout to show list recycler item
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

/*
        *Types of Layout
        *
        *  Layout 1
        StaggeredGridLayoutManager Staggered = new StaggeredGridLayoutManager(4,
                StaggeredGridLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(Staggered);

        * Layout 2
        GridLayoutManager gridlayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridlayoutManager);

        * Layout 3
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
*/



    }
}