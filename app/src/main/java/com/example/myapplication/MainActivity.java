package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.content.Intent;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends Activity
{

    private RadioButton radioButton;
    private ImageButton imageButton;
    private Boolean f_jumptolayout03 = false;
    private Integer layout_choice = 0;
    private RadioButton mRadioButton1,
            mRadioButton2,
            mRadioButton3,
            mRadioButton4,
            mRadioButton5,
            mRadioButton6,
            mRadioButton7,
            mRadioButton31,
            mRadioButton32,
            mRadioButton33,
            mRadioButton34,
            mRadioButton35,
            mRadioButton36,
            mRadioButton37,
            mRadioButton38,
            mRadioButton39,
            mRadioButton40,
            mRadioButton41,
            mRadioButton42,
            mRadioButton43,
            mRadioButton44,
            mRadioButton45,
            mRadioButton46,
            mRadioButton47;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView textview = findViewById(R.id.textView34);

        textview.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                jumpTomood();
            }
        });
    }

    private void jumpTomood(){
        //super.onCreate(savedInstanceState);
        setContentView(R.layout.mood1);

        Button button01 = findViewById(R.id.mood1_next_button);

        button01.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                jumpToLayout02();
            }
        });

        mRadioButton1 = (RadioButton) findViewById(R.id.one_buttom01);
        mRadioButton2 = (RadioButton) findViewById(R.id.one_buttom02);
        mRadioButton3 = (RadioButton) findViewById(R.id.one_buttom03);
        mRadioButton4 = (RadioButton) findViewById(R.id.one_buttom04);
        mRadioButton5 = (RadioButton) findViewById(R.id.one_buttom05);
        mRadioButton6 = (RadioButton) findViewById(R.id.one_buttom06);
        mRadioButton7 = (RadioButton) findViewById(R.id.one_buttom07);

        mRadioButton1.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                mRadioButton1.setChecked(true);
                mRadioButton2.setChecked(false);
                mRadioButton3.setChecked(false);
                mRadioButton4.setChecked(false);
                mRadioButton5.setChecked(false);
                mRadioButton6.setChecked(false);
                mRadioButton7.setChecked(false);
                layout_choice = 1;
            }
        });

        mRadioButton2.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                mRadioButton1.setChecked(false);
                mRadioButton2.setChecked(true);
                mRadioButton3.setChecked(false);
                mRadioButton4.setChecked(false);
                mRadioButton5.setChecked(false);
                mRadioButton6.setChecked(false);
                mRadioButton7.setChecked(false);
                layout_choice = 2;
            }
        });

        mRadioButton3.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                mRadioButton1.setChecked(false);
                mRadioButton2.setChecked(false);
                mRadioButton3.setChecked(true);
                mRadioButton4.setChecked(false);
                mRadioButton5.setChecked(false);
                mRadioButton6.setChecked(false);
                mRadioButton7.setChecked(false);
                layout_choice = 3;
            }
        });

        mRadioButton4.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                mRadioButton1.setChecked(false);
                mRadioButton2.setChecked(false);
                mRadioButton3.setChecked(false);
                mRadioButton4.setChecked(true);
                mRadioButton5.setChecked(false);
                mRadioButton6.setChecked(false);
                mRadioButton7.setChecked(false);
                layout_choice = 4;
            }
        });

        mRadioButton5.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                mRadioButton1.setChecked(false);
                mRadioButton2.setChecked(false);
                mRadioButton3.setChecked(false);
                mRadioButton4.setChecked(false);
                mRadioButton5.setChecked(true);
                mRadioButton6.setChecked(false);
                mRadioButton7.setChecked(false);
                layout_choice = 5;
            }
        });

        mRadioButton6.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                mRadioButton1.setChecked(false);
                mRadioButton2.setChecked(false);
                mRadioButton3.setChecked(false);
                mRadioButton4.setChecked(false);
                mRadioButton5.setChecked(false);
                mRadioButton6.setChecked(true);
                mRadioButton7.setChecked(false);
                layout_choice = 6;
            }
        });

        mRadioButton7.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                mRadioButton1.setChecked(false);
                mRadioButton2.setChecked(false);
                mRadioButton3.setChecked(false);
                mRadioButton4.setChecked(false);
                mRadioButton5.setChecked(false);
                mRadioButton6.setChecked(false);
                mRadioButton7.setChecked(true);
                layout_choice = 7;
            }
        });
    }

    private void jumpToLayout01() {
        setContentView(R.layout.mood1);
        Button button01 = findViewById(R.id.mood1_next_button);
        TextView title = findViewById(R.id.textView10);
        title.setText("三、心情溫度計" + "");

        mRadioButton1 = (RadioButton) findViewById(R.id.one_buttom01);
        mRadioButton2 = (RadioButton) findViewById(R.id.one_buttom02);
        mRadioButton3 = (RadioButton) findViewById(R.id.one_buttom03);
        mRadioButton4 = (RadioButton) findViewById(R.id.one_buttom04);
        mRadioButton5 = (RadioButton) findViewById(R.id.one_buttom05);
        mRadioButton6 = (RadioButton) findViewById(R.id.one_buttom06);
        mRadioButton7 = (RadioButton) findViewById(R.id.one_buttom07);

        mRadioButton1.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                mRadioButton1.setChecked(true);
                mRadioButton2.setChecked(false);
                mRadioButton3.setChecked(false);
                mRadioButton4.setChecked(false);
                mRadioButton5.setChecked(false);
                mRadioButton6.setChecked(false);
                mRadioButton7.setChecked(false);
                layout_choice = 1;
            }
        });

        mRadioButton2.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                mRadioButton1.setChecked(false);
                mRadioButton2.setChecked(true);
                mRadioButton3.setChecked(false);
                mRadioButton4.setChecked(false);
                mRadioButton5.setChecked(false);
                mRadioButton6.setChecked(false);
                mRadioButton7.setChecked(false);
                layout_choice = 2;
            }
        });

        mRadioButton3.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                mRadioButton1.setChecked(false);
                mRadioButton2.setChecked(false);
                mRadioButton3.setChecked(true);
                mRadioButton4.setChecked(false);
                mRadioButton5.setChecked(false);
                mRadioButton6.setChecked(false);
                mRadioButton7.setChecked(false);
                layout_choice = 3;
            }
        });

        mRadioButton4.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                mRadioButton1.setChecked(false);
                mRadioButton2.setChecked(false);
                mRadioButton3.setChecked(false);
                mRadioButton4.setChecked(true);
                mRadioButton5.setChecked(false);
                mRadioButton6.setChecked(false);
                mRadioButton7.setChecked(false);
                layout_choice = 4;
            }
        });

        mRadioButton5.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                mRadioButton1.setChecked(false);
                mRadioButton2.setChecked(false);
                mRadioButton3.setChecked(false);
                mRadioButton4.setChecked(false);
                mRadioButton5.setChecked(true);
                mRadioButton6.setChecked(false);
                mRadioButton7.setChecked(false);
                layout_choice = 5;
            }
        });

        mRadioButton6.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                mRadioButton1.setChecked(false);
                mRadioButton2.setChecked(false);
                mRadioButton3.setChecked(false);
                mRadioButton4.setChecked(false);
                mRadioButton5.setChecked(false);
                mRadioButton6.setChecked(true);
                mRadioButton7.setChecked(false);
                layout_choice = 6;
            }
        });

        mRadioButton7.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                mRadioButton1.setChecked(false);
                mRadioButton2.setChecked(false);
                mRadioButton3.setChecked(false);
                mRadioButton4.setChecked(false);
                mRadioButton5.setChecked(false);
                mRadioButton6.setChecked(false);
                mRadioButton7.setChecked(true);
                layout_choice = 7;
            }
        });

        button01.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                if(layout_choice==5 | layout_choice==6 |
                        layout_choice==7)
                    jumpToLayout03_1();
                else if(layout_choice==1 | layout_choice==2 |
                        layout_choice==3 | layout_choice==4)
                    jumpToLayout03();
            }

        });
    }

    @SuppressLint("WrongViewCast")
    private void jumpToLayout02() {
        setContentView(R.layout.mood2);
//        Button button02 = findViewById(R.id.mood2_next_button);
//        button02.setOnClickListener(new Button.OnClickListener(){
//            public void onClick(View v){
//                f_jumptolayout03 = true;
//                jumpToLayout01();
//            }
//        });

        ImageButton mImageButton21 = (ImageButton) findViewById(R.id.two_imageButton01);
        ImageButton mImageButton22 = (ImageButton) findViewById(R.id.two_imageButton02);
        ImageButton mImageButton23 = (ImageButton) findViewById(R.id.two_imageButton03);
        ImageButton mImageButton24 = (ImageButton) findViewById(R.id.two_imageButton04);
        ImageButton mImageButton25 = (ImageButton) findViewById(R.id.two_imageButton05);
        ImageButton mImageButton26 = (ImageButton) findViewById(R.id.two_imageButton06);
        ImageButton mImageButton27 = (ImageButton) findViewById(R.id.two_imageButton07);

        mImageButton21.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                jumpToLayout02_mad();
            }
        });

        mImageButton22.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                jumpToLayout02_angry();
            }
        });

        mImageButton23.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                jumpToLayout02_unhappy();
            }
        });

        mImageButton24.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                jumpToLayout02_calm();
            }
        });

        mImageButton25.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                jumpToLayout02_happy();
            }
        });

        mImageButton26.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                jumpToLayout02_excited();
            }
        });

        mImageButton27.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                jumpToLayout02_veryhappy();
            }
        });

    }

    private void jumpToLayout02_mad(){
        setContentView(R.layout.mood2_mad);
        final CheckBox is_correct = (CheckBox) findViewById(R.id.checkBox4);
        Button button = findViewById(R.id.button15);
        button.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                if(is_correct.isChecked())
                    jumpToLayout01();
                else
                    jumpToLayout02();
            }
        });
    }
    private void jumpToLayout02_angry(){
        setContentView(R.layout.mood2_angry);
        final CheckBox is_correct = (CheckBox) findViewById(R.id.checkBox6);
        Button button = findViewById(R.id.button17);
        button.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                if(is_correct.isChecked())
                    jumpToLayout01();
                else
                    jumpToLayout02();
            }
        });
    }
    private void jumpToLayout02_unhappy(){
        setContentView(R.layout.mood2_unhappy);
        final CheckBox is_correct = (CheckBox) findViewById(R.id.checkBox5);
        Button button = findViewById(R.id.button16);
        button.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                if(is_correct.isChecked())
                    jumpToLayout01();
                else
                    jumpToLayout02();
            }
        });
    }
    private void jumpToLayout02_calm(){
        setContentView(R.layout.mood2_calm);
        final CheckBox is_correct = (CheckBox) findViewById(R.id.checkBox7);
        Button button = findViewById(R.id.button18);
        button.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                if(is_correct.isChecked())
                    jumpToLayout01();
                else
                    jumpToLayout02();
            }
        });
    }
    private void jumpToLayout02_happy(){
        setContentView(R.layout.mood2_happy);
        final CheckBox is_correct = (CheckBox) findViewById(R.id.checkBox);
        Button button = findViewById(R.id.button12);
        button.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                if(is_correct.isChecked())
                    jumpToLayout01();
                else
                    jumpToLayout02();
            }
        });
    }
    private void jumpToLayout02_excited(){
        setContentView(R.layout.mood2_excited);
        final CheckBox is_correct = (CheckBox) findViewById(R.id.checkBox3);
        Button button = findViewById(R.id.button14);
        button.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                if(is_correct.isChecked())
                    jumpToLayout01();
                else
                    jumpToLayout02();
            }
        });
    }
    private void jumpToLayout02_veryhappy(){
        setContentView(R.layout.mood2_veryhappy);
        final CheckBox is_correct = (CheckBox) findViewById(R.id.checkBox2);
        Button button = findViewById(R.id.button13);
        button.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                if(is_correct.isChecked())
                    jumpToLayout01();
                else
                    jumpToLayout02();
            }
        });
    }

    private void jumpToLayout03_1() {
        setContentView(R.layout.mood3_1);
        Button button03 = findViewById(R.id.mood3_1_next_button);
        button03.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                jumpToLayout04();
            }
        });

        mRadioButton31 = (RadioButton) findViewById(R.id.three_button101);
        mRadioButton32 = (RadioButton) findViewById(R.id.three_button102);
        mRadioButton33 = (RadioButton) findViewById(R.id.three_button103);
        mRadioButton34 = (RadioButton) findViewById(R.id.three_button104);
        mRadioButton35 = (RadioButton) findViewById(R.id.three_button105);
        mRadioButton36 = (RadioButton) findViewById(R.id.three_button106);
        mRadioButton37 = (RadioButton) findViewById(R.id.three_button107);
        mRadioButton38 = (RadioButton) findViewById(R.id.three_button108);
        mRadioButton39 = (RadioButton) findViewById(R.id.three_button109);
        mRadioButton40 = (RadioButton) findViewById(R.id.three_button110);

        mRadioButton31.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                mRadioButton31.setChecked(true);
                mRadioButton32.setChecked(false);
                mRadioButton33.setChecked(false);
                mRadioButton34.setChecked(false);
                mRadioButton35.setChecked(false);
                mRadioButton36.setChecked(false);
                mRadioButton37.setChecked(false);
                mRadioButton38.setChecked(false);
                mRadioButton39.setChecked(false);
                mRadioButton40.setChecked(false);

            }
        });

        mRadioButton32.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                mRadioButton31.setChecked(false);
                mRadioButton32.setChecked(true);
                mRadioButton33.setChecked(false);
                mRadioButton34.setChecked(false);
                mRadioButton35.setChecked(false);
                mRadioButton36.setChecked(false);
                mRadioButton37.setChecked(false);
                mRadioButton38.setChecked(false);
                mRadioButton39.setChecked(false);
                mRadioButton40.setChecked(false);
            }
        });

        mRadioButton33.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                mRadioButton31.setChecked(false);
                mRadioButton32.setChecked(false);
                mRadioButton33.setChecked(true);
                mRadioButton34.setChecked(false);
                mRadioButton35.setChecked(false);
                mRadioButton36.setChecked(false);
                mRadioButton37.setChecked(false);
                mRadioButton38.setChecked(false);
                mRadioButton39.setChecked(false);
                mRadioButton40.setChecked(false);
            }
        });

        mRadioButton34.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                mRadioButton31.setChecked(false);
                mRadioButton32.setChecked(false);
                mRadioButton33.setChecked(false);
                mRadioButton34.setChecked(true);
                mRadioButton35.setChecked(false);
                mRadioButton36.setChecked(false);
                mRadioButton37.setChecked(false);
                mRadioButton38.setChecked(false);
                mRadioButton39.setChecked(false);
                mRadioButton40.setChecked(false);
            }
        });

        mRadioButton35.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                mRadioButton31.setChecked(false);
                mRadioButton32.setChecked(false);
                mRadioButton33.setChecked(false);
                mRadioButton34.setChecked(false);
                mRadioButton35.setChecked(true);
                mRadioButton36.setChecked(false);
                mRadioButton37.setChecked(false);
                mRadioButton38.setChecked(false);
                mRadioButton39.setChecked(false);
                mRadioButton40.setChecked(false);
            }
        });

        mRadioButton36.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                mRadioButton31.setChecked(false);
                mRadioButton32.setChecked(false);
                mRadioButton33.setChecked(false);
                mRadioButton34.setChecked(false);
                mRadioButton35.setChecked(false);
                mRadioButton36.setChecked(true);
                mRadioButton37.setChecked(false);
                mRadioButton38.setChecked(false);
                mRadioButton39.setChecked(false);
                mRadioButton40.setChecked(false);
            }
        });

        mRadioButton37.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                mRadioButton31.setChecked(false);
                mRadioButton32.setChecked(false);
                mRadioButton33.setChecked(false);
                mRadioButton34.setChecked(false);
                mRadioButton35.setChecked(false);
                mRadioButton36.setChecked(false);
                mRadioButton37.setChecked(true);
                mRadioButton38.setChecked(false);
                mRadioButton39.setChecked(false);
                mRadioButton40.setChecked(false);
            }
        });

        mRadioButton38.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                mRadioButton31.setChecked(false);
                mRadioButton32.setChecked(false);
                mRadioButton33.setChecked(false);
                mRadioButton34.setChecked(false);
                mRadioButton35.setChecked(false);
                mRadioButton36.setChecked(false);
                mRadioButton37.setChecked(false);
                mRadioButton38.setChecked(true);
                mRadioButton39.setChecked(false);
                mRadioButton40.setChecked(false);
            }
        });

        mRadioButton39.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                mRadioButton31.setChecked(false);
                mRadioButton32.setChecked(false);
                mRadioButton33.setChecked(false);
                mRadioButton34.setChecked(false);
                mRadioButton35.setChecked(false);
                mRadioButton36.setChecked(false);
                mRadioButton37.setChecked(false);
                mRadioButton38.setChecked(false);
                mRadioButton39.setChecked(true);
                mRadioButton40.setChecked(false);
            }
        });

        mRadioButton40.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                mRadioButton31.setChecked(false);
                mRadioButton32.setChecked(false);
                mRadioButton33.setChecked(false);
                mRadioButton34.setChecked(false);
                mRadioButton35.setChecked(false);
                mRadioButton36.setChecked(false);
                mRadioButton37.setChecked(false);
                mRadioButton38.setChecked(false);
                mRadioButton39.setChecked(false);
                mRadioButton40.setChecked(true);
            }
        });

    }

    private void jumpToLayout03() {
        setContentView(R.layout.mood3);
        Button button03 = findViewById(R.id.mood3_next_button);
        TextView text_view = findViewById(R.id.textView40);

        switch (layout_choice) {
            case 1:
                text_view.setText("我非常開心，已經開心到頂點了，我會和朋友分享，記住這件開心的事情。");
                break;
            case 2:
                text_view.setText("我會把這件開心的事情和朋友分享，記住這件開心的事情。");
                break;
            case 3:
                text_view.setText("我會把這件開心的事情和朋友分享，記住這件開心的事情。");
                break;
            case 4:
                text_view.setText("我會找有趣的事情，讓自己的心情更好一點。");
                break;
            case 5:
                jumpToLayout03_1();
                //text_view.setText("5");
                break;
            case 6:
                jumpToLayout03_1();
                //text_view.setText("6");
                break;
            case 7:
                jumpToLayout03_1();
                //text_view.setText("7");
                break;
        }
//        public void onRadioButtonClicked(View view) {
//            // Is the button now checked?
//            boolean checked = ((RadioButton) view).isChecked();
//
//            // Check which radio button was clicked
//            switch(view.getId()) {
//                case R.id.two_button01:
//                    if (checked)
//                        jumpToLayout03(1);
//                case R.id.two_button02:
//                    if (checked)
//                        break;
//                case R.id.two_button03:
//                    if (checked)
//                        break;
//                case R.id.two_button04:
//                    if (checked)
//                        break;
//                case R.id.two_button05:
//                    if (checked)
//                        break;
//                case R.id.two_button06:
//                    if (checked)
//                        break;
//                case R.id.two_button07:
//                    if (checked)
//                        break;
//
//            }
//        }

        button03.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                jumpToLayout04();
            }
        });
    }

    private void jumpToLayout04() {
        setContentView(R.layout.mood4);
        Button button04 = findViewById(R.id.mood4_next_button);
        button04.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                System.exit(0);
            }
        });

        mRadioButton41 = (RadioButton) findViewById(R.id.four_button01);
        mRadioButton42 = (RadioButton) findViewById(R.id.four_button02);
        mRadioButton43 = (RadioButton) findViewById(R.id.four_button03);
        mRadioButton44 = (RadioButton) findViewById(R.id.four_button04);
        mRadioButton45 = (RadioButton) findViewById(R.id.four_button05);
        mRadioButton46 = (RadioButton) findViewById(R.id.four_button06);
        mRadioButton47 = (RadioButton) findViewById(R.id.four_button07);

        mRadioButton41.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                mRadioButton41.setChecked(true);
                mRadioButton42.setChecked(false);
                mRadioButton43.setChecked(false);
                mRadioButton44.setChecked(false);
                mRadioButton45.setChecked(false);
                mRadioButton46.setChecked(false);
                mRadioButton47.setChecked(false);
            }
        });

        mRadioButton42.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                mRadioButton41.setChecked(false);
                mRadioButton42.setChecked(true);
                mRadioButton43.setChecked(false);
                mRadioButton44.setChecked(false);
                mRadioButton45.setChecked(false);
                mRadioButton46.setChecked(false);
                mRadioButton47.setChecked(false);
            }
        });

        mRadioButton43.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                mRadioButton41.setChecked(false);
                mRadioButton42.setChecked(false);
                mRadioButton43.setChecked(true);
                mRadioButton44.setChecked(false);
                mRadioButton45.setChecked(false);
                mRadioButton46.setChecked(false);
                mRadioButton47.setChecked(false);
            }
        });

        mRadioButton44.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                mRadioButton41.setChecked(false);
                mRadioButton42.setChecked(false);
                mRadioButton43.setChecked(false);
                mRadioButton44.setChecked(true);
                mRadioButton45.setChecked(false);
                mRadioButton46.setChecked(false);
                mRadioButton47.setChecked(false);
            }
        });

        mRadioButton45.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                mRadioButton41.setChecked(false);
                mRadioButton42.setChecked(false);
                mRadioButton43.setChecked(false);
                mRadioButton44.setChecked(false);
                mRadioButton45.setChecked(true);
                mRadioButton46.setChecked(false);
                mRadioButton47.setChecked(false);
            }
        });

        mRadioButton46.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                mRadioButton41.setChecked(false);
                mRadioButton42.setChecked(false);
                mRadioButton43.setChecked(false);
                mRadioButton44.setChecked(false);
                mRadioButton45.setChecked(false);
                mRadioButton46.setChecked(true);
                mRadioButton47.setChecked(false);
            }
        });

        mRadioButton47.setOnClickListener(new RadioButton.OnClickListener() {
            public void onClick(View v) {
                mRadioButton41.setChecked(false);
                mRadioButton42.setChecked(false);
                mRadioButton43.setChecked(false);
                mRadioButton44.setChecked(false);
                mRadioButton45.setChecked(false);
                mRadioButton46.setChecked(false);
                mRadioButton47.setChecked(true);
            }
        });

    }

    }