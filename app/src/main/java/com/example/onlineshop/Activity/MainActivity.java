package com.example.onlineshop.Activity;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onlineshop.Adapter.PopularListAdapter;
import com.example.onlineshop.Domain.PopularDomain;
import com.example.onlineshop.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapterPupolar;
    private RecyclerView recyclerViewPupolar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
       initRecyclerview();
    }

    private void initRecyclerview() {
        ArrayList<PopularDomain> items=new ArrayList<>();
        items.add(new PopularDomain("Asus Vivobook","powerful M2 chip. This cutting-edge laptop" +
                "\" redefines performance and portability. With its \\n\"\n" +
                "\"sleek design and advanced technology, the \\n\" + \n" +
                "\"MacBook Pro 13 M2 chip is your ultimate \\n\" + \n" +
                "\"companion for productivity, creativity, and\\n\" + \n" +
                "\" entertainment. Experience seamless multitasking, \n" +
                "\\n\" + \"stunning visuals on the Retina display, and\\n\" + \n" +
                "\"enhanced security with Touch ID. Take your\\n\" +\n" +
                "computing experience to the next level","pic1",15,20,500));
        items.add(new PopularDomain("PS-5 Pro Plus","powerful M2 chip. This cutting-edge laptop" +
                "\" redefines performance and portability. With its \\n\"\n" +
                "\"sleek design and advanced technology, the \\n\" + \n" +
                "\"MacBook Pro 13 M2 chip is your ultimate \\n\" + \n" +
                "\"companion for productivity, creativity, and\\n\" + \n" +
                "\" entertainment. Experience seamless multitasking, \n" +
                "\\n\" + \"stunning visuals on the Retina display, and\\n\" + \n" +
                "\"enhanced security with Touch ID. Take your\\n\" +\n" +
                "computing experience to the next level","pic2",10,4.2,450));
        items.add(new PopularDomain("Iphone 14","powerful M2 chip. This cutting-edge laptop\n" +
                "\" redefines performance and portability. With its \\n\"\n" +
                "\"sleek design and advanced technology, the \\n\" + \n" +
                "\"MacBook Pro 13 M2 chip is your ultimate \\n\" + \n" +
                "\"companion for productivity, creativity, and\\n\" + \n" +
                "\" entertainment. Experience seamless multitasking, \n" +
                "\\n\" + \"stunning visuals on the Retina display, and\\n\" + \n" +
                "\"enhanced security with Touch ID. Take your\\n\" +\n" +
                "computing experience to the next level ","pic3",13,4.5,800));

        recyclerViewPupolar=findViewById(R.id.view1);
        recyclerViewPupolar.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterPupolar=new PopularListAdapter(items);
        recyclerViewPupolar.setAdapter(adapterPupolar);


    }
}