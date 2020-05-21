package com.example.android.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RestaurantAdapter extends ArrayAdapter<Restaurant> {


    RestaurantAdapter(Activity context, ArrayList<Restaurant> restaurants) {
        super(context, 0, restaurants);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.restaurant_list_item, parent, false);
        }

        Restaurant currentRestaurant = getItem(position);
        TextView restaurantName = listItemView.findViewById(R.id.restaurant_name);
        assert currentRestaurant != null;
        restaurantName.setText(currentRestaurant.getRestaurantName());

        ImageView iconView = listItemView.findViewById(R.id.restaurant_image);
        iconView.setImageResource(currentRestaurant.getImageResourceId());

        TextView restaurantLocation = listItemView.findViewById(R.id.restaurant_location);
        restaurantLocation.setText(currentRestaurant.getRestaurantLocation());

        TextView aboutRestaurant = listItemView.findViewById(R.id.about_restaurant);
        aboutRestaurant.setText(currentRestaurant.getAboutRestaurant());
        return listItemView;
    }
}
