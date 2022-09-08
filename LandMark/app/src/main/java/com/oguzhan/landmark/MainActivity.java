package com.oguzhan.landmark;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.oguzhan.landmark.databinding.ActivityDetailsBinding;
import com.oguzhan.landmark.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {
    ArrayList<LandMarks> landMarksArrayList;
    private ActivityMainBinding binding;
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);

        landMarksArrayList=new ArrayList<>();

        LandMarks pisa=new LandMarks("Pisa","Italy",R.drawable.pisa);
        LandMarks eiffel=new LandMarks("Eiffel","France",R.drawable.eiffel);
        LandMarks colosseum=new LandMarks("colosseum","Italy",R.drawable.colesseo);
        LandMarks londonBridge=new LandMarks("London Bridge","UK",R.drawable.londonbridge);

        landMarksArrayList.add(pisa);
        landMarksArrayList.add(eiffel);
        landMarksArrayList.add(colosseum);
        landMarksArrayList.add(londonBridge);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter=new LandmarkAdapter(landMarksArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);
        /*

        //Adapter
        //Listview
        ArrayAdapter arrayAdapter =new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1,
                landMarksArrayList.stream().map(landMarks -> landMarks.name).collect(Collectors.toList())
        );
        binding.listView.setAdapter(arrayAdapter);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent =new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("landmark",landMarksArrayList.get(position));
                startActivity(intent);

            }
        });

*/

    }
}