package com.example.helloworld;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Clicked(View v){
        Toast.makeText(getApplicationContext(),"버튼이 눌렸어요. ", Toast.LENGTH_LONG).show();
    }//Toast는 클릭하였을때 핸드폰에서 아래 검정색배경으로 팝업창을 띄우는 것
    public void onButton2Clicked(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(intent);
    }//인터넷으로 연결하는것
}
