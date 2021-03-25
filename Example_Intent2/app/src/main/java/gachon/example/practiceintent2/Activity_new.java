package gachon.example.practiceintent2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity_new extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Button button=findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "돌아가기 버튼이 눌렸어요", Toast.LENGTH_LONG).show();

                Intent myCallerIntent = getIntent();
                Bundle myBundle2 = myCallerIntent.getExtras();
                int var1 = myBundle2.getInt("var1");
                Intent myCallingIntent = new Intent(getApplicationContext(), MainActivity.class);
                myBundle2.putString("val1", "test");
                myCallingIntent.putExtras(myBundle2);
                setResult(Activity.RESULT_OK, myCallingIntent);

                finish();
            }


        });
    }
}
