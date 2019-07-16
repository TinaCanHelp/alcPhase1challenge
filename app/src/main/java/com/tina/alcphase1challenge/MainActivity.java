package com.tina.alcphase1challenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Intent intent=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public  void  openProfile(View view){
        intent = new Intent(MainActivity.this, MyProfile.class);
        startActivity(intent);
        intent = null;

    }
    public  void openAbout(View view){
        intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
        intent = null;

    }
}
