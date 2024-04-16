package luanlq.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView view;
    ArrayList<examData> ds;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = findViewById(R.id.recyclerView);
        ds = new ArrayList<>();
        ds.add(new examData("First exam", "12/23/23", "fsakjfs"));
        ds.add(new examData("First exam", "12/23/23", "fsakjfs"));
        ds.add(new examData("First exam", "12/23/23", "fsakjfs"));
        ds.add(new examData("First exam", "12/23/23", "fsakjfs"));
        ds.add(new examData("First exam", "12/23/23", "fsakjfs"));
        view.setLayoutManager(new LinearLayoutManager(this));
        view.setAdapter(new ImageGalleryAdapter2(ds, this));
    }
}