package gachon.example.example_campus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyView vw = new MyView(this);
        setContentView(vw);
    }

    protected class MyView extends View {
        public MyView(Context context) {
            super(context);
        }
        /*
        @Override
        protected void onDraw(Canvas canvas){
            super.onDraw(canvas);
            Paint pnt = new Paint();
            pnt.setColor(Color.BLUE);
            canvas.drawColor(Color.RED);
            canvas.drawRect(100,100,200,200,pnt);
        }*/
        /*
        @Override
        protected void onDraw(Canvas canvas){
            Paint pnt = new Paint(Paint.ANTI_ALIAS_FLAG);

            pnt.setColor(Color.BLUE);
            pnt.setStrokeWidth(16);
            canvas.drawLine(50,30,240,30,pnt);
            pnt.setStrokeCap(Paint.Cap.ROUND);
            canvas.drawLine(50,60,240,60, pnt);
            pnt.setStrokeCap(Paint.Cap.SQUARE);
            canvas.drawLine(50,90,240,90, pnt);

            pnt.setColor(Color.BLACK);
            pnt.setStrokeWidth(20);
            pnt.setStyle(Paint.Style.STROKE);
            pnt.setStrokeJoin(Paint.Join.MITER);
            canvas.drawRect(50,150,90,200,pnt);
            pnt.setStrokeJoin(Paint.Join.BEVEL);
            canvas.drawRect(120,150,160,200,pnt);
            pnt.setStrokeJoin(Paint.Join.ROUND);
            canvas.drawRect(190,150,230,200,pnt);
        }         */

        @Override
        protected void onDraw(Canvas canvas) {

            Path path = new Path();
            canvas.drawColor(Color.WHITE);
            Paint pnt = new Paint();
            pnt.setColor(Color.RED);
            pnt.setStrokeWidth(5);
            pnt.setStyle(Paint.Style.STROKE);

            path.addRect(100, 0, 150, 90, Path.Direction.CW);
            path.addCircle(50, 50, 40, Path.Direction.CW);
            canvas.drawPath(path, pnt);

            path.reset();
            path.moveTo(10, 110);
            path.lineTo(50, 150);
            path.lineTo(400, 10);
            pnt.setStrokeWidth(3);
            pnt.setColor(Color.BLUE);
            canvas.drawPath(path, pnt);
            pnt.setTextSize(20);
            pnt.setStyle(Paint.Style.FILL);
            canvas.drawTextOnPath("Text on Path", path, 0, 0, pnt);
        }
    }
}
