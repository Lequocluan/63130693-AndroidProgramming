package ntu_63130693.cau2_appdanhsachnhac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvdsBaiHat = findViewById(R.id.lv_dsBaiHat);
        ArrayList<BaiHat> dsBaiHat = new ArrayList<BaiHat>();
        dsBaiHat.add(new BaiHat(R.drawable.ctcht,"Chúng ta của hiện tại", "Sơn Tùng MTP", R.drawable.btn_like_default, R.drawable.mores));
        BaiHat bh1= new BaiHat(R.drawable.ctctl,"Chúng ta của tương lai", "Sơn Tùng MTP", R.drawable.btn_like_default, R.drawable.mores);
        BaiHat bh2= new BaiHat(R.drawable.ncts,"Nâng chén tieu sau", "Bích Phương", R.drawable.btn_like_default, R.drawable.mores);
        BaiHat bh3= new BaiHat(R.drawable.lan_man,"Lan Man", "RonBongz", R.drawable.btn_like_default, R.drawable.mores);
        BaiHat bh4= new BaiHat(R.drawable.anhdalonhonthenhieu,"Anh da lon hon the nhieu", "Huỳnh Công Hiếu", R.drawable.btn_like_default, R.drawable.mores);
        BaiHat bh5= new BaiHat(R.drawable.ghe_qua,"Ghé qua", "Huỳnh Công Hiếu", R.drawable.btn_like_default, R.drawable.mores);
        BaiHat bh6= new BaiHat(R.drawable.ngoailecuanhau,"Ngoại lệ của nhau", "Obito feat Hương Ly", R.drawable.btn_like_default, R.drawable.mores);
        BaiHat bh7= new BaiHat(R.drawable.cdns,"Cat doi noi sau", "Sơn Tùng MTP", R.drawable.btn_like_default, R.drawable.mores);
        BaiHat bh8= new BaiHat(R.drawable.ncts,"Chúng ta của hiện tại nâng chén tiêu sau", "Sơn Tùng MTP & Bích Phương", R.drawable.btn_like_default, R.drawable.mores);
        BaiHat bh9= new BaiHat(R.drawable.atenv,"Anh thich em nhu vay", "Song Luan", R.drawable.btn_like_default, R.drawable.mores);
        BaiHat bh10= new BaiHat(R.drawable.alnv,"Anh luôn như vậy", "B Ray", R.drawable.btn_like_default, R.drawable.mores);


    }
}