package com.teodik.chess_bluetooth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class PawnDialog extends AppCompatActivity implements View.OnClickListener {

    private ImageButton queen;
    private ImageButton rook;
    private ImageButton knight;
    private ImageButton bishop;
    private Intent resultIntent;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_pawn);
        queen = (ImageButton) findViewById(R.id.imageButton3);
        rook = (ImageButton) findViewById(R.id.imageButton4);
        knight = (ImageButton) findViewById(R.id.imageButton2);
        bishop = (ImageButton) findViewById(R.id.imageButton);
        queen.setImageResource(R.drawable.wq);
        rook.setImageResource(R.drawable.wr);
        knight.setImageResource(R.drawable.wn);
        bishop.setImageResource(R.drawable.wb);
        queen.setOnClickListener(this);
        rook.setOnClickListener(this);
        knight.setOnClickListener(this);
        bishop.setOnClickListener(this);
        resultIntent = new Intent();
    }

    public void onClick(View v) {
        switch(v.getId()){
            case R.id.imageButton3:
                resultIntent.putExtra("White", "WQ");
                setResult(Activity.RESULT_OK, resultIntent);
                finish();
                break;
            case R.id.imageButton4:
                resultIntent.putExtra("White", "WR");
                setResult(Activity.RESULT_OK, resultIntent);
                finish();
                break;
            case R.id.imageButton2:
                resultIntent.putExtra("White", "WN");
                setResult(Activity.RESULT_OK, resultIntent);
                finish();
                break;
            case R.id.imageButton:
                resultIntent.putExtra("White", "WB");
                setResult(Activity.RESULT_OK, resultIntent);
                finish();
                break;
        }
    }
}
