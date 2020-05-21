package com.example.android.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);

        Intent intent = getIntent();
        int foodImage = intent.getIntExtra("food_image", R.drawable.image_placeholder);
        String foodName = intent.getStringExtra("food_name");
        String aboutFood = intent.getStringExtra("about_food");

        ImageView foodCoverImageView = findViewById(R.id.foodImage);
        foodCoverImageView.setImageResource(foodImage);

        TextView foodNameTextView = findViewById(R.id.foodName);
        foodNameTextView.setText(foodName);

        TextView aboutFoodTextView = findViewById(R.id.aboutFood);
        aboutFoodTextView.setText(aboutFood);
    }
}
