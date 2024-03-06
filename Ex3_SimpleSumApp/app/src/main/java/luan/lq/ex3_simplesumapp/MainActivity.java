package luan.lq.ex3_simplesumapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }
    //la bo lang nghe va xu ly su kien onclick
    public void XuLyCong(View view){
    //tim tham chieu den dieu khien tren xml
        EditText edittextsoA = findViewById(R.id.edtA);
        EditText edittextsoB = findViewById(R.id.edtB);
        EditText edittextKQ = findViewById(R.id.edtKQ);
        //lay du lieu ve
        String strA = edittextsoA.getText().toString();
        String strB = edittextsoB.getText().toString();

        //chuyen du lieu sang so
        int so_A = Integer.parseInt(strA);
        int so_B = Integer.parseInt(strB);

        //tinh toan
    int tong = so_A + so_B;
    String strTong = String.valueOf(tong);
    //hien ra man hinh ket qua tinh duoc
         edittextKQ.setText(strTong);

    }
}