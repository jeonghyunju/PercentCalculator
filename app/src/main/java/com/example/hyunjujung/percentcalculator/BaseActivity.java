package com.example.hyunjujung.percentcalculator;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by charlie on 2018. 2. 7
 * 모든 액티비티들이 상속 받는 기본 액티비티.
 * 공통적으로 지정해 주는 애니메이션이나 색상 설정을 한다. (Ex: ToolBar)
 */

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*
            모든 화면에 상태바 배경 색과 아이콘 색상을 설정.
            마시멜로우 이상 버전에선 배경 색과 아이콘 색상 모두 변경이 가능
            이하 버전에서는 배경 색만 변경이 가능함.
         */
        View view = getWindow().getDecorView();
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            if(view != null){
                // 23 버전 이상일 때 하얀 바탕에 회색 아이콘 설정
                view.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
                getWindow().setStatusBarColor(Color.parseColor("#f2f2f2"));
            }
        }else if(Build.VERSION.SDK_INT >= 21){
            // 21 버전 이상일 때 회색 바탕으로 설정
            getWindow().setStatusBarColor(Color.parseColor("#c0979797"));
        }
    }
}
