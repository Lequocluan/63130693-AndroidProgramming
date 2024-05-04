package luanlq.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ActivityNhapLieu extends AppCompatActivity {

    EditText edHT ;
    EditText edNS  ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhap_lieu);
        edNS  = (EditText) findViewById(R.id.edNamSinh);
        edHT  = (EditText) findViewById(R.id.edHoTen);
    }
    public void NhapQuayVe(View v){

        String txtHoTen = edHT.getText().toString();
        int txtNamSinh = Integer.parseInt(edNS.getText().toString());

        Intent iNhapLieu = new Intent();

        iNhapLieu.putExtra("HT", txtHoTen);
        iNhapLieu.putExtra("NS", txtNamSinh);

        setResult(RESULT_OK, iNhapLieu);
        finish();
    }
    public void cancel(View v){
        edHT.setText("");
        edNS.setText("");
    }
}