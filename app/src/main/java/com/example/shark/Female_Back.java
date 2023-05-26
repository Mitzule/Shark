package com.example.shark;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Female_Back extends AppCompatActivity {
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
        Intent intent = new Intent(this, FemaleExActivity.class);
        startActivity(intent);
    }

    // Metoda de exemplu pentru a obține lista de exerciții
    private List<Exercise> getExercises() {
        List<Exercise> exerciseList = new ArrayList<>();

        // Adăugați exerciții la listă
        exerciseList.add(new Exercise("Pull Ups", "Grasp the bar with an overhand grip, arms and shoulders fully extended.\n" +
                "Pull your body up until your chin is above the bar.\n" +
                "Lower your body back to starting position." +
                "Slowly bring the weight back down to the starting position.", R.drawable.pull_up));
        exerciseList.add(new Exercise("Machine Pulldown", "Grip the bar with the palms facing forward, your hands need to be spaced out at a distance wider than shoulder width.\n" +
                "As you have both arms extended in front of you holding the bar, bring your torso back around 30 degrees while sticking your chest out.\n" +
                "Pull the bar down to about chin level or a little lower in a smooth movement whilst squeezing the shoulder blades together.\n" +
                "After a second of squeezing, slowly raise the bar back to the starting position when your arms are fully extended.", R.drawable.machine_pulldown));
        exerciseList.add(new Exercise("Dumbbell Row Unilateral", "Brace your off arm against something stable (bench, box). Stagger your stance so your leg on the side of your working arm is back.\n" +
                "Try to get your torso to parallel with the ground. That will extend your range of motion.\n" +
                "Let your arm hang freely and then pull your elbow back. Imagine you've got a tennis ball in your armpit and squeeze it each rep.", R.drawable.dumbbel_row));
        exerciseList.add(new Exercise("Machine Seated Cable Row", "Sit with your back straight on the machine and grip the handles.\n" +
                "Pull the handles back using your arms. Your legs and torso should be at a 90° angle. Push out your chest.\n" +
                "Pull the handles towards your body until your hands are beside your abdomen.", R.drawable.machine_cable_row));
        exerciseList.add(new Exercise("Cable Lat Prayer", "You can use any attachment. Cable should be set all the way to the top of the machine.\n" +
                "Grab your attachment and walk a few steps back. Push your butt back to where you are leaning forward. Your ears should be between your arms.\n" +
                "Initiate the movement with your shoulders and not your elbows. As you flex at the shoulder joint push your hips forward until your hips meet the attachment.", R.drawable.cable_lat));
        exerciseList.add(new Exercise("Dumbbell Laying Incline Row", "Lay on an incline bench that is between 30-45 degrees high.\n" +
                "Let your arms hang freely. Pull your elbows straight back toward the ceiling.", R.drawable.dumbbel_incline));
        exerciseList.add(new Exercise("Romanian Deadlift", "Stand with a shoulder width stance. Push your butt back while leaving your knees MOSTLY extended.\n" +
                "You should feel a stretch in your hamstrings. When you feel the stretch, push your hips forward to complete the rep.\n" +
                "Do not push your hips all the way forward. This will hyperextend your spine. Just go to a normal standing position.", R.drawable.romanian_deadlift));
        exerciseList.add(new Exercise("Dumbbell Shrug", "Stand tall with two dumbbells. Pull your shoulder blades up. Give a one second squeeze at the top.", R.drawable.dumbell_trapez));

        return exerciseList;
    }
}
