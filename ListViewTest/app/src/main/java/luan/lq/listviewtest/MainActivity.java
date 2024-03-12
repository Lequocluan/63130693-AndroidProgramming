package luan.lq.listviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.jetbrains.annotations.TestOnly;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayList<String>   dsBH;
    ArrayAdapter<String> adapterBH;
    ListView    lvBaiHat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDK();

        ArrayList<String> dsBH;
        dsBH = new ArrayList<>();
        dsBH.add("chung ta cua tuong lai");
        dsBH.add("chung ta cua hien tai");
        dsBH.add("chung ta cua qua khu");

        ArrayAdapter<String> adapterBH;
        adapterBH = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                dsBH
        );

        ListView lvBaiHat = findViewById(R.id.lvLoiBaiHatYeuThich);
        lvBaiHat.setAdapter(adapterBH);
        lvBaiHat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String ChuoiThongBao= "Bạn chọn bài " + dsBH.get(position);
                Toast.makeText(MainActivity.this,
                        ChuoiThongBao,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
    void HamXuLyChonItem(int p){
        String ChuoiThongBao= "Bạn chọn bài" + dsBH.get(p);
        Toast.makeText(this, ChuoiThongBao, Toast.LENGTH_SHORT).show();
    }
    void TimDK(){
        lvBaiHat = findViewById(R.id.lvLoiBaiHatYeuThich);
    }
}