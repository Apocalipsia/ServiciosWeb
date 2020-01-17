package facci.vanessa.macias.serviciosweb.ui.enter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import facci.vanessa.macias.serviciosweb.R;

public class EnterUserActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etUser;
    private Button btnFollowers;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_user);
        initViews();
    }

    private void initViews() {
        etUser = findViewById(R.id.enter_user_edit_text);
        btnFollowers = findViewById(R.id.enter_user_button);
        btnFollowers.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == btnFollowers) {
            Intent intent = new Intent(EnterUserActivity.this, InfoUserActivity.class);
            intent.putExtra("loginName", etUser.getText().toString());
            startActivity(intent);
        }
    }
}
