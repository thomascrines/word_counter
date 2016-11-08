package com.example.user.wordcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


/**
 * Created by user on 08/11/2016.
 */

public class WordCounterActivity extends AppCompatActivity {

    TextView mWordCountTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);

        mWordCountTotal = (TextView)findViewById(R.id.word_count_total);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String count = extras.getString("count");
        mWordCountTotal.setText(count);
    }
}
