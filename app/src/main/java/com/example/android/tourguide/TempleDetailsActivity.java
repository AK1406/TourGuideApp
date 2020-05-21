package com.example.android.tourguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TempleDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temple_detail);


        Intent intent = getIntent();

        int templeImage = intent.getIntExtra("temple_image", R.drawable.image_placeholder);
        String templeName = intent.getStringExtra("temple_name");
        String templeLocation = intent.getStringExtra("temple_location");
        String aboutTemple = intent.getStringExtra("about_temple");

        ImageView templeCoverImageView = findViewById(R.id.templeImage);
        templeCoverImageView.setImageResource(templeImage);

        TextView templeNameTextView = findViewById(R.id.templeName);
        templeNameTextView.setText(templeName);

        TextView templeLocationTextView = findViewById(R.id.templeLocation);
        templeLocationTextView.setText(templeLocation);

        TextView aboutTempleTextView = findViewById(R.id.aboutTemple);
        aboutTempleTextView.setText(aboutTemple);
    }
}
