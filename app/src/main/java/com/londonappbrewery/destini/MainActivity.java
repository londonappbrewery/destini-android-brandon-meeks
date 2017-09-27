package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStory;
    private Button mButtonTop;
    private Button mButtonBottom;
    private int mStoryIndex = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStory = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mStoryIndex = mStoryIndex + 1;
                updateStory();
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mStoryIndex = mStoryIndex + 5;
                updateStory();
            }
        });

    }

    public void updateStory() {
        if (mStoryIndex == 2) {
            mStory.setText(R.string.T3_Story);
            mButtonTop.setText(R.string.T3_Ans1);
            mButtonBottom.setText(R.string.T3_Ans2);
        } else if (mStoryIndex == 3) {
            mStory.setText(R.string.T6_End);
            mButtonTop.setVisibility(View.GONE);
            mButtonBottom.setVisibility(View.GONE);
        } else if (mStoryIndex == 5) {
            mStory.setText(R.string.T5_End);
            mButtonTop.setVisibility(View.GONE);
            mButtonBottom.setVisibility(View.GONE);
        } else if (mStoryIndex == 6) {
            mStory.setText(R.string.T2_Story);
            mButtonTop.setText(R.string.T2_Ans1);
            mButtonBottom.setText(R.string.T2_Ans2);
        } else if (mStoryIndex == 7) {
            mStory.setText(R.string.T3_Story);
            mButtonTop.setText(R.string.T3_Ans1);
            mButtonBottom.setText(R.string.T3_Ans2);
        } else if (mStoryIndex == 8) {
            mStory.setText(R.string.T6_End);
            mButtonTop.setVisibility(View.GONE);
            mButtonBottom.setVisibility(View.GONE);
        } else if (mStoryIndex == 11) {
            mStory.setText(R.string.T4_End);
            mButtonTop.setVisibility(View.GONE);
            mButtonBottom.setVisibility(View.GONE);
        } else if (mStoryIndex == 12) {
            mStory.setText(R.string.T5_End);
            mButtonTop.setVisibility(View.GONE);
            mButtonBottom.setVisibility(View.GONE);
        } else {
            mStory.setText(R.string.T1_Story);
            mButtonTop.setText(R.string.T1_Ans1);
            mButtonBottom.setText(R.string.T1_Ans2);
        }
    }
}
