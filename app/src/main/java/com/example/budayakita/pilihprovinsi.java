package com.example.budayakita;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.example.budayakita.adapter.ProvinsiRvAdapter;
import com.example.budayakita.model.ProvinsiModel;

import java.util.ArrayList;
import java.util.List;

public class pilihprovinsi extends AppCompatActivity {

    RecyclerView recyclerView;
    ProvinsiRvAdapter provinsiRvAdapter;
    List<ProvinsiModel> provinsiList;

    EditText etSearch;
    CharSequence search = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihprovinsi);

        // getActionBar().setTitle("Budaya Kita");

        etSearch = findViewById(R.id.etSearch);

        provinsiList = new ArrayList<>();
        isiDataProvinsi();

        provinsiRvAdapter = new ProvinsiRvAdapter(this, provinsiList);

        recyclerView = findViewById(R.id.rvProvinsi);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(provinsiRvAdapter);

        etSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                provinsiRvAdapter.getFliter().filter(charSequence);
                search = charSequence;
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }

        });

    }

    private void isiDataProvinsi() {
        provinsiList.add(new ProvinsiModel(1, "Aceh", "#fc00ff", R.drawable.aceh));
        provinsiList.add(new ProvinsiModel(2, "Sumatera Utara", "#h100ff", R.drawable.jatim));
        provinsiList.add(new ProvinsiModel(3, "Sumatera Barat", "#h100ff", R.drawable.jatim));
        /* Tambahkan yang lain nya disini... */

    }


}