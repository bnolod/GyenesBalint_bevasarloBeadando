package com.beadando.bevasarlobeadando;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNev, editTextEgysegar, editTextMennyiseg, editTextMertekegyseg;
    private Button buttonHozzaadas, buttonMegtekintes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNev = findViewById(R.id.editTextNev);
        editTextEgysegar = findViewById(R.id.editTextEgysegar);
        editTextMennyiseg = findViewById(R.id.editTextMennyiseg);
        editTextMertekegyseg = findViewById(R.id.editTextMertekegyseg);
        buttonHozzaadas = findViewById(R.id.buttonHozzaadas);
        buttonMegtekintes = findViewById(R.id.buttonMegtekintes);

        buttonHozzaadas.setOnClickListener(v -> addProduct());
        buttonMegtekintes.setOnClickListener(v -> {
            Intent intent = new Intent(this, ListActivity.class);
            startActivity(intent);
        });
    }

    private void addProduct() {
        String nev = editTextNev.getText().toString();
        String egysegarStr = editTextEgysegar.getText().toString();
        String mennyisegStr = editTextMennyiseg.getText().toString();
        String mertekegyseg = editTextMertekegyseg.getText().toString();

        //nem
    }
}