package com.nikpatel.digitalgrow.Menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.nikpatel.digitalgrow.R;

public class MenuActivity extends AppCompatActivity {

    private Toolbar toolBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        toolBar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolBar);

        final Button btn = (Button) findViewById(R.id.btnPop);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popup = new PopupMenu(MenuActivity.this,btn);

                popup.getMenuInflater().inflate(R.menu.optionmenu,popup.getMenu());

                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {

                        Toast.makeText(MenuActivity.this, "You Clicked:- "+menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });
                popup.show();

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.menu_home:
                Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_search:
                Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();

                return true;
            case R.id.menu_setting:
                Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();

                return true;
            case R.id.menu_exit:
                Toast.makeText(this, "Exit", Toast.LENGTH_SHORT).show();

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
