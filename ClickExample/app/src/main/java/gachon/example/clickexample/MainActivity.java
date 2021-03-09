package gachon.example.clickexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateTime();
            }
        });

/*        btn2=findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v) {
                updateTime2();
                return false;
            }
        });
*/
    }
    void updateTime(){
        btn1.setText(new Date().toString());
    }
    void updateTime2(){
        btn2.setText(new Date().toString());
    }
    void updateTime3(){
        btn3.setText(new Date().toString());
    }
}
