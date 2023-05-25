package com.example.shark;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Female_Chest
        extends AppCompatActivity {
    private RecyclerView exerciseRecyclerView;
    private ExerciseAdapter exerciseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list_recyclerview);

        // Inițializați RecyclerView
        exerciseRecyclerView = findViewById(R.id.exercise_recyclerview);
        exerciseRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Inițializați adaptorul și atașați-l la RecyclerView
        List<Exercise> exercises = getExercises(); // Metoda pentru a obține lista de exerciții
        exerciseAdapter = new ExerciseAdapter(exercises);
        exerciseRecyclerView.setAdapter(exerciseAdapter);
    }

    public void goToMainActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    // Metoda de exemplu pentru a obține lista de exerciții
    private List<Exercise> getExercises() {
        List<Exercise> exerciseList = new ArrayList<>();

        // Adăugați exerciții la listă
        exerciseList.add(new Exercise("Dumbbell Incline Bench Press", "Lay flat on the incline bench with your feet on the ground. Raise the dumbbells until you have straight arms.\n" +
                "Lower the dumbbells to your mid chest\n" +
                "Raise the dumbbells until you've locked your elbows.", R.drawable.dumbell_incline));
        exerciseList.add(new Exercise("Push Up", "Place your hands firmly on the ground, directly under shoulders.\n" +
                "Flatten your back so your entire body is straight and slowly lower your body\n" +
                "Draw shoulder blades back and down, keeping elbows tucked close to your body\n" +
                "Exhale as you push back to the starting position.", R.drawable.pushups));
        exerciseList.add(new Exercise("Bench Press", "Lay flat on the bench with your feet on the ground. With straight arms unrack the bar.\n" +
                "Lower the bar to your mid chest\n" +
                "Raise the bar until you've locked your elbows.", R.drawable.benchpress));
        exerciseList.add(new Exercise("Incline Bench Press", "Position the bench between 30 and 45 degrees.\n" +
                "Lay flat on the bench with your feet on the ground. With straight arms unrack the bar.\n" +
                "Lower the bar to your mid chest\n" +
                "Raise the bar (slowly and controlled) until you've locked your elbows.", R.drawable.inclinebp));
        exerciseList.add(new Exercise("Cable Chest Press", "Use a handle attachment. The cables should be set to shoulder height.\n" +
                "Bring both of the handles to your chest and make sure you are in the center of the cable crossover.\n" +
                "Walk a few steps forward. Then press the weight forward.\n" +
                "From there, you should flex and extend at both the shoulders and elbows simultaneously.", R.drawable.cablechest));
        exerciseList.add(new Exercise("Dumbbell Chest Fly", "Lay on a bench with two dumbbells extended in front of you.\n" +
                "You should have a slight bend in your elbows and maintain that bend. Your shoulder joint should do all the movement.\n" +
                "Bring the dumbbells out to your side. Stop the dumbbells before going behind your body.\n" +
                "Bring the dumbbells back together at the top.", R.drawable.dumbelchestfly));
        exerciseList.add(new Exercise("Decline Bench Press", "Lay on a decline bench with both arms extended in front of you.\n" +
                "Break at the elbows and bring your upper arms to your side.\n" +
                "Once your upper arms have reached your side, press the dumbbells back to the ceiling.", R.drawable.declinebp));

        return exerciseList;
    }
}
