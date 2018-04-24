package com.nikpatel.digitalgrow.Alert;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.nikpatel.digitalgrow.R;

public class Alert_Activity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "Alert_Activity";

    private Button btnAlert,btnYes,btnCancle;

    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);

        btnAlert = (Button) findViewById(R.id.btnAlert);
        btnYes = (Button) findViewById(R.id.btnYes);
        btnCancle = (Button) findViewById(R.id.btnCancle);

        progressDialog = new ProgressDialog(this);

        btnAlert.setOnClickListener(this);
        btnYes.setOnClickListener(this);
        btnCancle.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btnAlert:
                Log.e(TAG, "onClick: " );

                AlertDialog.Builder alert = new AlertDialog.Builder(this);
                alert.setTitle("Alert");
                alert.setMessage("Alert");
                alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Alert_Activity.this, "you click OK button", Toast.LENGTH_SHORT).show();
                    }
                });
                alert.show();
                break;
            case  R.id.btnYes:
                AlertDialog.Builder alert1 = new AlertDialog.Builder(this);
                alert1.setTitle("Alert");
                alert1.setMessage("Alert");
                alert1.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Alert_Activity.this, "you click YES button", Toast.LENGTH_SHORT).show();
                    }
                });
                alert1.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Alert_Activity.this, "you click NO button", Toast.LENGTH_SHORT).show();

                    }
                });
                alert1.show();
                break;
            case R.id.btnCancle:
                AlertDialog.Builder alert2 = new AlertDialog.Builder(this);
                alert2.setTitle("Alert");
                alert2.setMessage("Alert");
                alert2.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Alert_Activity.this, "you click YES button", Toast.LENGTH_SHORT).show();
                    }
                });
                alert2.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Alert_Activity.this, "you click NO button", Toast.LENGTH_SHORT).show();

                    }
                });
                alert2.setNeutralButton("Cancle", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Alert_Activity.this, "you click Cancle button", Toast.LENGTH_SHORT).show();
                    }
                });
                alert2.show();
                break;
        }

    }
}
