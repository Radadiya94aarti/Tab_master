package com.example.lenovo.clientapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by lenovo on 17-03-2017.
 */

public class Login extends AppCompatActivity {


    TextView user_name, password,forgot_password;
    TextInputLayout password_field;
    Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        user_name = (TextView)findViewById(R.id.txt_username);
        password_field = (TextInputLayout)findViewById(R.id.txt_pwd);
        password = (TextView)findViewById(R.id.login_txt_pwd);
        forgot_password = (TextView)findViewById(R.id.forgot_pwd);
        login = (Button)findViewById(R.id.login_button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,MainActivity.class);
                startActivity(intent);

            }
        });
    }
}
