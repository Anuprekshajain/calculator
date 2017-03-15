package com.gamecodeschool.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class activity2 extends AppCompatActivity {
    private static TextView t1;
    private static RatingBar rate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        listenerForRatingBar();
    }
    public void listenerForRatingBar(){
        rate=(RatingBar)findViewById(R.id.ratingBar);
        t1=(TextView)findViewById(R.id.textView);
        rate.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {

                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean b) {
                        t1.setText(String.valueOf(rating));

                    }

                }

        );

}

}
