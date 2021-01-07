package com.xiangxue.new_modular_customarouter.personal;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.xiangxue.arouter_annotation.ARouter;
import com.xiangxue.new_modular_customarouter.personal.R;

@ARouter(path = "/personal/Personal_Main4Activity")
public class Personal_Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_activity_main2);
    }
}
