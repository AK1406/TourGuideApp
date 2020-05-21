package com.example.android.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ArchitectureDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_architechture_detail);

        Intent intent = getIntent();
        int ArchitectureImage = intent.getIntExtra("Architecture_image", R.drawable.image_placeholder);
        String ArchitectureName = intent.getStringExtra("Architecture_name");
        String ArchitectureLocation = intent.getStringExtra("Architecture_location");
        String aboutArchitecture = intent.getStringExtra("about_Architecture");

        ImageView ArchitectureCoverImageView = findViewById(R.id.ArchitectureImage);
        ArchitectureCoverImageView.setImageResource(ArchitectureImage);

        TextView ArchitectureNameTextView = findViewById(R.id.ArchitectureName);
        ArchitectureNameTextView.setText(ArchitectureName);

        TextView ArchitectureLocationTextView = findViewById(R.id.ArchitectureLocation);
        ArchitectureLocationTextView.setText(ArchitectureLocation);

        TextView aboutArchitectureTextView = findViewById(R.id.aboutArchitecture);
        aboutArchitectureTextView.setText(aboutArchitecture);
    }
}
