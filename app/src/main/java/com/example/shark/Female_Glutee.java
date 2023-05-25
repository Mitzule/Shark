package com.example.shark;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Female_Glutee
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
        exerciseList.add(new Exercise("Barbell Squat", "Stand with your feet shoulder-width apart. Maintain the natural arch in your back, squeezing your shoulder blades and raising your chest.\n" +
                "Grip the bar across your shoulders and support it on your upper back. Unwrack the bar by straightening your legs, and take a step back.\n" +
                "Bend your knees as you lower the weight without altering the form of your back until your hips are below your knees.\n" +
                "Raise the bar back to starting position, lift with your legs and exhale at the top.", R.drawable.barbellsquat));
        exerciseList.add(new Exercise("Barbell Hip Thrust", "Sit on the ground with a bench behind you. Have the barbell over your legs just above your hips.\n" +
                "Lean back against the bench so that your shoulders are resting upon it, stretch your arms out to either side using the bench as support.\n" +
                "Raise the weight by driving through your feet and extending your hips upwards. Support the weight with your shoulders and feet.", R.drawable.barbelhiptrust));
        exerciseList.add(new Exercise("Barbell Step Up", "Begin by standing in front of a sturdy box or bench that is about knee-height, holding a barbell across your upper back and shoulders, using an overhand grip.\n" +
                "Place your right foot on the box and push through the heel to lift your body up and onto the box.\n" +
                "Step back down with your right foot.", R.drawable.barbelstepup));
        exerciseList.add(new Exercise("Dumbbell Bulgarian Split Squat", "Find a box or bench that is roughly knee height or a few inches lower. (The lower the box is the lower the mobility requirement).\n" +
                "You can either place your toes or the top of your foot on the box. Point your front foot forward or slightly turned outwards and break at the knees and hips simultaneously.\n" +
                "Aim to get your front leg to hit parallel depth (hamstring parallel with the ground) or lower.\n" +
                "The further forward your front foot is, the longer the Range of Motion is at your hips. The further back your front foot is, the longer the ROM at your knees.", R.drawable.bulgariansquat));
        exerciseList.add(new Exercise("Cable Hip Abduction", "Use an ankle attachment. Cable should be set all the way to the bottom.\n" +
                "Face sideways with the ankle attachment on your outside leg. Walk a few steps away.\n" +
                "Abduct at the hips and raise your leg out to the side.\n" +
                "Return to the starting position and stop just short of your foot touching back to the ground (to keep tension on the muscle).", R.drawable.cableabduction));
        exerciseList.add(new Exercise("Cable Glute Kickback", "Use an ankle attachment. The cable should be set to the bottom of the crossover machine.\n" +
                "Push your ankle straight back, extending at the hip. Hold for a one count when you feel a contraction in your glutes.\n" +
                "Then flex at the hips until you are back into your original position.", R.drawable.cablekickback));
        exerciseList.add(new Exercise("Single Leg Hip Thrust", "Sitting on the floor with one knee bent with the foot firmly on the floor and one leg extended, lean your back against the bench.\n" +
                "Resting the kettlebell on your pelvis, raise your pelvis until your stomach, pelvis and thighs are in line.\n" +
                "Slowly lower until you are in the starting position and repeat.", R.drawable.singleleg));
        exerciseList.add(new Exercise("Barbell", "Stand", R.drawable.man));


        return exerciseList;
    }
}
