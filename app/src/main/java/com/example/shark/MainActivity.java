package com.example.shark;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private NavigationView navigationView;

    private EditText editTextWeight, editTextHeight, editTextAge;
    private RadioGroup radioGroupGoal, radioGroupWorkouts;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.my_drawer_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        // To make the Navigation drawer icon always appear on the action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        navigationView = findViewById(R.id.nav_view);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                // Handle navigation view item clicks here.
                int id = item.getItemId();

                if (id == R.id.male_ex) {
                    Intent intent = new Intent(MainActivity.this, MainActivity.class);
                    startActivity(intent);
                } else if (id == R.id.female_ex) {
                    Intent intent = new Intent(MainActivity.this, FemaleExActivity.class);
                    startActivity(intent);
                } else if (id == R.id.meals_diets) {
                    Intent intent = new Intent(MainActivity.this, MealActivity.class);
                    startActivity(intent);
                }

                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });

        // Initialize the views for calorie calculation
        editTextWeight = findViewById(R.id.editTextWeight);
        editTextHeight = findViewById(R.id.editTextHeight);
        editTextAge = findViewById(R.id.editTextAge);
        radioGroupGoal = findViewById(R.id.radioGroupGoal);
        radioGroupWorkouts = findViewById(R.id.radioGroupWorkouts);
        textViewResult = findViewById(R.id.textViewResult);
    }

    public void calculateCalories(View view) {
        // Get user input values
        double weight = Double.parseDouble(editTextWeight.getText().toString());
        double height = Double.parseDouble(editTextHeight.getText().toString());
        int age = Integer.parseInt(editTextAge.getText().toString());

        // Get selected goal (gain/lose weight)
        int selectedGoalId = radioGroupGoal.getCheckedRadioButtonId();
        RadioButton selectedGoalRadioButton = findViewById(selectedGoalId);
        String goal = selectedGoalRadioButton.getText().toString();

        // Get selected number of workouts per week
        int selectedWorkoutsId = radioGroupWorkouts.getCheckedRadioButtonId();
        RadioButton selectedWorkoutsRadioButton = findViewById(selectedWorkoutsId);
        String workouts = selectedWorkoutsRadioButton.getText().toString();

        // Calculate calorie intake based on selected goal and workouts
        double calorieIntake;
        if (goal.equals("Gain Weight")) {
            if (workouts.equals("1-3 workouts/week")) {
                calorieIntake = calculateCaloriesForGainWeight(weight, height, age, 1.2);
            } else if (workouts.equals("4-5 workouts/week")) {
                calorieIntake = calculateCaloriesForGainWeight(weight, height, age, 1.375);
            } else {
                calorieIntake = calculateCaloriesForGainWeight(weight, height, age, 1.55);
            }
        } else {
            if (workouts.equals("1-3 workouts/week")) {
                calorieIntake = calculateCaloriesForLoseWeight(weight, height, age, 1.2);
            } else if (workouts.equals("4-5 workouts/week")) {
                calorieIntake = calculateCaloriesForLoseWeight(weight, height, age, 1.375);
            } else {
                calorieIntake = calculateCaloriesForLoseWeight(weight, height, age, 1.55);
            }
        }

        // Display the result
        textViewResult.setText(String.format("%.2f", calorieIntake));
    }

    private double calculateCaloriesForGainWeight(double weight, double height, int age, double activityMultiplier) {
        // Revised Harris-Benedict equation for gaining weight
        double bmr = 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);
        return bmr * activityMultiplier;
    }

    private double calculateCaloriesForLoseWeight(double weight, double height, int age, double activityMultiplier) {
        // Revised Harris-Benedict equation for losing weight
        double bmr = 447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age);
        return bmr * activityMultiplier;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
