package gachon.example.practice01intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(
                        android.content.Intent.ACTION_VIEW,
                        Uri.parse("content://contacts/people"));
                startActivity(Intent);
                //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01010001000"));
                //startActivity(intent);
            }
        });


    }
}