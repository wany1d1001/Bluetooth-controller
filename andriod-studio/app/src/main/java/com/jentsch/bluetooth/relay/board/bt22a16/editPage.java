package com.jentsch.bluetooth.relay.board.bt22a16;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class editPage extends MainActivity {
    private EditText edit;
    private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,confirm;
    private Context context;
    public editPage(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_page);


        edit = (EditText) findViewById(R.id.edit_dialog);
        btn0 = (Button) findViewById(R.id.a1_e);
        btn1 = (Button) findViewById(R.id.b1_e);
        btn2 = (Button) findViewById(R.id.c1_e);
        btn3 = (Button) findViewById(R.id.d1_e);
        btn4 = (Button) findViewById(R.id.e1_e);
        btn5 = (Button) findViewById(R.id.f1_e);
        btn6 = (Button) findViewById(R.id.g1_e);
        btn7 = (Button) findViewById(R.id.h1_e);
        btn8 = (Button) findViewById(R.id.i1_e);
        btn9 = (Button) findViewById(R.id.j1_e);
        confirm = (Button) findViewById(R.id.confirm);
        //Initiate editable buttons
        SharedPreferences btnName = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        String b0 = btnName.getString("b0", null);
        String b1 = btnName.getString("b1", null);
        String b2 = btnName.getString("b2", null);
        String b3 = btnName.getString("b3", null);
        String b4 = btnName.getString("b4", null);
        String b5 = btnName.getString("b5", null);
        String b6 = btnName.getString("b6", null);
        String b7 = btnName.getString("b7", null);
        String b8 = btnName.getString("b8", null);
        String b9 = btnName.getString("b9", null);

        btn0.setText(b0);
        btn1.setText(b1);
        btn2.setText(b2);
        btn3.setText(b3);
        btn4.setText(b4);
        btn5.setText(b5);
        btn6.setText(b6);
        btn7.setText(b7);
        btn8.setText(b8);
        btn9.setText(b9);


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(edit.getText().toString(),"b0", btn0);

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(edit.getText().toString(),"b1", btn1);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(edit.getText().toString(),"b2", btn2);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(edit.getText().toString(),"b3", btn3);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(edit.getText().toString(),"b4", btn4);

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(edit.getText().toString(),"b5", btn5);

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(edit.getText().toString(),"b6", btn6);

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(edit.getText().toString(),"b7", btn7);

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(edit.getText().toString(),"b8", btn8);

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(edit.getText().toString(),"b9", btn9);

            }
        });

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(editPage.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    public void showDialog(String str, final String bName, final Button btn) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Edit Name");
        View view = LayoutInflater.from(this).inflate(R.layout.dialog_view, null);
        final EditText edit_dialog = (EditText) view.findViewById(R.id.edit_dialog);
        edit_dialog.setText(str);
        builder.setView(view);
        builder.setNegativeButton("cancel",null);
        builder.setPositiveButton("confirm", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                SharedPreferences btnName = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = btnName.edit();
                editor.putString(bName, edit_dialog.getText().toString());
                editor.apply();
                String x = btnName.getString(bName, null);
                btn.setText(x);
            }
        });
        builder.show();
    }


}
