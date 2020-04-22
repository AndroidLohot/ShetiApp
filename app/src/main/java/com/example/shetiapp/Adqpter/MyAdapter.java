package com.example.shetiapp.Adqpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shetiapp.R;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ListViewHolder> {

    private int prodect;
    private Context context;
    private ArrayList<String> arrayList;

    public MyAdapter(int prodect, ArrayList<String> arrayList,Context context) {
        this.prodect = prodect;
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_list,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {

        String oName=arrayList.get(position);

        holder.tvOwnerName.setText(oName);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        TextView tvOwnerName,tvProdectName,tvShowLike,tvShowDiceLike,tvPrice;
        ImageView imageProdect;
        ImageButton btnLike,btnDiceLike;
        View itemCon;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            tvOwnerName=itemView.findViewById(R.id.item_OwnerName);
            tvProdectName=itemView.findViewById(R.id.item_ProdectName);
            tvShowLike=itemView.findViewById(R.id.item_LikeCouShow);
            tvShowDiceLike=itemView.findViewById(R.id.item_DiceLikeCouShow);
            tvPrice=itemView.findViewById(R.id.item_ProdectPrice);
            itemCon=itemView.findViewById(R.id.item_Con);

            imageProdect=itemView.findViewById(R.id.item_ProdectImage);

            btnLike=itemView.findViewById(R.id.btnImLike);
            btnDiceLike=itemView.findViewById(R.id.btnImDiceLike);

        }
    }
}










