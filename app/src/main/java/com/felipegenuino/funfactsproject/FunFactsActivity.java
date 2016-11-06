package com.felipegenuino.funfactsproject;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class FunFactsActivity extends AppCompatActivity {
    private MythBook mMythBook = new MythBook();
    private ColorWheel mColorWheel = new ColorWheel();

    //Declare out view variables
    private TextView mUxMythTitle;
    private Button mUxMythButton;
    private RelativeLayout mRelativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Assing the Views from the layout file to the corresponding variables
        mUxMythTitle = (TextView) findViewById(R.id.UxMythTitle);
        mUxMythButton = (Button) findViewById(R.id.UxMythButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.UxMythRelativeLayout);


        View.OnClickListener listener =  new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String myth = mMythBook.getMyth();
                int color = mColorWheel.getColor();

                //update de screen with our dynamic fact
                mUxMythTitle.setText(myth);
                mRelativeLayout.setBackgroundColor(color);
                mUxMythButton.setTextColor(color);

             }
        };

        mUxMythButton.setOnClickListener(listener);

    }
}
