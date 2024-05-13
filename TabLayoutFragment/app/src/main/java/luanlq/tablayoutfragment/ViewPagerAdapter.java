package luanlq.tablayoutfragment;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentStateAdapter {
    ArrayList<Landscape> ds;

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity, ArrayList<Landscape> _ds) {
        super(fragmentActivity);
        ds = _ds;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Landscape item_selected = ds.get(position);
        OneFragment_Landscape oneFragmentLandscape = new OneFragment_Landscape(item_selected);
        return oneFragmentLandscape;
    }

    @Override
    public int getItemCount() {
        return ds.size();
    }
}
