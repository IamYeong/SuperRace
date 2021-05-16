package com.iamyeong.superrace;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class UsualDialog extends Dialog {

    private Button btn_confirm, btn_cancel;
    private TextView tv_msg;
    private String msg;

    public UsualDialog(@NonNull Context context, String msg) {
        super(context);

        this.msg = msg;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.usual_dialog_two_button);

        setCancelable(true);

        btn_confirm = findViewById(R.id.btn_usual_dialog_confirm);
        btn_cancel = findViewById(R.id.btn_usual_dialog_cancel);
        tv_msg = findViewById(R.id.tv_dialog_two_button);
        tv_msg.setText(msg);

        btn_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Click confirm button

                System.out.println("Confirm");

                dismiss();
            }
        });

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Click cancel button
                System.out.println("Cancel");
                dismiss();
            }
        });

    }
}
