package com.example.telkomnewui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;
import com.kingfisher.easyviewindicator.RecyclerViewIndicator;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private List<Item> itemList = new ArrayList<>();
    private List<Item2> itemList2 = new ArrayList<>();
    private RecycleAdapter adapter;
    private RecycleAdapter2 adapter2;
    RecyclerView recycleview1,recycleview2;
    TabLayout tabs;
    TextView tv_lihatsemua;
    RecyclerViewIndicator tab_layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycleview1=findViewById(R.id.recycleview1);
        recycleview2=findViewById(R.id.recycleview2);
        tv_lihatsemua=findViewById(R.id.tv_lihatsemua);
        tab_layout=findViewById(R.id.tab_layout);
        tabs = findViewById(R.id.tabs);
        tabs.addTab(tabs.newTab().setText("Internet").setIcon(R.drawable.internet));
        tabs.addTab(tabs.newTab().setText("Telepon & SMS").setIcon(R.drawable.sendmsg));
        tabs.addTab(tabs.newTab().setText("Roaming").setIcon(R.drawable.plane));
        tabs.addTab(tabs.newTab().setText("Multimedia").setIcon(R.drawable.stars));

        adapter=new RecycleAdapter(itemList);

        adapter2=new RecycleAdapter2(itemList2);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager mLayoutManager2 = new LinearLayoutManager(getApplicationContext());
        recycleview1.setLayoutManager(mLayoutManager);
        recycleview2.setLayoutManager(mLayoutManager2);

        recycleview1.setItemAnimator(new DefaultItemAnimator());
        recycleview1.setAdapter(adapter);
        tab_layout.setRecyclerView(recycleview1);
        dataList();

        recycleview2.setItemAnimator(new DefaultItemAnimator());
        recycleview2.setAdapter(adapter2);
        data2List();

        tv_lihatsemua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void dataList()
    {
        Item item = new Item(R.drawable.itemimage,"Promo - Berakhir dalam 3 hari","50 GB", "Rp 150.000","Rp 199.000","Combo Extra Internet OMG!","30 Hari");
        itemList.add(item);

        Item item2 = new Item(R.drawable.itemimage,"Promo - Berakhir dalam 3 hari","17 GB", "Rp 150.000","Rp 103.000","Internet OMG!","30 Hari");
        itemList.add(item2);

        Item item3 = new Item(R.drawable.itemimage,"Promo - Berakhir dalam 3 hari","18 GB", "Rp 109.000","Rp 106.000","Internet PROMO Asia Australia","30 Hari");
        itemList.add(item3);

        Item item4 = new Item(R.drawable.itemimage,"Promo - Berakhir dalam 3 hari","20 GB", "Rp 150.000","Rp 199.000","Paket Bundling CloudMAX","30 Hari");
        itemList.add(item4);

        Item item5 = new Item(R.drawable.itemimage,"Promo - Berakhir dalam 1 hari","5 GB", "Rp 60.000","Rp 51.000","Paket Internet","30 Hari");
        itemList.add(item5);

        Item item6 = new Item(R.drawable.itemimage,"Promo - Berakhir dalam 1 hari","7 GB", "Rp 80.000","Rp 71.000","MAXstream","30 Hari");
        itemList.add(item6);

        Item item7 = new Item(R.drawable.itemimage,"Promo - Berakhir dalam 1 hari","10 GB", "Rp 95.000","Rp 81.000","Combo MAXstream","30 Hari");
        itemList.add(item7);

        Item item8 = new Item(R.drawable.itemimage,"Promo - Berakhir dalam 1 hari","13 GB", "Rp 103.000","Rp 92.000","Combo Mantap Internet OMG!","30 Hari");
        itemList.add(item8);


    }

    private void data2List()
    {
        Item2 item = new Item2(R.drawable.itemimage," Promo","Combo Internet OMG!","27 GB" ,"30 Hari","Rp 179.000" ,"Rp 195.000");
        itemList2.add(item);

        Item2 item2 = new Item2(R.drawable.itemimage,"","Internet OMG!","14 GB" ,"30 Hari","Rp 115.000" ,"");
        itemList2.add(item2);

        Item2 item3 = new Item2(R.drawable.keluargaiklan,"","Kuota Keluarga","45 GB" ,"30 Hari","Rp 250.000" ,"");
        itemList2.add(item3);

        Item2 item4 = new Item2(R.drawable.keluargaiklan,"","Kuota Keluarga","90 GB" ,"30 Hari","Rp 400.000" ,"");
        itemList2.add(item4);
    }
}
