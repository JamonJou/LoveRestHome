package com.love.resthome.loveresthome.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.love.resthome.loveresthome.R;
import com.love.resthome.loveresthome.utils.CodeUtils;

public class LoginActivity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_step1);
        imageView = (ImageView) findViewById(R.id.image_code_random);

        imageView.setImageBitmap(CodeUtils.getInstance().createBitmap());

    }
}
