package com.example.shark;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ExerciseAdapter extends RecyclerView.Adapter<ExerciseAdapter.ExerciseViewHolder> {
    private List<Exercise> exercises;

    public ExerciseAdapter(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    public static class ExerciseViewHolder extends RecyclerView.ViewHolder {
        public TextView titleTextView;
        public TextView descriptionTextView;
        public ImageView imageView;

        public ExerciseViewHolder(View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.title_textview);
            descriptionTextView = itemView.findViewById(R.id.description_textview);
            imageView = itemView.findViewById(R.id.imageview);
        }
    }

    @NonNull
    @Override
    public ExerciseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_exercise, parent, false);
        return new ExerciseViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ExerciseViewHolder holder, int position) {
        Exercise currentExercise = exercises.get(position);
        holder.titleTextView.setText(currentExercise.getTitle());
        holder.descriptionTextView.setText(currentExercise.getDescription());
        holder.imageView.setImageResource(currentExercise.getImageResId());
    }

    @Override
    public int getItemCount() {
        return exercises.size();
    }
}