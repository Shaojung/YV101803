package com.example.yvtc.yv101803;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final int REQUEST_CODE_INPUT = 123;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View v)
    {
        Intent it = new Intent(MainActivity.this, Main2Activity.class);
        startActivityForResult(it, REQUEST_CODE_INPUT);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_INPUT)
        {
            if (resultCode == RESULT_OK)
            {
                TextView tv = (TextView) findViewById(R.id.textView);
                String str = data.getStringExtra("myinput");
                tv.setText(str);
            }
        }


    }
}
