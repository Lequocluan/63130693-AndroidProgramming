package luanlq.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TextViewKt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == 8000) {
            if(resultCode == RESULT_OK) {
                String hoTenNhanDuoc = data.getStringExtra("HT");
                int namSinhNhanDuoc = data.getIntExtra("NS", 2022); // Đảm bảo bạn đã sử dụng "NS" ở đây
                TextView tvHT = findViewById(R.id.tvHoTen);
                TextView tvNS = findViewById(R.id.tvNamSinh);
                tvHT.setText(hoTenNhanDuoc);
                tvNS.setText(String.valueOf(namSinhNhanDuoc));
            } else {
                Toast.makeText(this, "Trả về thất bại", Toast.LENGTH_SHORT).show();
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    public void NhapLieu(View v){
        Intent iNhap = new Intent(this, ActivityNhapLieu.class);
        startActivityForResult(iNhap, 8000);
    }
}