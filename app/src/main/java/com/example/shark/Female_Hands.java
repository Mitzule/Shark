package com.example.shark;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Female_Hands
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
        exerciseList.add(new Exercise("Dumbbell Curl", "Stand up straight with a dumbbell in each hand at arm's length.\n" +
                "Raise one dumbbell and twist your forearm until it is vertical and your palm faces the shoulder.\n" +
                "Lower to original position and repeat with opposite arm", R.drawable.dumbcurl));
        exerciseList.add(new Exercise("Dumbbell Hammer Curl", "Hold the dumbbells with a neutral grip (thumbs facing the ceiling).\n" +
                "Slowly lift the dumbbell up to chest height\n" +
                "Return to starting position and repeat.", R.drawable.hamercurl));
        exerciseList.add(new Exercise("Concentration Curl", "Sitting on a chair with your legs apart, rest your arm against your thigh and hold the kettlebell with your arm extended towards the floor.\n" +
                "Bending your arm at the elbow, lift the kettlebell until your palm faces your shoulder.\n" +
                "Lower to the starting position and repeat.", R.drawable.concurl));
        exerciseList.add(new Exercise("Preacher Curl", "Stand behind a bench, with your chest leaning over the edge of the bench.\n" +
                "With one arm resting on the bench, hold the kettlebell, bending the arm at the elbow.\n" +
                "Lower your arm using the bench as a guide, keeping your forearm straight.\n" +
                "Return to the starting position and repeat.", R.drawable.preachcurl));
        exerciseList.add(new Exercise("Barbell Curl", "While holding the upper arms stationary, curl the weights forward while contracting the biceps as you breathe out.\n" +
                "Continue the movement until your biceps are fully contracted and the bar is at shoulder level.\n" +
                "Hold the contracted position for a second and squeeze the biceps hard.\n" +
                "Slowly bring the weight back down to the starting position.", R.drawable.barbcurl));
        exerciseList.add(new Exercise("Dumbbell Wrist Extension", "Grab two dumbbells with an overhand grip and lay your forearms across your knees.\n" +
                "Let your wrists flex fully, then extend your wrists.", R.drawable.wristext));
        exerciseList.add(new Exercise("Cable Push Down", "You can use any attachment for this. The cable should be set all the way at the top of the machine.\n" +
                "Make sure to keep your upper arm glued at your side. Extend your elbows until you feel your triceps contract.", R.drawable.cablepushdown));
        exerciseList.add(new Exercise("Machine Cable V Bar Push Downs", "Grip the pulley bar with palms facing down at shoulder width.\n" +
                "Stand straight with a small forward incline. Keep your upper arms close to your body, and slowly bring the pulley bar down until your arms are fully extended.\n" +
                "Pause when you are at the contracted position of the motion, then slowly raise the pulley bar back to the starting point.", R.drawable.vpush));
        exerciseList.add(new Exercise("Cable Skullcrusher", "You can use a straight bar, rope, easy bar, or two handles. The cable should be set all the way to the top of the machine.\n" +
                "Face away from the machine with your elbows up and the attachment just behind your head.\n" +
                "Extend at the elbows until you feel a contraction in your triceps and then flex at the elbow back to the starting position.", R.drawable.skullcrush));
        exerciseList.add(new Exercise("Dumbbell Seated Overhead Tricep Extension", "Lay flat on the incline bench with your feet on the ground. Raise the dumbbells until you have straight arms.\n" +
                "Lower the dumbbells to your mid chest\n" +
                "Raise the dumbbells until you've locked your elbows.", R.drawable.tripextens));
        exerciseList.add(new Exercise("Dumbbell Tricep Kickback", "Start by standing with your feet shoulder-width apart and holding a dumbbell in one hand.\n" +
                "Bend at the waist and place your opposite hand on your knee for support.\n" +
                "From this starting position, extend your arm backwards so that the dumbbell is behind your body.\n" +
                "Make sure to keep your elbow close to your body and your core engaged throughout the movement.", R.drawable.trikick));
        exerciseList.add(new Exercise("Dumbbell Seated Overhead Press", "Sit on a bench with back support. Raise the dumbbells to shoulder height with your palms forward.\n" +
                "Raise the dumbbells upwards and pause at the contracted position.\n" +
                "Lower the weights back to starting position.", R.drawable.overpress));
        exerciseList.add(new Exercise("Dumbbell Lateral Raise", "Stand up straight with dumbbells at either side, palms facing your hips.\n" +
                "Raise your arms on either side with a slight bend in your elbow until they are parallel with the floor. Pause at the top of the motion.\n" +
                "Slowly return your arms down to starting position.", R.drawable.latraise));
        exerciseList.add(new Exercise("Barbell Upright Row", "Take a double overhand roughly shoulder width grip.\n" +
                "Pull your elbows straight up the ceiling. Aim to get the bar to chin level or slightly higher.", R.drawable.uprightrow));
        exerciseList.add(new Exercise("Dumbbell Front Raise", "Grab two dumbbells while standing upright with the dumbbells at your side.\n" +
                "Raise the two dumbbells with your elbows being fully extended until the dumbbells are eye level.\n" +
                "Lower the weights in a controlled manner to the starting position and repeat.", R.drawable.frontraise));
        exerciseList.add(new Exercise("Dumbbell Seated Rear Delt Fly", "With dumbbells in either hand, bend your knees with your feet slightly bowed out. Arch your back above your knees, and start with the weights touching in front of your chest.\n" +
                "With bent elbows, raise your arms up to shoulder level, pausing at the at the end of the motion.\n" +
                "Slowly lower your arms back to starting position.", R.drawable.reardelt));
        exerciseList.add(new Exercise("Barbell Overhead Press", "Take a roughly shoulder width grip. There should be a straight line from your elbow to fist (vertical forearms).\n" +
                "Pull your chin back and press the weight toward the ceiling by extending at the elbow joint and flexing at the shoulder joint.\n" +
                "Press until your elbows are extended and push your head forward slightly.\n" +
                "Return to the start position with control. Pulling your chin back to allow the bar to pass your face safely.", R.drawable.overheadpress));

        return exerciseList;
    }
}
