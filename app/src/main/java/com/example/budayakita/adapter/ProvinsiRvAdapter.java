package com.example.budayakita.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.budayakita.ItemAnimation;
import com.example.budayakita.R;
import com.example.budayakita.model.ProvinsiModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProvinsiRvAdapter extends RecyclerView.Adapter<ProvinsiRvAdapter.ProvinsiRvAdapterHolder> {

    Context context;
    List<ProvinsiModel> provinsiList;
    List<ProvinsiModel> filteredProvinsiList;

    public ProvinsiRvAdapter(Context context, List<ProvinsiModel> provinsiList) {
        this.context = context;
        this.provinsiList = provinsiList;
        this.filteredProvinsiList = provinsiList;
    }

    @NonNull
    @Override
    public ProvinsiRvAdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.provinsi_list_items, parent, false);
        return new ProvinsiRvAdapterHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProvinsiRvAdapterHolder holder, int position) {
        holder.ivPhotoProvinsi.setImageResource(provinsiList.get(position).getGambar());
        holder.tvNamaProvinsi.setText(provinsiList.get(position).getNama());
        // holder.llyProvinsi.setBackgroundColor(Integer.parseInt(provinsiList.get(position).getWarna_bg()));

        // ItemAnimation.animateFadeIn(holder.itemView, position);
    }

    @Override
    public int getItemCount() {
        return filteredProvinsiList.size();
    }

    public static class ProvinsiRvAdapterHolder extends RecyclerView.ViewHolder {

        ImageView ivPhotoProvinsi;
        TextView tvNamaProvinsi;
        LinearLayout llyProvinsi;

        public ProvinsiRvAdapterHolder(@NonNull View itemView) {
            super(itemView);

            ivPhotoProvinsi = itemView.findViewById(R.id.ivPhotoProvinsi);
            tvNamaProvinsi = itemView.findViewById(R.id.tvNamaProvinsi);
            llyProvinsi = itemView.findViewById(R.id.llyProvinsi);

        }
    }

    public Filter getFliter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {

                String Key = charSequence.toString();
                if(Key.isEmpty()) {
                    filteredProvinsiList = provinsiList;
                } else {
                    List<ProvinsiModel> lstFiltered = new ArrayList<>();
                    for (ProvinsiModel row: provinsiList) {
                        if(row.getNama().toLowerCase().contains(Key.toLowerCase())) {
                            lstFiltered.add(row);
                        }
                    }
                    filteredProvinsiList = lstFiltered;
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = filteredProvinsiList;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                filteredProvinsiList = (List<ProvinsiModel>)filterResults.values;
                notifyDataSetChanged();
            }
        };
    }
}
