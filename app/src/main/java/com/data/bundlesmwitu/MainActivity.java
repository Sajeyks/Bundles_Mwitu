package com.data.bundlesmwitu;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class MainActivity extends AppCompatActivity {


    //The permission cedes go here
    private static final int PHONE_PERMISSION_CODE = 100;
    private static final String TAG = "== > " ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //  Button btn = findViewById(R.id.button);
        View pack_1 = findViewById(R.id.package1);
        View pack_2 = findViewById(R.id.package2);
        View pack_3 = findViewById(R.id.package3);
        View pack_4 = findViewById(R.id.package4);
        View pack_5 = findViewById(R.id.package5);
        View pack_6 = findViewById(R.id.package6);
        View pack_7 = findViewById(R.id.package7);
        View pack_8 = findViewById(R.id.package8);
        // the digits
        final String phone = "0705892086%23";
        final String c1 = "*140*10*";
        final String c2 = "*140*20*";
        final String c3 = "*140*30*";
        final String c4 = "*140*150*";
        final String c5 = "*140*70*";
        final String c6 = "*140*70*";
        final String c7 = "*140*30*";
        final String c8 = "*140*30*";

        // Permission check function call
        CheckPermission(Manifest.permission.CALL_PHONE, PHONE_PERMISSION_CODE);


        //for 1

        pack_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    CheckPermission(Manifest.permission.CALL_PHONE, PHONE_PERMISSION_CODE);
                Uri p1 = Uri.parse("tel:" + c1 + phone);

                Intent i = new Intent(Intent.ACTION_CALL, p1);


                if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                   // Toast.makeText(MainActivity.this,"The App must access that permission to function properly",Toast.LENGTH_LONG).show();
                    showmessageOKCancel(
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                                        CheckPermission(Manifest.permission.CALL_PHONE, PHONE_PERMISSION_CODE);
                                    }
                                }
                            }
                    );


                }
                else if(ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED){

                    startActivity(i);
                }



            }
        });

        //for 2

        pack_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Uri p1 = Uri.parse("tel:" + c2 + phone);

                Intent i = new Intent(Intent.ACTION_CALL, p1);


                if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {


                    showmessageOKCancel(
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                                        CheckPermission(Manifest.permission.CALL_PHONE, PHONE_PERMISSION_CODE);
                                    }
                                }
                            }
                    );

                }
                else if(ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED){

                    startActivity(i);
                }


            }
        });

        //for 3

        pack_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri p1 = Uri.parse("tel:" + c3 + phone);

                Intent i = new Intent(Intent.ACTION_CALL, p1);


                if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {


                    showmessageOKCancel(
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                                        CheckPermission(Manifest.permission.CALL_PHONE, PHONE_PERMISSION_CODE);
                                    }
                                }
                            }
                    );


                }
                else if(ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED){

                    startActivity(i);
                }




            }
        });

        //for 4

        pack_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri p1 = Uri.parse("tel:" + c4 + phone);

                Intent i = new Intent(Intent.ACTION_CALL, p1);


                if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {


                    showmessageOKCancel(
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                                        CheckPermission(Manifest.permission.CALL_PHONE, PHONE_PERMISSION_CODE);
                                    }
                                }
                            }
                    );

                }
                else if(ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED){

                    startActivity(i);
                }



            }
        });


        //for 5

        pack_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri p1 = Uri.parse("tel:" + c5 + phone);

                Intent i = new Intent(Intent.ACTION_CALL, p1);


                if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {


                    showmessageOKCancel(
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                                        CheckPermission(Manifest.permission.CALL_PHONE, PHONE_PERMISSION_CODE);
                                    }
                                }
                            }
                    );


                }
                else if(ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED){

                    startActivity(i);
                }



            }
        });



        //for 6

        pack_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri p1 = Uri.parse("tel:" + c6 + phone);

                Intent i = new Intent(Intent.ACTION_CALL, p1);


                if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {


                    showmessageOKCancel(
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                                        CheckPermission(Manifest.permission.CALL_PHONE, PHONE_PERMISSION_CODE);
                                    }
                                }
                            }
                    );


                }
                else if(ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED){

                    startActivity(i);
                }



            }
        });



        //for 7

        pack_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri p1 = Uri.parse("tel:" + c7 + phone);

                Intent i = new Intent(Intent.ACTION_CALL, p1);


                if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {


                    showmessageOKCancel(
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                                        CheckPermission(Manifest.permission.CALL_PHONE, PHONE_PERMISSION_CODE);
                                    }
                                }
                            }
                    );


                }
                else if(ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED){

                    startActivity(i);
                }


            }
        });



        //for 8

        pack_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri p1 = Uri.parse("tel:" + c8 + phone);

                Intent i = new Intent(Intent.ACTION_CALL, p1);


                if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {


                    showmessageOKCancel(
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                                        CheckPermission(Manifest.permission.CALL_PHONE, PHONE_PERMISSION_CODE);
                                    }
                                }
                            }
                    );


                }
                else if(ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED){

                    startActivity(i);
                }



            }
        });


    }



    // Check & request permission Function
    public void CheckPermission(String permission, int requestCode)
    {

        if (ActivityCompat.checkSelfPermission(MainActivity.this,permission ) == PackageManager.PERMISSION_DENIED)
        {
            // Requesting for it
            ActivityCompat.requestPermissions(MainActivity.this,new String[] {permission},requestCode);
        }



    }

    /*
    * After Accepting or Declining
    * we check which ones called this function*/

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           @NonNull String[] permissions,
                                           @NonNull int[] grantResults)
    {
        super.onRequestPermissionsResult(requestCode,
                                           permissions,
                                             grantResults);

        if (requestCode == PHONE_PERMISSION_CODE)
        {
            if (grantResults.length > 0 &&
                      grantResults[0] == PackageManager.PERMISSION_GRANTED)
            {
                Log.i(TAG,"Permission Granted");
            }
            else {
                Log.i(TAG,"Permission Denied");
            }
        }

    }

// The Dialog Box
    private void showmessageOKCancel(DialogInterface.OnClickListener okListener){
        new AlertDialog.Builder(MainActivity.this)
                .setMessage("You need to allow the access permission for the app to run properly")
                .setPositiveButton("OK",okListener)
                .setNegativeButton("Cancel",null)
                .create()
                .show();

    }




    }

