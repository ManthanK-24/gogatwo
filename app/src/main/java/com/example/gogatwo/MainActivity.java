package com.example.gogatwo;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MediaPlayer snd = MediaPlayer.create(this,R.raw.birds);
        et=(EditText)findViewById(R.id.editText) ;
        Button btn = (Button) this.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 snd.start();
                 String nv = et.getText().toString();
                 Intent i1 = new Intent(MainActivity.this,scndpage.class);
                 i1.putExtra("NAME",nv);
                 startActivity(i1);
            }
        });
    }
}
