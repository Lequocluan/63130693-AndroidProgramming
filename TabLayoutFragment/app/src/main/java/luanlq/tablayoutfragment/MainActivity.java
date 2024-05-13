package luanlq.tablayoutfragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Landscape> ds;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ds =getDataViewPager2();
        tabLayout = findViewById(R.id.tabLayoutLandscape);
        ViewPager2 viewPager2 = findViewById(R.id.viewPager);
        viewPager2.setAdapter(new ViewPagerAdapter(this, ds));
        viewPager2.setPageTransformer(pageTransformer);
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout, viewPager2, ((tab, position) -> tab.setText("Land " + (position + 1))));
        tabLayoutMediator.attach();
    }
    ViewPager2.PageTransformer pageTransformer = new ViewPager2.PageTransformer() {
        @Override
        public void transformPage(@NonNull View page, float position) {
            final float MIN_SCALE = 0.75f;
            int pageWidth = page.getWidth();
            if (position < -1) {
                page.setAlpha(0f);
            } else if (position <= 0) {
                page.setAlpha(1f);
                page.setTranslationX(0f);
                page.setScaleX(1f);
                page.setScaleY(1f);
            } else if (position <= 1) {
                page.setAlpha(1 - position);
                page.setTranslationX(pageWidth * -position);
                float scaleFactor = MIN_SCALE
                        + (1 - MIN_SCALE) * (1 - Math.abs(position));
                page.setScaleX(scaleFactor);
                page.setScaleY(scaleFactor);
            } else {
                page.setAlpha(0f);
            }
        }
    };
    ArrayList<Landscape> getDataViewPager2(){
        ArrayList<Landscape> dsDuLieu = new ArrayList<>();
        dsDuLieu.add(new Landscape("Cát bà", R.drawable.catba));
        dsDuLieu.add(new Landscape("Mũi Điện Phú Yên", R.drawable.muidien));
        dsDuLieu.add(new Landscape("Núi Bà Đen", R.drawable.nuibaden));
        dsDuLieu.add(new Landscape("Phú Quốc", R.drawable.phuquoc));
        dsDuLieu.add(new Landscape("Vinpearl", R.drawable.vinpearl));
        dsDuLieu.add(new Landscape("Phong Nha Kẻ Bàng", R.drawable.phongnhakebang));
        return dsDuLieu;
    }
}