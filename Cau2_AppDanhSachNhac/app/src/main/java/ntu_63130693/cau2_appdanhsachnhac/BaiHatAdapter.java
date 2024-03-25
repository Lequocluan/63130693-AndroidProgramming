

import android.content.Context;
import android.icu.util.RangeValueIterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import ntu_63130693.cau2_appdanhsachnhac.BaiHat;
import ntu_63130693.cau2_appdanhsachnhac.R;

public class BaiHatAdapter extends BaseAdapter {

    private ArrayList<BaiHat> dsBaiHat;
    private LayoutInflater layoutInflater;
    private Context context;

    public BaiHatAdapter(ArrayList<BaiHat> dsBaiHat, Context _context) {
        this.dsBaiHat = dsBaiHat;
        this.context = _context;
        this.layoutInflater = LayoutInflater.from(_context);
    }

    @Override
    public int getCount() {
        return dsBaiHat.size();
    }

    @Override
    public Object getItem(int i) {
        return dsBaiHat.get(i);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        //
        View viewHien = view;
        //
        if (viewHien == null) {
            viewHien = layoutInflater.inflate(R.layout.item_baihat, null);

            //lay dư lieu
            BaiHat BaiHatHienTai = dsBaiHat.get(i);

            //gan lên các điều khiển

            //tim đều khiển
            TextView textView_BaiHat = (TextView) viewHien.findViewById(R.id.tv_tenBaiHat);
            TextView textView_CaSi = (TextView) viewHien.findViewById(R.id.tv_tenCasi);
            ImageView img_avt_BaiHat = (ImageView) viewHien.findViewById(R.id.avt_baihat);
            ImageButton imbtn_btn_likeMusic = (ImageButton) viewHien.findViewById(R.id.btn_likeMusic);
            TextView textView_btn_more = (TextView) viewHien.findViewById(R.id.btn_more);

            //set ln
            textView_BaiHat.setText(BaiHatHienTai.getTenBaiHat());
            textView_CaSi.setText(BaiHatHienTai.getTenCaSi());
            img_avt_BaiHat.setImageResource(BaiHatHienTai.getAvt_BaiHat());

            // Thêm sự kiện click cho nút more
            textView_btn_more.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "Lựa chọn thêm vào danh sách phát, chia sẻ và xem chi tiết...", Toast.LENGTH_SHORT).show();

                }
            });
        }
        return viewHien;

    }
}
