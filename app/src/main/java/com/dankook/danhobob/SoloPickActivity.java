package com.dankook.danhobob;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class SoloPickActivity extends AppCompatActivity {

    ImageView imageViews;
    TextView foodNames;
    TextView foodExplain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solo_pick);

        imageViews = findViewById(R.id.img_food);
        foodNames = findViewById(R.id.tv_food);
        foodExplain = findViewById(R.id.tv_expain_food);

        Random random = new Random();
        int num = random.nextInt(5);

        switch (num) {
            case 0:
                imageViews.setImageResource(R.drawable.pick1);
                foodNames.setText("마라탕");
                foodExplain.setText("오늘은" + WeatherByGPS.getLocation() + "에" + WeatherByGPS.getWeather() + "가 꼈네! 날씨가 추우니까 따뜻한 면인 마라탕을 먹는 것을 추천한단호밥!\n\n맛있는 마라탕 먹고 힘내랏!");
                break;
            case 1:
                imageViews.setImageResource(R.drawable.pick2);
                foodNames.setText("막국수");
                foodExplain.setText("오늘은 날씨가 비도 오고 꾸리꾸리하니까, 시원한 막국수 한사발 먹는 것을 추천한단호밥!\n\n막국수 먹고 좋은 하루 보내시길! ٩(◦`꒳´◦)۶");
                break;
            case 2:
                imageViews.setImageResource(R.drawable.pick3);
                foodNames.setText("햄버거");
                foodExplain.setText("오늘은 날씨가 맑고 적당하니까, 식감있는 햄버거 한번 잡솨보라굿!\n나 단호밥이 귀찮을 때 적극 추천한단호밥~_~");
            case 3:
                imageViews.setImageResource(R.drawable.pick4);
                foodNames.setText("초밥");
                foodExplain.setText("오늘은 바람이 많이 부니까, 살아있는 초밥 한번 먹어보라굿!\n나 단호밥이 정말 좋아한단호밥 ٩(◦`꒳´◦)۶");
            case 4:
                imageViews.setImageResource(R.drawable.pick5);
                foodNames.setText("간장게장");
                foodExplain.setText("오늘은 바람이 많이 부니까, 짭쪼롬한 간장게장 한번 잡솨보라굿!\n나 단호밥도 먹고싶단호밥+_+");

        }
    }
}