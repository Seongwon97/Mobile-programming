package gachon.example.practice_network;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.button1);
        editText=(EditText)findViewById(R.id.editText1);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String address = editText.getText().toString().trim();
                ConnectThread thread = new ConnectThread(address);
                thread.start();
            }
        });
    }
}