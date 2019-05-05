package com.unikom.esa.navdraw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FriendActivity extends AppCompatActivity {
    private List<Grocery> groceryList = new ArrayList<>();
    private RecyclerView groceryRecyclerView;
    private RecyclerViewHorizontalListAdapter groceryAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend);
        groceryRecyclerView = findViewById(R.id.idRecyclerViewHorizontalList);
        // add a divider after each item for more clarity
        groceryRecyclerView.addItemDecoration(new DividerItemDecoration(FriendActivity.this, LinearLayoutManager.HORIZONTAL));
        groceryAdapter = new RecyclerViewHorizontalListAdapter(groceryList, getApplicationContext());
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(FriendActivity.this, LinearLayoutManager.HORIZONTAL, false);
        groceryRecyclerView.setLayoutManager(horizontalLayoutManager);
        groceryRecyclerView.setAdapter(groceryAdapter);
        populategroceryList();
    }

    private void populategroceryList() {
        Grocery potato = new Grocery("Gerdi", R.drawable.avatar);
        Grocery onion = new Grocery("OnionBro", R.drawable.avatar);
        Grocery cabbage = new Grocery("Ilham", R.drawable.avatar);
        Grocery cauliflower = new Grocery("Husna", R.drawable.avatar);
        groceryList.add(potato);
        groceryList.add(onion);
        groceryList.add(cabbage);
        groceryList.add(cauliflower);
        groceryAdapter.notifyDataSetChanged();
    }
}
