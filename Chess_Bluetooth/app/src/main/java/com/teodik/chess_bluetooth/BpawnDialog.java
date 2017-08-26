package com.teodik.chess_bluetooth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class BpawnDialog extends AppCompatActivity implements View.OnClickListener {

    private ImageButton queen;
    private ImageButton rook;
    private ImageButton knight;
    private ImageButton bishop;
    private Intent resultIntent;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_bpawn);
        queen = (ImageButton) findViewById(R.id.imageButton7);
        rook = (ImageButton) findViewById(R.id.imageButton8);
        knight = (ImageButton) findViewById(R.id.imageButton6);
        bishop = (ImageButton) findViewById(R.id.imageButton5);
        queen.setImageResource(R.drawable.bq);
        rook.setImageResource(R.drawable.br);
        knight.setImageResource(R.drawable.bn);
        bishop.setImageResource(R.drawable.bb);
        queen.setOnClickListener(this);
        rook.setOnClickListener(this);
        knight.setOnClickListener(this);
        bishop.setOnClickListener(this);
        resultIntent = new Intent();
    }

    public void onClick(View v) {
        switch(v.getId()){
            case R.id.imageButton7:
                resultIntent.putExtra("Black", "BQ");
                setResult(Activity.RESULT_OK, resultIntent);
                finish();
                break;
            case R.id.imageButton8:
                resultIntent.putExtra("Black", "BR");
                setResult(Activity.RESULT_OK, resultIntent);
                finish();
                break;
            case R.id.imageButton6:
                resultIntent.putExtra("Black", "BN");
                setResult(Activity.RESULT_OK, resultIntent);
                finish();
                break;
            case R.id.imageButton5:
                resultIntent.putExtra("Black", "BB");
                setResult(Activity.RESULT_OK, resultIntent);
                finish();
                break;
        }
    }
}
