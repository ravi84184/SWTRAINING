package com.nikpatel.digitalgrow.RatingBar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

import com.nikpatel.digitalgrow.R;

import java.text.BreakIterator;

/**
 * Created by nikpatel on 19/08/17.
 */

public class Activity_Rating_bar extends AppCompatActivity {
    private static final String TAG = "Activity_Rating_bar";
    private TextView rate;
    private RatingBar ratingBar;
    private SeekBar seekBar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratingbar);
        ratingBar = (RatingBar) findViewById(R.id.rating_bar);
        rate = (TextView) findViewById(R.id.text);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                if ( v == ratingBar.getNumStars() ){
                    rate.setText(String .valueOf(v) +"  \n Bingoooo!!!!! ");
                }else {
                    rate.setText(String .valueOf(v));
                }
            }
        });
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Log.e(TAG, "onProgressChanged: "+ i );
                if (i == seekBar.getMax()) {

                    rate.setText(String .valueOf(i) +"  \n Bingoooo!!!!! ");
                }
                else {
                    rate.setText(String .valueOf(i));
                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
