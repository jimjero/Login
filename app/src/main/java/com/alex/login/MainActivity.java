package com.alex.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etloginName;
    private EditText etloginPassword;
    private Button btnLoginSend;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView();
        btnLoginSend.setOnClickListener(this);
        etloginPassword.setOnClickListener(this);
        etloginName.setOnClickListener(this);
    }

    private void setContentView() {
        etloginName = findViewById(R.id.txtUsernamefacebook);
        etloginPassword = findViewById(R.id.editTextTextPassword2);
        btnLoginSend = findViewById(R.id.button);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {
            sendLogin();
        }
    }

    private void sendLogin() {
        if (etloginName.getText().toString().equalsIgnoreCase("Alex") &&
        etloginPassword.getText().toString().equalsIgnoreCase("1234"));
        Intent calculatorIntent = new Intent(this, CalculatorActivity.class);
        startActivity(calculatorIntent);
    }


}