package com.iamyeong.superrace.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.iamyeong.superrace.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et_id, et_pw;
    private Button btn_sign_in, btn_sign_up;
    private ImageView img_kakao, img_facebook, img_naver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        allFindViewById();
        allSetOnClickListener(LoginActivity.this);





    }

    private void allFindViewById() {

        et_id = findViewById(R.id.et_login_id);
        et_pw = findViewById(R.id.et_login_pw);

        btn_sign_in = findViewById(R.id.btn_sign_in);
        btn_sign_up = findViewById(R.id.btn_sign_up);

        img_kakao = findViewById(R.id.img_kakao);
        img_facebook = findViewById(R.id.img_facebook);
        img_naver = findViewById(R.id.img_naver);

    }

    private void allSetOnClickListener(View.OnClickListener listener) {

        btn_sign_in.setOnClickListener(listener);
        btn_sign_up.setOnClickListener(listener);

        img_kakao.setOnClickListener(listener);
        img_facebook.setOnClickListener(listener);
        img_naver.setOnClickListener(listener);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btn_sign_in :
                String id = et_id.getText().toString();
                String pw = et_pw.getText().toString();

                System.out.println(id + ", " + pw);

                break;

            case R.id.btn_sign_up :

                //Fragment
                break;

        }

    }
}