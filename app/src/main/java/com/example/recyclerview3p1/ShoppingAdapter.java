package com.example.recyclerview3p1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class ShoppingAdapter extends RecyclerView.Adapter<ShoppingAdapter.ProductViewHolder>{

    private LayoutInflater inflater;
    private final LinkedList<String> listaZakupow;

    public ShoppingAdapter(Context context, LinkedList<String> listaZakupow) {
        inflater = LayoutInflater.from(context);
        this.listaZakupow = listaZakupow;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.item_product, parent, false);
        return new ProductViewHolder(itemView,this);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        holder.productItemView.setText(listaZakupow.get(position));
    }

    @Override
    public int getItemCount() {
        return listaZakupow.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public final TextView productItemView;
        public final ShoppingAdapter shoppingAdapter;
        public ProductViewHolder(@NonNull View itemView, ShoppingAdapter adapter) {
            super(itemView);
            productItemView = itemView.findViewById(R.id.textView);
            shoppingAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int shoppingPosition = getLayoutPosition();
            String prod = listaZakupow.get(shoppingPosition);
            prod = "Kupione "+prod;
            listaZakupow.set(shoppingPosition,prod);
            //TODO: zrobić żeby po drugim kliknięciu nie dopisywało się kupione
            shoppingAdapter.notifyDataSetChanged();
            Toast.makeText(inflater.getContext(), prod, Toast.LENGTH_SHORT).show();
        }
    }
}
