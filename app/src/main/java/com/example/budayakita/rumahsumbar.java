package com.example.budayakita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class rumahsumbar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumahsumbar);
        //now we can create two types of slider first using viewpager
        //and another using third party library which is easy to use let's get started
        ImageSlider imageSlider=findViewById(R.id.slider);

        List<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.rumahsumbar1,"Rumah Adat"));
        slideModels.add(new SlideModel (R.drawable.rumahsumbar2,"Rumah Adat"));
        slideModels.add(new SlideModel(R.drawable.rumahsumbar3,"Rumah Adat"));
        imageSlider.setImageList(slideModels,true);
    }
}