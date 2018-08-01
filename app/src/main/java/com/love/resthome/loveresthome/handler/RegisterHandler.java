package com.love.resthome.loveresthome.handler;

import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

import com.love.resthome.loveresthome.MyApplication;
import com.love.resthome.loveresthome.activity.RegisterActivity;
import com.love.resthome.loveresthome.bean.UserBean;


public class RegisterHandler {
    private static final String TAG = "RegisterHandler";

    public void register(UserBean user) {
        Log.i(TAG, "RegisterHandler->register");
        Toast.makeText(MyApplication.getInstance(), "register ok! " + user.getUserName(), Toast.LENGTH_LONG).show();
        if (TextUtils.isEmpty(user.getUserName()) {
            Toast.makeText(MyApplication.getInstance(), "请输入用户名", Toast.LENGTH_SHORT).show();
        }
    }
}
