package com.example.shark;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Female_Legs
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
        exerciseList.add(new Exercise("Barbell High Bar Squat", "Place the bar on top of your traps.\n" +
                "Push your hips back and break at the knees. Push your elbows forward to keep yourself from getting pitched too far forward.\n" +
                "Aim to get your hamstrings to parallel with the floor.\n" +
                "Push your heels into the floor and squat back to a standing position.", R.drawable.barbsquat));
        exerciseList.add(new Exercise("Machine Leg Extension", "Sit on the machine with your back against the cushion and adjust the machine you are using so that your knees are at a 90 degree angle at the starting position.\n" +
                "Raise the weight by extending your knees outward, then lower your leg to the starting position. Both movements should be done in a slow, controlled motion.", R.drawable.maext));
        exerciseList.add(new Exercise("Machine Leg Press", "Place your legs on the platform with your feet at shoulder width.\n" +
                "Release the weight and extend your legs fully, without locking your knees.\n" +
                "Lower the weight until your legs are at a 90° angle (but DO NOT allow your butt and lower back to rise off of the pad. This will put your lower back in a rounded position, which is very dangerous.)\n" +
                "Raise the weight back to starting position.", R.drawable.legpress));
        exerciseList.add(new Exercise("Dumbbell Bulgarian Split Squat", "Find a box or bench that is roughly knee height or a few inches lower. (The lower the box is the lower the mobility requirement).\n" +
                "You can either place your toes or the top of your foot on the box. Point your front foot forward or slightly turned outwards and break at the knees and hips simultaneously.\n" +
                "Aim to get your front leg to hit parallel depth (hamstring parallel with the ground) or lower.\n" +
                "The further forward your front foot is, the longer the Range of Motion is at your hips. The further back your front foot is, the longer the ROM at your knees.", R.drawable.bulgariansquat));
        exerciseList.add(new Exercise("Barbell Heels Up Back Squat", "Stand with your feet shoulder-width apart and your heels on a plate or low step.\n" +
                "Bend your knees and lower your body into a squat position.\n" +
                "Push through your heels to return to the starting position.", R.drawable.heelup));
        exerciseList.add(new Exercise("Machine Standing Calf Raises", "Adjust the machine in accordance with your height and place your shoulders underneath the padded lever.\n" +
                "The balls of your feet should be supporting your weight on the calve block, your heels extending off of it.\n" +
                "Extend your heels upwards while keeping your knees stationary, and pause at the contracted position.\n" +
                "Slowly return to the starting position. Repeat.", R.drawable.calfraise));
        exerciseList.add(new Exercise("Machine Seated Calf Raises", "Get comfortable on the machine, then place your lower thighs beneath the padded lever. Place your toes and the balls of your feet onto the foot supports.\n" +
                "Prevent the weight from slipping forward by gripping the handles, and release the safety bar. Lower the weight until your calves are extended.\n" +
                "Push your heels up to lift the padded lever and hold the contracted position, then slowly lower back down to the starting position. Repeat.", R.drawable.calfraiseseat));
        exerciseList.add(new Exercise("Barbell Stiff Leg Deadlifts", "Stand with a barbell at your shins with your feet shoulder width apart.\n" +
                "Bend forward at your hips and keep your knees as fully extended as possible.\n" +
                "Grab the barbell and then extend your hips while maintaining a straight back.\n" +
                "From the standing position, lower the weight in a controlled manner.\n" +
                "You can either lower the weight to the floor or before you touch the floor, depending on your mobility.", R.drawable.legdeadlift));
        exerciseList.add(new Exercise("Machine Hamstring Curl", "Lay down on the machine, placing your legs beneath the padded lever. Position your legs so that the padded lever is below your calve muscles.\n" +
                "Support yourself by grabbing the side handles of the machine, and slowly raise the weight with your legs, toes pointed straight.\n" +
                "Pause at the apex of the motion, then slowly return to starting position.", R.drawable.hamstring));
        exerciseList.add(new Exercise("Dumbbell Single Leg Stiff Leg Deadlift", "Start by standing on one leg with your feet shoulder-width apart and holding two dumbbells.\n" +
                "From this starting position, hinge at the hips to lower the dumbbell towards the ground, keeping your back straight and your core engaged.\n" +
                "Once you feel a stretch in your hamstring, slowly return to the starting position.\n" +
                "Make sure to keep your standing leg slightly bent and avoid rounding your back as you lower the dumbbell.", R.drawable.stifflegdead));

        return exerciseList;
    }
}
