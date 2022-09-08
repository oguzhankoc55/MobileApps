package com.oguzhan.landmark;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;

import com.oguzhan.landmark.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {
    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityDetailsBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);

        Singleton singleton=Singleton.getInstance();
        LandMarks selectedLandmark = singleton.getSelectedLandmark();
        //binding.countryView.setText("Test");
        Intent intent =getIntent();
        LandMarks selectedLandMark=(LandMarks) intent.getSerializableExtra("landmark");
        binding.namView.setText(selectedLandMark.name);
        binding.imageView.setImageResource(selectedLandMark.image);
        binding.countryView.setText(selectedLandMark.country);


    }
}