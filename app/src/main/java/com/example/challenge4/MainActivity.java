package com.example.challenge4;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Sport> sportsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        setupData();
        setupRecyclerView();
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recycler_view);
    }

    private void setupData() {
        sportsList = new ArrayList<>();

        // Thêm các môn thể thao với drawable resources
        sportsList.add(new Sport("Football", R.drawable.sport_football));
        sportsList.add(new Sport("Basketball", R.drawable.sport_basketball));
        sportsList.add(new Sport("Tennis", R.drawable.sport_tennis));
        sportsList.add(new Sport("Baseball", R.drawable.sport_baseball));
        sportsList.add(new Sport("Volleyball", R.drawable.sport_volleyball));
        sportsList.add(new Sport("Swimming", R.drawable.sport_swimming));
        sportsList.add(new Sport("Golf", R.drawable.sport_golf));
        sportsList.add(new Sport("Boxing", R.drawable.sport_boxing));
        sportsList.add(new Sport("Badminton", R.drawable.sport_badminton));
        sportsList.add(new Sport("Cricket", R.drawable.sport_cricket));
        sportsList.add(new Sport("Hockey", R.drawable.sport_hockey));
    }

    private void setupRecyclerView() {
        SportsAdapter adapter = new SportsAdapter(this, sportsList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}