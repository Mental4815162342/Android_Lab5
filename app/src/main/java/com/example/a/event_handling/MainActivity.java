package com.example.a.event_handling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        TextView headetView = (TextView) findViewById(R.id.header);
        switch (id)
        {
            case R.id.action_ButtonClick:
                Intent intent1 = new Intent(MainActivity.this, ButtonClickActivity.class);
                startActivity(intent1);
            case R.id.action_MotionEvent:
                Intent intent2 = new Intent(MainActivity.this, MotionEventActivity.class);
                startActivity(intent2);
            case R.id.action_CommonGestures:
                Intent intent3 = new Intent(MainActivity.this, CommonGesturesActivity.class);
                startActivity(intent3);

        }
        return super.onOptionsItemSelected(item);
    }
}