package com.example.recyclerview3p1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    LinkedList <String> produkty = new LinkedList<>();
    private RecyclerView shoppingRecyclerView;
    private ShoppingAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wypelnijListe();
        shoppingRecyclerView = findViewById(R.id.recyclerView);
        adapter = new ShoppingAdapter(this,produkty);
        shoppingRecyclerView.setAdapter(adapter);
        shoppingRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void  wypelnijListe(){
        produkty.addLast("jabłka");
        produkty.addLast("gruszki");
        produkty.addLast("sliwki");
        produkty.addLast("mleko");
        produkty.addLast("jajka");
        produkty.addLast("woda");
        produkty.addLast("mąka");
        produkty.addLast("pomidory");
        produkty.addLast("kabanosy");
        produkty.addLast("ser");
        produkty.addLast("sól");
        produkty.addLast("masło");
        produkty.addLast("czekolada");
        produkty.addLast("chleb");
        produkty.addLast("bułki");
    }
}