package com.iamyeong.superrace;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link UserRullsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class UserRullsFragment extends Fragment {

    private CheckBox box_service_rule, box_privacy_rule, box_message, box_all;
    private Button btn_next;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public UserRullsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment UserRullsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static UserRullsFragment newInstance(String param1, String param2) {
        UserRullsFragment fragment = new UserRullsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_user_rulls, container, false);


        allFindViewById(view);

        System.out.println(box_all.isChecked());


        box_all.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                System.out.println(isChecked);

                if (isChecked) {
                    box_service_rule.setChecked(true);
                    box_privacy_rule.setChecked(true);
                    box_message.setChecked(true);

                } else {

                    box_service_rule.setChecked(false);
                    box_privacy_rule.setChecked(false);
                    box_message.setChecked(false);
                }




            }
        });


        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Toast.makeText(getActivity(), "다음 버튼 클릭", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    private void allFindViewById(View view) {

        box_all = view.findViewById(R.id.box_all_agree);
        box_service_rule = view.findViewById(R.id.box_rulls_agree);
        box_privacy_rule = view.findViewById(R.id.box_privacy_agree);
        box_message = view.findViewById(R.id.box_message_agree);

        btn_next = view.findViewById(R.id.btn_next_agree);


    }

}