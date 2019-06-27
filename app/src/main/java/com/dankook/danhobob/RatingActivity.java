package com.dankook.danhobob;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class RatingActivity extends AppCompatActivity {

    private static final int VIEW_NUM = 9;

    RelativeLayout[] relativeLayouts = new RelativeLayout[VIEW_NUM + 1];
    LinearLayout linearLayout;

    ImageView[] foodImgs = new ImageView[VIEW_NUM];
    TextView[] foodTxts = new TextView[VIEW_NUM];
    RatingBar[] ratingBars = new RatingBar[VIEW_NUM];

    Button submitButton;

    String[] foodNames = {"떡볶이", "햄버거", "피자", "막국수", "냉모밀", "국밥", "찜닭", "짜장면", "짬뽕"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        submitButton = new Button(this);

        linearLayout = findViewById(R.id.layout_linear);

        RelativeLayout.LayoutParams imageParams = new RelativeLayout.LayoutParams(256, 256);

        RelativeLayout.LayoutParams textParams = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        RelativeLayout.LayoutParams ratingParams = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        LinearLayout.LayoutParams submitParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        submitButton.setLayoutParams(submitParams);
        submitButton.setTextSize(32);
        submitButton.setText("확인!");

        textParams.setMargins(270, 0, 0, 0);

        for (int i = 0; i < VIEW_NUM; i++) {
            relativeLayouts[i] = new RelativeLayout(this);

            foodImgs[i] = new ImageView(this);
            foodTxts[i] = new TextView(this);
            ratingBars[i] = new RatingBar(this);

            foodTxts[i].setTextSize(20);

            foodImgs[i].setLayoutParams(imageParams);
            foodTxts[i].setLayoutParams(textParams);
            ratingBars[i].setLayoutParams(ratingParams);

            imageParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
            textParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
            ratingParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);

            foodImgs[i].setImageResource(R.drawable.food1);
            foodTxts[i].setText(foodNames[i]);
        }

        foodImgs[0].setImageResource(R.drawable.food1);
        foodImgs[1].setImageResource(R.drawable.food2);
        foodImgs[2].setImageResource(R.drawable.food3);
        foodImgs[3].setImageResource(R.drawable.food4);
        foodImgs[4].setImageResource(R.drawable.food5);
        foodImgs[5].setImageResource(R.drawable.food6);
        foodImgs[6].setImageResource(R.drawable.food7);
        foodImgs[7].setImageResource(R.drawable.food8);
        foodImgs[8].setImageResource(R.drawable.food9);

        int i;

        for (i = 0; i < VIEW_NUM; i++) {
            relativeLayouts[i].addView(foodImgs[i]);
            relativeLayouts[i].addView(foodTxts[i]);
            relativeLayouts[i].addView(ratingBars[i]);

            linearLayout.addView(relativeLayouts[i]);
        }

        relativeLayouts[i] = new RelativeLayout(this);
        relativeLayouts[i].addView(submitButton);
        linearLayout.addView(relativeLayouts[i]);
    }
}