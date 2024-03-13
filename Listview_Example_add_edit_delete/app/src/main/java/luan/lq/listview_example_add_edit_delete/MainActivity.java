package luan.lq.listview_example_add_edit_delete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dssv;
    ArrayAdapter<String> adapter;
    EditText edtItemPos;
    EditText edtValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String>   dssv;
        dssv = new ArrayList<>();
        dssv.add("Lê Huy Tiến");
        dssv.add("Bùi Văn Đồng");
        dssv.add("Lê Quốc Luân");
        dssv.add("Nguyễn Thị Lanh");
        dssv.add("Đặng Thanh Nhàn");
        dssv.add("Tống Minh Tiến");
        dssv.add("Hoàng Thế Trình");

        
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, itemList);

        Button btnThem = findViewById(R.id.btnLuu);
        Button btnSua = findViewById(R.id.btnsua);
        Button btnXoa = findViewById(R.id.btnXoa);


    }

}