package gachon.example.example_drawable_java2;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton button=(ImageButton) findViewById(R.id.button);
        TransitionDrawable drawable=(TransitionDrawable) button.getDrawable();
        drawable.startTransition(10000);
    }
}