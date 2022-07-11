package com.example.wazaifnadeali.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wazaifnadeali.R;
import com.example.wazaifnadeali.models.Models;

import java.util.ArrayList;

public class WazaifListAdapter extends RecyclerView.Adapter<WazaifListAdapter.viewHolder> {
    ArrayList<Models> List;
    Context context;

    public WazaifListAdapter( ArrayList<Models> list, Context context) {
        List = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_wazaif_list, parent, false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
    Models models = List.get(position);
    holder.title.setText(models.getWazaifTitle());
    }

    @Override
    public int getItemCount() {
        return List.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        private TextView title;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.listViewText);
        }
    }
}
