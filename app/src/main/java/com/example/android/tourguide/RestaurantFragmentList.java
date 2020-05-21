package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantFragmentList extends Fragment {
    public RestaurantFragmentList() {
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_restaurent_list, container, false);

        final ArrayList<Restaurant> restaurantDetail = new ArrayList<Restaurant>();

        restaurantDetail.add(new Restaurant(R.drawable.brown, "Brown Bread Café", "Bangali Tola Road, Pandey Ghat, Bangali Tola Varanasi, Uttar Pradesh, 221001, India",
                "Timings: 7:00 AM to 10:00 PM   Price: INR 500 for 2 people", getString(R.string.brown)));

        restaurantDetail.add(new Restaurant(R.drawable.canton, "Canton Royale Restaurant", "The Mall Road S-20/51 A-5, Hotel Surya, Varanasi 221002 India, +91 98385 21199",
                "Timings: 11:00 AM to 11:00 PM   Price: INR 500 to 1500 for 2 people", getString(R.string.canton)));

        restaurantDetail.add(new Restaurant(R.drawable.roof, "Roof Top Restaurant", "D 1/45, Lalita Ghat, Lahori Tola, Puja Guest House, Varanasi 222 India",
                "Timings: 7:00 AM to 10:30 AM, 2:00 PM to 4:30 PM and 6:30 PM to 10:30 PM \n Price: INR 1100 for two people", getString(R.string.roof)));

        restaurantDetail.add(new Restaurant(R.drawable.kashi, "Kashi Chat Bhandar", "Godowlia Chowk (between crossroads and church), Varanasi India, +91 542 241 2116",
                "Timings: 4:00 AM to 10:00 PM   Price: INR 150", getString(R.string.kashi)));

        restaurantDetail.add(new Restaurant(R.drawable.pizzi, "Pizzeria Vaatika Café, Assi Ghat", "Pizzeria Vaatika Cafe, B 1/178 Assi Ghat, Varanasi, India, +91 9838 094111",
                "Timings: 7:30 AM to 10:00PM   Price: INR 1000 for 2 people", getString(R.string.pizzi)));

        restaurantDetail.add(new Restaurant(R.drawable.mangi, "Mangi Ferra Café", "The Mall Road Cantonment, Varanasi 221002 India, +91 542 250 8466",
                "Timings: 11:00 AM to 11:00 PM   Price: INR 800 for two people", getString(R.string.mangi)));


        RestaurantAdapter restaurantAdapter = new RestaurantAdapter(getActivity(), restaurantDetail);
        ListView listView = rootView.findViewById(R.id.restaurant_list);
        listView.setAdapter((ListAdapter) restaurantAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent = new Intent(getActivity(), RestaurantDetailActivity.class);
                Restaurant restaurantInfo = restaurantDetail.get(position);
                Bundle bundle = new Bundle();
                bundle.putInt("restaurant_image", restaurantInfo.getImageResourceId());
                bundle.putString("restaurant_name", restaurantInfo.getRestaurantName());
                bundle.putString("restaurant_location", restaurantInfo.getRestaurantLocation());
                bundle.putString("restaurant_time_price", restaurantInfo.getRestaurantTime());
                bundle.putString("about_restaurant", restaurantInfo.getAboutRestaurant());

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        return rootView;
    }
}




