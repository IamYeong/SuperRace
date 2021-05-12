package com.iamyeong.superrace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et_id, et_pw;
    private Button btn_sign_in, btn_sign_up;
    private ImageView img_kakao, img_facebook, img_naver;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        allFindViewById();
        allSetOnClickListener(LoginActivity.this);

        btn_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                UserRullsFragment fragment = new UserRullsFragment();

                if (fragment.isAdded()) {
                    fragmentTransaction.remove(fragment);
                }

                fragmentManager = LoginActivity.this.getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();

                fragmentTransaction.add(R.id.constraint_login, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();


            }
        });



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