package com.example.sound_laug;
import android.R;
import android.media.MediaPlayer;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

import java.io.File;

public class sound_play {


    public static void play_sound_progress(SeekBar seekBar, MediaPlayer mediaPlayer){
        seekBar.setMax(mediaPlayer.getDuration());

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    mediaPlayer.seekTo(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                mediaPlayer.pause();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                mediaPlayer.start();
            }
        });

    }

    public static void on_sound_play(TextView textView,TextView name,MediaPlayer mediaPlayer){
        if (mediaPlayer.isPlaying()){
            try {
                String nplayer="Spielen:"+name.getText().toString();
                textView.setText(nplayer);
            }catch (Exception e){
                e.printStackTrace();
            }
        }else {
            textView.setText("Spielen:");
        }
    }

    public static void player_done(MediaPlayer mediaPlayer,TextView textView,SeekBar seekBar){
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                if (!mediaPlayer.isPlaying()){
                    textView.setText("Spielen:");
                    seekBar.setProgress(0);
                }
            }
        });
    }


}
