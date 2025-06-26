package com.example.challenge4;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private SportsAdapter adapter;
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
        sportsList.add(new Sport("Football", R.drawable.ic_football));
        sportsList.add(new Sport("Basketball", R.drawable.ic_basketball));
        sportsList.add(new Sport("Tennis", R.drawable.ic_tennis));
        sportsList.add(new Sport("Baseball", R.drawable.ic_baseball));
        sportsList.add(new Sport("Soccer", R.drawable.ic_soccer));
        sportsList.add(new Sport("Volleyball", R.drawable.ic_volleyball));
        sportsList.add(new Sport("Swimming", R.drawable.ic_swimming));
        sportsList.add(new Sport("Golf", R.drawable.ic_golf));
        sportsList.add(new Sport("Boxing", R.drawable.ic_boxing));
        sportsList.add(new Sport("Badminton", R.drawable.ic_badminton));
        sportsList.add(new Sport("Cricket", R.drawable.ic_cricket));
        sportsList.add(new Sport("Hockey", R.drawable.ic_hockey));
    }

    private void setupRecyclerView() {
        adapter = new SportsAdapter(this, sportsList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}