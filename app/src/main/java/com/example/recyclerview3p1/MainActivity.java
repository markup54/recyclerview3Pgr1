package com.example.recyclerview3p1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    LinkedList <Product> produkty = new LinkedList<>();
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
        EditText editText =findViewById(R.id.editText);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //TODO: sprawdz czy pole edycyjne jest wypełnione
                        Product dodawanyProdukt = new Product(editText.getText().toString());
                        //dodać do listy w adapterze
                        adapter.dodajProduktDoListy(dodawanyProdukt);
                        editText.setText("");
                    }
                }
        );
    }

    private void  wypelnijListe(){
        produkty.addLast(new Product("jabłka"));
        produkty.addLast(new Product("gruszki"));
        produkty.addLast(new Product("sliwki"));
        produkty.addLast(new Product("mleko"));
        produkty.addLast(new Product("jajka"));
        produkty.addLast(new Product("woda"));
        produkty.addLast(new Product("mąka"));
        produkty.addLast(new Product("pomidory"));
        produkty.addLast(new Product("kabanosy"));
        produkty.addLast(new Product("ser"));
        produkty.addLast(new Product("sól"));
        produkty.addLast(new Product("masło"));
        produkty.addLast(new Product("czekolada"));
        produkty.addLast(new Product("chleb"));
        produkty.addLast(new Product("bułki"));
    }
}