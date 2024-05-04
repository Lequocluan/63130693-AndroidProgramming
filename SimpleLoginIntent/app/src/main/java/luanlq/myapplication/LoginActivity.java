package luanlq.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText txtUser, txtPassword, txtUserEmail;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // Ánh xạ các view
        btnLogin = findViewById(R.id.btnLogin);
        txtUser = findViewById(R.id.txtUser);
        txtUserEmail = findViewById(R.id.txtUserEmail);
        txtPassword = findViewById(R.id.txtPassword);
    }

    public void DangNhap(View v) {
        String user = txtUser.getText().toString();
        String email = txtUserEmail.getText().toString();
        String password = txtPassword.getText().toString();

        if (user.isEmpty() || email.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập đầy đủ thông tin bao gồm: username, useremail, password", Toast.LENGTH_SHORT).show();
        } else if (user.equals("63CNTT2") && password.equals("12345678")) {
            Intent iTrangChaoMung = new Intent(this, HomeActivity.class);
            iTrangChaoMung.putExtra("USERNAME", user);
            startActivity(iTrangChaoMung);
        } else {
            Toast.makeText(this, "Sai tên người dùng hoặc mật khẩu", Toast.LENGTH_SHORT).show();
        }
    }
}