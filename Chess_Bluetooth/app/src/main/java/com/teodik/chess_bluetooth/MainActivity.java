package com.teodik.chess_bluetooth;

/*Teodik Meserkhani August 2017*/

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bluetooth;
        Button local;
        bluetooth = (Button) findViewById(R.id.bluetooth);
        local = (Button) findViewById(R.id.Local);
        bluetooth.setOnClickListener(this);
        local.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.Local:
                Intent intent = new Intent(MainActivity.this, ChessActivity.class);
                startActivity(intent);
                break;
            case R.id.bluetooth:
                Toast.makeText(MainActivity.this, "Bluetooth has not been finished yet!", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
