package com.love.resthome.loveresthome.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.love.resthome.loveresthome.R;
import com.love.resthome.loveresthome.bean.UserBean;
import com.love.resthome.loveresthome.databinding.RegisterBinding;
import com.love.resthome.loveresthome.handler.RegisterHandler;

public class RegisterActivity extends AppCompatActivity {
    private static final String TAG = "RegisterActivity";
    private RegisterBinding registerBinding;

    private UserBean user;
    private RegisterHandler rh;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        registerBinding = DataBindingUtil.setContentView(this, R.layout.activity_register);

        user = new UserBean();
        rh = new RegisterHandler();
        registerBinding.setUserBean(user);
        registerBinding.setRegisterHandler(rh);


    }
}
