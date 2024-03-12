package luan.lq.simpleloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLogin= findViewById(R.id.btnLogin);
        final EditText edtUser = findViewById(R.id.edtUser);
        final EditText edtPass = findViewById(R.id.edtPass);
        final TextView tvAttemps= findViewById(R.id.tvAttemps);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String User= edtUser.getText().toString();
                String Pass=edtPass.getText().toString();
                if(User.equals("luandz") && Pass.equals("88888888")){
                    Toast.makeText(MainActivity.this, "User and PassWord is correct!", Toast.LENGTH_SHORT).show();
                }else{
                    int attemps= Integer.parseInt(tvAttemps.getText().toString());
                    tvAttemps.setText(String.valueOf(attemps+1));
                    Toast.makeText(MainActivity.this, "User and PassWord is not correct!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    

    
}