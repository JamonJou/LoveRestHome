package com.love.resthome.loveresthome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.love.resthome.loveresthome.activity.RegisterActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tv_hw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_hw = (TextView) findViewById(R.id.tv_helloworld);
        tv_hw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(it);
            }
        });

    }
}
