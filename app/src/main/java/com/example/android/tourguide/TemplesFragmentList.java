package com.example.android.tourguide;

import android.app.Activity;
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

public class TemplesFragmentList extends Fragment {
    public TemplesFragmentList() {
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_temple_list, container, false);

        final ArrayList<Temple> templeDetail = new ArrayList<Temple>();

        templeDetail.add(new Temple(R.drawable.shrikashi, "Shri Kasi Temple", "Lahori Tola, Varanasi, Uttar Pradesh 221001", getString(R.string.shriKasiTemple)));
        templeDetail.add(new Temple(R.drawable.sankatmochan, "Sankat Mochan Temple", "Lahori Tola, Varanasi, Uttar Pradesh 221001", getString(R.string.sankatMochanTemplw)));
        templeDetail.add(new Temple(R.drawable.assighat, "Assi Ghat Temple", "Lahori Tola, Varanasi, Uttar Pradesh 221001", getString(R.string.assi_ghat_temple)));
        templeDetail.add(new Temple(R.drawable.biswa, "Kashi Vishwanath Mandir", "Vishwanath Gali,Varanasi", getString(R.string.viswa)));
        templeDetail.add(new Temple(R.drawable.kaal, " Kaal Bhairav Mandir", "Bharonath, Vishweshwarganj.", getString(R.string.kaal)));
        templeDetail.add(new Temple(R.drawable.kund, "Durga Kund Mandir", "Durgakund Road, Jawahar Nagar Colony", getString(R.string.viswa)));
        templeDetail.add(new Temple(R.drawable.nepali, "Nepali Hindu Temple", "Near Lalita Ghat, Lahori Tola.", getString(R.string.nepali)));

        TempleAdapter templeAdapter = new TempleAdapter(getActivity(), templeDetail);
        ListView listView = rootView.findViewById(R.id.temple_list);
        listView.setAdapter((ListAdapter) templeAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent = new Intent(getActivity(), TempleDetailsActivity.class);
                Temple templeInfo = templeDetail.get(position);

                Bundle bundle = new Bundle();
                bundle.putInt("temple_image", templeInfo.getImageResourceId());
                bundle.putString("temple_name", templeInfo.getTempleName());
                bundle.putString("temple_location", templeInfo.getTempleLocation());
                bundle.putString("about_temple", templeInfo.getAboutTemple());

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        return rootView;
    }
}
