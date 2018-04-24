package com.nikpatel.digitalgrow.Validation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.nikpatel.digitalgrow.R;

public class RegistartionActivity extends AppCompatActivity implements View.OnClickListener{


    EditText edtFName, edtLName, edtEmail, edtPass, edtCPass;
    Button btnSubmit;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registartion);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        init();
    }

    private void init() {

        edtFName = (EditText) findViewById(R.id.edtFname);
        edtLName = (EditText) findViewById(R.id.edtLname);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtPass = (EditText) findViewById(R.id.edtPassword);
        edtCPass = (EditText) findViewById(R.id.edtCPassword);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnSubmit:
                checkValication();
        }
    }

    private void checkValication() {

        if (CommonUtil.isNullString(edtFName.getText().toString())){
            Toast.makeText(this, "please enter First Name", Toast.LENGTH_SHORT).show();
        }else if (edtFName.length() < 2 || edtFName.length() > 20 ) {
            Toast.makeText(this, "First Name length not valid", Toast.LENGTH_SHORT).show();
        }else if (!CommonUtil.checkFirstLastName(edtFName.getText().toString())){
            Toast.makeText(this, "not valid first name", Toast.LENGTH_SHORT).show();
        }

        else if (CommonUtil.isNullString(edtLName.getText().toString())){
            Toast.makeText(this, "Please Enter Last Name", Toast.LENGTH_SHORT).show();
        }else if (edtLName.length() < 2 || edtLName.length() > 20 ) {
            Toast.makeText(this, "Last Name length not valid", Toast.LENGTH_SHORT).show();
        }else if (!CommonUtil.checkFirstLastName(edtLName.getText().toString())){
            Toast.makeText(this, "not valid last name", Toast.LENGTH_SHORT).show();
        }


        else if (CommonUtil.isNullString(edtEmail.getText().toString())){
            Toast.makeText(this, "Please Enter Email", Toast.LENGTH_SHORT).show();
        }
        else if (!CommonUtil.checkEmail(edtEmail.getText().toString())){
            Toast.makeText(this, "Please Enter Valid Email", Toast.LENGTH_SHORT).show();
        }


        else if (CommonUtil.isNullString(edtPass.getText().toString())){
            Toast.makeText(this, "Please Enter Password", Toast.LENGTH_SHORT).show();
        }else if (!CommonUtil.checkPassword(edtPass.getText().toString())){
            Toast.makeText(this, "Please Enter Valid Password", Toast.LENGTH_SHORT).show();
        }else if (edtPass.length() < 8 || edtPass.length() > 15){
            Toast.makeText(this, "Password length not valid", Toast.LENGTH_SHORT).show();
        }


        else if (CommonUtil.isNullString(edtCPass.getText().toString())){
            Toast.makeText(this, "Please Enter Confirm Password", Toast.LENGTH_SHORT).show();
        }else if (!CommonUtil.checkPassword(edtCPass.getText().toString())){
            Toast.makeText(this, "Please Enter Valid Confirm Password", Toast.LENGTH_SHORT).show();
        }else if (edtCPass.length() < 8 || edtCPass.length() > 15){
            Toast.makeText(this, "Confirm Password length not valid", Toast.LENGTH_SHORT).show();
        }else if (!(edtCPass.getText().toString().equals(edtPass.getText().toString()))){
            Toast.makeText(this, "password not match", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Succesfull", Toast.LENGTH_SHORT).show();
        }


    }
}
