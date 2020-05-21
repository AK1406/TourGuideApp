package com.example.android.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ArchitectureAdapter extends ArrayAdapter<Architecture> {


    ArchitectureAdapter(Activity context, ArrayList<Architecture> Architectures) {
        super(context, 0, Architectures);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.architecture_list_item, parent, false);
        }

        Architecture currentArchitecture = getItem(position);
        TextView ArchitectureName = listItemView.findViewById(R.id.Architecture_name);
        assert currentArchitecture != null;
        ArchitectureName.setText(currentArchitecture.getArchitectureName());

        ImageView iconView = listItemView.findViewById(R.id.Architecture_image);
        iconView.setImageResource(currentArchitecture.getImageResourceId());


        TextView ArchitectureLocation = listItemView.findViewById(R.id.Architecture_location);
        ArchitectureLocation.setText(currentArchitecture.getArchitectureLocation());

        TextView aboutArchitecture = listItemView.findViewById(R.id.about_Architecture);
        aboutArchitecture.setText(currentArchitecture.getAboutArchitecture());
        return listItemView;
    }
}
