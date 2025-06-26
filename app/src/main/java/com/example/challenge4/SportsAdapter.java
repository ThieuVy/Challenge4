package com.example.challenge4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class SportsAdapter extends RecyclerView.Adapter<SportsAdapter.SportViewHolder> {

    private Context context;
    private List<Sport> sportsList;

    public SportsAdapter(Context context, List<Sport> sportsList) {
        this.context = context;
        this.sportsList = sportsList;
    }

    @NonNull
    @Override
    public SportViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_sport, parent, false);
        return new SportViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SportViewHolder holder, int position) {
        Sport sport = sportsList.get(position);

        holder.sportName.setText(sport.getName());
        holder.sportImage.setImageResource(sport.getImageResource());

        // Thêm click listener cho CardView
        holder.cardView.setOnClickListener(v -> {
            Toast.makeText(context, "Clicked: " + sport.getName(), Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return sportsList.size();
    }

    public static class SportViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        ImageView sportImage;
        TextView sportName;

        public SportViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.card_view);
            sportImage = itemView.findViewById(R.id.sport_image);
            sportName = itemView.findViewById(R.id.sport_name);
        }
    }
}