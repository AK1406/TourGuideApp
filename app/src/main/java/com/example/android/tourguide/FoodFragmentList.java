package com.example.android.tourguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class FoodFragmentList extends Fragment {
    public FoodFragmentList() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_food_list, container, false);

        final ArrayList<Food> foodDetail = new ArrayList<Food>();

        foodDetail.add(new Food(R.drawable.aalo, "Aloo Kachori", getString(R.string.aalo)));
        foodDetail.add(new Food(R.drawable.jalebi, "Desi Ghee Ki Jalebi", getString(R.string.jalebi)));
        foodDetail.add(new Food(R.drawable.chat, "Aloo Tamatar Chaat", getString(R.string.chaat)));
        foodDetail.add(new Food(R.drawable.galgappe, "Golgappe", getString(R.string.golgappe)));
        foodDetail.add(new Food(R.drawable.baati, "Baati Chokha", getString(R.string.baati)));
        foodDetail.add(new Food(R.drawable.thandai, "Thandai", getString(R.string.thandai)));
        foodDetail.add(new Food(R.drawable.dahi, "Chhena Dahi Badas", getString(R.string.dahi)));
        foodDetail.add(new Food(R.drawable.chicken, "Dalmandi Wale Chicken And Roomali Roti", getString(R.string.chicken)));

        FoodAdapter foodAdapter = new FoodAdapter(getActivity(), foodDetail);
        ListView listView = rootView.findViewById(R.id.food_list);
        listView.setAdapter(foodAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent = new Intent(getActivity(), FoodDetailActivity.class);
                Food foodInfo = foodDetail.get(position);

                Bundle bundle = new Bundle();
                bundle.putInt("food_image", foodInfo.getImageResourceId());
                bundle.putString("food_name", foodInfo.getFoodName());
                bundle.putString("about_food", foodInfo.getAboutFood());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        return rootView;
    }
}
