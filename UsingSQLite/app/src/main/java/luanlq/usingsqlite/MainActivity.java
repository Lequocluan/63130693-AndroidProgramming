package luanlq.usingsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SQLiteDatabase db = openOrCreateDatabase("QLSach.db", MODE_PRIVATE, null );
        String sqlXoaBangNeuDaCo="DROP TABLE IF EXISTS Books;";
//
        String sqlTaoBang = "CREATE TABLE Books( BookID integer PRIMARY KEY, " +
                                                "BookName text, " +
                                                "Page integer, " +
                                                "Price Float, " +
                                                "Description text);";

        db.execSQL(sqlXoaBangNeuDaCo);
        db.execSQL(sqlTaoBang);
        // Thêm một số dòng dữ liệu vào bảng
        String sqlThem1 = "INSERT INTO Books VALUES(1, 'C', 100, 9.99, 'cơ bản C');";
        String sqlThem2 = "INSERT INTO Books VALUES(2, 'C#', 320, 19.00, 'C# cơ bản');";
        String sqlThem3 = "INSERT INTO Books VALUES(3, 'an', 120, 0.99, 'ăn');";
        String sqlThem4 = "INSERT INTO Books VALUES(4, 'gsk', 1000, 29.50, 'sách gsk');";
        String sqlThem5 = "INSERT INTO Books VALUES(5, 'mac', 1, 1, 'mac-lenin');";
        db.execSQL(sqlThem1);
        db.execSQL(sqlThem2);
        db.execSQL(sqlThem3);
        db.execSQL(sqlThem4);
        db.execSQL(sqlThem5);
        db.close();
    }
}