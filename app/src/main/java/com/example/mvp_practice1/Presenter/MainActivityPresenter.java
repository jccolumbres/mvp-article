package com.example.mvp_practice1.Presenter;

import android.content.Context;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mvp_practice1.Contract.MainActivityContract;
import com.example.mvp_practice1.Model.User;
import com.example.mvp_practice1.Views.LoginActivity;

public class MainActivityPresenter implements MainActivityContract.Presenter {

    private User user;
    private MainActivityContract.View mView;

    public MainActivityPresenter(MainActivityContract.View mView) {
        this.user = new User();
        this.mView = mView;
    }

    @Override
    public void saveDetails(String firstName, String lastName, String address, String age) {
        if (firstName.isEmpty() || lastName.isEmpty() || address.isEmpty() || age.isEmpty()) {
            mView.showError("Invalid details.");
        } else {
            user.setmFirstName(firstName);
            user.setmLastName(lastName);
            user.setmAddress(address);
            user.setmAge(age);
            loadDetails();
        }
    }

    @Override
    public void loadDetails() {
        String message = user.getDetails();
        mView.showInfo(message);
    }

    @Override
    public void goToLogin(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
    }
}
