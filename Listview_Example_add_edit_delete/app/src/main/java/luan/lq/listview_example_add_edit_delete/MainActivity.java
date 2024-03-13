package luan.lq.listview_example_add_edit_delete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity { 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnThem = findViewById(R.id.btnLuu);
        Button btnSua = findViewById(R.id.btnsua);
        Button btnXoa = findViewById(R.id.btnXoa);


    }

}