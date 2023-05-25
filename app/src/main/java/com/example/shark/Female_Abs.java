package com.example.shark;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Female_Abs
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

        exerciseList.add(new Exercise("Hanging Knee Raises", "Grab the bar and hang, your body still and your legs straight.\n" +
                "Slowly draw your knees up to your chest\n" +
                "Once you have raised your knees as high as possible, lower your legs and repeat. Duration of these movements should be slow so that you do not utilize momentum, enabling you to get the most out of the exercise.\n" +
                "Duration of these movements should be slow so that you do not utilize momentum, enabling you to get the most out of the exercise.", R.drawable.hangingkneeraises));
        exerciseList.add(new Exercise("Hand Plank", "Start in a kneeling position with your hands planted on the ground.\n" +
                "Pick your knees up off the ground. Hold in this position with a flat back.", R.drawable.handplank));
        exerciseList.add(new Exercise("Crunches", "Lay flat on your back with your knees bent and your feet flat on the ground, about a foot from your lower back.\n" +
                "Place your fingertips on your temples with your palms facing out.\n" +
                "Draw your belly into the base of your spine to engage the muscles, then raise your head and shoulders off the floor. Return to starting position and repeat.", R.drawable.crunches));
        exerciseList.add(new Exercise("Dumbbell Russian Twist", "Sit on the floor and flex your knees and hips to a 90 degree angle.\n" +
                "Your feet should be hovering off the ground. (If that's too hard start with heels on the floor)\n" +
                "Rotate your upper spine to engage your obliques.", R.drawable.russiantwist));
        exerciseList.add(new Exercise("Laying Leg Raises", "Lay on your back with your arms palms down on either side.\n" +
                "Keep your legs together and as straight as possible.\n" +
                "Slowly raise your legs to a 90° angle, pause at this position, or as high as you can reach your legs, and then slowly lower your legs back down.\n" +
                "Duration of these movements should be slow so that you do not utilize momentum, enabling you to get the most out of the exercise.", R.drawable.layingleg));
        exerciseList.add(new Exercise("Cable Kneeling Crunch", "Use a double handle attachment and set the cable all the way to the top.\n" +
                "Walk a few steps forward then fall into a kneeling position.\n" +
                "Push your hips back and flex your abs, then push hips forward until in the starting position.", R.drawable.cablecrunch));
        exerciseList.add(new Exercise("Mountain Climber", "To perform a bodyweight mountain climber, start in a plank position with your hands placed directly under your shoulders.\n" +
                "Bring your right knee towards your chest, keeping your foot close to your hand. Quickly switch legs, bringing your left knee towards your chest.\n" +
                "Continue this movement, alternating legs, at a quick pace for a set amount of time or repetitions.", R.drawable.mountainclimber));
        exerciseList.add(new Exercise("Dumbbell Crunch", "Start by lying flat on your back with your feet flat on the floor and your knees bent.\n" +
                "Hold a dumbbell over your clavicle.\n" +
                "Engage your core muscles and lift your torso off the floor until your shoulders are a few inches off the ground.\n" +
                "Lower yourself back down to the starting position, but avoid resting completely on the floor between reps.", R.drawable.dumbcrunch));

        return exerciseList;
    }
}
