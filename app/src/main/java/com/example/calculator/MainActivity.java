package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
public TextView rest;
public EditText n1,n2;
public Button sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 =(EditText) findViewById(R.id.edNb1);
        n2 =(EditText) findViewById(R.id.edNb2);
        sum= (Button) findViewById(R.id.btnSUM);
        rest =(TextView) findViewById(R.id.txtRest);
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String nb1 = n1.getText().toString();
//                String nb2 = n2.getText().toString();
//                Integer total = Integer.parseInt(nb1) + Integer.parseInt(nb2);
//                rest.setText(Integer.toString(total));
                rest.setText(calculSum());

            }
            public String calculSum (){
                String nb1 = n1.getText().toString();
                String nb2 = n2.getText().toString();
                Integer total = Integer.parseInt(nb1) + Integer.parseInt(nb2);
                return Integer.toString(total);
            }
        });



    }
}