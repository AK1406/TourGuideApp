package com.example.android.tourguide;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TempleAdapter extends ArrayAdapter<Temple> {


    TempleAdapter(Activity context, ArrayList<Temple> temples) {
        super(context, 0, temples);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.temple_item_list, parent, false);
        }

        Temple currentTemple = getItem(position);
        TextView templeName = listItemView.findViewById(R.id.temple_name);
        assert currentTemple != null;
        templeName.setText(currentTemple.getTempleName());

        ImageView iconView = listItemView.findViewById(R.id.temple_image);
        iconView.setImageResource(currentTemple.getImageResourceId());

        TextView templeLocation = listItemView.findViewById(R.id.temple_location);
        templeLocation.setText(currentTemple.getTempleLocation());

        TextView aboutTemple = listItemView.findViewById(R.id.about_temple);
        aboutTemple.setText(currentTemple.getAboutTemple());

        return listItemView;
    }
}
