package luanlq.simpleexplicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import luanlq.simpleexplicitintent.R;

public class SubActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_one);
    }
}