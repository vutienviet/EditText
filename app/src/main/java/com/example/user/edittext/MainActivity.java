package com.example.user.edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     // B2: Khai bao
    private EditText adUsername;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //B3: Khoi tao
        adUsername= findViewById(R.id.adUsername);
        //B4:Xu ly
        // doi voi wdittext: thuong la lay text nguoi dung da nhap
        String input = adUsername.getText().toString().trim();
    }
}
