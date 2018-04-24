package com.nikpatel.digitalgrow.OnActivityResult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.nikpatel.digitalgrow.R;

public class SeconActivityResult extends AppCompatActivity {


    private Button btnPost;
    private EditText edtDate;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secon_result);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnPost = (Button) findViewById(R.id.btnPost);
        edtDate = (EditText) findViewById(R.id.edtdata);

        btnPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = edtDate.getText().toString();

                Intent intent = new Intent();
                intent.putExtra("POSTDATA",data);

                setResult(4,intent);

                finish();

            }
        });
    }
}
