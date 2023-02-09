package com.example.recyclerview3p1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ShoppingAdapter extends RecyclerView.Adapter<ShoppingAdapter.ProductViewHolder>{

    private LayoutInflater inflater;

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.item_product, parent, false);
        return new ProductViewHolder(itemView,this);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder{
        public final TextView productItemView;
        public final ShoppingAdapter shoppingAdapter;
        public ProductViewHolder(@NonNull View itemView, ShoppingAdapter adapter) {
            super(itemView);
            productItemView = itemView.findViewById(R.id.textView);
            shoppingAdapter = adapter;
        }
    }
}
