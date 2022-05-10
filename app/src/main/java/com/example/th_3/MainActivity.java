package com.example.th_3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
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

    public void btn_tong2so (View v){
        EditText edtsoa = (EditText) findViewById(R.id.editSoa);
        int a = Integer.parseInt(edtsoa.getText()+"");

        EditText edtSob = (EditText) findViewById(R.id.editSob);
        int b = Integer.parseInt(edtSob.getText()+"");

        TextView txtkq = (TextView) findViewById(R.id.txtKQ);
        txtkq.setText((a+b)+"");
    }
}