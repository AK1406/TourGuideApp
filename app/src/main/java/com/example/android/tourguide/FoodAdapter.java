package com.example.android.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FoodAdapter extends ArrayAdapter<Food> {


    FoodAdapter(Activity context, ArrayList<Food> food) {
        super(context, 0, food);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.food_list_item, parent, false);
        }

        Food currentFood = getItem(position);
        TextView foodName = listItemView.findViewById(R.id.food_name);
        assert currentFood != null;
        foodName.setText(currentFood.getFoodName());

        ImageView iconView = listItemView.findViewById(R.id.food_image);
        iconView.setImageResource(currentFood.getImageResourceId());

        TextView aboutFood = listItemView.findViewById(R.id.about_food);
        aboutFood.setText(currentFood.getAboutFood());
        return listItemView;

    }
}
