package luanlq.examviewpager2recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> viewPagerData;
    ViewPager2 viewPager2Land;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPagerData = getDataForViewPager();
        viewPager2Land = findViewById(R.id.vp2Land);
        landScapeAdapter = new LandScapeAdapter(this, viewPagerData);
        viewPager2Land.setAdapter(landScapeAdapter);

    }
    ArrayList<LandScape> getDataForViewPager(){
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