package com.iamyeong.superrace;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class SingleDialog extends Dialog {

    private String msg;
    private Button btn_confirm;
    private TextView tv_msg;

    public SingleDialog(@NonNull Context context, String msg) {
        super(context);

        this.msg = msg;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.usual_dialog_one_button);
        setCancelable(true);

        btn_confirm = findViewById(R.id.btn_usual_dialog_one);
        tv_msg = findViewById(R.id.tv_dialog_one_button);
        tv_msg.setText(msg);

        btn_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                System.out.println("Single button!!");

                dismiss();
            }
        });

    }
}
