package com.example.sintomapp;
//Pagina Pricipal By Yeisson Fonseca

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button BtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BtnLogin=findViewById(R.id.BtnLogin);

        BtnLogin.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,ModuloProfesoresMenu.class);
            startActivity(intent);
        });
    }



}