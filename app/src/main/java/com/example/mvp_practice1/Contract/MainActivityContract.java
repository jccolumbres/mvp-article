package com.example.mvp_practice1.Contract;

import android.content.Context;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;

public interface MainActivityContract {

    interface View{
        void showInfo(String info);
        void showError(String error);
    }

    interface Presenter{
        void saveDetails(
                String firstName,
                String lastName,
                String address,
                String age);
        void loadDetails();
        void goToLogin(Context ctx);
    }
}
