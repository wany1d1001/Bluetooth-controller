package com.jentsch.bluetooth.relay.board.bt22a16;

import static com.jentsch.bluetooth.relay.board.bt22a16.DeviceList.address;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.constraint.ConstraintLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends BluetoothActivity {

    MenuItem connectedIcon;
    MenuItem disconnectedIcon;
    MenuItem setting;
    private ProgressDialog progress;
    private LinearLayout mainLayout;
    private Bluetooth bluetooth;
    private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9, btnF,btnB,btnUp, btnDown, btnLeft, btnRight;
    private Button btn0e,btn1e,btn2e,btn3e,btn4e,btn5e,btn6e,btn7e,btn8e,btn9e;
    private String tag=null;
    private boolean isSend = false;
    private EditText edit;
    private JoystickView joystick;
    private int longClickDuration = 3000;
    private boolean isLongPress = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
//        addLayoutChannels();
        bluetooth = new Bluetooth(this);
        btn0 = (Button) findViewById(R.id.a1);
        btn1 = (Button) findViewById(R.id.b1);
        btn2 = (Button) findViewById(R.id.c1);
        btn3 = (Button) findViewById(R.id.d1);
        btn4 = (Button) findViewById(R.id.e1);
        btn5 = (Button) findViewById(R.id.f1);
        btn6 = (Button) findViewById(R.id.g1);
        btn7 = (Button) findViewById(R.id.h1);
        btn8 = (Button) findViewById(R.id.i1);
        btn9 = (Button) findViewById(R.id.j1);
        btnF = (Button) findViewById(R.id.k1);
        btnB = (Button) findViewById(R.id.l1);
        btnUp = (Button)findViewById(R.id.btn_up);
        btnDown = (Button) findViewById(R.id.btn_down);
        btnLeft=(Button) findViewById(R.id.btn_left);
        btnRight=(Button) findViewById(R.id.btn_right);
        edit = (EditText) findViewById(R.id.edit_dialog);
        joystick = (JoystickView) findViewById(R.id.joystickView);
//        btn0e = (Button) findViewById(R.id.a1_e);
//        btn1e = (Button) findViewById(R.id.b1_e);
//        btn2e = (Button) findViewById(R.id.c1_e);
//        btn3e = (Button) findViewById(R.id.d1_e);
//        btn4e = (Button) findViewById(R.id.e1_e);
//        btn5e = (Button) findViewById(R.id.f1_e);
//        btn6e = (Button) findViewById(R.id.g1_e);
//        btn7e = (Button) findViewById(R.id.h1_e);
//        btn8e = (Button) findViewById(R.id.i1_e);
//        btn9e = (Button) findViewById(R.id.j1_e);
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
            boolean tmp = false;
            @Override
            public void onClick(View view) {
                tmp = !tmp;
                int resId = tmp? R.drawable.button_selected: R.drawable.button_bg;
                btn0.setBackgroundResource(resId);
                onButtonClick(view);
                pause();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            boolean tmp = false;
            @Override
            public void onClick(View view) {
                tmp = !tmp;
                int resId = tmp? R.drawable.button_selected: R.drawable.button_bg;
                btn1.setBackgroundResource(resId);
                onButtonClick(view);
                pause();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            boolean tmp = false;
            @Override
            public void onClick(View view) {
                tmp = !tmp;
                int resId = tmp? R.drawable.button_selected: R.drawable.button_bg;
                btn2.setBackgroundResource(resId);
                onButtonClick(view);
                pause();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            boolean tmp = false;
            @Override
            public void onClick(View view) {
                tmp = !tmp;
                int resId = tmp? R.drawable.button_selected: R.drawable.button_bg;
                btn3.setBackgroundResource(resId);
                onButtonClick(view);
                pause();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            boolean tmp = false;
            @Override
            public void onClick(View view) {
                tmp = !tmp;
                int resId = tmp? R.drawable.button_selected: R.drawable.button_bg;
                btn4.setBackgroundResource(resId);
                onButtonClick(view);
                pause();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            boolean tmp = false;
            @Override
            public void onClick(View view) {
                tmp = !tmp;
                int resId = tmp? R.drawable.button_selected: R.drawable.button_bg;
                btn5.setBackgroundResource(resId);
                onButtonClick(view);
                pause();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            boolean tmp = false;
            @Override
            public void onClick(View view) {
                tmp = !tmp;
                int resId = tmp? R.drawable.button_selected: R.drawable.button_bg;
                btn6.setBackgroundResource(resId);
                onButtonClick(view);
                pause();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            boolean tmp = false;
            @Override
            public void onClick(View view) {
                tmp = !tmp;
                int resId = tmp? R.drawable.button_selected: R.drawable.button_bg;
                btn7.setBackgroundResource(resId);
                onButtonClick(view);
                pause();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            boolean tmp = false;
            @Override
            public void onClick(View view) {
                tmp = !tmp;
                int resId = tmp? R.drawable.button_selected: R.drawable.button_bg;
                btn8.setBackgroundResource(resId);
                onButtonClick(view);
                pause();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            boolean tmp = false;
            @Override
            public void onClick(View view) {
                tmp = !tmp;
                int resId = tmp? R.drawable.button_selected: R.drawable.button_bg;
                btn9.setBackgroundResource(resId);
                onButtonClick(view);
                pause();
            }
        });
//        btnF.setOnClickListener(new View.OnClickListener() {
//            boolean tmp = false;
//            @Override
//            public void onClick(View view) {
//                tmp = !tmp;
//                int resId = tmp? R.drawable.button_selected: R.drawable.button_bg;
//                btnF.setBackgroundResource(resId);
//                btnB.setEnabled(!tmp);
//                onButtonClick(view);
//            }
//        });
        btnF.setOnTouchListener(new View.OnTouchListener() {
            boolean tmp = false;
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                    tmp = true;
                    bluetooth.btSendData("K4");
                    int resId = tmp? R.drawable.button_selected: R.drawable.button_bg;
                    btnF.setBackgroundResource(resId);
                }
                else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    tmp = false;
                    bluetooth.btSendData("K3");
                    btnF.setBackgroundResource(R.drawable.button_bg);

                }
                return false;
            }
        });
//        btnB.setOnClickListener(new View.OnClickListener() {
//            boolean tmp = false;
//            @Override
//            public void onClick(View view) {
//                tmp = !tmp;
//                int resId = tmp? R.drawable.button_selected: R.drawable.button_bg;
//                btnB.setBackgroundResource(resId);
//                btnF.setEnabled(!tmp);
//                onButtonClick(view);
//            }
//        });
        btnB.setOnTouchListener(new View.OnTouchListener() {
            boolean tmp = false;
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                    tmp = true;
                    bluetooth.btSendData("L4");
                    int resId = tmp? R.drawable.button_selected: R.drawable.button_bg;
                    btnB.setBackgroundResource(resId);
                }
                else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    tmp = false;
                    bluetooth.btSendData("L3");
                    btnB.setBackgroundResource(R.drawable.button_bg);

                }
                return false;
            }
        });
//        btnUp.setOnClickListener(new View.OnClickListener() {
//            boolean tmp = false;
//            @Override
//            public void onClick(View view) {
//                tmp = !tmp;
//                int resId = tmp? R.drawable.arrow_sel: R.drawable.arrow_def;
//                btnUp.setBackgroundResource(resId);
//                btnDown.setEnabled(!tmp);
//                btnLeft.setEnabled(!tmp);
//                btnRight.setEnabled(!tmp);
//                joystick.setEnabled(!tmp);
//                onButtonClick(view);
//            }
//        });
//        btnRight.setOnClickListener(new View.OnClickListener() {
//            boolean tmp = false;
//            @Override
//            public void onClick(View view) {
//                tmp = !tmp;
//                int resId = tmp? R.drawable.arrow_sel: R.drawable.arrow_def;
//                btnRight.setBackgroundResource(resId);
//                btnLeft.setEnabled(!tmp);
//                btnDown.setEnabled(!tmp);
//                btnUp.setEnabled(!tmp);
//                joystick.setEnabled(!tmp);
//                onButtonClick(view);
//            }
//        });
//        btnDown.setOnClickListener(new View.OnClickListener() {
//            boolean tmp = false;
//            @Override
//            public void onClick(View view) {
//                tmp = !tmp;
//                int resId = tmp? R.drawable.arrow_sel: R.drawable.arrow_def;
//                btnDown.setBackgroundResource(resId);
//                btnUp.setEnabled(!tmp);
//                btnLeft.setEnabled(!tmp);
//                btnRight.setEnabled(!tmp);
//                joystick.setEnabled(!tmp);
//                onButtonClick(view);
//            }
//        });
//        btnLeft.setOnClickListener(new View.OnClickListener() {
//            boolean tmp = false;
//            @Override
//            public void onClick(View view) {
//                tmp = !tmp;
//                int resId = tmp? R.drawable.arrow_sel: R.drawable.arrow_def;
//                btnLeft.setBackgroundResource(resId);
//                btnRight.setEnabled(!tmp);
//                btnDown.setEnabled(!tmp);
//                btnUp.setEnabled(!tmp);
//                joystick.setEnabled(!tmp);
//                onButtonClick(view);
//            }
//        });


//        joystick.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                switch (event.getAction()) {
//                    case MotionEvent.ACTION_DOWN:
//                        int x = (int) event.getX();
//                        int y = (int) event.getY();
//                        int r = joystick.getButtonRadius();
//                        float m = joystick.getButtonSizeRatio();
//                        int d = Math.min(x, y);
//                        int a = (int)(d / 2 * m);
//                        System.out.println("r: "+r);
//                        System.out.println("a: "+a);
//
//                        joystick.setEnabled(a<=r);
//                        break;
//                    case MotionEvent.ACTION_UP:
//                        v.performClick();
//                        break;
//                    default:
//                        break;
//                }
//                return true;
//            }
//        });

        joystick.setOnMoveListener(new JoystickView.OnMoveListener() {

            @Override
            public void onMove(int angle, int strength) {

                if(strength>30 && joystick.isEnabled()){

                    if(angle>60 && angle<120 && !isSend){
                            isSend=true;
                            tag= "O";
                            bluetooth.btSendData(tag+4);
                            System.out.println("UP");

                    }

                    else if (angle>150 && angle<210 && !isSend){
                        isSend=true;
                        tag="N";
                        bluetooth.btSendData(tag+4);
                        System.out.println("LEFT");
                    }
                    else if (angle>240 && angle<300 && !isSend){
                        isSend=true;
                        tag="M";
                        bluetooth.btSendData(tag+4);
                        System.out.println("DOWN");
                    }
                    else if((angle>330 ||angle<30) && !isSend){
                        isSend=true;
                        tag="P";
                        bluetooth.btSendData(tag+4);
                        System.out.println("RIGHT");
                    }
                    else if(angle<60&&angle>30){
                        stop();
                        System.out.println("reset");
                    }
                    else if (angle<150&&angle>120){
                        stop();
                        System.out.println("reset");
                    }
                    else if(angle<240 &&angle>210){
                        stop();
                        System.out.println("reset");
                    }
                    else if(angle<330 && angle>300){
                        stop();
                        System.out.println("reset");
                    }
//                    else{
//                        stop();
//                        System.out.println("stop1");
//                    }

                }else{
                    stop();
                    System.out.println("stop2");
                }

            }
        });


    }

//    private View.OnTouchListener handleTouch = new View.OnTouchListener() {
//
//        @Override
//        public boolean onTouch(View v, MotionEvent event) {
//
//            double x = (double) event.getX();
//            double y = (double) event.getY();
//            double r = joystick.getButtonRadius();
//            joystick.setEnabled(x < r && y < r);
//            return true;
//        }
//    };
//    public void showDialog(String str, final String bName, final Button btn) {
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setTitle("Edit Name");
//        View view = LayoutInflater.from(this).inflate(R.layout.dialog_view, null);
//        final EditText edit_dialog = (EditText) view.findViewById(R.id.edit_dialog);
//        edit_dialog.setText(str);
//        builder.setView(view);
//        builder.setNegativeButton("cancel",null);
//        builder.setPositiveButton("confirm", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                SharedPreferences btnName = getPreferences(Context.MODE_PRIVATE);
//                SharedPreferences.Editor editor = btnName.edit();
//                editor.putString(bName, edit_dialog.getText().toString());
//                editor.apply();
//                String x = btnName.getString(bName, null);
//                btn.setText(x);
//            }
//        });
//        builder.show();
//    }

    public void onButtonClick(View view) {
        String data = (String) view.getTag();
        bluetooth.btSendData(data);
        System.out.println(data);
    }

    public void stop(){
        if(tag!=null){
            bluetooth.btSendData(tag+3);
        }
        tag=null;
        isSend = false;
    }

    public void pause(){
        ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.mainlayout);
        final ProgressBar pb = (ProgressBar) findViewById(R.id.progressBar);
        for(int i=0; i<layout.getChildCount();i++){
            final View child = layout.getChildAt(i);
            child.setEnabled(false);
            pb.setVisibility(View.VISIBLE);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run()
                {
                    child.setEnabled(true);
                    pb.setVisibility(View.INVISIBLE);
                }
            },1000);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        connectedIcon = menu.findItem(R.id.connected);
        disconnectedIcon = menu.findItem(R.id.disconnected);
        setting = menu.findItem(R.id.setting);
        connectedIcon.setVisible(false);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.connectBluetooth) {
            if (!bluetooth.isBtConnected()) {
                Intent i = new Intent(this, DeviceList.class);
                startActivityForResult(i, 1);
            } else
                msg("Bluetooth is already connected.");
        }

        if (id == R.id.disconnectBluetooth) {
            bluetooth.disconnect();
        }

        if (id == R.id.setting){
            Intent intent = new Intent(MainActivity.this, editPage.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 1) { //deviceList
            if (resultCode == Activity.RESULT_OK) {
                address = data.getStringExtra(address);
                bluetooth.setAddress(address);
            }
            if (resultCode == Activity.RESULT_CANCELED)
                msg("Canceled.");
        } else {
            msg("Invalid request code");
        }
    }

    @Override
    public void onDestroy() {
        bluetooth.disconnect();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.onDestroy();
    }

    @Override
    public void msg(String s) {
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_LONG).show();
    }

    @Override
    public void setProgress(ProgressDialog progress) {
        this.progress = progress;
    }

    @Override
    public void dismissProgress() {
        progress.dismiss();
    }

    @Override
    public void connected(boolean notify) {
        if (notify)
            msg("Connected.");
        connectedIcon.setVisible(true);
        disconnectedIcon.setVisible(false);
    }

    @Override
    public void disconnected(boolean notify) {
        if (notify)
            msg("Disconnected.");
        disconnectedIcon.setVisible(true);
        connectedIcon.setVisible(false);
    }
}


