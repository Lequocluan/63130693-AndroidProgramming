package luan.lq.listview_example_add_edit_delete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dssv;
    ArrayAdapter<String> adapter;
    EditText edtItemPos;
    EditText edtValue;
    ListView lsvTen;
    Button btnLuu, btnSua, btnXoa;

    void LayThongTin() {
        // Khai báo các view
        edtItemPos=findViewById(R.id.edtItem_pos);
        edtValue=findViewById(R.id.edtValue);
        lsvTen = findViewById(R.id.lvTen);
        btnLuu = findViewById(R.id.btnLuu);
        btnSua = findViewById(R.id.btnsua);
        btnXoa = findViewById(R.id.btnXoa);
        // Khởi tạo danh sách
        dssv=new ArrayList<>();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LayThongTin();

        // Khởi tạo dữ liệu mẫu
        dssv.add("Lê Huy Tiến");
        dssv.add("Bùi Văn Đồng");
        dssv.add("Lê Quốc Luân");
        dssv.add("Nguyễn Thị Lanh");
        dssv.add("Đặng Thanh Nhàn");
        dssv.add("Tống Minh Tiến");
        dssv.add("Hoàng Thế Trình");

        // Khởi tạo Adapter và gán cho ListView
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dssv);
        lsvTen.setAdapter(adapter);

        // Đăng ký sự kiện khi click vào item trên ListView
        lsvTen.setOnItemClickListener(langnghe);
    }

    AdapterView.OnItemClickListener langnghe= new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            // Hiển thị thông tin của item được chọn lên các EditText
            edtItemPos.setText(String.valueOf(position));
            edtValue.setText(String.valueOf(dssv.get(position)));
            String banchon = "bạn chọn " + dssv.get(position);
            Toast.makeText(MainActivity.this, banchon, Toast.LENGTH_SHORT).show();
        }
    };

    // Sự kiện khi click vào nút "Lưu sửa"
    public void SaveEdit(View v) {
        String str_viTri = edtItemPos.getText().toString();
        if(str_viTri.isEmpty()){
            Toast.makeText(MainActivity.this, "Không có giá trị phù hợp để thay đổi!\nHãy chọn Item bên dưới nếu cần thay đổi...", Toast.LENGTH_SHORT).show();
        }
        else{
            String str_giaTri = edtValue.getText().toString();
            int index = Integer.parseInt(str_viTri);
            dssv.set(index, str_giaTri);
            adapter.notifyDataSetChanged(); // Cập nhật lại ListView
            Toast.makeText(MainActivity.this, "Đã thay đổi thành công!", Toast.LENGTH_SHORT).show();
        }
    }

    // Sự kiện khi click vào nút "Lưu thêm"
    public void AddItem(View v) {
        String str_GiaTri = edtValue.getText().toString();
        if(str_GiaTri.isEmpty()){
            Toast.makeText(this, "Không có giá trị để thêm vào!", Toast.LENGTH_SHORT).show();
        }
        else{
            dssv.add(str_GiaTri);
            adapter.notifyDataSetChanged(); // Cập nhật lại ListView
            edtValue.setText("");
            edtItemPos.setText("");
            Toast.makeText(this, "Đã thêm thành công!", Toast.LENGTH_SHORT).show();
        }
    }

    // Sự kiện khi click vào nút "Xóa"
    public void RemoveItem(View v){
        String str_viTri = edtItemPos.getText().toString();
        if(str_viTri.isEmpty()){
            Toast.makeText(MainActivity.this, "Không có phần tử nào để xóa!", Toast.LENGTH_SHORT).show();
        }
        else{
            int index = Integer.parseInt(str_viTri);
            dssv.remove(index);
            adapter.notifyDataSetChanged(); // Cập nhật lại ListView
            edtValue.setText("");
            edtItemPos.setText("");
            Toast.makeText(MainActivity.this, "Đã xóa thành công!", Toast.LENGTH_SHORT).show();
        }
    }
}

