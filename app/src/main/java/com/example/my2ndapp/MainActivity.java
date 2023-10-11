package com.example.my2ndapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onBtnClick (View view){
        TextView txtHello = findViewById(R.id.txtEmail);
        EditText edtTxtEmail = findViewById(R.id.editTextTextEmailAddress);
        txtHello.setText("Email: " + edtTxtEmail.getText().toString());
        TextView txtHello1 = findViewById(R.id.txtMessage2);
        EditText edtTxtName = findViewById(R.id.editTextName);
        txtHello1.setText("Fist Name: " + edtTxtName.getText().toString());
        TextView txtHello2 = findViewById(R.id.txtMessage3);
        EditText edtTxtName2 = findViewById(R.id.editTextName2);
        txtHello2.setText("Last Name: " + edtTxtName2.getText().toString());

    }
}