package com.example.soundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_1 = (ImageView) findViewById(R.id.btn_1);
        btn_1.setOnClickListener(playSelectedSound);

        btn_2 = (ImageView) findViewById(R.id.btn_2);
        btn_2.setOnClickListener(playSelectedSound);

        btn_3 = (ImageView) findViewById(R.id.btn_3);
        btn_3.setOnClickListener(playSelectedSound);

        btn_4 = (ImageView) findViewById(R.id.btn_4);
        btn_4.setOnClickListener(playSelectedSound);

        btn_5 = (ImageView) findViewById(R.id.btn_5);
        btn_5.setOnClickListener(playSelectedSound);

        btn_6 = (ImageView) findViewById(R.id.btn_6);
        btn_6.setOnClickListener(playSelectedSound);

        btn_7 = (ImageView) findViewById(R.id.btn_7);
        btn_7.setOnClickListener(playSelectedSound);

        btn_8 = (ImageView) findViewById(R.id.btn_8);
        btn_8.setOnClickListener(playSelectedSound);

        btn_9 = (ImageView) findViewById(R.id.btn_9);
        btn_9.setOnClickListener(playSelectedSound);


    }

    View.OnClickListener playSelectedSound = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // makes sure to stop sound as to not overlap
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }

            switch (v.getId()) {
                case R.id.btn_1:
                    mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.sound1);
                    break;

                case R.id.btn_2:
                    mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.sound2);
                    break;

                case R.id.btn_3:
                    mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.sound3);
                    break;

                case R.id.btn_4:
                    mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.sound4);
                    break;

                case R.id.btn_5:
                    mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.sound5);
                    break;

                case R.id.btn_6:
                    mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.sound6);
                    break;

                case R.id.btn_7:
                    mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.sound7);
                    break;

                case R.id.btn_8:
                    mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.sound8);
                    break;

                case R.id.btn_9:
                    mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.sound9);
                    break;
            }

            mediaPlayer.start();
        }
    };


    @Override
    protected void onDestroy() {
        super.onDestroy();
        mediaPlayer.release();
    }
}