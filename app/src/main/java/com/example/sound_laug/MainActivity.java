package com.example.sound_laug;


import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnclick();

    }
    private Button guantouxiao_but,guantouxiao2_but,otto_but1,otto_but2,otto_but3,geye_but;
    private MediaPlayer mediaPlayer,mediaPlayer1,mediaPlayer2,mediaPlayer3,mediaPlayer4,mediaPlayer5,mediaPlayersing;
    private SeekBar guantouxiaoseek1,guantouxiaoseek2,ottosk1,ottosk2,ottosk3,geyesk;

    Handler handler=new Handler();

    private void btnclick(){
        guantouxiao_but=(Button) findViewById(R.id.guantouxiao);
        guantouxiao2_but=(Button) findViewById(R.id.gouantouxiao2);
        otto_but1=(Button)findViewById(R.id.ottoneexr2);
        otto_but2=(Button)findViewById(R.id.ottocc1);
        otto_but3=(Button)findViewById(R.id.ottodjt);
        geye_but=(Button)findViewById(R.id.gaye);

        mediaPlayer=MediaPlayer.create(this,R.raw.guantouxiao1);
        mediaPlayer1=MediaPlayer.create(this,R.raw.guantouxiao2);
        mediaPlayer2=MediaPlayer.create(this,R.raw.exinrniyougedua);
        mediaPlayer3=MediaPlayer.create(this,R.raw.ccc);
        mediaPlayer4=MediaPlayer.create(this,R.raw.daojiadojbtingmong);
        mediaPlayer5=MediaPlayer.create(this,R.raw.gaye);

        guantouxiaoseek1=findViewById(R.id.guantxskd);
        guantouxiaoseek2=findViewById(R.id.guantouxiao2_sk);
        ottosk1=findViewById(R.id.otto3_sk);
        ottosk2=findViewById(R.id.otto4_sk);
        ottosk3=findViewById(R.id.otto5_sk);
        geyesk=findViewById(R.id.geye6_sk);

        //sound_play.play_sound_progress(seekBar,mediaPlayer);



        guantouxiao_but.setOnClickListener(new View.OnClickListener() {     //罐头笑
            @Override
            public void onClick(View view) {
                sound_play.play_sound_progress(guantouxiaoseek1,mediaPlayer);
                if (mediaPlayer.isPlaying()){
                    mediaPlayer.stop();
                }else {
                    mediaPlayer.start();
                    media_play_seek(mediaPlayer,guantouxiaoseek1);
                    sound_play.on_sound_play(findViewById(R.id.now_playing),findViewById(R.id.soundname1),mediaPlayer);
                    sound_play.player_done(mediaPlayer,findViewById(R.id.now_playing),guantouxiaoseek1);
                }
            }
        });

        guantouxiao2_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound_play.play_sound_progress(guantouxiaoseek2,mediaPlayer1);
                if (mediaPlayer1.isPlaying()){
                    mediaPlayer1.pause();
                }else {
                    mediaPlayer1.start();
                    media_play_seek(mediaPlayer1,guantouxiaoseek2);
                    sound_play.on_sound_play(findViewById(R.id.now_playing),findViewById(R.id.soundname2),mediaPlayer1);
                    sound_play.player_done(mediaPlayer1,findViewById(R.id.now_playing),guantouxiaoseek2);
                }
            }
        });

        otto_but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound_play.play_sound_progress(ottosk1,mediaPlayer2);
                if (mediaPlayer2.isPlaying()){
                    mediaPlayer2.pause();
                }else {
                    mediaPlayer2.start();
                    media_play_seek(mediaPlayer2,ottosk1);
                    sound_play.on_sound_play(findViewById(R.id.now_playing),findViewById(R.id.soundname3),mediaPlayer2);
                    sound_play.player_done(mediaPlayer2,findViewById(R.id.now_playing),ottosk1);
                }
            }
        });

        otto_but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound_play.play_sound_progress(ottosk2,mediaPlayer3);
                if (mediaPlayer3.isPlaying()){
                    mediaPlayer3.pause();
                }else {
                    mediaPlayer3.start();
                    media_play_seek(mediaPlayer3,ottosk2);
                    sound_play.on_sound_play(findViewById(R.id.now_playing),findViewById(R.id.soundname4),mediaPlayer3);
                    sound_play.player_done(mediaPlayer3,findViewById(R.id.now_playing),ottosk2);
                }
            }
        });

        otto_but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound_play.play_sound_progress(ottosk3,mediaPlayer4);
                if (mediaPlayer4.isPlaying()){
                    mediaPlayer4.pause();
                }else {
                    mediaPlayer4.start();
                    media_play_seek(mediaPlayer4,ottosk3);
                    sound_play.on_sound_play(findViewById(R.id.now_playing),findViewById(R.id.soundname5),mediaPlayer4);
                    sound_play.player_done(mediaPlayer4,findViewById(R.id.now_playing),ottosk3);
                }
            }
        });

        geye_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound_play.play_sound_progress(geyesk,mediaPlayer5);
                if (mediaPlayer5.isPlaying()){
                    mediaPlayer5.pause();
                }else {
                    mediaPlayer5.start();
                    media_play_seek(mediaPlayer5,geyesk);
                    sound_play.on_sound_play(findViewById(R.id.now_playing),findViewById(R.id.soundname6),mediaPlayer5);
                    sound_play.player_done(mediaPlayer5,findViewById(R.id.now_playing),geyesk);
                }
            }
        });

    }





    //das wr
private void media_play_seek(MediaPlayer mediaPlayer_s,SeekBar seekBar_s){
    MainActivity.this.runOnUiThread(new Runnable() {
        @Override
        public void run() {
        if (mediaPlayer_s!=null){
            int currentpos=mediaPlayer_s.getCurrentPosition();
            seekBar_s.setProgress(currentpos);
        }
        handler.postDelayed(this,1000);
        }
    });
}






}