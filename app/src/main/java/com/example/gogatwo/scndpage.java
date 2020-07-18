package com.example.gogatwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class scndpage extends AppCompatActivity {
    TextView tv,tv1;
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scndpage);
        tv=(TextView) findViewById(R.id.textView2);
        tv1=(TextView) findViewById(R.id.textView3);
        tv.setText("Hello "+getIntent().getStringExtra("NAME"));
        tv1.setText("Welcome");
        b2=(Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(scndpage.this,trdpg.class);
                startActivity(i2);
            }
        });

    }
}
