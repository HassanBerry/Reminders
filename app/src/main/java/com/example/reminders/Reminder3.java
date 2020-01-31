package com.example.reminders;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class Reminder3 extends AppCompatActivity {


    private static SeekBar seekBar;
    private static TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder3);
        seekbar();
    }

    public void seekbar(){

        seekBar = (SeekBar)findViewById(R.id.seekBar);
        textView = (TextView) findViewById(R.id.textView4);
        textView.setText("Selection is: " + seekBar.getProgress() + "/" + seekBar.getMax());



        seekBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    int progressValue;

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progressValue = progress;
                        textView.setText("Selection is: " + progress + "/" + seekBar.getMax());
                        Toast.makeText(Reminder3.this, "SeekBar in progress", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        Toast.makeText(Reminder3.this, "SeekBar in startTracking", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                        textView.setText("Selection is: " + progressValue + "/" + seekBar.getMax());
                        Toast.makeText(Reminder3.this, "SeekBar in stopTracking", Toast.LENGTH_LONG).show();
                    }
                    }



        );



    }


}
