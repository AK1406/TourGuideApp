package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class ArchitectureFragmentList extends Fragment {

    public ArchitectureFragmentList() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_architecture_list, container, false);

        final ArrayList<Architecture> ArchitectureDetail = new ArrayList<Architecture>();
        ArchitectureDetail.add(new Architecture(R.drawable.ramnagar, "Ramnagar Fort", "Varanasi Rd, Purana, Ramnagar, Uttar Pradesh 221008",
                getString(R.string.ramnagar)));
        ArchitectureDetail.add(new Architecture(R.drawable.tomb, "Tomb Of Lal Khan", "near the Malviya bridge right on the back side of Khirkiya Ghat, Varanasi, Uttar Pradesh",
                getString(R.string.tomb)));
        ArchitectureDetail.add(new Architecture(R.drawable.stupa, "Chaukhandi Stupa", "Rishpattan Rd, Near, Sarnath, Varanasi, Uttar Pradesh 221007",
                getString(R.string.stupa)));
        ArchitectureDetail.add(new Architecture(R.drawable.masjid, "Madho Rai Ki Masjid", " Varanasi, Uttar Pradesh 221007",
                getString(R.string.masjid)));
        ArchitectureDetail.add(new Architecture(R.drawable.dhamke, "Dhamekh Stupa", " Dharmapala Rd, Singhpur, Sarnath, Varanasi, Uttar Pradesh 221007",
                getString(R.string.dhamke)));
        ArchitectureDetail.add(new Architecture(R.drawable.asoka, "Ashoka Pillar", "Varanasi, Uttar Pradesh 221007",
                getString(R.string.ashok)));
        ArchitectureDetail.add(new Architecture(R.drawable.mulagandha, "Mulagandha Kuti Vihara", "Sarnath, Varanasi, Uttar Pradesh 221007",
                getString(R.string.ashok)));

        ArrayAdapter ArchitectureAdapter = new ArchitectureAdapter(getActivity(), ArchitectureDetail);
        ListView listView = rootView.findViewById(R.id.Architecture_list);
        listView.setAdapter(ArchitectureAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent = new Intent(getActivity(), ArchitectureDetailActivity.class);
                Architecture ArchitectureInfo = ArchitectureDetail.get(position);

                Bundle bundle = new Bundle();
                bundle.putInt("Architecture_image", ArchitectureInfo.getImageResourceId());
                bundle.putString("Architecture_name", ArchitectureInfo.getArchitectureName());
                bundle.putString("Architecture_location", ArchitectureInfo.getArchitectureLocation());
                bundle.putString("about_Architecture", ArchitectureInfo.getAboutArchitecture());

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        return rootView;
    }

}
