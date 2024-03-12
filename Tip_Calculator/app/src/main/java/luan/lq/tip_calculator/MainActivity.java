package luan.lq.tip_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edtTien = findViewById(R.id.edtTien);
        final TextView tvThongBao = findViewById(R.id.tvThongBao);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        Button btnTinh = findViewById(R.id.btnTinh);

        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Kiểm tra xem đã chọn RadioButton và nhập số tiền vào EditText chưa
                if (edtTien.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập số tiền", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (radioGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(MainActivity.this, "Vui lòng chọn phần trăm tip", Toast.LENGTH_SHORT).show();
                    return;
                }

                double tien = Double.parseDouble(edtTien.getText().toString());

                RadioButton selectedRadioButton = findViewById(radioGroup.getCheckedRadioButtonId());
                double tipPercentage = Double.parseDouble(selectedRadioButton.getText().toString().replace("%", "")) / 100;

                double tipAmount = tien * tipPercentage;
                double totalAmount = tien + tipAmount;

                // Hiển thị tiền tip ở TextView
                String message = "Tiền tip: $" + String.format("%.2f", tipAmount);
                tvThongBao.setText(message);

            }
        });
    }
}