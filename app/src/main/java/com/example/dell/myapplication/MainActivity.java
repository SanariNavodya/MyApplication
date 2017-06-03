package com.example.dell.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Convert(View view) {
        EditText DField = (EditText) findViewById(R.id.DField);

        Double RAmount = Double.parseDouble(DField.getText().toString());

        Double DAmount = RAmount * 0.01;

        Toast.makeText(getApplicationContext(),"$" +DAmount.toString(),Toast.LENGTH_LONG).show();

    }
}
