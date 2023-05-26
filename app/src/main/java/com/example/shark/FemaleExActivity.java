package com.example.shark;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class FemaleExActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_female_ex);

        drawerLayout = findViewById(R.id.my_drawer_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.male_ex) {
            Intent intent = new Intent(FemaleExActivity.this, MainActivity.class);
            startActivity(intent);
        } else if (id == R.id.female_ex) {
            Intent intent = new Intent(FemaleExActivity.this, FemaleExActivity.class);
            startActivity(intent);
        } else if (id == R.id.meals_diets) {
            Intent intent = new Intent(FemaleExActivity.this, MealActivity.class);
            startActivity(intent);
        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    public void goToMainActivity(View view) {
        Intent intent = new Intent(this, FemaleExActivity.class);
        startActivity(intent);
    }

    public void goToFemale1Activity(View view) {
        Intent intent = new Intent(this, Female_Hands.class);
        startActivity(intent);
    }

    public void goToFemale2Activity(View view) {
        Intent intent = new Intent(this, Female_Back.class);
        startActivity(intent);
    }

    public void goToFemale3Activity(View view) {
        Intent intent = new Intent(this, Female_Chest.class);
        startActivity(intent);
    }

    public void goToFemale4Activity(View view) {
        Intent intent = new Intent(this, Female_Glutee.class);
        startActivity(intent);
    }

    public void goToFemale5Activity(View view) {
        Intent intent = new Intent(this, Female_Legs.class);
        startActivity(intent);
    }

    public void goToFemale6Activity(View view) {
        Intent intent = new Intent(this, Female_Abs.class);
        startActivity(intent);
    }
}
