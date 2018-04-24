package com.nikpatel.digitalgrow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nikpatel.digitalgrow.Alarm.AlarmActivity;
import com.nikpatel.digitalgrow.Alert.Alert_Activity;
import com.nikpatel.digitalgrow.AutoComplete.AutoCompleteActivity;
import com.nikpatel.digitalgrow.Button.Btn_preActivity;
import com.nikpatel.digitalgrow.CustomGridView.CustomGridActivity;
import com.nikpatel.digitalgrow.Date_Time_Picker.Date_TimePicker;
import com.nikpatel.digitalgrow.Form.OnclickActivity;
import com.nikpatel.digitalgrow.Fragment.Fragment_main;
import com.nikpatel.digitalgrow.GraphView.GraphViewActivity;
import com.nikpatel.digitalgrow.GridView.GridActivity;
import com.nikpatel.digitalgrow.ListView.ListActivity;
import com.nikpatel.digitalgrow.ListView.List_Activity;
import com.nikpatel.digitalgrow.Menu.MenuActivity;
import com.nikpatel.digitalgrow.Navigation.NavigationActivity;
import com.nikpatel.digitalgrow.Notification.NotificationActivityDemo;
import com.nikpatel.digitalgrow.OnActivityResult.MainActivityResult;
import com.nikpatel.digitalgrow.PickImageGallery.GalleryMainActivity;
import com.nikpatel.digitalgrow.RatingBar.Activity_Rating_bar;
import com.nikpatel.digitalgrow.RecyclerViewDemo.RecycleViewDemo;
import com.nikpatel.digitalgrow.ServiceDemo.ServiceActivityDemo;
import com.nikpatel.digitalgrow.SharePreference.ShareActivity;
import com.nikpatel.digitalgrow.Spinner.SpinnerActivity;
import com.nikpatel.digitalgrow.Table.TableActivity;
import com.nikpatel.digitalgrow.Validation.RegistartionActivity;
import com.nikpatel.digitalgrow.WebView.WebViewActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

   Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,
           btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25,btn26;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btn10=(Button)findViewById(R.id.btn10);
        btn11=(Button) findViewById(R.id.btn11);
        btn12=(Button) findViewById(R.id.btn12);
        btn13=(Button) findViewById(R.id.btn13);
        btn14=(Button) findViewById(R.id.btn14);
        btn15=(Button) findViewById(R.id.btn15);
        btn16=(Button) findViewById(R.id.btn16);
        btn17=(Button) findViewById(R.id.btn17);
        btn18=(Button) findViewById(R.id.btn18);
        btn19=(Button) findViewById(R.id.btn19);
        btn20=(Button) findViewById(R.id.btn20);
        btn21=(Button) findViewById(R.id.btn21);
        btn22=(Button) findViewById(R.id.btn22);
        btn23=(Button) findViewById(R.id.btn23);
        btn24=(Button) findViewById(R.id.btn24);
        btn25=(Button) findViewById(R.id.btn25);
        btn26=(Button) findViewById(R.id.btn26);


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
        btn14.setOnClickListener(this);
        btn15.setOnClickListener(this);
        btn16.setOnClickListener(this);
        btn17.setOnClickListener(this);
        btn18.setOnClickListener(this);
        btn19.setOnClickListener(this);
        btn20.setOnClickListener(this);
        btn21.setOnClickListener(this);
        btn22.setOnClickListener(this);
        btn23.setOnClickListener(this);
        btn24.setOnClickListener(this);
        btn25.setOnClickListener(this);
        btn26.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
                startActivity(new Intent(this,Btn_preActivity.class));
                break;
            case R.id.btn2:
                startActivity(new Intent(this,OnclickActivity.class));
                break;

            case R.id.btn3:
                startActivity(new Intent(this,TableActivity.class));
                break;

            case R.id.btn4:
                startActivity(new Intent(this,Activity_Rating_bar.class));
                break;

            case R.id.btn5:
                startActivity(new Intent(this,SpinnerActivity.class));
                break;

            case R.id.btn6:
                startActivity(new Intent(this,Alert_Activity.class));
                break;

            case R.id.btn7:
                startActivity(new Intent(this,WebViewActivity.class));
                break;
            case R.id.btn8:
                startActivity(new Intent(this,Date_TimePicker.class));
                break;
            case R.id.btn9:
                startActivity(new Intent(this,ListActivity.class));
                break;
            case R.id.btn10:
                startActivity(new Intent(this,List_Activity.class));
                break;
            case R.id.btn11:
                startActivity(new Intent(this,GridActivity.class));
                break;
            case R.id.btn12:
                startActivity(new Intent(this,CustomGridActivity.class));
                break;
            case R.id.btn13:
                startActivity(new Intent(this,MenuActivity.class));
                break;
            case R.id.btn14:
                startActivity(new Intent(this,Fragment_main.class));
                break;
            case R.id.btn15:
                startActivity(new Intent(this,NavigationActivity.class));
                break;
            case R.id.btn16:
                startActivity(new Intent(this,ShareActivity.class));
                break;
            case R.id.btn17:
                startActivity(new Intent(this,AutoCompleteActivity.class));
                break;
            case R.id.btn18:
                startActivity(new Intent(this,RecycleViewDemo.class));
                break;
            case R.id.btn19:
                startActivity(new Intent(this,RecycleViewDemo.class));
                break;
            case R.id.btn20:
                startActivity(new Intent(this,MainActivityResult.class));
                break;
            case R.id.btn21:
                startActivity(new Intent(this,GalleryMainActivity.class));
                break;
            case R.id.btn22:
                startActivity(new Intent(this,ServiceActivityDemo.class));
                break;
            case R.id.btn23:
                startActivity(new Intent(this,NotificationActivityDemo.class));
                break;
            case R.id.btn24:
                startActivity(new Intent(this,AlarmActivity.class));
                break;
            case R.id.btn25:
                startActivity(new Intent(this,RegistartionActivity.class));
                break;
            case R.id.btn26:
                startActivity(new Intent(this,GraphViewActivity.class));
                break;
        }
    }
}
