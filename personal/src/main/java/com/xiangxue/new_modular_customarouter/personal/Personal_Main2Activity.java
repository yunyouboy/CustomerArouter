package com.xiangxue.new_modular_customarouter.personal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.xiangxue.arouter_annotation.ARouter;

@ARouter(path = "/personal/Personal_Main2Activity")
public class Personal_Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_activity_main2);
    }
}
