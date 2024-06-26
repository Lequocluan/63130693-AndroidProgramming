package luan.lq.usingrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recycleViewData;
    RecyclerView recyclerViewLandScape;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycleViewData = getDataForRecyclerView();
        recyclerViewLandScape = findViewById(R.id.recycleLand);
            //set layout đứng
//      RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
//      recyclerViewLandScape.setLayoutManager(layoutLinear);

//            //layout ngang
//        RecyclerView.LayoutManager layoutLinearHorizonal = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
//        recyclerViewLandScape.setLayoutManager(layoutLinearHorizonal);

            //layout grid
                RecyclerView.LayoutManager layoutGrid = new GridLayoutManager(this,2);
        recyclerViewLandScape.setLayoutManager(layoutGrid);
        landScapeAdapter = new LandScapeAdapter(this, recycleViewData);
        recyclerViewLandScape.setAdapter(landScapeAdapter);



    }
    ArrayList<LandScape> getDataForRecyclerView(){
        ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();
        LandScape landScape1 = new LandScape("muidien", "mũi điện");
        dsDuLieu.add(landScape1);
        dsDuLieu.add(new LandScape("thienvientruclam", "Thiền viện trúc lâm"));
        dsDuLieu.add(new LandScape("eiffel", "Tháp Eiffel"));
        dsDuLieu.add(new LandScape("nuidabia", "Núi đá bia"));
        dsDuLieu.add(new LandScape("nuidabia", "Núi đá bia"));
        return dsDuLieu;
    }
}