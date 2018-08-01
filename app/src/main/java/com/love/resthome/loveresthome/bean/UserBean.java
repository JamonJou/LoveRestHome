package com.love.resthome.loveresthome.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.love.resthome.loveresthome.BR;
/**
  * BaseObservable
  * 一个纯净的 ViewModel 类被更新后，并不会让 UI 自动更新。
  * 而数据绑定后，我们自然会希望数据变更后 UI 会即时刷新，Observable 就是为此而生的概念
  * <p>
  * BaseObservable 提供了 notifyChange() 和 notifyPropertyChanged() 两个方法，
  * 前者会刷新所有的值域，后者则只更新对应 BR 的 flag，该 BR 的生成通过注释 @Bindable 生成，可以通过 BR notify 特定属性关联的视图
  */

public class UserBean extends BaseObservable{

    @Bindable
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        notifyPropertyChanged(BR.userName);
    }

    @Bindable
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
        notifyPropertyChanged(BR.nickName);
    }


    private String userName;
    private String nickName;


}
