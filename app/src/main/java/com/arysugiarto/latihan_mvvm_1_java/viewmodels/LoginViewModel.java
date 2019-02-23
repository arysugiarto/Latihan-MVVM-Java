package com.arysugiarto.latihan_mvvm_1_java.viewmodels;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.BR;
import com.arysugiarto.latihan_mvvm_1_java.model.User;

public class LoginViewModel extends BaseObservable {
    private User user;

    private String successMesage = "Login was Successful";
    private String errorMessage = "Email or Passowrd not valid";

    @Bindable
    public String toastMessage = null;

    public String getToastMessage(){
        return toastMessage;
    }

    private void setToastMessage(String toastMessage){
        this.toastMessage = toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }

    public LoginViewModel(){
        user = new User("","");
    }
    public void afterEmailTextChanged(CharSequence s){
        user.setEmail(s.toString());
    }
    public void afterPasswordTextChanged(CharSequence s) {
        user.setPassword(s.toString());
    }
    public void onLoginClicked(){
        if (user.isInputDataValid())
            setToastMessage(successMesage);
        else
            setToastMessage(errorMessage);
    }
}
