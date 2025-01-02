package com.beadando.bevasarlobeadando;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ListActivity extends AppCompatActivity {

    private ListView listView;
    private Button buttonVissza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView = findViewById(R.id.listView);
        buttonVissza = findViewById(R.id.buttonVissza);

        buttonVissza.setOnClickListener(v -> finish());

        loadProducts();
    }

    private void loadProducts() {
    //nem
    }
}