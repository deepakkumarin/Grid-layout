package com.example.gridlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MainAdapter adapter;
    String[] list={"Pizza","Pizza","Pizza","Pizza","Pizza","Pizza","Pizza","Pizza"};
    int[] img={R.drawable.food1,R.drawable.food2,R.drawable.food3,R.drawable.food4,R.drawable.food6,R.drawable.food7,R.drawable.food8,R.drawable.food9};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler);
        MainAdapter adapter =new MainAdapter(MainActivity.this,list,img);
        recyclerView.setAdapter(adapter);

//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
//        recyclerView.setLayoutManager(linearLayoutManager);

//        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
//        recyclerView.setLayoutManager(gridLayoutManager);

          StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.);
          recyclerView.setLayoutManager(staggeredGridLayoutManager);

    }
}