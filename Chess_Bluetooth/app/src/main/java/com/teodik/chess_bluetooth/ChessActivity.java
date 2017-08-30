package com.teodik.chess_bluetooth;

/*Teodik Meserkhani August 2017*/

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class ChessActivity extends AppCompatActivity implements View.OnClickListener{
    private Handler handler = new Handler();
    private boolean validate;
    private String piece;
    private int origin;
    private int destination;
    private boolean turn;
    private boolean[] whitePawns;
    private boolean[] blackPawns;
    private boolean enpasse;
    private int enpasse_loc;
    private static final int white = 1;
    private static final int black = 2;
    private int pawnPromotion;
    private String savedTag;
    private int whiteKing;
    private int blackKing;
    private boolean kingWhite;
    private boolean leftWhiteRook;
    private boolean rightWhiteRook;
    private boolean kingBlack;
    private boolean leftBlackRook;
    private boolean rightBlackRook;
    private boolean castle;
   // private boolean castle1;
    private ImageButton b0;
    private ImageButton b1;
    private ImageButton b2;
    private ImageButton b3;
    private ImageButton b4;
    private ImageButton b5;
    private ImageButton b6;
    private ImageButton b7;
    private ImageButton b8;
    private ImageButton b9;
    private ImageButton b10;
    private ImageButton b11;
    private ImageButton b12;
    private ImageButton b13;
    private ImageButton b14;
    private ImageButton b15;
    private ImageButton b16;
    private ImageButton b17;
    private ImageButton b18;
    private ImageButton b19;
    private ImageButton b20;
    private ImageButton b21;
    private ImageButton b22;
    private ImageButton b23;
    private ImageButton b24;
    private ImageButton b25;
    private ImageButton b26;
    private ImageButton b27;
    private ImageButton b28;
    private ImageButton b29;
    private ImageButton b30;
    private ImageButton b31;
    private ImageButton b32;
    private ImageButton b33;
    private ImageButton b34;
    private ImageButton b35;
    private ImageButton b36;
    private ImageButton b37;
    private ImageButton b38;
    private ImageButton b39;
    private ImageButton b40;
    private ImageButton b41;
    private ImageButton b42;
    private ImageButton b43;
    private ImageButton b44;
    private ImageButton b45;
    private ImageButton b46;
    private ImageButton b47;
    private ImageButton b48;
    private ImageButton b49;
    private ImageButton b50;
    private ImageButton b51;
    private ImageButton b52;
    private ImageButton b53;
    private ImageButton b54;
    private ImageButton b55;
    private ImageButton b56;
    private ImageButton b57;
    private ImageButton b58;
    private ImageButton b59;
    private ImageButton b60;
    private ImageButton b61;
    private ImageButton b62;
    private ImageButton b63;
    private ImageButton[] buttons;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chess);
        validate = false;
        turn = true;
        piece = "";
        origin = -1;
        destination = -1;
        pawnPromotion = -1;
        savedTag = "";
        enpasse=false;
        enpasse_loc = -1;
        whitePawns = new boolean[]{false, false, false, false, false, false, false, false};
        blackPawns = new boolean[]{false, false, false, false, false, false, false, false};
        kingBlack = true;
        kingWhite = true;
        leftBlackRook = true;
        rightBlackRook = true;
        leftWhiteRook = true;
        rightWhiteRook = true;
        castle = false;
        //castle1 = false;
        b0 = (ImageButton) findViewById(R.id.b0);
        b1 = (ImageButton) findViewById(R.id.b1);
        b2 = (ImageButton) findViewById(R.id.b2);
        b3 = (ImageButton) findViewById(R.id.b3);
        b4 = (ImageButton) findViewById(R.id.b4);
        b5 = (ImageButton) findViewById(R.id.b5);
        b6 = (ImageButton) findViewById(R.id.b6);
        b7 = (ImageButton) findViewById(R.id.b7);
        b8 = (ImageButton) findViewById(R.id.b8);
        b9 = (ImageButton) findViewById(R.id.b9);
        b10 = (ImageButton) findViewById(R.id.b10);
        b11 = (ImageButton) findViewById(R.id.b11);
        b12 = (ImageButton) findViewById(R.id.b12);
        b13 = (ImageButton) findViewById(R.id.b13);
        b14 = (ImageButton) findViewById(R.id.b14);
        b15 = (ImageButton) findViewById(R.id.b15);
        b16 = (ImageButton) findViewById(R.id.b16);
        b17 = (ImageButton) findViewById(R.id.b17);
        b18 = (ImageButton) findViewById(R.id.b18);
        b19 = (ImageButton) findViewById(R.id.b19);
        b20 = (ImageButton) findViewById(R.id.b20);
        b21 = (ImageButton) findViewById(R.id.b21);
        b22 = (ImageButton) findViewById(R.id.b22);
        b23 = (ImageButton) findViewById(R.id.b23);
        b24 = (ImageButton) findViewById(R.id.b24);
        b25 = (ImageButton) findViewById(R.id.b25);
        b26 = (ImageButton) findViewById(R.id.b26);
        b27 = (ImageButton) findViewById(R.id.b27);
        b28 = (ImageButton) findViewById(R.id.b28);
        b29 = (ImageButton) findViewById(R.id.b29);
        b30 = (ImageButton) findViewById(R.id.b30);
        b31 = (ImageButton) findViewById(R.id.b31);
        b32 = (ImageButton) findViewById(R.id.b32);
        b33 = (ImageButton) findViewById(R.id.b33);
        b34 = (ImageButton) findViewById(R.id.b34);
        b35 = (ImageButton) findViewById(R.id.b35);
        b36 = (ImageButton) findViewById(R.id.b36);
        b37 = (ImageButton) findViewById(R.id.b37);
        b38 = (ImageButton) findViewById(R.id.b38);
        b39 = (ImageButton) findViewById(R.id.b39);
        b40 = (ImageButton) findViewById(R.id.b40);
        b41 = (ImageButton) findViewById(R.id.b41);
        b42 = (ImageButton) findViewById(R.id.b42);
        b43 = (ImageButton) findViewById(R.id.b43);
        b44 = (ImageButton) findViewById(R.id.b44);
        b45 = (ImageButton) findViewById(R.id.b45);
        b46 = (ImageButton) findViewById(R.id.b46);
        b47 = (ImageButton) findViewById(R.id.b47);
        b48 = (ImageButton) findViewById(R.id.b48);
        b49 = (ImageButton) findViewById(R.id.b49);
        b50 = (ImageButton) findViewById(R.id.b50);
        b51 = (ImageButton) findViewById(R.id.b51);
        b52 = (ImageButton) findViewById(R.id.b52);
        b53 = (ImageButton) findViewById(R.id.b53);
        b54 = (ImageButton) findViewById(R.id.b54);
        b55 = (ImageButton) findViewById(R.id.b55);
        b56 = (ImageButton) findViewById(R.id.b56);
        b57 = (ImageButton) findViewById(R.id.b57);
        b58 = (ImageButton) findViewById(R.id.b58);
        b59 = (ImageButton) findViewById(R.id.b59);
        b60 = (ImageButton) findViewById(R.id.b60);
        b61 = (ImageButton) findViewById(R.id.b61);
        b62 = (ImageButton) findViewById(R.id.b62);
        b63 = (ImageButton) findViewById(R.id.b63);
        b0.setTag("BR");
        b0.setImageResource(R.drawable.br);
        b1.setTag("BN");
        b1.setImageResource(R.drawable.bn);
        b2.setTag("BB");
        b2.setImageResource(R.drawable.bb);
        b3.setTag("BQ");
        b3.setImageResource(R.drawable.bq);
        b4.setTag("BK");
        blackKing = 4;
        b4.setImageResource(R.drawable.bk);
        b5.setTag("BB");
        b5.setImageResource(R.drawable.bb);
        b6.setTag("BN");
        b6.setImageResource(R.drawable.bn);
        b7.setTag("BR");
        b7.setImageResource(R.drawable.br);
        b8.setTag("BP");
        b8.setImageResource(R.drawable.bp);
        b9.setTag("BP");
        b9.setImageResource(R.drawable.bp);
        b10.setTag("BP");
        b10.setImageResource(R.drawable.bp);
        b11.setTag("BP");
        b11.setImageResource(R.drawable.bp);
        b12.setTag("BP");
        b12.setImageResource(R.drawable.bp);
        b13.setTag("BP");
        b13.setImageResource(R.drawable.bp);
        b14.setTag("BP");
        b14.setImageResource(R.drawable.bp);
        b15.setTag("BP");
        b15.setImageResource(R.drawable.bp);
        b16.setTag("");
        b16.setImageResource(0);
        b17.setTag("");
        b17.setImageResource(0);
        b18.setTag("");
        b18.setImageResource(0);
        b19.setTag("");
        b19.setImageResource(0);
        b20.setTag("");
        b20.setImageResource(0);
        b21.setTag("");
        b21.setImageResource(0);
        b22.setTag("");
        b22.setImageResource(0);
        b23.setTag("");
        b23.setImageResource(0);
        b24.setTag("");
        b24.setImageResource(0);
        b25.setTag("");
        b25.setImageResource(0);
        b26.setTag("");
        b26.setImageResource(0);
        b27.setTag("");
        b27.setImageResource(0);
        b28.setTag("");
        b28.setImageResource(0);
        b29.setTag("");
        b29.setImageResource(0);
        b30.setTag("");
        b30.setImageResource(0);
        b31.setTag("");
        b31.setImageResource(0);
        b32.setTag("");
        b32.setImageResource(0);
        b33.setTag("");
        b33.setImageResource(0);
        b34.setTag("");
        b34.setImageResource(0);
        b35.setTag("");
        b35.setImageResource(0);
        b36.setTag("");
        b36.setImageResource(0);
        b37.setTag("");
        b37.setImageResource(0);
        b38.setTag("");
        b38.setImageResource(0);
        b39.setTag("");
        b39.setImageResource(0);
        b40.setTag("");
        b40.setImageResource(0);
        b41.setTag("");
        b41.setImageResource(0);
        b42.setTag("");
        b42.setImageResource(0);
        b43.setTag("");
        b43.setImageResource(0);
        b44.setTag("");
        b44.setImageResource(0);
        b45.setTag("");
        b45.setImageResource(0);
        b46.setTag("");
        b46.setImageResource(0);
        b47.setTag("");
        b47.setImageResource(0);
        b48.setTag("WP");
        b48.setImageResource(R.drawable.wp);
        b49.setTag("WP");
        b49.setImageResource(R.drawable.wp);
        b50.setTag("WP");
        b50.setImageResource(R.drawable.wp);
        b51.setTag("WP");
        b51.setImageResource(R.drawable.wp);
        b52.setTag("WP");
        b52.setImageResource(R.drawable.wp);
        b53.setTag("WP");
        b53.setImageResource(R.drawable.wp);
        b54.setTag("WP");
        b54.setImageResource(R.drawable.wp);
        b55.setTag("WP");
        b55.setImageResource(R.drawable.wp);
        b56.setTag("WR");
        b56.setImageResource(R.drawable.wr);
        b57.setTag("WN");
        b57.setImageResource(R.drawable.wn);
        b58.setTag("WB");
        b58.setImageResource(R.drawable.wb);
        b59.setTag("WQ");
        b59.setImageResource(R.drawable.wq);
        b60.setTag("WK");
        whiteKing = 60;
        b60.setImageResource(R.drawable.wk);
        b61.setTag("WB");
        b61.setImageResource(R.drawable.wb);
        b62.setTag("WN");
        b62.setImageResource(R.drawable.wn);
        b63.setTag("WR");
        b63.setImageResource(R.drawable.wr);
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
        buttons = new ImageButton[]{b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15,
                b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28, b29, b30, b31,
                b32, b33, b34, b35, b36, b37, b38, b39, b40, b41, b42, b43, b44, b45, b46, b47,
                b48, b49, b50, b51, b52, b53, b54, b55, b56, b57, b58, b59, b60, b61, b62, b63};
    }

    public void onClick(View v) {
        switch(v.getId()){
            case R.id.b0:
                if(piece.equals("") && origin == -1) {
                    if(!b0.getTag().equals("")) {
                        piece = b0.getTag().toString();
                        origin = 0;
                    }
                }
                else if(piece.equals(b0.getTag().toString())&& origin == 0){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 0;
                    evaluate();
                }
                break;
            case R.id.b1:
                if(piece.equals("") && origin == -1) {
                    if(!b1.getTag().equals("")) {
                        piece = b1.getTag().toString();
                        origin = 1;
                    }
                }
                else if(piece.equals(b1.getTag().toString())&& origin == 1) {
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 1;
                    evaluate();
                }
                break;
            case R.id.b2:
                if(piece.equals("") && origin == -1) {
                    if(!b2.getTag().equals("")) {
                        piece = b2.getTag().toString();
                        origin = 2;
                    }
                }
                else if(piece.equals(b2.getTag().toString())&& origin == 2){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 2;
                    evaluate();
                }
                break;
            case R.id.b3:
                if(piece.equals("") && origin == -1) {
                    if(!b3.getTag().equals("")) {
                        piece = b3.getTag().toString();
                        origin = 3;
                    }
                }
                else if(piece.equals(b3.getTag().toString())&& origin == 3){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 3;
                    evaluate();
                }
                break;
            case R.id.b4:
                if(piece.equals("") && origin == -1) {
                    if(!b4.getTag().equals("")) {
                        piece = b4.getTag().toString();
                        origin = 4;
                    }
                }
                else if(piece.equals(b4.getTag().toString())&& origin == 4){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 4;
                    evaluate();
                }
                break;
            case R.id.b5:
                if(piece.equals("") && origin == -1) {
                    if(!b5.getTag().equals("")) {
                        piece = b5.getTag().toString();
                        origin = 5;
                    }
                }
                else if(piece.equals(b5.getTag().toString())&& origin == 5){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 5;
                    evaluate();
                }
                break;
            case R.id.b6:
                if(piece.equals("") && origin == -1) {
                    if(!b6.getTag().equals("")) {
                        piece = b6.getTag().toString();
                        origin = 6;
                    }
                }
                else if(piece.equals(b6.getTag().toString())&& origin == 6){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 6;
                    evaluate();
                }
                break;
            case R.id.b7:
                if(piece.equals("") && origin == -1) {
                    if(!b7.getTag().equals("")) {
                        piece = b7.getTag().toString();
                        origin = 7;
                    }
                }
                else if(piece.equals(b7.getTag().toString())&& origin == 7){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 7;
                    evaluate();
                }
                break;
            case R.id.b8:
                if(piece.equals("") && origin == -1) {
                    if(!b8.getTag().equals("")) {
                        piece = b8.getTag().toString();
                        origin = 8;
                    }
                }
                else if(piece.equals(b8.getTag().toString())&& origin == 8){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 8;
                    evaluate();
                }
                break;
            case R.id.b9:
                if(piece.equals("")&&origin == -1) {
                    if(!b9.getTag().equals("")) {
                        piece = b9.getTag().toString();
                        origin = 9;
                    }
                }
                else if(piece.equals(b9.getTag().toString())&& origin == 9){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();

                }
                else{
                    destination = 9;
                    evaluate();
                }
                break;
            case R.id.b10:
                if(piece.equals("") && origin == -1) {
                    if(!b10.getTag().equals("")) {
                        piece = b10.getTag().toString();
                        origin = 10;
                    }
                }
                else if(piece.equals(b10.getTag().toString())&& origin == 10){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 10;
                    evaluate();
                }
                break;
            case R.id.b11:
                if(piece.equals("") && origin == -1) {
                    if(!b11.getTag().equals("")) {
                        piece = b11.getTag().toString();
                        origin = 11;
                    }
                }
                else if(piece.equals(b11.getTag().toString())&& origin == 11){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 11;
                    evaluate();
                }
                break;
            case R.id.b12:
                if(piece.equals("") && origin == -1) {
                    if(!b12.getTag().equals("")) {
                        piece = b12.getTag().toString();
                        origin = 12;
                    }
                }
                else if(piece.equals(b12.getTag().toString())&& origin == 12){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 12;
                    evaluate();
                }
                break;
            case R.id.b13:
                if(piece.equals("") && origin == -1) {
                    if(!b13.getTag().equals("")) {
                        piece = b13.getTag().toString();
                        origin = 13;
                    }
                }
                else if(piece.equals(b13.getTag().toString())&& origin == 13){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 13;
                    evaluate();
                }
                break;
            case R.id.b14:
                if(piece.equals("") && origin == -1) {
                    if(!b14.getTag().equals("")) {
                        piece = b14.getTag().toString();
                        origin = 14;
                    }
                }
                else if(piece.equals(b14.getTag().toString())&& origin == 14){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 14;
                    evaluate();
                }
                break;
            case R.id.b15:
                if(piece.equals("") && origin == -1) {
                    if(!b15.getTag().equals("")) {
                        piece = b15.getTag().toString();
                        origin = 15;
                    }
                }
                else if(piece.equals(b15.getTag().toString())&& origin == 15){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 15;
                    evaluate();
                }
                break;
            case R.id.b16:
                if(piece.equals("") && origin == -1) {
                    if(!b16.getTag().equals("")) {
                        piece = b16.getTag().toString();
                        origin = 16;
                    }
                }
                else if(piece.equals(b16.getTag().toString())&& origin == 16){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 16;
                    evaluate();
                }
                break;
            case R.id.b17:
                if(piece.equals("") && origin == -1) {
                    if(!b17.getTag().equals("")) {
                        piece = b17.getTag().toString();
                        origin = 17;
                    }
                }
                else if(piece.equals(b17.getTag().toString())&& origin == 17){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 17;
                    evaluate();
                }
                break;
            case R.id.b18:
                if(piece.equals("") && origin == -1) {
                    if(!b18.getTag().equals("")) {
                        piece = b18.getTag().toString();
                        origin = 18;
                    }
                }
                else if(piece.equals(b18.getTag().toString())&& origin == 18){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 18;
                    evaluate();
                }
                break;
            case R.id.b19:
                if(piece.equals("") && origin == -1) {
                    if(!b19.getTag().equals("")) {
                        piece = b19.getTag().toString();
                        origin = 19;
                    }
                }
                else if(piece.equals(b19.getTag().toString())&& origin == 19){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 19;
                    evaluate();
                }
                break;
            case R.id.b20:
                if(piece.equals("") && origin == -1) {
                    if(!b20.getTag().equals("")) {
                        piece = b20.getTag().toString();
                        origin = 20;
                    }
                }
                else if(piece.equals(b20.getTag().toString())&& origin == 20){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 20;
                    evaluate();
                }
                break;
            case R.id.b21:
                if(piece.equals("") && origin == -1) {
                    if(!b21.getTag().equals("")) {
                        piece = b21.getTag().toString();
                        origin = 21;
                    }
                }
                else if(piece.equals(b21.getTag().toString())&& origin == 21){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 21;
                    evaluate();
                }
                break;
            case R.id.b22:
                if(piece.equals("") && origin == -1) {
                    if(!b22.getTag().equals("")) {
                        piece = b22.getTag().toString();
                        origin = 22;
                    }
                }
                else if(piece.equals(b22.getTag().toString())&& origin == 22){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 22;
                    evaluate();
                }
                break;
            case R.id.b23:
                if(piece.equals("") && origin == -1) {
                    if(!b23.getTag().equals("")) {
                        piece = b23.getTag().toString();
                        origin = 23;
                    }
                }
                else if(piece.equals(b23.getTag().toString())&& origin == 23){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 23;
                    evaluate();
                }
                break;
            case R.id.b24:
                if(piece.equals("") && origin == -1) {
                    if(!b24.getTag().equals("")) {
                        piece = b24.getTag().toString();
                        origin = 24;
                    }
                }
                else if(piece.equals(b24.getTag().toString())&& origin == 24){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 24;
                    evaluate();
                }
                break;
            case R.id.b25:
                if(piece.equals("") && origin == -1) {
                    if(!b25.getTag().equals("")) {
                        piece = b25.getTag().toString();
                        origin = 25;
                    }
                }
                else if(piece.equals(b25.getTag().toString())&& origin == 25){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 25;
                    evaluate();
                }
                break;
            case R.id.b26:
                if(piece.equals("") && origin == -1) {
                    if(!b26.getTag().equals("")) {
                        piece = b26.getTag().toString();
                        origin = 26;
                    }
                }
                else if(piece.equals(b26.getTag().toString())&& origin == 26){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 26;
                    evaluate();
                }
                break;
            case R.id.b27:
                if(piece.equals("") && origin == -1) {
                    if(!b27.getTag().equals("")) {
                        piece = b27.getTag().toString();
                        origin = 27;
                    }
                }
                else if(piece.equals(b27.getTag().toString())&& origin == 27){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 27;
                    evaluate();
                }
                break;
            case R.id.b28:
                if(piece.equals("") && origin == -1) {
                    if(!b28.getTag().equals("")) {
                        piece = b28.getTag().toString();
                        origin = 28;
                    }
                }
                else if(piece.equals(b28.getTag().toString())&& origin == 28){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 28;
                    evaluate();
                }
                break;
            case R.id.b29:
                if(piece.equals("") && origin == -1) {
                    if(!b29.getTag().equals("")) {
                        piece = b29.getTag().toString();
                        origin = 29;
                    }
                }
                else if(piece.equals(b29.getTag().toString())&& origin == 29){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 29;
                    evaluate();
                }
                break;
            case R.id.b30:
                if(piece.equals("") && origin == -1) {
                    if(!b30.getTag().equals("")) {
                        piece = b30.getTag().toString();
                        origin = 30;
                    }
                }
                else if(piece.equals(b30.getTag().toString())&& origin == 30){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 30;
                    evaluate();
                }
                break;
            case R.id.b31:
                if(piece.equals("") && origin == -1) {
                    if(!b31.getTag().equals("")) {
                        piece = b31.getTag().toString();
                        origin = 31;
                    }
                }
                else if(piece.equals(b31.getTag().toString())&& origin == 31){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 31;
                    evaluate();
                }
                break;
            case R.id.b32:
                if(piece.equals("") && origin == -1) {
                    if(!b32.getTag().equals("")) {
                        piece = b32.getTag().toString();
                        origin = 32;
                    }
                }
                else if(piece.equals(b32.getTag().toString())&& origin == 32){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 32;
                    evaluate();
                }
                break;
            case R.id.b33:
                if(piece.equals("") && origin == -1) {
                    if(!b33.getTag().equals("")) {
                        piece = b33.getTag().toString();
                        origin = 33;
                    }
                }
                else if(piece.equals(b33.getTag().toString())&& origin == 33){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 33;
                    evaluate();
                }
                break;
            case R.id.b34:
                if(piece.equals("") && origin == -1) {
                    if(!b34.getTag().equals("")) {
                        piece = b34.getTag().toString();
                        origin = 34;
                    }
                }
                else if(piece.equals(b34.getTag().toString())&& origin == 34){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 34;
                    evaluate();
                }
                break;
            case R.id.b35:
                if(piece.equals("") && origin == -1) {
                    if(!b35.getTag().equals("")) {
                        piece = b35.getTag().toString();
                        origin = 35;
                    }
                }
                else if(piece.equals(b35.getTag().toString())&& origin == 35){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 35;
                    evaluate();
                }
                break;
            case R.id.b36:
                if(piece.equals("") && origin == -1) {
                    if(!b36.getTag().equals("")) {
                        piece = b36.getTag().toString();
                        origin = 36;
                    }
                }
                else if(piece.equals(b36.getTag().toString())&& origin == 36){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 36;
                    evaluate();
                }
                break;
            case R.id.b37:
                if(piece.equals("") && origin == -1) {
                    if(!b37.getTag().equals("")) {
                        piece = b37.getTag().toString();
                        origin = 37;
                    }
                }
                else if(piece.equals(b37.getTag().toString())&& origin == 37){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 37;
                    evaluate();
                }
                break;
            case R.id.b38:
                if(piece.equals("") && origin == -1) {
                    if(!b38.getTag().equals("")) {
                        piece = b38.getTag().toString();
                        origin = 38;
                    }
                }
                else if(piece.equals(b38.getTag().toString())&& origin == 38){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 38;
                    evaluate();
                }
                break;
            case R.id.b39:
                if(piece.equals("") && origin == -1) {
                    if(!b39.getTag().equals("")) {
                        piece = b39.getTag().toString();
                        origin = 39;
                    }
                }
                else if(piece.equals(b39.getTag().toString())&& origin == 39){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 39;
                    evaluate();
                }
                break;
            case R.id.b40:
                if(piece.equals("") && origin == -1) {
                    if(!b40.getTag().equals("")) {
                        piece = b40.getTag().toString();
                        origin = 40;
                    }
                }
                else if(piece.equals(b40.getTag().toString())&& origin == 40){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 40;
                    evaluate();
                }
                break;
            case R.id.b41:
                if(piece.equals("") && origin == -1) {
                    if(!b41.getTag().equals("")) {
                        piece = b41.getTag().toString();
                        origin = 41;
                    }
                }
                else if(piece.equals(b41.getTag().toString())&& origin == 41){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 41;
                    evaluate();
                }
                break;
            case R.id.b42:
                if(piece.equals("") && origin == -1) {
                    if(!b42.getTag().equals("")) {
                        piece = b42.getTag().toString();
                        origin = 42;
                    }
                }
                else if(piece.equals(b42.getTag().toString())&& origin == 42){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 42;
                    evaluate();
                }
                break;
            case R.id.b43:
                if(piece.equals("") && origin == -1) {
                    if(!b43.getTag().equals("")) {
                        piece = b43.getTag().toString();
                        origin = 43;
                    }
                }
                else if(piece.equals(b43.getTag().toString())&& origin == 43){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 43;
                    evaluate();
                }
                break;
            case R.id.b44:
                if(piece.equals("") && origin == -1) {
                    if(!b44.getTag().equals("")) {
                        piece = b44.getTag().toString();
                        origin = 44;
                    }
                }
                else if(piece.equals(b44.getTag().toString())&& origin == 44){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 44;
                    evaluate();
                }
                break;
            case R.id.b45:
                if(piece.equals("") && origin == -1) {
                    if(!b45.getTag().equals("")) {
                        piece = b45.getTag().toString();
                        origin = 45;
                    }
                }
                else if(piece.equals(b45.getTag().toString())&& origin == 45){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 45;
                    evaluate();
                }
                break;
            case R.id.b46:
                if(piece.equals("") && origin == -1) {
                    if(!b46.getTag().equals("")) {
                        piece = b46.getTag().toString();
                        origin = 46;
                    }
                }
                else if(piece.equals(b46.getTag().toString())&& origin == 46){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 46;
                    evaluate();
                }
                break;
            case R.id.b47:
                if(piece.equals("") && origin == -1) {
                    if(!b47.getTag().equals("")) {
                        piece = b47.getTag().toString();
                        origin = 47;
                    }
                }
                else if(piece.equals(b47.getTag().toString())&& origin == 47){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 47;
                    evaluate();
                }
                break;
            case R.id.b48:
                if(piece.equals("") && origin == -1) {
                    if(!b48.getTag().equals("")) {
                        piece = b48.getTag().toString();
                        origin = 48;
                    }
                }
                else if(piece.equals(b48.getTag().toString())&& origin == 48){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 48;
                    evaluate();
                }
                break;
            case R.id.b49:
                if(piece.equals("") && origin == -1) {
                    if(!b49.getTag().equals("")) {
                        piece = b49.getTag().toString();
                        origin = 49;
                    }
                }
                else if(piece.equals(b49.getTag().toString())&& origin == 49){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 49;
                    evaluate();
                }
                break;
            case R.id.b50:
                if(piece.equals("") && origin == -1) {
                    if(!b50.getTag().equals("")) {
                        piece = b50.getTag().toString();
                        origin = 50;
                    }
                }
                else if(piece.equals(b50.getTag().toString())&& origin == 50){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 50;
                    evaluate();
                }
                break;
            case R.id.b51:
                if(piece.equals("") && origin == -1) {
                    if(!b51.getTag().equals("")) {
                        piece = b51.getTag().toString();
                        origin = 51;
                    }
                }
                else if(piece.equals(b51.getTag().toString())&& origin == 51){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 51;
                    evaluate();
                }
                break;
            case R.id.b52:
                if(piece.equals("") && origin == -1) {
                    if(!b52.getTag().equals("")) {
                        piece = b52.getTag().toString();
                        origin = 52;
                    }
                }
                else if(piece.equals(b52.getTag().toString())&& origin == 52){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 52;
                    evaluate();
                }
                break;
            case R.id.b53:
                if(piece.equals("") && origin == -1) {
                    if(!b53.getTag().equals("")) {
                        piece = b53.getTag().toString();
                        origin = 53;
                    }
                }
                else if(piece.equals(b53.getTag().toString())&& origin == 53){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 53;
                    evaluate();
                }
                break;
            case R.id.b54:
                if(piece.equals("") && origin == -1) {
                    if(!b54.getTag().equals("")) {
                        piece = b54.getTag().toString();
                        origin = 54;
                    }
                }
                else if(piece.equals(b54.getTag().toString())&& origin == 54){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 54;
                    evaluate();
                }
                break;
            case R.id.b55:
                if(piece.equals("") && origin == -1) {
                    if(!b55.getTag().equals("")) {
                        piece = b55.getTag().toString();
                        origin = 55;
                    }
                }
                else if(piece.equals(b55.getTag().toString())&& origin == 55){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 55;
                    evaluate();
                }
                break;
            case R.id.b56:
                if(piece.equals("") && origin == -1) {
                    if(!b56.getTag().equals("")) {
                        piece = b56.getTag().toString();
                        origin = 56;
                    }
                }
                else if(piece.equals(b56.getTag().toString())&& origin == 56){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 56;
                    evaluate();
                }
                break;
            case R.id.b57:
                if(piece.equals("") && origin == -1) {
                    if(!b57.getTag().equals("")) {
                        piece = b57.getTag().toString();
                        origin = 57;
                    }
                }
                else if(piece.equals(b57.getTag().toString())&& origin == 57){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 57;
                    evaluate();
                }
                break;
            case R.id.b58:
                if(piece.equals("") && origin == -1) {
                    if(!b58.getTag().equals("")) {
                        piece = b58.getTag().toString();
                        origin = 58;
                    }
                }
                else if(piece.equals(b58.getTag().toString())&& origin == 58){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 58;
                    evaluate();
                }
                break;
            case R.id.b59:
                if(piece.equals("") && origin == -1) {
                    if(!b59.getTag().equals("")) {
                        piece = b59.getTag().toString();
                        origin = 59;
                    }
                }
                else if(piece.equals(b59.getTag().toString())&& origin == 59){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 59;
                    evaluate();
                }
                break;
            case R.id.b60:
                if(piece.equals("") && origin == -1) {
                    if(!b60.getTag().equals("")) {
                        piece = b60.getTag().toString();
                        origin = 60;
                    }
                }
                else if(piece.equals(b60.getTag().toString())&& origin == 60){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 60;
                    evaluate();
                }
                break;
            case R.id.b61:
                if(piece.equals("") && origin == -1) {
                    if(!b61.getTag().equals("")) {
                        piece = b61.getTag().toString();
                        origin = 61;
                    }
                }
                else if(piece.equals(b61.getTag().toString())&& origin == 61){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 61;
                    evaluate();
                }
                break;
            case R.id.b62:
                if(piece.equals("") && origin == -1) {
                    if(!b62.getTag().equals("")) {
                        piece = b62.getTag().toString();
                        origin = 62;
                    }
                }
                else if(piece.equals(b62.getTag().toString())&& origin == 62){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 62;
                    evaluate();
                }
                break;
            case R.id.b63:
                if(piece.equals("") && origin == -1) {
                    if(!b63.getTag().equals("")) {
                        piece = b63.getTag().toString();
                        origin = 63;
                    }
                }
                else if(piece.equals(b63.getTag().toString())&& origin == 63){
                    piece = "";
                    origin = -1;
                    Toast.makeText(ChessActivity.this, "Move Cancelled!", Toast.LENGTH_LONG).show();
                }
                else{
                    destination = 63;
                    evaluate();
                }
                break;
        }
    }

    private void evaluate() {
        if(turn){
            if(piece.charAt(0) != 'W'){
                piece = "";
                origin = -1;
                destination = -1;
                Toast.makeText(ChessActivity.this, "It's white turn!", Toast.LENGTH_LONG).show();
                return;
            }
        }
        else{
            if(piece.charAt(0) != 'B'){
                piece = "";
                origin = -1;
                destination = -1;
                Toast.makeText(ChessActivity.this, "It's black turn!", Toast.LENGTH_LONG).show();
                return;
            }
        }
        if(!buttons[destination].getTag().equals("") && buttons[destination].getTag().toString().charAt(0) == piece.charAt(0)){
            piece = "";
            origin = -1;
            destination = -1;
            Toast.makeText(ChessActivity.this, "Invalid Move!", Toast.LENGTH_LONG).show();
        }
        else if(piece.charAt(1) == 'R')
            handler.post(rook);
        else if(piece.charAt(1) == 'N')
            handler.post(knight);
        else if(piece.charAt(1) == 'B')
            handler.post(bishop);
        else if(piece.charAt(1) == 'Q')
            handler.post(queen);
        else if(piece.charAt(1) == 'P')
            handler.post(pawn);
        else if(piece.charAt(1) == 'K')
            handler.post(king);
    }

    private int getImage() {
        switch(piece.charAt(1)){
            case'K':
                if(piece.charAt(0) == 'W')
                    return R.drawable.wk;
                if(piece.charAt(0) == 'B')
                    return  R.drawable.bk;
                break;
            case'Q':
                if(piece.charAt(0) == 'W')
                    return R.drawable.wq;
                if(piece.charAt(0) == 'B')
                    return  R.drawable.bq;
                break;
            case'B':
                if(piece.charAt(0) == 'W')
                    return R.drawable.wb;
                if(piece.charAt(0) == 'B')
                    return  R.drawable.bb;
                break;
            case'N':
                if(piece.charAt(0) == 'W')
                    return R.drawable.wn;
                if(piece.charAt(0) == 'B')
                    return  R.drawable.bn;
                break;
            case'R':
                if(piece.charAt(0) == 'W')
                    return R.drawable.wr;
                if(piece.charAt(0) == 'B')
                    return  R.drawable.br;
                break;
            case'P':
                if(piece.charAt(0) == 'W')
                    return R.drawable.wp;
                if(piece.charAt(0) == 'B')
                    return  R.drawable.bp;
                break;
            default:
                return 0;
        }
        return 0;
    }

    public boolean kingCheck(){
        if(destination % 8 == 0 && destination / 8 == 0){
            if(turn) {
                if (buttons[destination + 1].getTag().toString().equals("BK")
                        || buttons[destination + 9].getTag().toString().equals("BK")
                        || buttons[destination + 8].getTag().toString().equals("BK"))
                    return false;
            }
            else{
                if (buttons[destination + 1].getTag().toString().equals("WK")
                        || buttons[destination + 9].getTag().toString().equals("WK")
                        || buttons[destination + 8].getTag().toString().equals("WK"))
                    return false;
            }
        }
        else if(destination % 8 == 0 && destination / 8 == 7){
            if(turn) {
                if (buttons[destination + 1].getTag().toString().equals("BK")
                        || buttons[destination -7 ].getTag().toString().equals("BK")
                        || buttons[destination - 8].getTag().toString().equals("BK"))
                    return false;
            }
            else{
                if (buttons[destination + 1].getTag().toString().equals("WK")
                        || buttons[destination - 7].getTag().toString().equals("WK")
                        || buttons[destination - 8].getTag().toString().equals("WK"))
                    return false;
            }
        }
        else if(destination % 8 == 7 && destination / 8 == 7){
            if(turn) {
                if (buttons[destination - 1].getTag().toString().equals("BK")
                        || buttons[destination - 9].getTag().toString().equals("BK")
                        || buttons[destination - 8].getTag().toString().equals("BK"))
                    return false;
            }
            else{
                if (buttons[destination - 1].getTag().toString().equals("WK")
                        || buttons[destination - 9].getTag().toString().equals("WK")
                        || buttons[destination - 8].getTag().toString().equals("WK"))
                    return false;
            }
        }
        else if(destination % 8 == 7 && destination / 8 == 0){
            if(turn) {
                if (buttons[destination - 1].getTag().toString().equals("BK")
                        || buttons[destination + 7].getTag().toString().equals("BK")
                        || buttons[destination + 8].getTag().toString().equals("BK"))
                    return false;
            }
            else{
                if (buttons[destination - 1].getTag().toString().equals("WK")
                        || buttons[destination + 7].getTag().toString().equals("WK")
                        || buttons[destination + 8].getTag().toString().equals("WK"))
                    return false;
            }
        }
        else if(destination / 8 == 0){
            if(turn) {
                if (buttons[destination - 1].getTag().toString().equals("BK")
                        || buttons[destination + 7].getTag().toString().equals("BK")
                        || buttons[destination + 8].getTag().toString().equals("BK")
                        || buttons[destination + 9].getTag().toString().equals("BK")
                        || buttons[destination + 1].getTag().toString().equals("BK"))
                    return false;
            }
            else{
                if (buttons[destination - 1].getTag().toString().equals("WK")
                        || buttons[destination + 7].getTag().toString().equals("WK")
                        || buttons[destination + 8].getTag().toString().equals("WK")
                        || buttons[destination + 9].getTag().toString().equals("WK")
                        || buttons[destination + 1].getTag().toString().equals("WK"))
                    return false;
            }
        }
        else if(destination / 8 == 7){
            if(turn) {
                if (buttons[destination - 1].getTag().toString().equals("BK")
                        || buttons[destination - 7].getTag().toString().equals("BK")
                        || buttons[destination - 8].getTag().toString().equals("BK")
                        || buttons[destination - 9].getTag().toString().equals("BK")
                        || buttons[destination + 1].getTag().toString().equals("BK"))
                    return false;
            }
            else{
                if (buttons[destination - 1].getTag().toString().equals("WK")
                        || buttons[destination - 7].getTag().toString().equals("WK")
                        || buttons[destination - 8].getTag().toString().equals("WK")
                        || buttons[destination - 9].getTag().toString().equals("WK")
                        || buttons[destination + 1].getTag().toString().equals("WK"))
                    return false;
            }
        }
        else if(destination % 8 == 0){
            if(turn) {
                if (buttons[destination - 8].getTag().toString().equals("BK")
                        || buttons[destination - 7].getTag().toString().equals("BK")
                        || buttons[destination + 8].getTag().toString().equals("BK")
                        || buttons[destination + 9].getTag().toString().equals("BK")
                        || buttons[destination + 1].getTag().toString().equals("BK"))
                    return false;
            }
            else{
                if (buttons[destination - 8].getTag().toString().equals("WK")
                        || buttons[destination - 7].getTag().toString().equals("WK")
                        || buttons[destination + 8].getTag().toString().equals("WK")
                        || buttons[destination + 9].getTag().toString().equals("WK")
                        || buttons[destination + 1].getTag().toString().equals("WK"))
                    return false;
            }
        }
        else if(destination % 8 == 7){
            if(turn) {
                if (buttons[destination - 1].getTag().toString().equals("BK")
                        || buttons[destination + 7].getTag().toString().equals("BK")
                        || buttons[destination + 8].getTag().toString().equals("BK")
                        || buttons[destination - 9].getTag().toString().equals("BK")
                        || buttons[destination - 8].getTag().toString().equals("BK"))
                    return false;
            }
            else{
                if (buttons[destination - 1].getTag().toString().equals("WK")
                        || buttons[destination + 7].getTag().toString().equals("WK")
                        || buttons[destination + 8].getTag().toString().equals("WK")
                        || buttons[destination - 9].getTag().toString().equals("WK")
                        || buttons[destination - 8].getTag().toString().equals("WK"))
                    return false;
            }
        }
        else{
            if(turn) {
                if (buttons[destination - 1].getTag().toString().equals("BK")
                        || buttons[destination + 7].getTag().toString().equals("BK")
                        || buttons[destination + 8].getTag().toString().equals("BK")
                        || buttons[destination - 9].getTag().toString().equals("BK")
                        || buttons[destination - 8].getTag().toString().equals("BK")
                        || buttons[destination + 1].getTag().toString().equals("BK")
                        || buttons[destination - 7].getTag().toString().equals("BK")
                        || buttons[destination + 9].getTag().toString().equals("BK"))
                    return false;
            }
            else{
                if (buttons[destination - 1].getTag().toString().equals("WK")
                        || buttons[destination + 7].getTag().toString().equals("WK")
                        || buttons[destination + 8].getTag().toString().equals("WK")
                        || buttons[destination - 9].getTag().toString().equals("WK")
                        || buttons[destination - 8].getTag().toString().equals("WK")
                        || buttons[destination + 1].getTag().toString().equals("WK")
                        || buttons[destination - 7].getTag().toString().equals("WK")
                        || buttons[destination + 9].getTag().toString().equals("WK"))
                    return false;
            }
        }
        return true;
    }

    private Runnable king = new Runnable() {
        @Override
        public void run() {
            validate = false;
            switch(origin - destination){
                case -9:
                    if(destination % 8 == origin % 8 + 1){
                        if(kingCheck())
                            validate = true;
                    }
                    break;
                case -8:
                    if(destination % 8 == origin % 8){
                        if(kingCheck())
                            validate = true;
                    }
                    break;
                case -7:
                    if(destination % 8 == origin % 8 - 1){
                        if(kingCheck())
                            validate = true;
                    }
                    break;
                case -1:
                    if(destination % 8 == origin % 8 + 1){
                        if(kingCheck())
                            validate = true;
                    }
                    break;
                case 1:
                    if(destination % 8 == origin % 8 - 1){
                        if(kingCheck())
                            validate = true;
                    }
                    break;
                case 7:
                    if(destination % 8 == origin % 8 + 1){
                        if(kingCheck())
                            validate = true;
                    }
                    break;
                case 8:
                    if(destination % 8 == origin % 8){
                        if(kingCheck())
                            validate = true;
                    }
                    break;
                case 9:
                    if(destination % 8 == origin % 8 -1){
                        if(kingCheck())
                            validate = true;
                    }
                    break;
                case 2:
                    if(turn){
                        if(kingWhite && leftWhiteRook){
                            if(buttons[59].getTag().toString().equals("")
                                    && buttons[57].getTag().toString().equals("")) {
                                validate = true;
                                castle = true;
                            }
                        }
                        else
                            validate = false;
                    }
                    else{
                        if(kingBlack && leftBlackRook){
                            if(buttons[3].getTag().toString().equals("")
                                    && buttons[1].getTag().toString().equals("")) {
                                validate = true;
                                castle = true;
                            }
                        }
                        else
                            validate = false;
                    }
                    break;
                case -2:
                    if(turn){
                        if(kingWhite && rightWhiteRook) {
                            if(buttons[61].getTag().toString().equals("")) {
                                validate = true;
                                castle = true;
                            }
                        }
                        else
                            validate = false;
                    }
                    else{
                        if(kingBlack && rightBlackRook) {
                            if(buttons[5].getTag().toString().equals("")) {
                                validate = true;
                                castle = true;
                            }
                        }
                        else
                            validate = false;
                    }
                    break;
                default:
                    validate = false;
            }
            if(validate){
                savedTag = buttons[destination].getTag().toString();
                buttons[origin].setTag("");
                if(turn) {
                    buttons[destination].setTag("WK");
                }
                else{
                    buttons[destination].setTag("BK");
                }
                if(castle) {
                    if (destination == 2)
                        handler.post(new Castle(3));
                    else if (destination == 6)
                        handler.post(new Castle(5));
                    else if (destination == 58)
                        handler.post(new Castle(59));
                    else
                        handler.post(new Castle(61));
                }
                else
                    handler.post(new Check(destination));
            }
            else{
                destination = -1;
                origin = -1;
                piece = "";
                Toast.makeText(ChessActivity.this, "Invalid Move!", Toast.LENGTH_LONG).show();
            }
        }
    };

    private Runnable queen = new Runnable() {
        @Override
        public void run() {
            validate = false;
            int j = origin + 8;
            while(j >= 0 && j < 64){
                if(j == destination){
                    savedTag = buttons[destination].getTag().toString();
                    buttons[destination].setTag(piece);
                    buttons[origin].setTag("");
                    validate = true;
                }
                if(!buttons[j].getTag().toString().equals(""))
                    break;
                j += 8;
            }
            j = origin - 8;
            while(j >= 0 && j < 64){
                if(j == destination){
                    savedTag = buttons[destination].getTag().toString();
                    buttons[destination].setTag(piece);
                    buttons[origin].setTag("");
                    validate = true;
                }
                if(!buttons[j].getTag().toString().equals(""))
                    break;
                j -= 8;
            }
            j = origin + 1;
            while(j >= 0 && j < 64){
                if(j == destination){
                    savedTag = buttons[destination].getTag().toString();
                    buttons[destination].setTag(piece);
                    buttons[origin].setTag("");
                    validate = true;
                }
                if(!buttons[j].getTag().toString().equals("")){
                    break;
                }
                if((j + 1) % 8 == 0)
                    break;
                j += 1;
            }
            j = origin - 1;
            while(j >= 0 && j < 64){
                if(j == destination){
                    savedTag = buttons[destination].getTag().toString();
                    buttons[destination].setTag(piece);
                    buttons[origin].setTag("");
                    validate = true;
                }
                if(!buttons[j].getTag().toString().equals(""))
                    break;
                if((j - 1) % 8 == 7)
                    break;
                j -= 1;
            }
            if(!validate)
                handler.post(bishop);
            else{
                if(turn) {
                    Check check = new Check(whiteKing);
                    handler.post(check);
                }
                else{
                    Check check = new Check(blackKing);
                    handler.post(check);
                }
            }
        }
    };
    
    private Runnable knight = new Runnable() {
        @Override
        public void run() {
            validate = false;            
            switch(origin - destination){
                case 10:
                    if((origin % 8 == (destination % 8 - 1)) || (origin % 8 == (destination % 8 - 2))
                            || (origin % 8 == (destination % 8 + 1)) || (origin % 8 == (destination % 8 + 2))) {
                        savedTag = buttons[destination].getTag().toString();
                        buttons[destination].setTag(piece);
                        buttons[origin].setTag("");
                        validate = true;
                    }
                    break;
                case 15:
                    if((origin % 8 == (destination % 8 - 1)) || (origin % 8 == (destination % 8 - 2))
                            || (origin % 8 == (destination % 8 + 1)) || (origin % 8 == (destination % 8 + 2))) {
                        savedTag = buttons[destination].getTag().toString();
                        buttons[destination].setTag(piece);
                        buttons[origin].setTag("");
                        validate = true;
                    }
                    break;
                case 17:
                    if((origin % 8 == (destination % 8 - 1)) || (origin % 8 == (destination % 8 - 2))
                            || (origin % 8 == (destination % 8 + 1)) || (origin % 8 == (destination % 8 + 2))) {
                        savedTag = buttons[destination].getTag().toString();
                        buttons[destination].setTag(piece);
                        buttons[origin].setTag("");
                        validate = true;
                    }
                    break;
                case 6:
                    if((origin % 8 == (destination % 8 - 1)) || (origin % 8 == (destination % 8 - 2))
                            || (origin % 8 == (destination % 8 + 1)) || (origin % 8 == (destination % 8 + 2))) {
                        savedTag = buttons[destination].getTag().toString();
                        buttons[destination].setTag(piece);
                        buttons[origin].setTag("");
                        validate = true;
                    }
                    break;
                case -10:
                    if((origin % 8 == (destination % 8 - 1)) || (origin % 8 == (destination % 8 - 2))
                            || (origin % 8 == (destination % 8 + 1)) || (origin % 8 == (destination % 8 + 2))) {
                        savedTag = buttons[destination].getTag().toString();
                        buttons[destination].setTag(piece);
                        buttons[origin].setTag("");
                        validate = true;
                    }
                    break;
                case -15:
                    if((origin % 8 == (destination % 8 - 1)) || (origin % 8 == (destination % 8 - 2))
                            || (origin % 8 == (destination % 8 + 1)) || (origin % 8 == (destination % 8 + 2))) {
                        savedTag = buttons[destination].getTag().toString();
                        buttons[destination].setTag(piece);
                        buttons[origin].setTag("");
                        validate = true;
                    }
                    break;
                case -17:
                    if((origin % 8 == (destination % 8 - 1)) || (origin % 8 == (destination % 8 - 2))
                            || (origin % 8 == (destination % 8 + 1)) || (origin % 8 == (destination % 8 + 2))) {
                        savedTag = buttons[destination].getTag().toString();
                        buttons[destination].setTag(piece);
                        buttons[origin].setTag("");
                        validate = true;
                    }
                    break;
                case -6:
                    if((origin % 8 == (destination % 8 - 1)) || (origin % 8 == (destination % 8 - 2))
                            || (origin % 8 == (destination % 8 + 1)) || (origin % 8 == (destination % 8 + 2))) {
                        savedTag = buttons[destination].getTag().toString();
                        buttons[destination].setTag(piece);
                        buttons[origin].setTag("");
                        validate = true;
                    }
                    break;
                default:
                    Toast.makeText(ChessActivity.this, "Invalid Move!", Toast.LENGTH_LONG).show();
            }
            if(validate) {
                if(turn) {
                    Check check = new Check(whiteKing);
                    handler.post(check);
                }
                else{
                    Check check = new Check(blackKing);
                    handler.post(check);
                }
            }
            else{
                destination = -1;
                origin = -1;
                piece = "";
            }
        }
    };

    private Runnable rook = new Runnable() {
        @Override
        public void run() {
            validate = false;
            int j = origin + 8;
            while(j >= 0 && j < 64){
                if(j == destination){
                    savedTag = buttons[destination].getTag().toString();
                    buttons[destination].setTag(piece);
                    buttons[origin].setTag("");
                    validate = true;
                }
                if(!buttons[j].getTag().toString().equals(""))
                    break;
                j += 8;
            }
            j = origin - 8;
            while(j >= 0 && j < 64){
                if(j == destination){
                    savedTag = buttons[destination].getTag().toString();
                    buttons[destination].setTag(piece);
                    buttons[origin].setTag("");
                    validate = true;
                }
                if(!buttons[j].getTag().toString().equals(""))
                    break;
                j -= 8;
            }
            j = origin + 1;
            while(j >= 0 && j < 64){
                if(j == destination){
                    savedTag = buttons[destination].getTag().toString();
                    buttons[destination].setTag(piece);
                    buttons[origin].setTag("");
                    validate = true;
                }
                if(!buttons[j].getTag().toString().equals("")){
                    break;
                }
                if((j + 1) % 8 == 0)
                    break;
                j += 1;
            }
            j = origin - 1;
            while(j >= 0 && j < 64){
                if(j == destination){
                    savedTag = buttons[destination].getTag().toString();
                    buttons[destination].setTag(piece);
                    buttons[origin].setTag("");
                    validate = true;
                }
                if(!buttons[j].getTag().toString().equals(""))
                    break;
                if((j - 1) % 8 == 7)
                    break;
                j -= 1;
            }
            if(!validate) {
                destination = -1;
                origin = -1;
                piece = "";
                Toast.makeText(ChessActivity.this, "Invalid Move!", Toast.LENGTH_LONG).show();
            }
            else {
                if(turn) {
                    Check check = new Check(whiteKing);
                    handler.post(check);
                }
                else{
                    Check check = new Check(blackKing);
                    handler.post(check);
                }
            }
        }
    };

    private Runnable bishop = new Runnable() {
        @Override
        public void run() {
            validate = false;
            int j = origin + 9;
            while(j >= 0 && j < 64){
                if(j == destination){
                    savedTag = buttons[destination].getTag().toString();
                    buttons[destination].setTag(piece);
                    buttons[origin].setTag("");
                    validate = true;
                }
                if(!buttons[j].getTag().toString().equals(""))
                    break;
                if(j  % 8 == 7)
                    break;
                j += 9;
            }
            j = origin + 7;
            while(j >= 0 && j < 64){
                if(j == destination){
                    savedTag = buttons[destination].getTag().toString();
                    buttons[destination].setTag(piece);
                    buttons[origin].setTag("");
                    validate = true;
                }
                if(!buttons[j].getTag().toString().equals(""))
                    break;
                if(j  % 8 == 0)
                    break;
                j += 7;
            }
            j = origin - 9;
            while(j >= 0 && j < 64){
                if(j == destination){
                    savedTag = buttons[destination].getTag().toString();
                    buttons[destination].setTag(piece);
                    buttons[origin].setTag("");
                    validate = true;
                }
                if(!buttons[j].getTag().toString().equals("")){
                    break;
                }
                if(j  % 8 == 0)
                    break;
                j -= 9;
            }
            j = origin - 7;
            while(j >= 0 && j < 64){
                if(j == destination){
                    savedTag = buttons[destination].getTag().toString();
                    buttons[destination].setTag(piece);
                    buttons[origin].setTag("");
                    validate = true;
                }
                if(!buttons[j].getTag().toString().equals(""))
                    break;
                if(j  % 8 == 7)
                    break;
                j -= 7;
            }
            if(!validate) {
                destination = -1;
                origin = -1;
                piece = "";
                Toast.makeText(ChessActivity.this, "Invalid Move!", Toast.LENGTH_LONG).show();
            }
            else {
                if(turn) {
                    Check check = new Check(whiteKing);
                    handler.post(check);
                }
                else{
                    Check check = new Check(blackKing);
                    handler.post(check);
                }
            }
        }
    };

    private Runnable pawn = new Runnable() {
        @Override
        public void run() {
            validate = false;
            switch(piece.charAt(0)){
                case'W':
                    switch(origin - destination){
                        case 7:
                            if(!buttons[destination].getTag().equals("") &&
                                    buttons[destination].getTag().toString().charAt(0) == 'B') {
                                savedTag = buttons[destination].getTag().toString();
                                buttons[destination].setTag(piece);
                                buttons[origin].setTag("");
                                validate = true;
                            }
                            if(destination > 15 && destination < 24){
                                if(blackPawns[destination + 8 - 24]){
                                    enpasse = true;
                                    enpasse_loc = destination + 8;
                                    savedTag = buttons[enpasse_loc].getTag().toString();
                                    buttons[destination + 8].setTag("");
                                    buttons[destination].setTag(piece);
                                    buttons[origin].setTag("");
                                    validate = true;
                                }
                            }
                            break;
                        case 8:
                            if(buttons[destination].getTag().equals("")) {
                                savedTag = buttons[destination].getTag().toString();
                                buttons[destination].setTag(piece);
                                buttons[origin].setTag("");
                                validate = true;
                            }
                            break;
                        case 9:
                            if(!buttons[destination].getTag().equals("")
                                    && buttons[destination].getTag().toString().charAt(0) == 'B') {
                                savedTag = buttons[destination].getTag().toString();
                                buttons[destination].setTag(piece);
                                buttons[origin].setTag("");
                                validate = true;
                            }
                            if(destination > 15 && destination < 24){
                                if(blackPawns[destination + 8 - 24]){
                                    enpasse = true;
                                    enpasse_loc = destination + 8;
                                    savedTag = buttons[enpasse_loc].getTag().toString();
                                    buttons[destination + 8].setTag("");
                                    buttons[destination].setTag(piece);
                                    buttons[origin].setTag("");
                                    validate = true;
                                }
                            }
                            break;
                        case 16:
                            if(origin / 8 == 6 && buttons[destination + 8].getTag().equals("")
                                    && buttons[destination].getTag().equals("")){
                                savedTag = buttons[destination].getTag().toString();
                                buttons[destination].setTag(piece);
                                buttons[origin].setTag("");
                                validate = true;
                                whitePawns[destination - 32] = true;
                            }
                            break;
                    }
                    break;
                case'B':
                    switch(destination - origin){
                        case 7:
                            if(!buttons[destination].getTag().equals("")
                                    && buttons[destination].getTag().toString().charAt(0) == 'W') {
                                savedTag = buttons[destination].getTag().toString();
                                buttons[destination].setTag(piece);
                                buttons[origin].setTag("");
                                validate = true;
                            }
                            if(destination > 39 && destination < 48){
                                if(whitePawns[destination - 8 - 32]){
                                    enpasse = true;
                                    enpasse_loc = destination - 8;
                                    savedTag = buttons[enpasse_loc].getTag().toString();
                                    buttons[destination - 8].setTag("");
                                    buttons[destination].setTag(piece);
                                    buttons[origin].setTag("");
                                    validate = true;
                                }
                            }
                            break;
                        case 8:
                            if(buttons[destination].getTag().equals("")) {
                                savedTag = buttons[destination].getTag().toString();
                                buttons[destination].setTag(piece);
                                buttons[origin].setTag("");
                                validate = true;
                            }
                            break;
                        case 9:
                            if(!buttons[destination].getTag().equals("")
                                    && buttons[destination].getTag().toString().charAt(0) == 'W') {
                                savedTag = buttons[destination].getTag().toString();
                                buttons[destination].setTag(piece);
                                buttons[origin].setTag("");
                                validate = true;
                            }
                            if(destination > 39 && destination < 48){
                                if(whitePawns[destination - 8 - 32]){
                                    enpasse = true;
                                    enpasse_loc = destination - 8;
                                    savedTag = buttons[enpasse_loc].getTag().toString();
                                    buttons[destination - 8].setTag("");
                                    buttons[destination].setTag(piece);
                                    buttons[origin].setTag("");
                                    validate = true;
                                }
                            }
                            break;
                        case 16:
                            if(origin / 8 == 1 && buttons[destination - 8].getTag().equals("")
                                    && buttons[destination].getTag().equals("")){
                                savedTag = buttons[destination].getTag().toString();
                                buttons[destination].setTag(piece);
                                buttons[origin].setTag("");
                                validate = true;
                                blackPawns[destination - 24] = true;
                            }
                            break;
                    }
                    break;
            }
            if(!validate) {
                Toast.makeText(ChessActivity.this, "Invalid Move!", Toast.LENGTH_LONG).show();
                destination = -1;
                origin = -1;
                piece = "";
            }
            else {
                if(turn)
                    handler.post(new Check(whiteKing));
                else
                    handler.post(new Check(blackKing));
            }
        }
    };

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch(requestCode) {
            case white :
                if (resultCode == Activity.RESULT_OK) {
                    piece = data.getStringExtra("White");
                    buttons[pawnPromotion].setTag(piece);
                    buttons[pawnPromotion].setImageResource(getImage());
                    piece = "";
                }
                break;
            case black:
                if (resultCode == Activity.RESULT_OK) {
                    piece = data.getStringExtra("Black");
                    buttons[pawnPromotion].setTag(piece);
                    buttons[pawnPromotion].setImageResource(getImage());
                    piece = "";
                }
                break;
        }
    }

    private class Check implements Runnable{

        private int squareNum;
        
        Check(int squareNum){
            this.squareNum = squareNum;
        }

        public void run() {
            boolean check = false;
            int j;
            if(turn){
                j = squareNum + 8;
                while(j >= 0 && j < 64 && !check){
                    if(buttons[j].getTag().toString().equals("BR") || buttons[j].getTag().toString().equals("BQ"))
                        check = true;
                    if(!buttons[j].getTag().toString().equals(""))
                        break;
                    j += 8;
                }
                j = squareNum - 8;
                while(j >= 0 && j < 64 && !check){
                    if(buttons[j].getTag().toString().equals("BR") || buttons[j].getTag().toString().equals("BQ"))
                        check = true;
                    if(!buttons[j].getTag().toString().equals(""))
                        break;
                    j -= 8;
                }
                j = squareNum + 1;
                while(j >= 0 && j < 64 && !check){
                    if(buttons[j].getTag().toString().equals("BR") || buttons[j].getTag().toString().equals("BQ"))
                        check = true;
                    if(!buttons[j].getTag().toString().equals("")){
                        break;
                    }
                    if((j + 1) % 8 == 0)
                        break;
                    j += 1;
                }
                j = squareNum - 1;
                while(j >= 0 && j < 64 && !check){
                    if(buttons[j].getTag().toString().equals("BR") || buttons[j].getTag().toString().equals("BQ"))
                        check = true;
                    if(!buttons[j].getTag().toString().equals(""))
                        break;
                    if((j - 1) % 8 == 7)
                        break;
                    j -= 1;
                }
                j = squareNum + 9;
                while(j >= 0 && j < 64 && !check){
                    if(buttons[j].getTag().toString().equals("BB") || buttons[j].getTag().toString().equals("BQ"))
                        check = true;
                    if(!buttons[j].getTag().toString().equals(""))
                        break;
                    if(j  % 8 == 7)
                        break;
                    j += 9;
                }
                j = squareNum + 7;
                while(j >= 0 && j < 64 && !check){
                    if(buttons[j].getTag().toString().equals("BB") || buttons[j].getTag().toString().equals("BQ"))
                        check = true;
                    if(!buttons[j].getTag().toString().equals(""))
                        break;
                    if(j  % 8 == 0)
                        break;
                    j += 7;
                }
                j = squareNum - 9;
                while(j >= 0 && j < 64 && !check){
                    if(buttons[j].getTag().toString().equals("BB") || buttons[j].getTag().toString().equals("BQ"))
                        check = true;
                    if(!buttons[j].getTag().toString().equals("")){
                        break;
                    }
                    if(j  % 8 == 0)
                        break;
                    j -= 9;
                }
                j = squareNum - 7;
                while(j >= 0 && j < 64 && !check){
                    if(buttons[j].getTag().toString().equals("BB") || buttons[j].getTag().toString().equals("BQ"))
                        check = true;
                    if(!buttons[j].getTag().toString().equals(""))
                        break;
                    if(j  % 8 == 7)
                        break;
                    j -= 7;
                }
                if (!check){
                    if((squareNum + 6) < 64 && ((squareNum + 6) % 8 == (squareNum % 8 - 2))){
                        if(buttons[squareNum + 6].getTag().toString().equals("BN"))
                            check = true;
                    }
                    if((squareNum - 10) > 0 && ((squareNum - 10) % 8 == (squareNum % 8 - 2))){
                        if(buttons[squareNum - 10].getTag().toString().equals("BN"))
                            check = true;
                    }
                    if((squareNum - 17) > 0 && ((squareNum - 17) % 8 == (squareNum % 8 - 1))){
                        if(buttons[squareNum - 17].getTag().toString().equals("BN"))
                            check = true;
                    }
                    if((squareNum + 15) < 64 && ((squareNum + 15) % 8 == (squareNum % 8 - 1))){
                        if(buttons[squareNum + 15].getTag().toString().equals("BN"))
                            check = true;
                    }
                    if((squareNum - 15) > 0 && ((squareNum - 15) % 8 == (squareNum % 8 + 1))){
                        if(buttons[squareNum - 15].getTag().toString().equals("BN"))
                            check = true;
                    }
                    if((squareNum + 17) < 64 && ((squareNum + 17) % 8 == (squareNum % 8 + 1))){
                        if(buttons[squareNum + 17].getTag().toString().equals("BN"))
                            check = true;
                    }
                    if((squareNum - 6) > 0 && ((squareNum - 6) % 8 == (squareNum % 8 + 2))){
                        if(buttons[squareNum - 6].getTag().toString().equals("BN"))
                            check = true;
                    }
                    if((squareNum + 10) < 64 && ((squareNum + 10) % 8 == (squareNum % 8 + 2))){
                        if(buttons[squareNum + 10].getTag().toString().equals("BN"))
                            check = true;
                    }
                }
                if(!check && squareNum > 15){
                    if(squareNum % 8 == (squareNum - 7) % 8 - 1 && (buttons[squareNum - 7].getTag().toString().equals("BP")))
                        check = true;
                    else if(squareNum % 8 == (squareNum - 9) % 8 + 1 && (buttons[squareNum - 9].getTag().toString().equals("BP")))
                        check = true;
                }
            }
            else{
                j = squareNum + 8;
                while(j >= 0 && j < 64 && !check){
                    if(buttons[j].getTag().toString().equals("WR") || buttons[j].getTag().toString().equals("WQ"))
                        check = true;
                    if(!buttons[j].getTag().toString().equals(""))
                        break;
                    j += 8;
                }
                j = squareNum - 8;
                while(j >= 0 && j < 64 && !check){
                    if(buttons[j].getTag().toString().equals("WR") || buttons[j].getTag().toString().equals("WQ"))
                        check = true;
                    if(!buttons[j].getTag().toString().equals(""))
                        break;
                    j -= 8;
                }
                j = squareNum + 1;
                while(j >= 0 && j < 64 && !check){
                    if(buttons[j].getTag().toString().equals("WR") || buttons[j].getTag().toString().equals("WQ"))
                        check = true;
                    if(!buttons[j].getTag().toString().equals("")){
                        break;
                    }
                    if((j + 1) % 8 == 0)
                        break;
                    j += 1;
                }
                j = squareNum - 1;
                while(j >= 0 && j < 64 && !check){
                    if(buttons[j].getTag().toString().equals("WR") || buttons[j].getTag().toString().equals("WQ"))
                        check = true;
                    if(!buttons[j].getTag().toString().equals(""))
                        break;
                    if((j - 1) % 8 == 7)
                        break;
                    j -= 1;
                }
                j = squareNum + 9;
                while(j >= 0 && j < 64 && !check){
                    if(buttons[j].getTag().toString().equals("WB") || buttons[j].getTag().toString().equals("WQ"))
                        check = true;
                    if(!buttons[j].getTag().toString().equals(""))
                        break;
                    if(j  % 8 == 7)
                        break;
                    j += 9;
                }
                j = squareNum + 7;
                while(j >= 0 && j < 64 && !check){
                    if(buttons[j].getTag().toString().equals("WB") || buttons[j].getTag().toString().equals("WQ"))
                        check = true;
                    if(!buttons[j].getTag().toString().equals(""))
                        break;
                    if(j  % 8 == 0)
                        break;
                    j += 7;
                }
                j = squareNum - 9;
                while(j >= 0 && j < 64 &&!check){
                    if(buttons[j].getTag().toString().equals("WB") || buttons[j].getTag().toString().equals("WQ"))
                        check = true;
                    if(!buttons[j].getTag().toString().equals("")){
                        break;
                    }
                    if(j  % 8 == 0)
                        break;
                    j -= 9;
                }
                j = squareNum - 7;
                while(j >= 0 && j < 64 && !check){
                    if(buttons[j].getTag().toString().equals("WB") || buttons[j].getTag().toString().equals("WQ"))
                        check = true;
                    if(!buttons[j].getTag().toString().equals(""))
                        break;
                    if(j  % 8 == 7)
                        break;
                    j -= 7;
                }
                if(!check){
                    if((squareNum + 6) < 64 && ((squareNum + 6) % 8 == (squareNum % 8 - 2))){
                        if(buttons[squareNum + 6].getTag().toString().equals("WN"))
                            check = true;
                    }
                    if((squareNum - 10) > 0 && ((squareNum - 10) % 8 == (squareNum % 8 - 2))){
                        if(buttons[squareNum - 10].getTag().toString().equals("WN"))
                            check = true;
                    }
                    if((squareNum - 17) > 0 && ((squareNum - 17) % 8 == (squareNum % 8 - 1))){
                        if(buttons[squareNum - 17].getTag().toString().equals("WN"))
                            check = true;
                    }
                    if((squareNum + 15) < 64 && ((squareNum + 15) % 8 == (squareNum % 8 - 1))){
                        if(buttons[squareNum + 15].getTag().toString().equals("WN"))
                            check = true;
                    }
                    if((squareNum - 15) > 0 && ((squareNum - 15) % 8 == (squareNum % 8 + 1))){
                        if(buttons[squareNum - 15].getTag().toString().equals("WN"))
                            check = true;
                    }
                    if((squareNum + 17) < 64 && ((squareNum + 17) % 8 == (squareNum % 8 + 1))){
                        if(buttons[squareNum + 17].getTag().toString().equals("WN"))
                            check = true;
                    }
                    if((squareNum - 6) > 0 && ((squareNum - 6) % 8 == (squareNum % 8 + 2))){
                        if(buttons[squareNum - 6].getTag().toString().equals("WN"))
                            check = true;
                    }
                    if((squareNum + 10) < 64 && ((squareNum + 10) % 8 == (squareNum % 8 + 2))){
                        if(buttons[squareNum + 10].getTag().toString().equals("WN"))
                            check = true;
                    }
                }
                if(!check && squareNum < 48){
                    if(squareNum % 8 == (squareNum + 7) % 8 + 1 && (buttons[squareNum + 7].getTag().toString().equals("WP")))
                        check = true;
                    else if (squareNum % 8 == (squareNum + 9) % 8 - 1 && (buttons[squareNum + 9].getTag().toString().equals("WP")))
                        check = true;
                }
            }
            if(check){
                if(castle) {
                    castle = false;
                    buttons[destination].setTag(savedTag);
                    buttons[origin].setTag(piece);
                }
                if(enpasse){
                    enpasse = false;
                    buttons[enpasse_loc].setTag(savedTag);
                    buttons[origin].setTag(piece);
                    buttons[destination].setTag("");
                }
                else {
                    buttons[destination].setTag(savedTag);
                    buttons[origin].setTag(piece);
                }
                if(turn)
                    Toast.makeText(ChessActivity.this, "White King is Under Check!", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ChessActivity.this, "Black King is Under Check!", Toast.LENGTH_LONG).show();
            }
            else {
                if (enpasse) {
                    enpasse = false;
                    buttons[destination].setImageResource(getImage());
                    buttons[origin].setImageResource(0);
                    buttons[enpasse_loc].setImageResource(0);
                }
                else if(castle){
                    castle = false;
                    if(destination == 2){
                        buttons[0].setTag("");
                        buttons[0].setImageResource(0);
                        buttons[2].setImageResource(getImage());
                        buttons[3].setTag("BR");
                        buttons[3].setImageResource(R.drawable.br);
                        buttons[4].setImageResource(0);
                    }
                    else if(destination == 6){
                        buttons[7].setTag("");
                        buttons[7].setImageResource(0);
                        buttons[6].setImageResource(getImage());
                        buttons[5].setTag("BR");
                        buttons[5].setImageResource(R.drawable.br);
                        buttons[4].setImageResource(0);
                    }
                    else if(destination == 58){
                        buttons[56].setTag("");
                        buttons[56].setImageResource(0);
                        buttons[58].setImageResource(getImage());
                        buttons[59].setTag("WR");
                        buttons[59].setImageResource(R.drawable.wr);
                        buttons[60].setImageResource(0);
                    }
                    else{
                        buttons[63].setTag("");
                        buttons[63].setImageResource(0);
                        buttons[62].setImageResource(getImage());
                        buttons[61].setTag("WR");
                        buttons[61].setImageResource(R.drawable.wr);
                        buttons[60].setImageResource(0);
                    }
                }
                else {
                    buttons[destination].setImageResource(getImage());
                    buttons[origin].setImageResource(0);
                }
                if (turn) {
                    for (int i = 0; i < 8; i++)
                        blackPawns[i] = false;
                    if (piece.equals("WK"))
                        whiteKing = destination;
                    if (destination < 8 && buttons[destination].getTag().toString().charAt(1) == 'P') {
                        pawnPromotion = destination;
                        Intent WhitePawn = new Intent(ChessActivity.this, PawnDialog.class);
                        startActivityForResult(WhitePawn, white);
                    }
                    if (origin == 56)
                        leftWhiteRook = false;
                    else if (origin == 60)
                        kingWhite = false;
                    else if (origin == 63)
                        rightWhiteRook = false;
                    }
                else {
                    for (int i = 0; i < 8; i++)
                        whitePawns[i] = false;
                    if (piece.equals("BK"))
                        blackKing = destination;
                    if (destination > 55 && buttons[destination].getTag().toString().charAt(1) == 'P') {
                        pawnPromotion = destination;
                        Intent BlackPawn = new Intent(ChessActivity.this, BpawnDialog.class);
                        startActivityForResult(BlackPawn, black);
                    }
                    if (origin == 0)
                        leftBlackRook = false;
                    else if (origin == 4)
                        kingBlack = false;
                    else if (origin == 7)
                        rightBlackRook = false;
                    }
                turn = !turn;
            }
            destination = -1;
            origin = -1;
            piece = "";
        }
    }

    private class Castle implements Runnable{

        private int squareNum;

        Castle(int squareNum){
            this.squareNum = squareNum;
        }

        public void run() {
            boolean check = false;
            if(turn){
                int j = squareNum + 8;
                while(j >= 0 && j < 64 && !check){
                    if(buttons[j].getTag().toString().equals("BR") || buttons[j].getTag().toString().equals("BQ"))
                        check = true;
                    if(!buttons[j].getTag().toString().equals(""))
                        break;
                    j += 8;
                }
                j = squareNum - 8;
                while(j >= 0 && j < 64 && !check){
                    if(buttons[j].getTag().toString().equals("BR") || buttons[j].getTag().toString().equals("BQ"))
                        check = true;
                    if(!buttons[j].getTag().toString().equals(""))
                        break;
                    j -= 8;
                }
                j = squareNum + 1;
                while(j >= 0 && j < 64 && !check){
                    if(buttons[j].getTag().toString().equals("BR") || buttons[j].getTag().toString().equals("BQ"))
                        check = true;
                    if(!buttons[j].getTag().toString().equals("")){
                        break;
                    }
                    if((j + 1) % 8 == 0)
                        break;
                    j += 1;
                }
                j = squareNum - 1;
                while(j >= 0 && j < 64 && !check){
                    if(buttons[j].getTag().toString().equals("BR") || buttons[j].getTag().toString().equals("BQ"))
                        check = true;
                    if(!buttons[j].getTag().toString().equals(""))
                        break;
                    if((j - 1) % 8 == 7)
                        break;
                    j -= 1;
                }
                j = squareNum + 9;
                while(j >= 0 && j < 64 && !check){
                    if(buttons[j].getTag().toString().equals("BB") || buttons[j].getTag().toString().equals("BQ"))
                        check = true;
                    if(!buttons[j].getTag().toString().equals(""))
                        break;
                    if(j  % 8 == 7)
                        break;
                    j += 9;
                }
                j = squareNum + 7;
                while(j >= 0 && j < 64 && !check){
                    if(buttons[j].getTag().toString().equals("BB") || buttons[j].getTag().toString().equals("BQ"))
                        check = true;
                    if(!buttons[j].getTag().toString().equals(""))
                        break;
                    if(j  % 8 == 0)
                        break;
                    j += 7;
                }
                j = squareNum - 9;
                while(j >= 0 && j < 64 && !check){
                    if(buttons[j].getTag().toString().equals("BB") || buttons[j].getTag().toString().equals("BQ"))
                        check = true;
                    if(!buttons[j].getTag().toString().equals("")){
                        break;
                    }
                    if(j  % 8 == 0)
                        break;
                    j -= 9;
                }
                j = squareNum - 7;
                while(j >= 0 && j < 64 && !check){
                    if(buttons[j].getTag().toString().equals("BB") || buttons[j].getTag().toString().equals("BQ"))
                        check = true;
                    if(!buttons[j].getTag().toString().equals(""))
                        break;
                    if(j  % 8 == 7)
                        break;
                    j -= 7;
                }
                if (!check){
                    if((squareNum + 6) < 64 && ((squareNum + 6) % 8 == (squareNum % 8 - 2))){
                        if(buttons[squareNum + 6].getTag().toString().equals("BN"))
                            check = true;
                    }
                    if((squareNum - 10) > 0 && ((squareNum - 10) % 8 == (squareNum % 8 - 2))){
                        if(buttons[squareNum - 10].getTag().toString().equals("BN"))
                            check = true;
                    }
                    if((squareNum - 17) > 0 && ((squareNum - 17) % 8 == (squareNum % 8 - 1))){
                        if(buttons[squareNum - 17].getTag().toString().equals("BN"))
                            check = true;
                    }
                    if((squareNum + 15) < 64 && ((squareNum + 15) % 8 == (squareNum % 8 - 1))){
                        if(buttons[squareNum + 15].getTag().toString().equals("BN"))
                            check = true;
                    }
                    if((squareNum - 15) > 0 && ((squareNum - 15) % 8 == (squareNum % 8 + 1))){
                        if(buttons[squareNum - 15].getTag().toString().equals("BN"))
                            check = true;
                    }
                    if((squareNum + 17) < 64 && ((squareNum + 17) % 8 == (squareNum % 8 + 1))){
                        if(buttons[squareNum + 17].getTag().toString().equals("BN"))
                            check = true;
                    }
                    if((squareNum - 6) > 0 && ((squareNum - 6) % 8 == (squareNum % 8 + 2))){
                        if(buttons[squareNum - 6].getTag().toString().equals("BN"))
                            check = true;
                    }
                    if((squareNum + 10) < 64 && ((squareNum + 10) % 8 == (squareNum % 8 + 2))){
                        if(buttons[squareNum + 10].getTag().toString().equals("BN"))
                            check = true;
                    }
                }
                if(!check && squareNum > 15){
                    if(squareNum % 8 == (squareNum - 7) % 8 - 1 && (buttons[squareNum - 7].getTag().toString().equals("BP")))
                        check = true;
                    else if(squareNum % 8 == (squareNum - 9) % 8 + 1 && (buttons[squareNum - 9].getTag().toString().equals("BP")))
                        check = true;
                }
            }
            else{
                int j = squareNum + 8;
                while(j >= 0 && j < 64 && !check){
                    if(buttons[j].getTag().toString().equals("WR") || buttons[j].getTag().toString().equals("WQ"))
                        check = true;
                    if(!buttons[j].getTag().toString().equals(""))
                        break;
                    j += 8;
                }
                j = squareNum - 8;
                while(j >= 0 && j < 64 && !check){
                    if(buttons[j].getTag().toString().equals("WR") || buttons[j].getTag().toString().equals("WQ"))
                        check = true;
                    if(!buttons[j].getTag().toString().equals(""))
                        break;
                    j -= 8;
                }
                j = squareNum + 1;
                while(j >= 0 && j < 64 && !check){
                    if(buttons[j].getTag().toString().equals("WR") || buttons[j].getTag().toString().equals("WQ"))
                        check = true;
                    if(!buttons[j].getTag().toString().equals("")){
                        break;
                    }
                    if((j + 1) % 8 == 0)
                        break;
                    j += 1;
                }
                j = squareNum - 1;
                while(j >= 0 && j < 64 && !check){
                    if(buttons[j].getTag().toString().equals("WR") || buttons[j].getTag().toString().equals("WQ"))
                        check = true;
                    if(!buttons[j].getTag().toString().equals(""))
                        break;
                    if((j - 1) % 8 == 7)
                        break;
                    j -= 1;
                }
                j = squareNum + 9;
                while(j >= 0 && j < 64 && !check){
                    if(buttons[j].getTag().toString().equals("WB") || buttons[j].getTag().toString().equals("WQ"))
                        check = true;
                    if(!buttons[j].getTag().toString().equals(""))
                        break;
                    if(j  % 8 == 7)
                        break;
                    j += 9;
                }
                j = squareNum + 7;
                while(j >= 0 && j < 64 && !check){
                    if(buttons[j].getTag().toString().equals("WB") || buttons[j].getTag().toString().equals("WQ"))
                        check = true;
                    if(!buttons[j].getTag().toString().equals(""))
                        break;
                    if(j  % 8 == 0)
                        break;
                    j += 7;
                }
                j = squareNum - 9;
                while(j >= 0 && j < 64 &&!check){
                    if(buttons[j].getTag().toString().equals("WB") || buttons[j].getTag().toString().equals("WQ"))
                        check = true;
                    if(!buttons[j].getTag().toString().equals("")){
                        break;
                    }
                    if(j  % 8 == 0)
                        break;
                    j -= 9;
                }
                j = squareNum - 7;
                while(j >= 0 && j < 64 && !check){
                    if(buttons[j].getTag().toString().equals("WB") || buttons[j].getTag().toString().equals("WQ"))
                        check = true;
                    if(!buttons[j].getTag().toString().equals(""))
                        break;
                    if(j  % 8 == 7)
                        break;
                    j -= 7;
                }
                if(!check){
                    if((squareNum + 6) < 64 && ((squareNum + 6) % 8 == (squareNum % 8 - 2))){
                        if(buttons[squareNum + 6].getTag().toString().equals("WN"))
                            check = true;
                    }
                    if((squareNum - 10) > 0 && ((squareNum - 10) % 8 == (squareNum % 8 - 2))){
                        if(buttons[squareNum - 10].getTag().toString().equals("WN"))
                            check = true;
                    }
                    if((squareNum - 17) > 0 && ((squareNum - 17) % 8 == (squareNum % 8 - 1))){
                        if(buttons[squareNum - 17].getTag().toString().equals("WN"))
                            check = true;
                    }
                    if((squareNum + 15) < 64 && ((squareNum + 15) % 8 == (squareNum % 8 - 1))){
                        if(buttons[squareNum + 15].getTag().toString().equals("WN"))
                            check = true;
                    }
                    if((squareNum - 15) > 0 && ((squareNum - 15) % 8 == (squareNum % 8 + 1))){
                        if(buttons[squareNum - 15].getTag().toString().equals("WN"))
                            check = true;
                    }
                    if((squareNum + 17) < 64 && ((squareNum + 17) % 8 == (squareNum % 8 + 1))){
                        if(buttons[squareNum + 17].getTag().toString().equals("WN"))
                            check = true;
                    }
                    if((squareNum - 6) > 0 && ((squareNum - 6) % 8 == (squareNum % 8 + 2))){
                        if(buttons[squareNum - 6].getTag().toString().equals("WN"))
                            check = true;
                    }
                    if((squareNum + 10) < 64 && ((squareNum + 10) % 8 == (squareNum % 8 + 2))){
                        if(buttons[squareNum + 10].getTag().toString().equals("WN"))
                            check = true;
                    }
                }
                if(!check && squareNum < 48){
                    if(squareNum % 8 == (squareNum + 7) % 8 + 1 && (buttons[squareNum + 7].getTag().toString().equals("WP")))
                        check = true;
                    else if (squareNum % 8 == (squareNum + 9) % 8 - 1 && (buttons[squareNum + 9].getTag().toString().equals("WP")))
                        check = true;
                }
            }
            if(check){
//                if(enpasse){
//                    enpasse = false;
//                    buttons[enpasse_loc].setTag(savedTag);
//                    buttons[origin].setTag(piece);
//                    buttons[destination].setTag("");
//                }
//                else {
//                    buttons[destination].setTag(savedTag);
//                    buttons[origin].setTag(piece);
//                }
                if(turn)
                    Toast.makeText(ChessActivity.this, "White King is Under Check!", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ChessActivity.this, "Black King is Under Check!", Toast.LENGTH_LONG).show();
                castle = false;
                destination = -1;
                origin = -1;
                piece = "";
            }
            else {
                handler.post(new Check(destination));
            }
        }
    }
}