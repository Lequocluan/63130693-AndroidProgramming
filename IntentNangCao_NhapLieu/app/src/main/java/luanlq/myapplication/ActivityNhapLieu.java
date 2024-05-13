package luanlq.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class ActivityNhapLieu extends AppCompatActivity {
    Button btnNhap, btnDong;
    EditText edtTen, edtNamSinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhap_lieu);
        init();
        btnNhap.setOnClickListener(setData);
        btnDong.setOnClickListener(cancle);

    }

    View.OnClickListener setData = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String ten = edtTen.getText().toString();
            String nam = edtNamSinh.getText().toString();
            if(ten.isEmpty() || nam.isEmpty()){
                Toast.makeText(ActivityNhapLieu.this, "Chưa nhập dữ liệu!", Toast.LENGTH_SHORT).show();
            }
            else {
                Intent iSet = new Intent();
                iSet.putExtra("hoTen", ten);
                iSet.putExtra("namSinh", nam);
                setResult(RESULT_OK, iSet);
                finish();
            }
        }
    };

    View.OnClickListener cancle = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            edtTen.setText("");
            edtNamSinh.setText("");
            edtTen.requestFocus();
        }
    };
    public void init(){
        btnNhap = findViewById(R.id.btnNhap);
        btnDong = findViewById(R.id.btnDong);
        edtTen = findViewById(R.id.edHoTen);
        edtNamSinh = findViewById(R.id.edNamSinh);
    }
}