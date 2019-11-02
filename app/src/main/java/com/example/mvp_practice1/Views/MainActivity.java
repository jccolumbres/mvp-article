package com.example.mvp_practice1.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mvp_practice1.Contract.MainActivityContract;
import com.example.mvp_practice1.Presenter.MainActivityPresenter;
import com.example.mvp_practice1.R;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View, View.OnClickListener {

    private MainActivityContract.Presenter mPresenter;

    private TextView mDetailsDisplay;
    private EditText mFirstName;
    private EditText mLastName;
    private EditText mAddress;
    private EditText mAge;
    private Button mSaveBtn;
    private Button mResetBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        mPresenter = new MainActivityPresenter(this);
    }

    private void initView() {
        mDetailsDisplay = findViewById(R.id.tvDetails);
        mFirstName = findViewById(R.id.etFirstName);
        mLastName = findViewById(R.id.etLastName);
        mAddress = findViewById(R.id.etAddress);
        mAge = findViewById(R.id.etAge);
        mSaveBtn = findViewById(R.id.btnSaveDetails);
        mResetBtn = findViewById(R.id.btnReset);

        mSaveBtn.setOnClickListener(this);
        mResetBtn.setOnClickListener(this);
    }

    @Override
    public void showInfo(String info) {
        mDetailsDisplay.setText(info);
    }

    @Override
    public void showError(String error) {
        mDetailsDisplay.setText(error);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSaveDetails:
                mPresenter.saveDetails(
                        mFirstName.getText().toString(),
                        mLastName.getText().toString(),
                        mAddress.getText().toString(),
                        mAge.getText().toString());
                break;
            case R.id.btnReset:
                mPresenter.goToLogin(this);
                break;
        }
    }
}
