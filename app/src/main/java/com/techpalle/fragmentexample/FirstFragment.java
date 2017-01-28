package com.techpalle.fragmentexample;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {
    //Declare all variables
    EditText editText1, editText2;
    Button button;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_first, container, false);
        editText1 = (EditText) v.findViewById(R.id.edit_text1);
        editText2 = (EditText) v.findViewById(R.id.edit_text2);
        button = (Button) v.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //read data from edit text
                String username = editText1.getText().toString();

                //pass to MainActivity/Parent Activity
                MainActivity m = (MainActivity) getActivity();
                //getActivity() is a pre-defined method, Which returns parent object Fragment/Parent Activity of the fragment
                m.passData(username);
            }
        });
        return v;
    }
}
