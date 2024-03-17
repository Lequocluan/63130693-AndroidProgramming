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
    Button btnLuu, btnSua, btnXoa;
    ListView lsvTen;
    void LayThongTin(){
        edtItemPos=findViewById(R.id.edtItem_pos);
        edtValue=findViewById(R.id.edtValue);
        lsvTen = (ListView)findViewById(R.id.lvTen);
        btnLuu = findViewById(R.id.btnLuu);
        btnSua = findViewById(R.id.btnsua);
        btnXoa = findViewById(R.id.btnXoa);
        dssv=new ArrayList<>();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LayThongTin();

        ArrayList<String> dssv;
        dssv = new ArrayList<>();
        dssv.add("Lê Huy Tiến");
        dssv.add("Bùi Văn Đồng");
        dssv.add("Lê Quốc Luân");
        dssv.add("Nguyễn Thị Lanh");
        dssv.add("Đặng Thanh Nhàn");
        dssv.add("Tống Minh Tiến");
        dssv.add("Hoàng Thế Trình");


        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dssv);
        lsvTen.setAdapter(adapter);
        lsvTen.setOnItemClickListener(langnghe);
    }
        AdapterView.OnItemClickListener langnghe= new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                edtItemPos.setText(String.valueOf(position));
                edtValue.setText(String.valueOf(dssv.get(position)));
                String banchon = "bạn chọn" + dssv.get(position);
                Toast.makeText(MainActivity.this, "banchon", Toast.LENGTH_SHORT).show();
            }
        };
    View.OnClickListener boLangNgheSuaItem = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String str_viTri = edtItemPos.getText().toString();
            if(str_viTri.isEmpty()){
                Toast.makeText(MainActivity.this, "Không có giá trị phù hợp để thay đổi!\nHãy chọn Item bên dưới nếu cần thay đổi...", Toast.LENGTH_SHORT).show();
            }
            else{
                String str_giaTri = edtValue.getText().toString();
                if(dssv.get(Integer.parseInt(str_viTri)).equals(str_giaTri)){
                    Toast.makeText(MainActivity.this, "Không có sự thay đổi!", Toast.LENGTH_SHORT).show();
                }
                else{
                    int index = Integer.parseInt(str_viTri);
                    dssv.set(index, str_giaTri);
                    Toast.makeText(MainActivity.this, "Đã thay đổi thành công!", Toast.LENGTH_SHORT).show();
                }
            }
        }
    };

    public void RemoveItem(View v){
        String str_viTri = edtItemPos.getText().toString();
        if(str_viTri.isEmpty()){
            Toast.makeText(MainActivity.this, "Không có phần tử nào để xóa!", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(MainActivity.this, "Đã xóa thành công phần tử " + dssv.get(Integer.parseInt(str_viTri)), Toast.LENGTH_SHORT).show();
            dssv.remove(Integer.parseInt(str_viTri));
            lsvTen.setAdapter(adapter);
            edtValue.setText("");
            edtItemPos.setText("");
        }
    }

    public void AddItem(View v){
        String str_GiaTri = edtValue.getText().toString();
        if(str_GiaTri.isEmpty()){
            Toast.makeText(this, "Không có giá trị để thêm vào!", Toast.LENGTH_SHORT).show();
        }
        else{
            for (String i : dssv){
                if(str_GiaTri.equals(i.toString())){
                    Toast.makeText(this, "Đã có phần tử này rồi!", Toast.LENGTH_SHORT).show();
                    return;
                }
            }
            dssv.add(str_GiaTri);
            lsvTen.setAdapter(adapter);
            edtValue.setText("");
            edtItemPos.setText("");
            Toast.makeText(this, "Đã thêm thành công!", Toast.LENGTH_SHORT).show();
        }
    }
}