package luanlq.myapplication;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TextViewKt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvHoten, tvNamsinh;
    private ActivityResultLauncher<Intent> activityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
        @Override
        public void onActivityResult(ActivityResult o) {
            if(o.getResultCode() == RESULT_OK){
                Intent iNhap = o.getData();
                tvHoten.setText(iNhap.getStringExtra("hoTen"));
                tvNamsinh.setText(iNhap.getStringExtra("namSinh"));
            }
            else Toast.makeText(MainActivity.this, "Trả về thất bại", Toast.LENGTH_SHORT).show();
        }
    });
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvHoten = findViewById(R.id.tvHoTen);
        tvNamsinh = findViewById(R.id.tvNamSinh);
    }
    public void MoManHinhNhapLieu(View v){
        Intent iNhapLieu = new Intent(this, ActivityNhapLieu.class);
        activityResultLauncher.launch(iNhapLieu);
    }
}