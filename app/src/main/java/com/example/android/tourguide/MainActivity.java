package com.example.android.tourguide;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mNavDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer_layout);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mNavDrawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.navView);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, mNavDrawer, toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close
        );
        mNavDrawer.addDrawerListener(toggle);

        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new MainFragment())
                    .commit();

            navigationView.setCheckedItem(R.id.nav_city);
        }
    }

    @Override
    public void onBackPressed() {

        if (mNavDrawer.isDrawerOpen(GravityCompat.START)) {
            mNavDrawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()) {
            case R.id.nav_city:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, new MainFragment())
                        .commit();
                break;
            case R.id.nav_temple:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, new TemplesFragmentList())
                        .commit();
                break;
            case R.id.nav_Architecture:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, new ArchitectureFragmentList())
                        .commit();
                break;
            case R.id.nav_restaurant:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, new RestaurantFragmentList())
                        .commit();
                break;
            case R.id.nav_food:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, new FoodFragmentList())
                        .commit();
                break;

        }

        mNavDrawer.closeDrawer(GravityCompat.START);

        return true;
    }
}
