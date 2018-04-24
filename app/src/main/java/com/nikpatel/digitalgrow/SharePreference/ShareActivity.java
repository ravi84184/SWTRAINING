package com.nikpatel.digitalgrow.SharePreference;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.nikpatel.digitalgrow.R;

public class ShareActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnSave,btnRetrive;
    EditText txtName,txtEmail;
    SharedPreferences sharedPreferences;

    public static final String myPref = "PREF";
    public static final String NAME = "namekey";
    public static final String EMAIL = "emailkey";

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnSave = (Button) findViewById(R.id.btnSave);
        btnRetrive = (Button) findViewById(R.id.btnRetrive);

        txtEmail = (EditText) findViewById(R.id.txtEmail);
        txtName = (EditText) findViewById(R.id.txtname);
        btnSave.setOnClickListener(this);
        btnRetrive.setOnClickListener(this);

//        final String emailPatt = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
//        String name = txtName.getText().toString();
//        final String email = txtEmail.getText().toString();
//
//        txtEmail.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//            }
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//            }
//            @Override
//            public void afterTextChanged(Editable editable) {
//                if (email.matches(emailPatt)){
//                    Toast.makeText(ShareActivity.this, "valid", Toast.LENGTH_SHORT).show();
//                }
//                else {
//                    Toast.makeText(ShareActivity.this, "Invalid", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.btnSave:
                String emailPatt = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
                String name = txtName.getText().toString();
                String email = txtEmail.getText().toString();



                if (name.equals("") || email.equals("")){
                    Toast.makeText(this, "please enter value", Toast.LENGTH_SHORT).show();
                }
                else {
                    sharedPreferences = getSharedPreferences(myPref, Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString(NAME,name);
                    editor.putString(EMAIL,email);

//                    editor.commit();
                    editor.apply();

                    txtName.setText("");
                    txtEmail.setText("");
                }




                break;
            case R.id.btnRetrive:

                sharedPreferences = getSharedPreferences(myPref,Context.MODE_PRIVATE);

                if (sharedPreferences.contains(NAME)){
                    txtName.setText(sharedPreferences.getString(NAME,""));
                }
                if (sharedPreferences.contains(EMAIL)){
                    txtEmail.setText(sharedPreferences.getString(EMAIL,""));
                }

                break;

        }

    }
}
