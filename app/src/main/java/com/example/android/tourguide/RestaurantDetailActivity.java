package com.example.android.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RestaurantDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_detail);


        Intent intent = getIntent();
        int restaurantImage = intent.getIntExtra("restaurant_image", R.drawable.image_placeholder);
        String restaurantName = intent.getStringExtra("restaurant_name");
        String restaurantLocation = intent.getStringExtra("restaurant_location");
        String restaurantTime = intent.getStringExtra("restaurant_time_price");
        String aboutRestaurant = intent.getStringExtra("about_restaurant");

        ImageView restaurantImageCover = findViewById(R.id.restaurantImage);
        restaurantImageCover.setImageResource(restaurantImage);

        TextView restaurantNameTextView = findViewById(R.id.restaurantName);
        restaurantNameTextView.setText(restaurantName);

        TextView restaurantLocationTextView = findViewById(R.id.restaurantLocation);
        restaurantLocationTextView.setText(restaurantLocation);

        TextView restaurantTimeTextView = findViewById(R.id.restaurantTime);
        restaurantTimeTextView.setText(restaurantTime);

        TextView aboutRestaurantTextView = findViewById(R.id.aboutRestaurant);
        aboutRestaurantTextView.setText(aboutRestaurant);
    }
}

