package com.example.senai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.editText = findViewById(R.id.et_texto);
        this.editText1 = findViewById(R.id.et_Texto1);
    }
    @Override
    protected void onStart() {super.onStart();}

    public void onClickBtnMostrar(View v) {
        Toast.makeText(MainActivity.this, editText.getText() + " " + editText1.getText(), Toast.LENGTH_LONG).show();

    }

    public void onClickBtnLimpar(View v) {
        editText.setText("");
        editText1.setText("");

    }
}