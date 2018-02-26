package com.training.vungoctuan.mvpdemo.activity.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.training.vungoctuan.mvpdemo.MvpApp;
import com.training.vungoctuan.mvpdemo.R;
import com.training.vungoctuan.mvpdemo.activity.main.MainActivity;
import com.training.vungoctuan.mvpdemo.model.DataManager;
import com.training.vungoctuan.mvpdemo.utils.CommonUtils;
import com.training.vungoctuan.mvpdemo.view.BaseActivity;

/**
 * Created by vungoctuan on 2/26/18.
 */
public class LoginActivity extends BaseActivity implements LoginMvpView{
    LoginPresenter mLoginPresenter;
    EditText mEditTextEmail, getmEditTextPassword;
    Button mButton;

    public static Intent getStartIntent(Context context) {
        return new Intent(context, LoginActivity.class);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        DataManager dataManager = ((MvpApp) getApplication()).getmDataManager();
        mLoginPresenter = new LoginPresenter(dataManager);
        mLoginPresenter.onAttach(this);

        mEditTextEmail = findViewById(R.id.editTextEmail);
        getmEditTextPassword = findViewById(R.id.editTextPassword);
        mButton = findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onLoginButtonClick();
            }
        });


    }

    @Override
    public void openMainActivity() {
        Intent intent = MainActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }

    @Override
    public void onLoginButtonClick() {
        String emailId = mEditTextEmail.getText().toString();
        String password = getmEditTextPassword.getText().toString();

        if (!CommonUtils.isEmailValid(emailId)) {
            Toast.makeText(this, "Enter correct Email", Toast.LENGTH_LONG).show();
            return;
        }

        if (password == null || password.isEmpty()) {
            Toast.makeText(this, "Enter Password", Toast.LENGTH_LONG).show();
            return;
        }

        mLoginPresenter.startLogin(emailId);
    }
}
