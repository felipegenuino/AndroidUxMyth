package com.felipegenuino.funfactsproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    //Declare out view variables
    private TextView mUxMythTitle;
    private Button mUxMythButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Assing the Views from the layout file to the corresponding variables
        mUxMythTitle = (TextView) findViewById(R.id.UxMythTitle);
        mUxMythButton = (Button) findViewById(R.id.UxMythButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] myths = {
                        "Myth #34: Simple = minimal",
                        "Myth #33: Mobile users are distracted",
                        "Myth #32: Success happens overnight",
                        "Myth #31: UX design is a step in a project",
                        "Myth #30: If you are an expert, you don’t need to test your design",
                        "Myth #29: People are rational",
                        "Myth #28: White space is wasted space",
                        "Myth #27: UX design is about usability",
                        "Myth #26: Usability testing = focus groups",
                        "Myth #25: Aesthetics are not important if you have good usability",
                        "Myth #24: People always use your product the way you imagined they would",
                        "Myth #23: Choices should always be limited to 7+/-2",
                        "Myth #22: Usability testing is expensive",
                        "Myth #21: People can tell you what they want",
                        "Myth #20: If it works for Amazon, it will work for you",
                        "Myth #19: You don't need the content to design a website",
                        "Myth #18: Flash is evil",
                        "Myth #17: The homepage is your most important page",
                        "Myth #16: Search will solve a website's navigation problems",
                        "Myth #15: Users make optimal choices",
                        "Myth #14: You are like your users",
                        "Myth #13: Icons enhance usability",
                        "Myth #12: More choices and features result in higher satisfaction",
                        "Myth #11: You need to redesign your website periodically",
                        "Myth #10: If your design is good, small details don't matter",
                        "Myth #9: Design has to be original",
                        "Myth #8: Stock photos improve the users' experience",
                        "Myth #7: Graphics will make a page element more visible",
                        "Myth #6: Accessible sites are ugly",
                        "Myth #5: Accessibility is expensive and difficult",
                        "Myth #4: Design is about making a website look good",
                        "Myth #3: People don't scroll",
                        "Myth #2: All pages should be accessible in 3 clicks",
                        "Myth #1: People read on the web"
                };

                String myth = "";

                //Randomly select a fact
                Random randomGenerator = new Random();

                int randomNumber = randomGenerator.nextInt(myths.length);
                myth = myths[randomNumber];

                //update de screen with our dynamic fact
                mUxMythTitle.setText(myth);
            }
        };

        mUxMythButton.setOnClickListener(listener);

    }
}
