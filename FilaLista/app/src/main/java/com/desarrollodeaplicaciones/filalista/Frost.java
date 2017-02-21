package com.desarrollodeaplicaciones.filalista;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Irbing on 15/02/2017.
 */

public class Frost extends AppCompatActivity {



    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frost);
        btnBack=(Button)findViewById(R.id.volver);

        btnBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent next = new Intent(Frost.this, MainActivity.class);
                startActivity(next);
            }
        });
    }
}
