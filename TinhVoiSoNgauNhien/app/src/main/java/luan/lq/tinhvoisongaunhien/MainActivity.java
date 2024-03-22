package luan.lq.tinhvoisongaunhien;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText edt1, edt2, edtKQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        edtKQ = findViewById(R.id.edtKQ);
        Button btnTao = findViewById(R.id.btnTao);

        btnTao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int num1 = rand.nextInt(10); // Tạo số ngẫu nhiên từ 0 đến 99
                int num2 = rand.nextInt(10);
                edt1.setText(String.valueOf(num1));
                edt2.setText(String.valueOf(num2));
                edtKQ.setText("");
            }
        });
    }

    // Phương thức tính toán kết quả
    public void calculate(View view) {
        int num1 = Integer.parseInt(edt1.getText().toString());
        int num2 = Integer.parseInt(edt2.getText().toString());
        ImageButton imbtnCong = findViewById(R.id.imbtnCong);
        int result = 0;


        if (view.getId() == R.id.imbtnCong) {
            result = num1 + num2;
        } else if (view.getId() == R.id.imbtnTru) {
            result = num1 - num2;
        } else if (view.getId() == R.id.imbtnNhan) {
            result = num1 * num2;
        } else if (view.getId() == R.id.imbtnChia) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                edtKQ.setText("Không thể chia cho 0");
                return;
            }
        }

        edtKQ.setText(String.valueOf(result));
    }
}