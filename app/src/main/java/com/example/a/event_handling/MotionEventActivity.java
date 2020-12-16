package com.example.a.event_handling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.TextView;

public class MotionEventActivity extends AppCompatActivity {
    public int x;
    public int y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motion_event);
        TextView action_1 = findViewById(R.id.action_1);
        TextView action_2 = findViewById(R.id.action_2);
        action_1.setText("Action: Click, X: -, Y: -.");
        action_2.setText("Action: LongClick, X: -, Y: -.");
        Button button = findViewById(R.id.button2);
        button.setBackgroundColor(Color.alpha(0));
        button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                x = (int)event.getX();
                y = (int)event.getY();
                action_1.setText("Action: Click, X: " + x + ", Y: " + y + ".");
                return false;
            }
        });
        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                action_2.setText("Action: LongClick, X: " + x + ", Y: " + y + ".");
                return false;
            }
        });
    }

}