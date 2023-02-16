package com.example.workanimal3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

private ArrayList<String> animalList;
private RecyclerView recyclerView;
private AnimalAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_animal);
        adapter = new AnimalAdapter(animalList);
        recyclerView.setAdapter(adapter);
    }

        private void loadData(){
        animalList = new ArrayList<>();
        animalList.add("Лев");
        animalList.add("Тигр");
        animalList.add("Жираф");
        animalList.add("Мартышка");
        animalList.add("Слон");
        animalList.add("Медведь");
        animalList.add("Волк");
        animalList.add("Лиса");
        animalList.add("Суслик");
        animalList.add("Собака");
        animalList.add("Кошка");

}
}