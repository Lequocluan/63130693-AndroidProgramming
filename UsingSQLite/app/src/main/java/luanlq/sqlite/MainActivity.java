package luanlq.sqlite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        SQLiteDatabase database;
        database = openOrCreateDatabase("QLSV.db", MODE_PRIVATE, null);

        String taoBang = "CREATE TABLE SinhVien (id integer PRIMARY KEY, name text, lop text, hocLuc text)";
        String xoaBang = "DROP TABLE IF EXISTS SinhVien";
        database.execSQL(xoaBang);
        database.execSQL(taoBang);

        String sqlThem1 = "INSERT INTO SinhVien VALUES (63132681, 'Lê Quốc Luân', '63.CNTT-3', 'Giỏi')";
        String sqlThem2 = "INSERT INTO SinhVien VALUES (1123214, 'Lê Văn A', '63.CNTT-2', 'Khá')";
        String sqlThem3 = "INSERT INTO SinhVien VALUES (4252, 'Lê Văn B', '63.CNTT-4', 'Trung bình')";
        String sqlThem4 = "INSERT INTO SinhVien VALUES (1543, 'Lê Văn C', '63.CNTT-5', 'Giỏi')";
        String sqlThem5 = "INSERT INTO SinhVien VALUES (63132681, 'Lê Quốc Luân', '63.CNTT-3', 'Giỏi')";
        String sqlThem6 = "INSERT INTO SinhVien VALUES (1123214, 'Lê Văn A', '63.CNTT-2', 'Khá')";
        String sqlThem7 = "INSERT INTO SinhVien VALUES (63132681, 'Lê Quốc Luân', '63.CNTT-3', 'Giỏi')";
        String sqlThem8 = "INSERT INTO SinhVien VALUES (1123214, 'Lê Văn A', '63.CNTT-2', 'Khá')";
        database.execSQL(sqlThem1);
        database.execSQL(sqlThem2);
        database.execSQL(sqlThem3);
        database.execSQL(sqlThem4);
        database.execSQL(sqlThem5);
        database.execSQL(sqlThem6);
        database.execSQL(sqlThem7);
        database.execSQL(sqlThem8);
        database.close();
    }
}