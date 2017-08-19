package com.teodik.chess_bluetooth;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ChessActivity extends AppCompatActivity implements View.OnClickListener{

    private String piece;
    private int location;
    private boolean turn;
    private Button b0;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b10;
    private Button b11;
    private Button b12;
    private Button b13;
    private Button b14;
    private Button b15;
    private Button b16;
    private Button b17;
    private Button b18;
    private Button b19;
    private Button b20;
    private Button b21;
    private Button b22;
    private Button b23;
    private Button b24;
    private Button b25;
    private Button b26;
    private Button b27;
    private Button b28;
    private Button b29;
    private Button b30;
    private Button b31;
    private Button b32;
    private Button b33;
    private Button b34;
    private Button b35;
    private Button b36;
    private Button b37;
    private Button b38;
    private Button b39;
    private Button b40;
    private Button b41;
    private Button b42;
    private Button b43;
    private Button b44;
    private Button b45;
    private Button b46;
    private Button b47;
    private Button b48;
    private Button b49;
    private Button b50;
    private Button b51;
    private Button b52;
    private Button b53;
    private Button b54;
    private Button b55;
    private Button b56;
    private Button b57;
    private Button b58;
    private Button b59;
    private Button b60;
    private Button b61;
    private Button b62;
    private Button b63;

    private Button[] buttons;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chess);
        turn = true;
        piece = "";
        location = -1;
        b0 = (Button) findViewById(R.id.b0);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b10 = (Button) findViewById(R.id.b10);
        b11 = (Button) findViewById(R.id.b11);
        b12 = (Button) findViewById(R.id.b12);
        b13 = (Button) findViewById(R.id.b13);
        b14 = (Button) findViewById(R.id.b14);
        b15 = (Button) findViewById(R.id.b15);
        b16 = (Button) findViewById(R.id.b16);
        b17 = (Button) findViewById(R.id.b17);
        b18 = (Button) findViewById(R.id.b18);
        b19 = (Button) findViewById(R.id.b19);
        b20 = (Button) findViewById(R.id.b20);
        b21 = (Button) findViewById(R.id.b21);
        b22 = (Button) findViewById(R.id.b22);
        b23 = (Button) findViewById(R.id.b23);
        b24 = (Button) findViewById(R.id.b24);
        b25 = (Button) findViewById(R.id.b25);
        b26 = (Button) findViewById(R.id.b26);
        b27 = (Button) findViewById(R.id.b27);
        b28 = (Button) findViewById(R.id.b28);
        b29 = (Button) findViewById(R.id.b29);
        b30 = (Button) findViewById(R.id.b30);
        b31 = (Button) findViewById(R.id.b31);
        b32 = (Button) findViewById(R.id.b32);
        b33 = (Button) findViewById(R.id.b33);
        b34 = (Button) findViewById(R.id.b34);
        b35 = (Button) findViewById(R.id.b35);
        b36 = (Button) findViewById(R.id.b36);
        b37 = (Button) findViewById(R.id.b37);
        b38 = (Button) findViewById(R.id.b38);
        b39 = (Button) findViewById(R.id.b39);
        b40 = (Button) findViewById(R.id.b40);
        b41 = (Button) findViewById(R.id.b41);
        b42 = (Button) findViewById(R.id.b42);
        b43 = (Button) findViewById(R.id.b43);
        b44 = (Button) findViewById(R.id.b44);
        b45 = (Button) findViewById(R.id.b45);
        b46 = (Button) findViewById(R.id.b46);
        b47 = (Button) findViewById(R.id.b47);
        b48 = (Button) findViewById(R.id.b48);
        b49 = (Button) findViewById(R.id.b49);
        b50 = (Button) findViewById(R.id.b50);
        b51 = (Button) findViewById(R.id.b51);
        b52 = (Button) findViewById(R.id.b52);
        b53 = (Button) findViewById(R.id.b53);
        b54 = (Button) findViewById(R.id.b54);
        b55 = (Button) findViewById(R.id.b55);
        b56 = (Button) findViewById(R.id.b56);
        b57 = (Button) findViewById(R.id.b57);
        b58 = (Button) findViewById(R.id.b58);
        b59 = (Button) findViewById(R.id.b59);
        b60 = (Button) findViewById(R.id.b60);
        b61 = (Button) findViewById(R.id.b61);
        b62 = (Button) findViewById(R.id.b62);
        b63 = (Button) findViewById(R.id.b63);
        b0.setText("BR");
        b1.setText("BN");
        b2.setText("BB");
        b3.setText("BK");
        b4.setText("BQ");
        b5.setText("BB");
        b6.setText("BN");
        b7.setText("BR");
        b8.setText("BP");
        b9.setText("BP");
        b10.setText("BP");
        b11.setText("BP");
        b12.setText("BP");
        b13.setText("BP");
        b14.setText("BP");
        b15.setText("BP");
        b48.setText("WP");
        b49.setText("WP");
        b50.setText("WP");
        b51.setText("WP");
        b52.setText("WP");
        b53.setText("WP");
        b54.setText("WP");
        b55.setText("WP");
        b56.setText("WR");
        b57.setText("WN");
        b58.setText("WB");
        b59.setText("WK");
        b60.setText("WQ");
        b61.setText("WB");
        b62.setText("WN");
        b63.setText("WR");
        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b13.setOnClickListener(this);
        b14.setOnClickListener(this);
        b15.setOnClickListener(this);
        b16.setOnClickListener(this);
        b17.setOnClickListener(this);
        b18.setOnClickListener(this);
        b19.setOnClickListener(this);
        b20.setOnClickListener(this);
        b21.setOnClickListener(this);
        b22.setOnClickListener(this);
        b23.setOnClickListener(this);
        b24.setOnClickListener(this);
        b25.setOnClickListener(this);
        b26.setOnClickListener(this);
        b27.setOnClickListener(this);
        b28.setOnClickListener(this);
        b29.setOnClickListener(this);
        b30.setOnClickListener(this);
        b31.setOnClickListener(this);
        b32.setOnClickListener(this);
        b33.setOnClickListener(this);
        b34.setOnClickListener(this);
        b35.setOnClickListener(this);
        b36.setOnClickListener(this);
        b37.setOnClickListener(this);
        b38.setOnClickListener(this);
        b39.setOnClickListener(this);
        b40.setOnClickListener(this);
        b41.setOnClickListener(this);
        b42.setOnClickListener(this);
        b43.setOnClickListener(this);
        b44.setOnClickListener(this);
        b45.setOnClickListener(this);
        b46.setOnClickListener(this);
        b47.setOnClickListener(this);
        b48.setOnClickListener(this);
        b49.setOnClickListener(this);
        b50.setOnClickListener(this);
        b51.setOnClickListener(this);
        b52.setOnClickListener(this);
        b53.setOnClickListener(this);
        b54.setOnClickListener(this);
        b55.setOnClickListener(this);
        b56.setOnClickListener(this);
        b57.setOnClickListener(this);
        b58.setOnClickListener(this);
        b59.setOnClickListener(this);
        b60.setOnClickListener(this);
        b61.setOnClickListener(this);
        b62.setOnClickListener(this);
        b63.setOnClickListener(this);
        buttons = new Button[64];
        buttons[0] = b0;
        buttons[1] = b1;
        buttons[2] = b2;
        buttons[3] = b3;
        buttons[4] = b4;
        buttons[5] = b5;
        buttons[6] = b6;
        buttons[7] = b7;
        buttons[8] = b8;
        buttons[9] = b9;
        buttons[10] = b10;
        buttons[11] = b11;
        buttons[12] = b12;
        buttons[13] = b13;
        buttons[14] = b14;
        buttons[15] = b15;
        buttons[16] = b16;
        buttons[17] = b17;
        buttons[18] = b18;
        buttons[19] = b19;
        buttons[20] = b20;
        buttons[21] = b21;
        buttons[22] = b22;
        buttons[23] = b23;
        buttons[24] = b24;
        buttons[25] = b25;
        buttons[26] = b26;
        buttons[27] = b27;
        buttons[28] = b28;
        buttons[29] = b29;
        buttons[30] = b30;
        buttons[31] = b31;
        buttons[32] = b32;
        buttons[33] = b33;
        buttons[34] = b34;
        buttons[35] = b35;
        buttons[36] = b36;
        buttons[37] = b37;
        buttons[38] = b38;
        buttons[39] = b39;
        buttons[40] = b40;
        buttons[41] = b41;
        buttons[42] = b42;
        buttons[43] = b43;
        buttons[44] = b44;
        buttons[45] = b45;
        buttons[46] = b46;
        buttons[47] = b47;
        buttons[48] = b48;
        buttons[49] = b49;
        buttons[50] = b50;
        buttons[51] = b51;
        buttons[52] = b52;
        buttons[53] = b53;
        buttons[54] = b54;
        buttons[55] = b55;
        buttons[56] = b56;
        buttons[57] = b57;
        buttons[58] = b58;
        buttons[59] = b59;
        buttons[60] = b60;
        buttons[61] = b61;
        buttons[62] = b62;
        buttons[63] = b63;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.b0:
                if(piece.equals("")&&location == -1) {
                    piece = b0.getText().toString();
                    location = 0;
                }
                else if(piece.equals(b0.getText().toString())&& location == 0){
                    piece = "";
                    location = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();

                }
                else{
                    if(equaluate(piece, location, 0)){
                        turn = !turn;
                        piece = "";
                        location = -1;
                    }
                    else{
                        piece = "";
                        location = -1;
                        Toast.makeText(ChessActivity.this, "Not a valid move!", Toast.LENGTH_LONG).show();
                    }
                }
                break;
            case R.id.b1:
                break;
            case R.id.b2:
                break;
            case R.id.b3:
                break;
            case R.id.b4:
                break;
            case R.id.b5:
                break;
            case R.id.b6:
                break;
            case R.id.b7:
                break;
            case R.id.b8:
                break;
            case R.id.b9:
                if(piece.equals("")&&location == -1) {
                    piece = b9.getText().toString();
                    location = 8;
                }
                else if(piece.equals(b9.getText().toString())&& location == 8){
                    piece = "";
                    location = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();

                }
                else{
                    if(equaluate(piece, location, 8)){
                        turn = !turn;
                        piece = "";
                        location = -1;
                    }
                    else{
                        piece = "";
                        location = -1;
                        Toast.makeText(ChessActivity.this, "Not a valid move!", Toast.LENGTH_LONG).show();
                    }
                }
                break;
            case R.id.b10:
                break;
            case R.id.b11:
                break;
            case R.id.b12:
                break;
            case R.id.b13:
                break;
            case R.id.b14:
                break;
            case R.id.b15:
                break;
            case R.id.b16:
                break;
            case R.id.b17:
                break;
            case R.id.b18:
                break;
            case R.id.b19:
                break;
            case R.id.b20:
                break;
            case R.id.b21:
                break;
            case R.id.b22:
                break;
            case R.id.b23:
                break;
            case R.id.b24:
                break;
            case R.id.b25:
                break;
            case R.id.b26:
                break;
            case R.id.b27:
                break;
            case R.id.b28:
                break;
            case R.id.b29:
                break;
            case R.id.b30:
                break;
            case R.id.b31:
                break;
            case R.id.b32:
                break;
            case R.id.b33:
                break;
            case R.id.b34:
                break;
            case R.id.b35:
                break;
            case R.id.b36:
                break;
            case R.id.b37:
                break;
            case R.id.b38:
                break;
            case R.id.b39:
                break;
            case R.id.b40:
                break;
            case R.id.b41:
                break;
            case R.id.b42:
                break;
            case R.id.b43:
                break;
            case R.id.b44:
                break;
            case R.id.b45:
                break;
            case R.id.b46:
                break;
            case R.id.b47:
                break;
            case R.id.b48:
                break;
            case R.id.b49:
                break;
            case R.id.b50:
                break;
            case R.id.b51:
                break;
            case R.id.b52:
                break;
            case R.id.b53:
                break;
            case R.id.b54:
                break;
            case R.id.b55:
                break;
            case R.id.b56:
                break;
            case R.id.b57:
                break;
            case R.id.b58:
                break;
            case R.id.b59:
                break;
            case R.id.b60:
                break;
            case R.id.b61:
                break;
            case R.id.b62:
                break;
            case R.id.b63:
                break;
        }
    }

    private boolean equaluate(String piece, int location, int i) {
        if(piece.charAt(1) == 'R' || piece.charAt(1) == 'P')
            return rook(piece, location, i);
        else if(piece.charAt(1) == 'B')
            return false;
        return false;
    }

    private boolean rook(String piece, int location, int i) {
        int j = location + 8;
        while(j >= 0 && j < 64){
            if(j == i){
                buttons[j].setText(piece);
                buttons[location].setText("");
                return true;
            }
            if(!buttons[j].getText().toString().equals(""))
                break;
            j += 8;
        }
        j = location - 8;
        while(j >= 0 && j < 64){
            if(j == i){
                buttons[j].setText(piece);
                buttons[location].setText("");
                return true;
            }
            if(!buttons[j].getText().toString().equals(""))
                break;
            j -= 8;
        }
        j = location + 1;
        while(j >= 0 && j < 64){
            if(j == i){
                buttons[j].setText(piece);
                buttons[location].setText("");
                return true;
            }
            if(!buttons[j].getText().toString().equals("")){
                break;
            }
            if(j % 8 == 0 && (j + 1) % 8 == 1)
                break;
            j += 1;
        }
        j = location - 1;
        while(j >= 0 && j < 64){
            if(j == i){
                buttons[j].setText(piece);
                buttons[location].setText("");
                return true;
            }
            if(!buttons[j].getText().toString().equals(""))
                break;
            if(j % 8 ==1 && (j - 1) % 8 == 0)
                break;
            j -= 1;
        }
        return false;
    }
}
