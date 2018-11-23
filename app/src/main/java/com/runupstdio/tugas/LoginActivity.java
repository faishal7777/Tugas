package com.runupstdio.tugas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    Button mSignIn;
    Button mSignUp;
    TextView mForgotPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mSignIn = findViewById(R.id.login_signIn);

        mSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SignIn = new Intent(LoginActivity.this, NavigationActivity.class);
                startActivity(SignIn);
            }
        });

        mSignUp = findViewById(R.id.login_signUp);
        mSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SignUp = new Intent(LoginActivity.this, RegistActivity.class);
                startActivity(SignUp);
            }
        });

        mForgotPass = findViewById(R.id.login_forgotPass);
        mForgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forgot = new Intent(LoginActivity.this, LupaPasswordActivity.class);
                startActivity(forgot);
            }
        });
    }
}
